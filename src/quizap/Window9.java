/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizap;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author brian
 */
public class Window9 {
    final private static Color mainColor = new Color(255,255,0);
    final private static Font mainFont = new Font("Sitka Text", Font.BOLD, 40);
    final private static Font titleFont = new Font("Sitka Text", Font.BOLD, 50);
public Window9(){
    JFrame frame = new JFrame();
        frame.setTitle("Window 9");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(255, 255, 0));
        frame.setSize(1000, 800);
        frame.setLayout(new BorderLayout());


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(new Color(255,255,0));
        panel2.setBackground(new Color(255,255,0));
        panel3.setBackground(new Color(255,255,0));
        panel4.setBackground(new Color(255,255,0));
        panel5.setBackground(new Color(255,255,0));

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(50, 100));
        panel5.setPreferredSize(new Dimension(50, 100));

        panel1.setLayout(new FlowLayout(FlowLayout.LEADING,50,15));

        
        JButton backbtn = new JButton();
        backbtn.setFont(mainFont);
        backbtn.setIcon(new ImageIcon("C:\\Users\\ANGELA\\Downloads\\icons8-less-than-60 (1).png"));
        backbtn.setBackground(mainColor);
        backbtn.setBorder(BorderFactory.createEmptyBorder());
        // backbtn.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        JLabel quizTitle = new JLabel("Quiz 1");
        quizTitle.setFont(titleFont);
        panel1.add(backbtn);
        panel1.add(quizTitle);

        

        JTextArea textArea = new JTextArea("Question 1"); // Create a JTextArea
        textArea.setFont(new Font("Sitka Text", Font.PLAIN, 16));
        textArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
        textArea.setBackground(Color.WHITE);
        textArea.setBorder(BorderFactory.createCompoundBorder(
            textArea.getBorder(),
            BorderFactory.createEmptyBorder(10,10,10,10)
        ));
        JPanel quizoptions = new JPanel();
        quizoptions.setBackground(new Color(255,255,0));
        quizoptions.setLayout(new GridLayout(2,6, 10,10));

        JRadioButton optionA = new JRadioButton();
        optionA.setHorizontalAlignment(SwingConstants.RIGHT);
        optionA.setFont(optionA.getFont().deriveFont(Font.PLAIN, 16f));
        optionA.setIcon(new RadioButtonIcon(40));
        optionA.setBackground(mainColor);

        JLabel optionALabel = new JLabel("A.");
        optionALabel.setHorizontalAlignment(SwingConstants.CENTER);
        optionALabel.setFont(mainFont);
        JTextField answerA = new JTextField();
        answerA.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        answerA.setBackground(Color.WHITE);

        JRadioButton optionB = new JRadioButton();
        optionB.setHorizontalAlignment(SwingConstants.RIGHT);
        optionB.setFont(optionB.getFont().deriveFont(Font.PLAIN, 16f));
        optionB.setIcon(new RadioButtonIcon(40));
        optionB.setBackground(mainColor);
        
        JLabel optionBLabel = new JLabel("B.");
        optionBLabel.setHorizontalAlignment(SwingConstants.CENTER);
        optionBLabel.setFont(mainFont);
        JTextField answerB = new JTextField();
        answerB.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        answerB.setBackground(Color.WHITE);

        JRadioButton optionC = new JRadioButton();
        optionC.setFont(optionC.getFont().deriveFont(Font.PLAIN, 16f));
        optionC.setIcon(new RadioButtonIcon(40));
        optionC.setHorizontalAlignment(SwingConstants.RIGHT);
        optionC.setBackground(mainColor);

        JLabel optionCLabel = new JLabel("C.");
        optionCLabel.setHorizontalAlignment(SwingConstants.CENTER);
        optionCLabel.setFont(mainFont);
        JTextField answerC = new JTextField();
        answerC.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        answerC.setBackground(Color.WHITE);

        JRadioButton optionD = new JRadioButton();
        optionD.setFont(optionD.getFont().deriveFont(Font.PLAIN, 16f));
        optionD.setIcon(new RadioButtonIcon(40));
        optionD.setHorizontalAlignment(SwingConstants.RIGHT);
        optionD.setBackground(mainColor);

        JLabel optionDLabel = new JLabel("D.");
        optionDLabel.setHorizontalAlignment(SwingConstants.CENTER);
        optionDLabel.setFont(mainFont);
        JTextField answerD = new JTextField();
        answerD.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        answerD.setBackground(Color.WHITE);

        ButtonGroup quizGroup = new ButtonGroup();
        quizGroup.add(optionA);
        quizGroup.add(optionB);
        quizGroup.add(optionC);
        quizGroup.add(optionD);

        quizoptions.add(optionA);
        quizoptions.add(optionALabel);
        quizoptions.add(answerA);
        quizoptions.add(optionB);
        quizoptions.add(optionBLabel);
        quizoptions.add(answerB);
        quizoptions.add(optionC);
        quizoptions.add(optionCLabel);
        quizoptions.add(answerC);
        quizoptions.add(optionD);
        quizoptions.add(optionDLabel);
        quizoptions.add(answerD);

        panel3.setLayout(new GridLayout(2,1, 0,10));
        panel3.add(textArea); // Add the text area to panel3
        panel3.add(quizoptions);

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.CENTER);
        frame.add(panel4,BorderLayout.EAST);
        frame.add(panel5,BorderLayout.WEST);
        frame.setVisible(true);

        panel2.setLayout( new GridLayout(1,1));

        JButton clearbtn = new JButton("Clear");
        clearbtn.setBackground(Color.WHITE);
        
        clearbtn.setFont(mainFont);
        JButton addbtn = new JButton("Add");
        addbtn.setBackground(Color.WHITE);
        
        addbtn.setFont(mainFont);
        JPanel clearadd = new JPanel();
        clearadd.setLayout(new FlowLayout(FlowLayout.LEADING, 51, 21));
        clearadd.setBackground(mainColor);
        clearadd.add(clearbtn);
        clearadd.add(addbtn);

        JButton savebtn = new JButton("Save");
        savebtn.setBackground(Color.WHITE);
        
        savebtn.setFont(mainFont);
        JPanel save = new JPanel();
        save.setLayout(new FlowLayout(FlowLayout.TRAILING, 51, 21));
        save.setBackground(mainColor);
        save.add(savebtn);
        
        panel2.add(clearadd);
        panel2.add(save);
        
    }
    private static class RadioButtonIcon implements Icon {
        private final int size;

        public RadioButtonIcon(int size) {
            this.size = size;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            ButtonModel model = ((AbstractButton) c).getModel();
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            Color selectedColor = Color.BLACK;     
            Color unselectedColor = Color.WHITE;    

            if (model.isSelected()) {
                g2d.setColor(unselectedColor);
                g2d.fillOval(x, y, size, size);
                g2d.setColor(selectedColor);
                g2d.fillOval(x + 4, y + 4, size - 8, size - 8);
            } else {
                g2d.setColor(selectedColor);
                g2d.fillOval(x, y, size, size);
                g2d.setColor(unselectedColor);
                g2d.fillOval(x + 4, y + 4, size - 8, size - 8);
            }

            g2d.dispose();
        }

        @Override
        public int getIconWidth() {
            return size;
        }

        @Override
        public int getIconHeight() {
            return size;
        }
    }
}
