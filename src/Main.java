package src;


public class Main {
    public static void main(String[] args) {
        String  text = "i love you my dear";
        String encryptedText = encryption(text);
        System.out.println(encryption(text));
        String decryptedText = decryption(encryptedText);
        System.out.println(decryptedText);
        //
        //this is for show only
        System.out.println((char)105); // i

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
            System.out.println(c);
            int cInt = c;
            String str = String.valueOf((char)cInt);
            mergeText += str;
        }

        return mergeText;
    }
    // github.com/saifurrahman-dev Mr. Ri has add this line 
      public static String decryption(String text, int num) {
        String mergeText = "";
        for (char c : text.toCharArray()) {
            System.out.println(c);
            int cInt = c;
            String str = String.valueOf((char)cInt);
            mergeText += str;
        }

        return mergeText;
    }
}
