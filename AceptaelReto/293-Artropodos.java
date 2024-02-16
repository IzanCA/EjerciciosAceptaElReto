import java.util.Scanner;

public class Ejercicio293Artropodos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = Integer.parseInt(sc.nextLine());
        int insectos = 6, aracnidos = 8, crustaceos = 10, nEscalopendras, anillosEscal = 2;
        int pedirIns, pedirArac, pedirCrus, sumaPatas, pedirAnillos;
        String entrada[];
        for (int i = 0; i < n; i++) {
            entrada = sc.nextLine().split(" ");
            pedirIns = Integer.parseInt(entrada[0]);
            pedirArac = Integer.parseInt(entrada[1]);
            pedirCrus = Integer.parseInt(entrada[2]);
            nEscalopendras = Integer.parseInt(entrada[3]);
            pedirAnillos = Integer.parseInt(entrada[4]);

            int insectosTotal = pedirIns * insectos;
            int AracTotal = pedirArac * aracnidos;
            int crusTotal = pedirCrus * crustaceos;
            int anillosPatas = pedirAnillos * anillosEscal;
            int patasEscalopendra = nEscalopendras * anillosPatas;

            sumaPatas = insectosTotal + AracTotal + crusTotal + patasEscalopendra;
            System.out.println(sumaPatas);
        }
    }
}
