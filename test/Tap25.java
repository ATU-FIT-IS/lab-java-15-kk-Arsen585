import java.util.*;
public class Tap25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5, count = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 0) count++;
        }
        System.out.println(count);
    }
}