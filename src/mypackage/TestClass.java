package mypackage;

public class TestClass {
    public static void main(String[] args) {
        String text = "Revert me";
        String text2 = "tenet";
        System.out.println(text + " backward is: " + reverseText(text));
        System.out.println("Is " + text2 + " palindrome? " + isPalindrome("tenet"));
    }

// method for reversing string
    static String reverseText(String text){
        String reversedText = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            reversedText = ch + reversedText;
        }
        return reversedText;
    }

// method for checking if a string is palindrome or not
    static boolean isPalindrome(String text){
        String reversedText = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            reversedText= ch + reversedText;
        }
        return text.equals(reversedText);
    }
}
