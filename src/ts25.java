
public class ts25 {
    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        String[] arrayStr = new String[]{};
        String result = "";
        if (phrase != null && phrase != "") {
            arrayStr = phrase.split(" ");
            String[] arrayResult = new String[arrayStr.length];
            ;
            for (int i = 0; i < arrayStr.length; i++) {
                arrayResult[i] = arrayStr[i].substring(0, 1).toUpperCase() + arrayStr[i].substring(1);
            }
            result = String.join(" ", arrayResult);

        } else if (phrase == null) {
            return null;
        } else if (phrase == "") {
            return null;
        }
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        toJadenCase("most trees are blue");
    }
}
