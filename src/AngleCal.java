import java.util.Scanner;
public class AngleCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of pairs: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter x and y coordinates of pair " + i + ": ");
            float x = sc.nextFloat();
            float y = sc.nextFloat();
            double angle = Math.toDegrees(Math.atan2(y, x));
            System.out.println("Angle of pair " + i + ": " + angle + " degrees");
        }
    }
}
