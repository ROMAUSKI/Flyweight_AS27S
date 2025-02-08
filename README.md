Padrão de Projeto - Flyweight
1. Introdução
Em aplicações que lidam com um grande número de objetos semelhantes, o consumo de memória pode se tornar um problema. Por exemplo, em um jogo que precisa renderizar milhares de árvores, criar uma nova instância para cada uma delas pode ser ineficiente e levar a problemas de desempenho. O padrão Flyweight ajuda a resolver esse problema ao compartilhar instâncias de objetos semelhantes, reduzindo a necessidade de alocação de memória excessiva.
O Flyweight separa os dados compartilhados (estado intrínseco) dos dados específicos de cada instância (estado extrínseco). Dessa forma, objetos semelhantes reutilizam os mesmos dados sempre que possível. Esse padrão é amplamente utilizado em aplicações como editores de texto (onde cada caractere pode ser uma instância compartilhada), jogos (para renderização de gráficos) e sistemas que lidam com grandes quantidades de dados repetitivos.
2. Implementação do Padrão Flyweight
O código implementado em Java demonstra como otimizar o uso de memória ao gerenciar objetos compartilhados no contexto de um jogo que exibe árvores. O projeto está disponível no GitHub, contendo a implementação completa.
Link do repositório: https://github.com/ROMAUSKI/Flyweight_AS27S
3. Explicação do Código



TipoArvore: Representa a parte compartilhada do objeto (estado intrínseco), como nome, cor e textura.
TipoArvoreFactory: Garante que objetos idênticos não sejam criados várias vezes, reutilizando instâncias existentes.
Árvore: Representa a árvore individual na floresta, armazenando apenas sua posição e uma referência ao tipo de árvore compartilhada.
FlyweightDemo: Demonstra o uso do Flyweight criando e exibindo várias árvores reutilizando instâncias compartilhadas.
4. Resultado Esperado
A execução do programa deve gerar uma saída semelhante a esta:
Árvore: Carvalho | Cor: Verde | Textura: Rugosa | Posição: (10, 20)
Árvore: Carvalho | Cor: Verde | Textura: Rugosa | Posição: (15, 25)
Árvore: Pinheiro | Cor: Verde Escuro | Textura: Lisa | Posição: (30, 40)
Árvore: Pinheiro | Cor: Verde Escuro | Textura: Lisa | Posição: (50, 60)
Árvore: Carvalho | Cor: Verde | Textura: Rugosa | Posição: (70, 80)
Isso mostra que os objetos são reutilizados em vez de criar novas instâncias desnecessárias.
5. Vantagens e Desvantagens
Vantagens:
Redução do consumo de memória ao reutilizar instâncias.
Melhor desempenho em sistemas que lidam com grandes volumes de objetos semelhantes.
Organização do código ao separar estado intrínseco e extrínseco.
Desvantagens:
Adiciona um pouco mais de complexidade ao código.
Pode não ser útil se os objetos forem muito diferentes e não puderem ser compartilhados.
