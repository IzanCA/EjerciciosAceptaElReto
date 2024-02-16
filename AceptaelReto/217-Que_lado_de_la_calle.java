import java.util.Scanner;

public class Ejercicio217 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {

            n = sc.nextInt();
            int div = n % 2;
            if (n != 0) {
                if (div == 0) {
                    System.out.println("DERECHA");
                } else if (div != 0) {
                    System.out.println("IZQUIERDA");
                }
            }

        } while (n != 0);
    }
}
