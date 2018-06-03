import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 12, 14, 161, 7, 54};
        System.out.println(Arrays.toString(numbers));
        
         for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int t = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = t;}
                }
            }
        System.out.println(Arrays.toString(numbers));
    }
}
