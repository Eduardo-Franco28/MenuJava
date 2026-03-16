import utils.Validacoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "";
        int idade = 0;
        double altura = 0;

        int op = -1;

        while(op != 0){

            criarMenu();

            op = sc.nextInt();
            sc.nextLine();

            switch (op){

                case 1:
                    System.out.println("Digite seu nome:");
                    String nomeTemporario = sc.nextLine();
                    if (Validacoes.validarNome(nomeTemporario)){
                        nome = nomeTemporario;
                        System.out.println("Nome Salvo!");
                    } else {
                        System.out.println("Nome Inválido!");
                    }
                    break;

                case 2:
                    System.out.println("Digite sua idade:");
                    int idadeTemporaria = sc.nextInt();
                    if (Validacoes.validarIdade(idadeTemporaria)){
                        idade = idadeTemporaria;
                        System.out.println("Idade Salva!");
                    } else {
                        System.out.println("Idade Inválida");
                    }
                    break;

                case 3:
                    System.out.println("Digite sua altura:");
                    double alturaTemporaria = sc.nextDouble();
                    if (Validacoes.validarAltura(alturaTemporaria)){
                        altura = alturaTemporaria;
                        System.out.println("Altura Salva!");
                    } else {
                        System.out.println("Altura Inválida!");
                    }
                    break;

                case 4:
                    System.out.println("Pessoa criada:");
                    System.out.println("Nome: " + nome);
                    System.out.println("Idade: " + idade);
                    System.out.println("Altura: " + altura);
                    break;
            }
        }
        sc.close();
    }

    public static void criarMenu() {
        System.out.println("------------- MENU -------------");
        System.out.println("1 - Digitar nome");
        System.out.println("2 - Digitar idade");
        System.out.println("3 - Digitar altura");
        System.out.println("4 - Ver pessoa");
        System.out.println("0 - Sair");
    }
}