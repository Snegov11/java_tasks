public class year {

    public static int leapYearCount(int year) {
        boolean i = false;
        if (year%4 == 0 & year%4 != 0) i = true;
        if (year%400==0) i = true;
        return i ? year: null;
    }
    public static void main(String[] args) {

    }
}
