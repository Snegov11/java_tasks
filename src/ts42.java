import java.util.Scanner;
import java.util.Arrays;
class MyNumber3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  line = sc.nextLine();
        String [] arr=line.split(" ");
        int n=arr.length;
        int [] arr1=new int [n];
        for (int i=0; i<arr.length; i++){
            int number = Integer.valueOf(arr[i]);
            arr1[i]=Integer.parseInt(arr[i]);

        }
        Arrays.sort(arr1);System.out.print(Arrays.toString(arr1));

    }
}
