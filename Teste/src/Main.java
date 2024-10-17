import java.util.Scanner;

public class Main {
    String word;

    public void setWord(String word) {
        this.word = word;
    }
    public String getWord() {
        return word;
    }

    static void inspectWord(String word){
        System.out.println(word);
    }

    Runnable exampleFunction = ()-> System.out.println("Teste");

    public static void main(String[] args) {
        try {
            Scanner scanOjbt = new Scanner(System.in);
            Main mainOjbt = new Main();
            System.out.println("Enter a word: ");
            String userInput = scanOjbt.nextLine();

            mainOjbt.setWord(userInput);
            inspectWord(mainOjbt.getWord());
            mainOjbt.exampleFunction.run();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}