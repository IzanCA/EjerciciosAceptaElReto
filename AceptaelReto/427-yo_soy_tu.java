import java.util.Scanner;

public class Ejercicio427 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        String pal1, pal2;
        for (int i = 0; i < n; i++) {
            pal1 = sc.nextLine();
            pal2 = sc.nextLine();
            if (pal1.equals("Luke") && pal2.equals("padre")) {
                System.out.println("TOP SECRET");  
            } else {
                System.out.println(pal1+", yo soy tu " + pal2);
            }
        }
    }
}
