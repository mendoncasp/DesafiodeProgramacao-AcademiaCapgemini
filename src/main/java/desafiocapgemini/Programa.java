package desafiocapgemini;

import java.util.Scanner;

public class Programa {

    static Repositorio repositorio = new Repositorio();
    static Plano plano = new Plano();
    public static void main(String[] args) {
        String opcaoUsuario = obterOpcaoUsuario();

        while (!opcaoUsuario.equals("X")){
            switch (opcaoUsuario){
                case "1":
                    criarAnuncio();
                    break;
                case "2":
                    procurarAnuncio();
                    break;
            }
            opcaoUsuario = obterOpcaoUsuario();
        }
        System.out.println("Obrigado por utilizar nossos serviços!!");
    }

    private static void criarAnuncio(){
        System.out.println("Inserir novo anúncio");
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o nome do anúncio: ");
        String anuncio = teclado.nextLine();

        System.out.print("Informe o nome do cliente: ");
        String cliente = teclado.nextLine();

        System.out.print("Qual será a data de início? ");
        int dataInicio = teclado.nextInt();

        System.out.print("Qual será a data do fim do anúncio? ");
        int dataFim = teclado.nextInt();

        System.out.print("Quanto será investido por dia? ");
        double investimento = teclado.nextDouble();

        System.out.print("Serão quantos dias de anúncio? " );
        int dias = teclado.nextInt();

        Registro novoAnuncio = new Registro(anuncio, cliente, dataInicio, dataFim, investimento);
        repositorio.Registrar(novoAnuncio);

        int valorTotal = (int) (dias*investimento);

        Calculadora novoPlano = new Calculadora(valorTotal);
        plano.Registrar(novoPlano);

    }

    private static void procurarAnuncio(){
        int data, opcao, data1;
        String nome;

        System.out.println("Procurar anúncio");
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual será a forma de busca? 1-Nome/2-Data: ");
        opcao = teclado.nextInt();
        int busca;
        if (opcao == 1){
            System.out.print("Informe o nome do cliente: ");
            nome = teclado.next();
            busca = repositorio.BuscaNome(nome);
            plano.Exibir(busca);
        } else if (opcao == 2){
            System.out.print("Informe a data de início: ");
            data = teclado.nextInt();
            System.out.print("Informe a data do fim: ");
            data1 = teclado.nextInt();
            busca = repositorio.BuscaData(data, data1);
            plano.Exibir(busca);
        }
    }

    private static String obterOpcaoUsuario(){
        System.out.println();
        System.out.println("Agência Divulga Tudo ao seu dispor!");
        System.out.println("Opções Disponíveis:");

        System.out.println("1 - Cadastrar Anúncio");
        System.out.println("2 - Procurar Anúncio");
        System.out.println("X - Sair");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a opção desejada: ");
        String opcaousuario = teclado.nextLine();
        System.out.println();
        return opcaousuario;
    }
}
