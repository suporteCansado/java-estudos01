import java.util.Scanner;

public class Main {
    String name;
    String email;
    int age;

    public Main(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    static void ShowInfo (String information){
        System.out.print(information);
    }
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter your name");
        String nameInput = scanObj.nextLine();
        System.out.println("Enter your email");
        String emailInput = scanObj.nextLine();
        System.out.println("Enter your age");
        int ageInput = scanObj.nextInt();

        Main userInfo = new Main(nameInput,emailInput,ageInput);
        String text = String.format("Name: %s - Email: %s - Age: %d",userInfo.name,userInfo.email,userInfo.age);
        ShowInfo(text);

    }
}
