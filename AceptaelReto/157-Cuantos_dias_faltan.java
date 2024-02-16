import java.util.Scanner;

public class Ejercicio157CuantosDiasFalta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] meses = {31,28,31,30,31,30,31,31,30,31,30,31};
        int n = Integer.parseInt(sc.nextLine());
        String entrada[];
        int dia, mes;
        for (int i = 0; i < n; i++) {
            entrada = sc.nextLine().split(" ");
            dia = Integer.parseInt(entrada[0]);
            mes = Integer.parseInt(entrada[1]);
            for (int j = 0; j < mes -1; j++) {
                dia = dia + meses[j];
            }
            System.out.println((365 - dia));
        }
    }
}
