import java.util.Scanner;

public class Ejercicio621 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        int pag;
        for (int i = 0; i < n; i++) {
            pag = sc.nextInt();
            if (pag%2 == 0) {
                int suma = pag +1;
                System.out.println(suma);
            } else if (pag%2 != 0) {
                int resta = pag -1;
                System.out.println(resta);
            }
        }
    }
}
