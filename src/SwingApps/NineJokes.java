package SwingApps;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alex on 19-Jun-17.
 */
public class NineJokes {
    private JPanel jokesTopPanel;
    private JButton joke1;
    private JButton joke2;
    private JButton joke3;
    private JButton joke4;
    private JButton joke5;
    private JButton joke6;
    private JButton joke7;
    private JButton joke8;
    private JButton joke9;
    private JLabel nineJokesLabel;
    private JTextArea jokeTextArea;
    private final static String newline = "\n";

    public NineJokes() {

        joke1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jokeTextArea.append("This was the first joke, haha..." + newline);
            }
        });

        joke2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jokeTextArea.append("This was the second joke, haha..."+ newline);
            }
        });

        joke3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jokeTextArea.append("This was the third joke, haha..."+ newline);
            }
        });

        joke4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jokeTextArea.append("This was the forth joke, haha..."+ newline);
            }
        });

        joke5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jokeTextArea.append("This was the fifth joke, haha..."+ newline);
            }
        });

        joke6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jokeTextArea.append("This was the sixth joke, haha..."+ newline);
            }
        });

        joke7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jokeTextArea.append("This was the seventh joke, haha..."+ newline);
            }
        });

        joke8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jokeTextArea.append("This was the eighth joke, haha..."+ newline);
            }
        });

        joke9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jokeTextArea.append("This was the ninth joke, haha..."+ newline);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("NineJokes");
            frame.setSize(500, 500);
            frame.setResizable(false);
            frame.setContentPane(new NineJokes().jokesTopPanel);
            frame.pack();

        JTextArea textArea = new JTextArea("TEST");
        textArea.setSize(400, 400);
            textArea.setLineWrap(true);
            textArea.setEditable(false);
            textArea.setVisible(true);

        JScrollPane scroll = new JScrollPane(textArea);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        frame.add(scroll);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
