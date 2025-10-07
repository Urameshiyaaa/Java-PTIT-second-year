import java.util.Scanner;
public class LietKeToHop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = i + 1;
        }

        int soToHop = 0;
        printArray(a);
        soToHop++;

        while (true) {
            int i = k - 1;
            while (i >= 0 && a[i] == n - k + i + 1) {
                i--;
            }
            if (i < 0) break;

            a[i]++; 
            for (int j = i + 1; j < k; j++) {
                a[j] = a[j - 1] + 1;
            }
            printArray(a);
            soToHop++;
        }
        System.out.println("Tong cong co " + soToHop + " to hop");
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(" ");
        }
        System.out.println();
    }
}