public class Atividad_Extra_6 {
    public static void main(String[] args) {
        // n = qual  é a tabuada e m o multiplicador
        int n = 1;
        int m = 1;
        while (n <= 10) {
            System.out.println(n + "x" + m + "= " + n * m);
            m++;
            if (m == 11) {
                n++;
                m = 1;
                System.out.println(" ");
            }
        }
    }
}
