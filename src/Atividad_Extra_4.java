import java.util.Scanner;

public class Atividad_Extra_4 {
    public static void main(String[] args) {
        char ver = 'S';
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de Adição");

        while (ver == 'S') {
            System.out.println("Digite o primeiro numero: ");
            num1 = sc.nextInt();
            System.out.println("Digite o segundo numero: ");
            num2 = sc.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.println("""
                    Deseja fazer de novo?
                    S - Sim
                    N - Não""");
            ver = sc.next().charAt(0);
        }
    }
}
