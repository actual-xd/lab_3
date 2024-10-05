import java.util.Scanner;
public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m: ");
        long m = scanner.nextLong();// запускать только при 2, 1 иначе переполняется стек :)))))

        System.out.print("Enter n: ");
        long n = scanner.nextLong();
        long result = ack(m, n);
        System.out.println("A(" + m + ", " + n + ") = " + result);
    }

    private static long ack(long m, long n) {
        if (m == 0)
            return n + 1;
        else if (n == 0)
            return ack(m - 1, 1);
        else
            return ack(m - 1, ack(m, n - 1));
    }
}