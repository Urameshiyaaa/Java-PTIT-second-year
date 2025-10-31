import java.util.Scanner;

public class SapXepNoiBot {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dayN = new int[n];
        for (int i = 0; i < n; i++) {
            dayN[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            boolean HoanVi = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (dayN[j] > dayN[j + 1]) {
                    int ar = dayN[j];
                    dayN[j] = dayN[j + 1];
                    dayN[j + 1] = ar;
                    HoanVi = true;
                }
            }
            if (!HoanVi) {
                break;
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            printArray(dayN);
        }
        sc.close();
    }
}