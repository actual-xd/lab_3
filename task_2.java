public class task_2 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Факториал: " + factorial(n));
        System.out.println("Логарифм: " + Math.log(factorial(n)));
    }
    private static int factorial(int n){
        int result;
        if (n==1)
            return 1;
        result = factorial(n-1) * n;
        return result;
    }
}