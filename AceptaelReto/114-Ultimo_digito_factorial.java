import java.util.Scanner;

public class Ejercicio114 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        int num;
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 0:
                    System.out.println(1);
                    break;
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(6);
                    break;
                case 4:
                    System.out.println(4);
                    break;
                default:
                    System.out.println(0);
                    break;
            }
        }
    }
}
