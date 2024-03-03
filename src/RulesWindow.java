/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
import java_quiz_app.Quiz_Form;
/**
 *
 * @author pasic
 */
public class RulesWindow {
    public static void showRules() {
        JFrame rulesFrame = new JFrame("Quiz Rules");
        rulesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        rulesFrame.setSize(600, 300);
        rulesFrame.getContentPane().setBackground(new Color(240, 240, 240));

        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(new Color(200, 200, 200));
        contentPanel.setLayout(new BorderLayout(10, 10));
        rulesFrame.add(contentPanel);

        JLabel titleLabel = new JLabel("Rules");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 25));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        contentPanel.add(titleLabel, BorderLayout.NORTH);

        JTextArea rulesTextArea = new JTextArea();
        rulesTextArea.setEditable(false);
        rulesTextArea.setText(
            "1. Time Limit: 20 seconds per question. Speed and efficiency are crucial.\n" +
            "2. One Answer: Each question has one correct answer.\n" +
            "3. No Assistance: Participants must not seek external help or advice during the quiz.\n" +
            "4. No Pre-prepared Answers: Responses must be immediate and based on the given options.\n" +
            "5. Eliminate Distractions: The quiz requires a calm environment for full concentration.\n" +
            "6. Accuracy Over Speed: The quality of answers is more important than speed.\n" +
            "7. Correct Input: Careful input of answers to avoid mistakes.\n" +
            "8. Respect Quiz Rules: All quiz rules must be adhered to for fair competition.\n" +
            "9. Unchangeable Answers: Responses cannot be altered after confirmation.\n" +
            "10. Results and Prizes: Results will be disclosed post-quiz. Good luck!\n"
        );

        JScrollPane scrollPane = new JScrollPane(rulesTextArea);
        contentPanel.add(scrollPane, BorderLayout.CENTER);

        JButton nextButton = new JButton("Next");
        nextButton.setBackground(Color.GRAY);
        nextButton.addActionListener(e -> {
            rulesFrame.dispose();
            new Quiz_Form().setVisible(true);
        });
        contentPanel.add(nextButton, BorderLayout.SOUTH);

        rulesFrame.setVisible(true);
    }
}
