import java.util.Scanner;
public class SumInt {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int boTest = n.nextInt();

        if (boTest > 10){  
            System.out.println("Bộ test nhỏ hơn 10 đi cu");
            n.close();  
            return;
        }
        
        for (int i = 0; i < boTest; i++){
            int nhapN = n.nextInt();
            if (nhapN <= 0) {
                System.out.println("N phải > 0");
                continue;
            }
            long sum = (long) nhapN * (nhapN + 1) / 2;
            System.out.println(sum);
        }
        n.close();
    }
}


