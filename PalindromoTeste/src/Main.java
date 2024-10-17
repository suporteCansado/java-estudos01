import java.awt.*;
import java.util.Scanner;

public class Main {
    String word;
    Boolean isPalindrome;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Boolean PalindromeCheckerGetter() {

        return isPalindrome;
    }

    public void setPalindrome(Boolean palindrome) {
        isPalindrome = palindrome;
    }

    public static void main(String[] args) {

        Main accessInfo = new Main();
        Scanner scanObject = new Scanner(System.in);

        FramePanel accessFramer = new FramePanel();
        String wordInput = scanObject.nextLine();

    }

}