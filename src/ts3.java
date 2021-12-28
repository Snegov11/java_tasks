public class ts3 {
    public static void main(String[] args) {
        int x = 5, y = 3;
        int z = ++x;
        y += x--;
        z+= --x + y++;
        System.out.println(x + y + z);
    }
}
