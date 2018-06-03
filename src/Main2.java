import java.util.Arrays;

public class Main2{

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 15, 23, 45};
        int n = a.length;
        int t;
            System.out.println(Arrays.toString(a));
        for (int i = 0; i < n / 2; i++) {
            t = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = t;
        }
            System.out.println(Arrays.toString(a));
    }
}