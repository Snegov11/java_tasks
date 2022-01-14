import java.util.Scanner;

class MyNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();

        int []num=new int[x];

        for(int i=0;i<x;i++){

            int y=sc.nextInt();

            num[i]=y;}

        System.out.println(num[x-1]);

    }

}