import java.util.*;

public class patoDonald {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String[] fechaP;
        TreeSet<String> fechas = new TreeSet<String>();
        String sub;
        String res = "NO";
        do {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                fechaP = sc.nextLine().split(" ");
                for (int i = 0; i < n; i++) {

                    sub = fechaP[i].substring(0, fechaP[i].length() - 5);
                    if (fechas.contains(sub)) {
                        res = "SI";
                    } else {
                        fechas.add(sub);
                    }
                }
                System.out.println(res);
                fechas.clear();
                res = "NO";
            }
        } while (n != 0);
    }
}
