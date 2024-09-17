import java.util.Arrays;
import java.util.Scanner;

public class Atividade_Extra_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] vetor = new String[5];
        int i = 0;

        while (i != 5) {
        System.out.println("Digete um nome :");
        vetor[i] = sc.nextLine();
            i++;
        }
        System.out.println("Os nomes são : " + Arrays.toString(vetor));
    }

}
