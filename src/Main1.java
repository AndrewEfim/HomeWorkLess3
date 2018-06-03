import java.util.Arrays;

public class Main1{ 

    public static void main(String[] args) {
        int[] numbers = {23, 1, 3, -4, 11, 23, 7, 1, 13, 10};
        int min = numbers[0];
        int max = numbers[1];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) 
                min = numbers[i];
            if (max < numbers[i])
                max = numbers[i];
            
        }
            System.out.println("min value ="+" " + min);
            System.out.println("max value ="+" " + max);
        for (int i = 0; i < numbers.length; i++){    
            if (min==numbers[i])
                numbers[i] = 0; 
            if (max==numbers[i])
                numbers[i] = 99; }

            System.out.println(Arrays.toString(numbers));
        }

    }