import java.util.Scanner;
public class CountAppear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            sc.nextLine();

            String[] nums = sc.nextLine().trim().split("\\s+");
            
            int[] count = new int[100001];
            boolean[] marked = new boolean[100001];
            
            for (String num : nums) {
                try {
                    int intNum = Integer.parseInt(num);
                    if (intNum >= 0 && intNum <= 100000) {
                        count[intNum]++;
                    }
                } 
                catch (NumberFormatException e) {}
            }
            
            System.out.println("Test " + (i + 1) + ":");
            for (String num : nums) {
                try {
                    int intNum = Integer.parseInt(num);
                    if (intNum >= 0 && intNum <= 100000 && !marked[intNum]) {
                        System.out.println(intNum + " xuat hien " + count[intNum] + " lan");
                        marked[intNum] = true;
                    }
                } 
                catch (NumberFormatException e) {}
            }
        }
        sc.close();
    }
}
