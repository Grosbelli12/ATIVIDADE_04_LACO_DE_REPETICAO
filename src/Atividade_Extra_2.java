import java.util.Scanner;

public class Atividade_Extra_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Digite o número limete para a contagem :");
        int lim = sc.nextInt();
        while (num < lim) {
            num++;
            System.out.println(num);
        }
    }
}
