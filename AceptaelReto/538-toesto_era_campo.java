import java.util.Scanner;

public class Ejercicio538 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] años;
        String entrada;
        do {
            entrada = sc.nextLine();
            años = entrada.split(" ");
            if (!entrada.equals("0 0")) {
                if (Integer.parseInt(años[0]) < Integer.parseInt(años[1])) {
                    System.out.println("SENIL");
                } else {
                    System.out.println("CUERDO");
                }
            }

        } while (!entrada.equals("0 0"));
    }
}
