import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyQueueGUI extends JFrame {

    private MyQueue stack;
    private JTextArea displayArea;
    private JTextField inputField;

    public MyQueueGUI() {
        stack = new MyQueue();

        setTitle("Стек из двух очередей");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        inputField = new JTextField();

        JButton pushButton = new JButton("Добавить");
        pushButton.setBackground(Color.PINK);
        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(inputField.getText());
                    stack.push(value);
                    updateDisplay();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Нужно ввести целые числа");
                }
            }
        });

        JButton emptyButton = new JButton("Пусто?");
        emptyButton.setBackground(Color.PINK);
        emptyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Стек пуст? " + stack.isEmpty());
            }
        });

        JButton popButton = new JButton("Удалить первый элемент");
        popButton.setBackground(Color.PINK);
        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stack.isEmpty()) {
                    stack.pop();
                    updateDisplay();
                } else {
                    JOptionPane.showMessageDialog(null, "Стек пуст");
                }
            }
        });

        JButton topButton = new JButton("Показать первый элемент");
        topButton.setBackground(Color.PINK);
        topButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stack.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Элемент на вершине стека: " + stack.top());
                } else {
                    JOptionPane.showMessageDialog(null, "Стек пуст");
                }
            }
        });

        displayArea = new JTextArea();
        displayArea.setEditable(false);

        JPanel inputPanel = new JPanel(new GridLayout(1, 2));
        inputPanel.add(inputField);
        inputPanel.add(pushButton);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(emptyButton);
        buttonPanel.add(topButton);
        buttonPanel.add(popButton);

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(displayArea), BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);
    }

    private void updateDisplay() {
        displayArea.setText(stack.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MyQueueGUI().setVisible(true);
        });
    }
}
