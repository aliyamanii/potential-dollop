import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int length = read.nextInt();
        int[ ] arr = new int[length];
        System.out.println("Please enter the elements: ");
        for (int i = 0; i < length; i++) {
            arr[i] = read.nextInt();
        }
        System.out.println(FindMax.maxSubArray(arr));
    }
}