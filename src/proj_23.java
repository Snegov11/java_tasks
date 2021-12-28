import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class proj_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<String> rich_man = new ArrayList<String>();
        rich_man.add("Джефф Безос");
        rich_man.add("Илон Маск");
        rich_man.add("Марк Цукерберг");
        rich_man.add("Билл Гейтс");

        if (str.toLowerCase().contains(rich_man.get(0).toLowerCase()) || str.toLowerCase().contains(rich_man.get(1).toLowerCase())
        || str.toLowerCase().contains(rich_man.get(2).toLowerCase()) || str.toLowerCase().contains(rich_man.get(3).toLowerCase())) {
            System.out.println("Добро пожаловать!");
        } else {
            System.out.println("Здесь никого нет, Вы ошиблись дверью");
        }

    }
}
