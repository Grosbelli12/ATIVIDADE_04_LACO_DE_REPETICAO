import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int[] tabuada = new int[10];
        System.out.println("digite um número de 1 até 10: ");
        int num1 = num.nextInt();
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += i;

            tabuada[0] = num1 * 1;
            tabuada[1] = num1 * 2;
            tabuada[2] = num1 * 3;
            tabuada[3] = num1 * 4;
            tabuada[4] = num1 * 5;
            tabuada[5] = num1 * 6;
            tabuada[6] = num1 * 7;
            tabuada[7] = num1 * 8;
            tabuada[8] = num1 * 9;
            tabuada[9] = num1 * 10;
            System.out.println("o resultado da sua tabuada é: " + tabuada[i]);

        }


    }
}