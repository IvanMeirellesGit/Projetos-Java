import java.util.Scanner;

class App {

    public static int soma(int a, int b) {
        return (a + b);
    }

    public static int subtracao(int a, int b) {
        return (a - b);
    }

    public static int multiplicacao(int a, int b) {
        return (a * b);
    }

    public static int divisao(int a, int b) {
        return (a / b);
    }

    public static void main(String[] args) {

        System.out.println("Programa Iniciado!");
        int x, y;
        int opcao;

        Scanner entrada = new Scanner(System.in);

        System.out.println("1 SOMA 2 SUBTRAÇÃO 3 MULTIPLICAÇÃO 4 DIVISÃO");

        opcao = entrada.nextInt();

        System.out.println("Digite o primeiro valor:");
        x = entrada.nextInt();
        System.out.println("Digite o segundo valor:");
        y = entrada.nextInt();

        switch (opcao) {
            case 1:
                int totalsoma = App.soma(x, y);
                System.out.println(totalsoma);
                break;
            case 2:
                int totalsub = App.subtracao(x, y);
                System.out.println(totalsub);
                break;
            case 3:
                int totalmult = App.multiplicacao(x, y);
                System.out.println(totalmult);
                break;
            case 4:
                int totaldiv = App.divisao(x, y);
                System.out.println(totaldiv);
                break;
            default:
                System.out.println("Opção escolhida é inválida");
        }
    }
}