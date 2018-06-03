
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();
        int numbernotoutput = number;
        int t;
        boolean found=false;
        //узнаем размер массива
        int sizeArray = (int) Math.log10(number) + 1;
        int[] numbers = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) { //zapolnyaem massiv
            int e = (numbernotoutput % 10);
            numbernotoutput /= 10;
            numbers[i] = e;
        }
        for (int i = 0; i < sizeArray / 2; i++) { // sortiruem
            t = numbers[sizeArray - i - 1];
            numbers[sizeArray - i - 1] = numbers[i];
            numbers[i] = t;
        }
        for (int i = 0; i < sizeArray-1; i++) { // proveriaem
            if(numbers[i]>+numbers[i+1]){
                found=true; 
                    break;}
        }
        if(found) //vivodim otvet
               {
                System.out.println(number + " не отвечает");}   
           else 
               {
                 System.out.println(number + " отвечает");}   
    }
}