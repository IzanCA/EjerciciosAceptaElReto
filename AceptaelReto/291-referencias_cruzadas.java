import java.util.*;

public class mapTreesetReferenciasCruzadas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String linea[];

        TreeMap<String, TreeSet<Integer>> p = new TreeMap<String, TreeSet<Integer>>();
        do {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                for (int i = 1; i <= n; i++) {
                    linea = sc.nextLine().toLowerCase().split(" ");

                    for (String string : linea) {
                        if (string.length() > 2) {
                            if (!p.containsKey(string)) {
                                p.put(string, new TreeSet<Integer>());
                            }
                            p.get(string).add(i);
                        }
                    }
                }
                for (String key : p.keySet()) {
                    System.out.print(key);
                    for (Integer t : p.get(key)) {
                        System.out.print(" " + t);
                    }
                    System.out.println();
                }
                p.clear();
                System.out.println("----");
            }

        } while (n != 0);
    }
}
