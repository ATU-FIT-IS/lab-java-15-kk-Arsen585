
import java.util.*;
public class Tap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a > b) System.out.println(a);
        else if (b > a) System.out.println(b);
        else System.out.println("Equal");
    }
}