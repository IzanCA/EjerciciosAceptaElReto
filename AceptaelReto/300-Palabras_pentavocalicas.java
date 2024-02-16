import java.util.Scanner;

public class Ejercicio300VocalesEnPal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String palabra;
        for (int i = 0; i < n; i++) {
            palabra = sc.nextLine();
            if (esPentaVocal(palabra)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean esPentaVocal(String palabra) {
        return (palabra.contains("a") && palabra.contains("e") && palabra.contains("i") && palabra.contains("o") && palabra.contains("u"));

    }
}
