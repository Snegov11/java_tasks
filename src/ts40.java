import java.util.Scanner;

public class ts40 {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String x = sc.nextLine();

        String []num = x.split(",");

        for(String str: num) {

            System.out.println(str);

        }

    }

}