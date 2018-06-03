import java.util.Arrays;
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        System.out.println("Введите числа");
        int[]arrayOfinput = new int [10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arrayOfinput.length ; i++) {
        arrayOfinput[i] = input.nextInt();}
        input.close();
        int[] arrayOfnumbers = new int[arrayOfinput.length]; //для запиcи чисел
        int[] arrayOfcount = new int[arrayOfinput.length]; // для записи повторений
        Arrays.sort(arrayOfinput);
        for (int i = 0; i < arrayOfinput.length; i++) {
            for (int j = i + 1; j < arrayOfinput.length; j++) {
                if (arrayOfinput[i] == arrayOfinput[j]) {
                    arrayOfnumbers[i] = arrayOfinput[i];
                    arrayOfcount[i]++;
                }
            }
        }
            for (int i = 0; i < arrayOfinput.length; i++) {
                if (arrayOfnumbers[i] == arrayOfinput[i]) {
                    arrayOfcount[i]++;
                }
            }
            for (int i = 0; i < arrayOfinput.length-1; i++) {
                if(arrayOfinput[i] == arrayOfnumbers[i+1]){
                arrayOfnumbers[i+1]=0;}
        }
                for (int i = 0; i < arrayOfinput.length-1; i++){
                    if (arrayOfnumbers[i] != 0) {
                       System.out.printf("%s%d%s-%s %d\n", "[", arrayOfnumbers[i], "]", "повторений", arrayOfcount[i]);
                    }
                }
            }
}