import java.util.Arrays;
public class task_1 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 7, 3, 9, 3};
        int numberToRemove = 3;
        int len = 0;
        for ( int i = 0; i < inputArray.length; i++){
            if (inputArray[i] == numberToRemove){
                len++;
            }}
        int[] outputArray = new int[inputArray.length - len];
        int outputArrayIndex = 0;
        for (int index = 0; index < inputArray.length; index++) {
            if (inputArray[index] == numberToRemove) {
                continue;
            }

            outputArray[outputArrayIndex] = inputArray[index];
            outputArrayIndex++;
        }
        System.err.println(Arrays.toString(outputArray));
    }
}