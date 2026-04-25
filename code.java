import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("-----RANDOM WHEEL OF FORTUNE-----");
        System.out.print("Hi, enter the number of elements you want: ");
        int n = in.nextInt();
        while (n <= 0) {
            System.out.println("Error: number below or equal to 0. Try again");
            n = in.nextInt();
        }
        System.out.println("What type of elements do you want? (i, d, s, c)");
        char t = in.next().toLowerCase().charAt(0);
        if (t == 'i') {
            int[] elements = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the element " + (i + 1) + ": ");
                elements[i] = in.nextInt();
            }
            System.out.println("The random element is " + elements[rand.nextInt(n)]);
        } else if (t == 'd') {
            double[] elements = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the element " + (i + 1) + ": ");
                elements[i] = in.nextDouble();
            }
            System.out.println("The random element is " + elements[rand.nextInt(n)]);
        } else if (t == 's') {
            String[] elements = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the element " + (i + 1) + ": ");
                elements[i] = in.next();
            }
            System.out.println("The random element is " + elements[rand.nextInt(n)]);
        } else if (t == 'c') {
            char[] elements = new char[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the element " + (i + 1) + ": ");
                elements[i] = in.next().charAt(0);
            }
            System.out.println("The random element is " + elements[rand.nextInt(n)]);
        }
        in.close();
    }
}