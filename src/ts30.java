import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ts30 {

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        String phone = "";

        String[] arrayPhone = Arrays.toString(numbers).split(", ");

        for (String num: arrayPhone) {
            phone = "(" + arrayPhone[0].replace("[","") + arrayPhone[1] + arrayPhone[2] + ")" + " " + arrayPhone[3] + arrayPhone[4] + arrayPhone[5] + "-" + arrayPhone[6] + arrayPhone[7] + arrayPhone[8] + arrayPhone[9].replace("]","");
            break;
        }

        System.out.println(phone);
     return phone;
    }

    public class Kata_1 {
        public String createPhoneNumber(int[] numbers) {
            String phoneNumber = new String("(xxx) xxx-xxxx");

            for (int i : numbers) {
                phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
            }

            return phoneNumber;
        }
    }

    public class Kata_2 {
        public String createPhoneNumber(int[] numbers) {
            return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
        }
    }

    public static void main(String[] args) {
        createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
    }
}
