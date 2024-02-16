import java.util.Scanner;

public class Ejercicio117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String saludo, salida;
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            saludo = sc.nextLine();
            salida = saludo.replaceAll("Soy " , "Hola, ");
            System.out.print(salida);
            System.out.println(".");
        }
    }
}
