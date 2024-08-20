import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        int choice, primeiro, segundo;
        choice = 0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("------ CALCULADORA ------");
            System.out.println("\n 1- Soma \n 2- Subtração \n 3- Multiplicação \n 4- Divisão \n 5-Sair da calculadora \n\nDigite a opção desejada ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- SOMA ---\nDigite o primeiro número:");
                    primeiro = sc.nextInt();
                    System.out.println("Digite o segundo número:");
                    segundo = sc.nextInt();
                    System.out.println("\n" + primeiro + " + " + segundo + " = " + (primeiro + segundo));
                    break;
                case 2:
                    System.out.println("\n--- SUBTRAÇÃO ---\nDigite o primeiro número:");
                    primeiro = sc.nextInt();
                    System.out.println("Digite o segundo número:");
                    segundo = sc.nextInt();
                    System.out.println(primeiro + " - " + segundo + " = " + (primeiro - segundo));
                    break;
                case 3:
                    System.out.println("\n--- MULTIPLICAÇÃO ---\nDigite o primeiro número:");
                    primeiro = sc.nextInt();
                    System.out.println("Digite o segundo número:");
                    segundo = sc.nextInt();
                    System.out.println(primeiro + " * " + segundo + " = " + (primeiro * segundo));
                    break;
                case 4:
                    System.out.println("\n--- DIVISÃO ---\nDigite o primeiro número:");
                    primeiro = sc.nextInt();
                    System.out.println("Digite o segundo número:");
                    segundo = sc.nextInt();
                    System.out.println(primeiro + " / " + segundo + " = " + (primeiro / segundo));
                    break;
                default:
                    if (choice == 5){
                        break;
                    }else{
                        System.out.println("Digite uma opção válida!");}
                    break;
            }
        }while(choice != 5);
    }

}
