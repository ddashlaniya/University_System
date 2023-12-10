package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.*;
public class chattoo extends JFrame{
    private JTextArea chatArea;
    private JTextField inputField;

    public chattoo() {
        setTitle("Chat Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        inputField = new JTextField();
        inputField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userInput = inputField.getText();
                chatArea.append("You: " + userInput + "\n");
                inputField.setText("");

                // Call the ChatGPT API to get the response
                CompletableFuture.supplyAsync(() -> getChatGPTResponse(userInput))
                        .thenAccept(response -> {
                            SwingUtilities.invokeLater(() -> {
                                chatArea.append("ChatGPT: " + response + "\n");
                            });
                        });
            }
        });
        add(inputField, BorderLayout.SOUTH);

        setSize(400, 300);
        setVisible(true);
    }

    private String getChatGPTResponse(String input) {
        // Code to call the ChatGPT API and get the response
        // Replace this with your implementation to connect with the API
        // For simplicity, a placeholder response is returned here
        return "This is a placeholder response from ChatGPT.";
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new chattoo();
            }
        });
    }
}
