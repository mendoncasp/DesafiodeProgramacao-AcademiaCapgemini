# DesafiodeProgramacao-AcademiaCapgemini
Repositório criado para transmitir o desafio de programação proposto pela Academia Capgemini. Projeto todo desenvolvido na linguagem Java.

## Começando
Essas informações a seguir são importantes para que seja possível a clonagem e execução do projeto.

### Pré requisitos
É necessário que as seguintes ferramentas estejam instaladas em sua máquina para a execução da aplicação:
```
JDK SE
Intellij IDEA
Gradle
```

### Instalação
Seguem os links para instalação das ferramentas mencionadas na fase de Pré requisitos:
```
JDK SE: https://www.oracle.com/br/java/technologies/javase-downloads.html
Intellij IDEA: https://www.jetbrains.com/pt-br/idea/download/#section=windows
Gradle: https://gradle.org/install/
```
Depois de instalados, podemos iniciar com a execução e teste.

##Inicio dos testes
Para executar o programa, o usuário deve acessar a pasta 'src', 'main', 'java', 'desafiocapgemini', conforme exemplo:
```
src
--main
----java
------desafiocapgamini
```

Estando dentro do pacote do programa, o usuário irá encontrar todas as Classe e Interfaces utilizadas para a construção do programa.

Para executar o programa, abra a Classe 'Programa' e vá até a linha que contém método main:
```
public static void main(String[] args){

```

Na linha do método main, do lado esquerdo, o usuário encontrará um triângulo verde. Ao clicar nesse triângulo, a IDE dará 3 opções, e o usuário deve usar a opção "Run 'Programa.main()'", conforme exemplo:
```
>  Run 'Programa.main()' - (Opção a ser utilizada)
   Debug 'Programa.main()'
   Run 'Programa.main() with Coverage'
```

O programa iniciará com uma breve introdução e algumas opções. Ao escolher a opção '1 - Cadastrar Anúncio', a entrada de dados deve ser feito da seguinte forma:
```
Para incluir nome do anúncio e cliente, pode ser digitado normalmente;
Os campos de data de início e data de fim do anuncio deve ser digitado de forma direta, com todos os números e sem nenhum símbolo separando-os. Ex: 25052021, 14122015;
Para incluir o valor do investimento diário do anúncio, o valor deve ser colocado sem pontos se for acima de 1000 e não colocar moedas, visto que no processo da calculadora o cálculo base é feito a cada 1 real. Ex: 595, 1520, 2345;
Incluí uma entrada de dados a mais para digitar qual será o tempo do anúncio, que simplesmente pode ser digitado quantos dias o anúncio ficará em vigor. Ex: Se o anúncio começa dia 4 de maio de 2021 e termina dia 14 de maio de 2021, serão 10 dias de intervalo, e deve ser digitado "10".
```

Após essa entrada de dados, serão feitos os registros com as informações do cliente e a calculadora irá funcionar e gravar o plano dele, com o total de visualizações, cliques e compartilhamentos.

Ao escolher a opção '2 - Procurar Anúncio', pode ser escolhido duas formas de busca, como proposto no desafio: Por nome e por data. Se escolhido por nome, o nome do cliente pode ser digitado normalmente. Se escolhido por data, a data de início e fim deve ser colocada como instruído anteriormente.
```
Obs: Infelizmente o programa não ficou 100% porque apesar de muita pesquisa em fóruns online, não consegui aprender como acessar os atributos do objeto registrado dentro do ArrayList para fazer as buscas por nome ou pela data. Tirando isso, todos os métodos existentes foram aprovados nos testes unitários e geral do programa.
```

Ao escolher a opção 'X - Sair' deve ser colocada o 'X' em caixa alta, para que o programa possa reconhecer e finalizar o programa.

### Testes unitários
Como mencionado antes, o processo de busca ficou um pouco prejudicado por não conseguir ter acesso aos atributos do objeto que foi registrado no ArrayLis. Porém, os métodos de busca retornam a posição correta do objeto dentro do ArrayList. Para validar a busca, a posição pode ser passada manualmente e o método irá retornar o objeto naquela posição.

O Debug do código pode ser usado para fazer a análise das chamadas e da passagem de parâmetro para os métodos.

## Agradecimentos
Agradeço a Capgemini por ter proporcionado a chance de realização desse desafio, onde pude praticar e pesquisar mais sobre Programação Orientada a Objeto, aumentando os meus conhecimentos em Java.
