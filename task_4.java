public class task_4 {
    public static void main(String[] args) {
        String word = "амма";
        System.out.println(isPalindrome(word));
    }
    static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < (length / 2); i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}