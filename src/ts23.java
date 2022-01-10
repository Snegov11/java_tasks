import java.util.*;

public class ts23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<n+1; i++){
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
