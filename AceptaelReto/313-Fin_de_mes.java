import java.util.Scanner;

public class Ejercicio313FinDeMes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        String entrada[];
        for (int i = 0; i < n; i++) {
            entrada = sc.nextLine().split(" ");
            int saldoCuenta = Integer.parseInt(entrada[0]);
            int cambioEstimado = Integer.parseInt(entrada[1]);
            if (cambioEstimado + saldoCuenta >= 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
