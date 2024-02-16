import java.util.Scanner;

public class Ejercicio413clarasYoscuras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int ancho;
        int alto;
        int blancas;
        int negras;
        double cantidad;
        double total;
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            ancho = sc.nextInt();
            alto = sc.nextInt();
            total = (double) ancho * alto;
            cantidad = (double) total / 2;

            blancas = (int) cantidad;
            negras = (int) cantidad;
            if (ancho == 1 && alto == 1) {
                blancas = 1;
                negras = 0;
            } else if (total % 2 != 0) {
                blancas = (int) cantidad + 1;
            }
            System.out.println(blancas + " " + negras);
        }
    }
}
