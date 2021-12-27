public class bool {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int s=0;
        if (a) s++;
        if (b) s++;
        if (c) s++;
        if (d) s++;
        if (s == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return s == 2 ? true : false;
    }
    public static void main(String[] args) {
        booleanExpression(true,true,false,false);
    }
}
