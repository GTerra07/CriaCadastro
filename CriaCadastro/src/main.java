import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = input.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        int idade = input.nextInt();

        System.out.print("Digite o sexo da pessoa (M/F): ");
        char sexo = input.next().charAt(0);

        input.nextLine(); // Limpa o buffer do teclado

        System.out.print("Digite o endereço da pessoa: ");
        String endereco = input.nextLine();

        System.out.print("Digite o telefone da pessoa: ");
        String telefone = input.nextLine();

        System.out.println("\n*** Dados cadastrados ***");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);

        input.close();
    }
}
