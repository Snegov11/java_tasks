import java.util.Scanner;

public class dfg {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Sergey";
        person.age = 30;

        System.out.println("Меня зовут " + person.name + " мой возраст " + person.age);

        class Person {
            String name;
            int age;
        }

        int num = 10;
        while (num != 0){
            num--;
            System.out.println(num);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные");
        String str = scanner.nextLine();
        System.out.println(str);

        int num_1 = 100;
        double[] data = new double[num_1];
        for(int i = 0; i<data.length; i++){
            data[i] = Math.random();
        }
        double max = data[0];
        double min = data[0];
        double avg = 0;

        for (int i = 0; i < data.length; i++) {
            if(max < data[i])
                max = data[i];
            if(min > data[i])
                min = data[i];
            avg += data[i]/data.length;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);

    }
}
