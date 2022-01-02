import java.util.Scanner;

public class ts19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n>0) {
            for (int i=1; i<n+1; i++) {
                count = 1;
                for (int j=1; j<i+1; j++) {
                    for (int k=1; k<j+1; k++ ){
                        if (count<=i){
                            System.out.print(j);
                        }
                        if (count<i) {
                            System.out.print(" ");
                        }
                        count++;
                    }
                }
                if (i<n) {
                    System.out.println();
                }
            }
        }
    }
}
