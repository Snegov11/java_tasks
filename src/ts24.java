public class ts24 {
    public static boolean isPalindrome1(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(text);
        System.out.println(sb.toString().equals(text) ? true : false);
        return sb.toString().equals(text) ? true : false; // your implementation here
    }

    public static boolean isPalindrome2(String text) {
        String newString = text.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb_newString = new StringBuilder(newString);
        boolean fin = newString.equalsIgnoreCase(sb_newString.reverse().toString());
        System.out.println(fin);
        return fin;
    }

    public static void main(String[] args) {

        isPalindrome1("Madam, I'm Adam!qaz");
        isPalindrome2("Madam, I'm Adam!qaz");

    }
}
