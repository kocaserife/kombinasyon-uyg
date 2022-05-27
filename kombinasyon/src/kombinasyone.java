import java.util.Scanner;
public class kombinasyone {
    public static void main(String[] args) {
        int n, r, f1 = 1, f2 = 1, f3 = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("n yaz: ");
        n = input.nextInt();
        
        do {
            System.out.print("r' yaz: ");
            r = input.nextInt();
        } while (r > n);
              
        for (int i = 1; i <= n; i++) {
            f1 = f1 * i;
        }
        for (int j = 1; j <= r; j++) {
            f2 = f2 * j;
        }
        for (int k = 1; k <= (n - r); k++) {
            f3 = f3 * k;
        }
        System.out.print("kombinasyonee: ");
        System.out.println(f1 / (f2 * f3));


    }
}
