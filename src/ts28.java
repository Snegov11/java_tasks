public class ts28 {

    public static boolean check(String sentence){
        //code
        String aZ = "abcdefghijklmnopqrstuvwxyz";
        int count = 26;
        int score = 0;
        String[] sentenceArray = sentence.toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9]", "").split("");
        for(int i=0; i<sentenceArray.length; i++) {
            if (aZ.contains(sentenceArray[i])) {
                score++;
            }
        }
        System.out.println(score>=count);
        return score>=count;
    }

    public boolean checkV2(String sentence){
        char[] characterArray = sentence.toLowerCase().toCharArray();
        int map[] = new int[26];
        int sum = 0;

        for(char current : characterArray) {

            int asciiCode = (int) current;
            if (asciiCode >= 97 && asciiCode <= 122) {

                if (map[122 - asciiCode] == 0) {

                    sum += 1;
                    map[122 - asciiCode] = 1;
                }
            }
        }

        return sum == 26;
    }

    public boolean checkV3(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

    }

    public static void main(String[] args) {
        check("The quick brown fox jumps over the lazy dog.");
    }
}
