import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FramePanel {

    String inputWord;

    public String getInputWord() {
        return inputWord;
    }

    public void setInputWord(String inputWord) {
        this.inputWord = inputWord;
    }

    public static void main(String[] args){

        JFrame cursor = new JFrame();
        FramePanel accessFramer = new FramePanel();

        cursor.setSize(1280, 800);
        cursor.setLayout(new FlowLayout());

        JLabel fieldLabel = new JLabel("Insert a Palindrome: ");
        JTextField field = new JTextField(20);
        JButton button = new JButton();

        cursor.add(fieldLabel);
        cursor.add(field);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked!");
                String resultText = field.getText().toString();
                accessFramer.setInputWord((resultText));
                System.out.println(accessFramer.getInputWord());
            }
        });
        cursor.add(button);
        cursor.setVisible(true);

    }
}
