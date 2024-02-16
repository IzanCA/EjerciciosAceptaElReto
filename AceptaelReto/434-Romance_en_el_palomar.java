import java.util.Scanner;

public class Ejercicio434Palomas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int palomas;
        int habit;
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            palomas = sc.nextInt();
            habit = sc.nextInt();

            if (palomas < habit) {
                System.out.println("ROMANCE");
            } else if (palomas == habit) {
                System.out.println("ROMANCE");
            } else {
                System.out.println("PRINCIPIO");
            }
        }
    }
}
