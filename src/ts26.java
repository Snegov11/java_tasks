public class ts26 {

    public static String maskify(String str) {
        String result = "";
        if (str.length() < 5 || str == "") {
            return str;
        } else if (str == null) {
            return null;
        } else {
            String[] arrayStr = str.split("");
            for (int i=0; i<arrayStr.length; i++) {
                arrayStr[i] = "#";
                if (arrayStr[i] == arrayStr[arrayStr.length - 5]) {
                    break;
                }
            }
            result = String.join("",arrayStr);
        }
        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        maskify("Nananananananananananananananana Batman!");
    }
}
