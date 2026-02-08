

public class Main {
    public static void main(String[] args) {

        System.out.println(encryption("i love you 300"));
        System.out.println(decryption(encryption("i love you 300")));
        //sdaw

    }   

    public static String encryption(String text) {
        String mergeText = "";
        for (char c : text.toCharArray()) {
            int t = c;
            String tTostr = Integer.toString(t);
            mergeText += tTostr;
        }

        return mergeText;
    }

    public static String decryption(String text) {
        String mergeText = "";
        for (char c : text.toCharArray()) {
            String str = String.valueOf((char) c);
            mergeText += str;
        }

        return mergeText;
    }

}
