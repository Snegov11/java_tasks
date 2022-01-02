import java.util.Scanner;

class proj_9 {
    public static void main(String[] args) {
        //your code goes here
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println((x<y)?"Бой продолжается!":"Холифилд - чемпион!" );
    }
}
