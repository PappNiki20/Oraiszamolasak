package Ciklusok;

public class Sarkany {

    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int i=(7 * x) + (11 * y);
        for (i = (7 * x) + (11 * y); i < 145;) {
            x++;
            y++;
            i = (7 * x) + (11 * y);

        }
        System.out.println(i);
        System.out.println("" + x + "\n" + y);
    }
}
