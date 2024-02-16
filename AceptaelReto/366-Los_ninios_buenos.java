import java.util.*;

public class NiniosBuenos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int punt = 0, peso = 0;
        ArrayList<ninio> p = new ArrayList<ninio>();

        do {
            n = Integer.parseInt(sc.nextLine());
            if (n != 0) {
                for (int i = 0; i < n; i++) {

                    punt = sc.nextInt();
                    peso = sc.nextInt();
                    sc.nextLine();

                    p.add(new ninio(punt, peso));

                }
                Collections.sort(p);
                for (ninio o : p) {
                    System.out.println(o.getpB() + " " + o.getPeso());

                }
                System.out.println("");
                p.clear();
            }
        } while (n != 0);
    }

}

class ninio implements Comparable {

    private int pB;
    private int peso;

    public ninio(int pB, int peso) {
        this.pB = pB;
        this.peso = peso;
    }

    @Override
    public int compareTo(Object o) {
        ninio otro = (ninio) o;
        if (this.pB != otro.pB) {
            return Integer.compare(otro.getpB(), this.getpB());
        } else {
            return Integer.compare(this.getPeso(), otro.getPeso());
        }
    }

    public int getpB() {
        return pB;
    }

    public void setpB(int pB) {
        this.pB = pB;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
