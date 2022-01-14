import java.util.Scanner;

 public class ts39 {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();

        int []num=new int[x];

        for(int i=0;i<x;i++){

            int y=sc.nextInt();

            num[i]=y;}

        for (int i=1; i<num.length; i++) {
            if (num[i] > num[i-1])
                System.out.println(num[i]+" ");
        }


    }

}
