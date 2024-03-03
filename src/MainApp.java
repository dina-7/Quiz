import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java_quiz_app.Quiz_Form;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pasic
 */
public class MainApp {
 public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Quiz App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 570);
        
        JPanel panel = new JPanel(new FlowLayout());

                ImageIcon imageIcon = new ImageIcon(MainApp.class.getResource("/resources/quiz_photo2.jpg"));
        JLabel imageLabel = new JLabel(imageIcon);
        panel.add(imageLabel);

        JButton rulesButton = new JButton("Rules");
        rulesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                  RulesWindow.showRules();
            }
        });
        rulesButton.setBackground(Color.GRAY);
        panel.add(rulesButton);
        
        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quiz_Form quizForm = new Quiz_Form();
                quizForm.setVisible(true);
            }
        });
        nextButton.setBackground(Color.GRAY);
        panel.add(nextButton);
        
        frame.add(panel);

        frame.setVisible(true);
    }   
}
