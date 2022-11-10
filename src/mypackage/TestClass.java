package mypackage;

public class TestClass {
    public static void main(String[] args) {
        System.out.println(reverseText("Reverse me", ""));

    }

    static String reverseText(String text, String reversedText){
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            reversedText= ch + reversedText;
        }
        return reversedText;
    } //method for reversing string
}
