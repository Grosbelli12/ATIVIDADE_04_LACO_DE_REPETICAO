import java.util.Scanner;

public class Atividade_2_Contagem_Regressiva {
    public static void main(String[] args) {

        Scanner subtracao = new Scanner(System.in);
        System.out.println("Digite um valor para subtrair até 0 : ");
        int num = subtracao.nextInt();

        int[] contagem = new int[num];
        int contador = num;

        System.out.println("A subtração até 0 do número desejadp é : ");

        while (contador > 0) {
            System.out.println(contador);
            contagem[0] = contador;
            contador--;
        }

    }
}
