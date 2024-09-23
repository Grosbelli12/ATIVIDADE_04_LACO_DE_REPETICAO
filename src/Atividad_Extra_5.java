import java.util.ArrayList;
import java.util.Scanner;

public class Atividad_Extra_5 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int i = 1;
    String nome;
        System.out.println("Programa de Cadastros");

    ArrayList<String> nomes = new ArrayList<>();

        while (i != 0) {
        System.out.print("Digite o nome das pessoas que deseja cadastrar:");
        nome = sc.nextLine();
        nomes.add(nome);

        System.out.println("Quer finalizar? 0 - Finalizar || 1 - Continuar");
        i = sc.nextInt();
        sc.nextLine();
    }

        System.out.println("Os nomes cadastrados foram " + nomes);
    }

}

