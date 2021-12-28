import java.util.Scanner;

public class ts2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] array = new int[num];
        for (int i=0;i<array.length; i++){
            array[i] = input.nextInt();
        }
        int max = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
