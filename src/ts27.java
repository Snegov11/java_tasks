public class ts27 {

    public static boolean getXO (String str) {
    boolean result = true;
    String[] arrayStr = str.toLowerCase().split("");
    int x = 0;
    int o = 0;
    for (int i=0;i<arrayStr.length; i++) {
        if (arrayStr[i].equals("x")) {
            x++;
        } else if (arrayStr[i].equals("o")) {
            o++;
        }
    }

    if (x==0 & o==0) {
        return result;
    } else if (x != o) {
        result = false;
    }

        // Good Luck!!
    return result;
    }

    public static void main(String[] args) {
        getXO("xxx23424esdsfvxXXOOoo");
    }
}
