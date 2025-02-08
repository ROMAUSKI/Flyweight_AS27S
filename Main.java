import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;


class TipoArvore {
    private final String nome;
    private final String cor;
    private final String textura;

    public TipoArvore(String nome, String cor, String textura) {
        this.nome = nome;
        this.cor = cor;
        this.textura = textura;
    }

    public void exibir(int x, int y) {
        System.out.println("Árvore: " + nome + " | Cor: " + cor + " | Textura: " + textura + " | Posição: (" + x + ", " + y + ")");
    }
}


class TipoArvoreFactory {
    private static final Map<String, TipoArvore> tipos = new HashMap<>();

    public static TipoArvore getTipoArvore(String nome, String cor, String textura) {
        String chave = nome + "_" + cor + "_" + textura;
        tipos.putIfAbsent(chave, new TipoArvore(nome, cor, textura));
        return tipos.get(chave);
    }
}


class Arvore {
    private final int x, y;
    private final TipoArvore tipo;

    public Arvore(int x, int y, TipoArvore tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void exibir() {
        tipo.exibir(x, y);
    }
}


public class Main {
    public static void main(String[] args) {
        List<Arvore> floresta = new ArrayList<>();
        
        
        floresta.add(new Arvore(10, 20, TipoArvoreFactory.getTipoArvore("Carvalho", "Verde", "Rugosa")));
        floresta.add(new Arvore(15, 25, TipoArvoreFactory.getTipoArvore("Carvalho", "Verde", "Rugosa")));
        floresta.add(new Arvore(30, 40, TipoArvoreFactory.getTipoArvore("Pinheiro", "Verde Escuro", "Lisa")));
        floresta.add(new Arvore(50, 60, TipoArvoreFactory.getTipoArvore("Pinheiro", "Verde Escuro", "Lisa")));
        floresta.add(new Arvore(70, 80, TipoArvoreFactory.getTipoArvore("Carvalho", "Verde", "Rugosa")));
        
        
        for (Arvore arvore : floresta) {
            arvore.exibir();
        }
    }
}