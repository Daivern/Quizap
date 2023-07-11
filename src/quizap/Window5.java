/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizap;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author brian
 */
public class Window5 extends JFrame implements ActionListener {
    final private static Color mainColor = new Color(255,255,0);
    final private static Font mainFont = new Font("Sitka Text", Font.BOLD, 40);
    final private static Font quizzz = new Font("Sitka Text", Font.PLAIN, 65);
    final private static Font titleFont = new Font("Sitka Text", Font.BOLD, 50);
    final private static Font takes = new Font("Sitka Text", Font.BOLD, 20);
    final private static Font label = new Font("Sitka Text", Font.BOLD, 30);

    JButton takeBtn;
    
public Window5(){
    JFrame frame = new JFrame();
        frame.setTitle("Window 5");
        frame.getContentPane().setBackground(new Color(255, 255, 0));
        frame.setSize(1000, 800);
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        JLabel resultTitle = new JLabel("RESULT:");
        resultTitle.setFont(quizzz);
        resultTitle.setBounds(100,100,500,100);

        panel1.setBackground(mainColor);
        panel1.add(resultTitle);

        JPanel panel2 = new JPanel();
        panel2.setBackground(mainColor);
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER,5, 20));

        takeBtn = new JButton("Take Again?");
        takeBtn.setFocusable(false);
        takeBtn.setBackground(Color.WHITE);
        //POSITION BTN LOWER MORE
        takeBtn.setFont(takes);
        takeBtn.addActionListener(this);
        panel2.add(takeBtn);

        
        JPanel panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBackground(mainColor);

        JPanel namequiz = new JPanel(new GridLayout(2,2,5,10));
        namequiz.setPreferredSize(new Dimension(400,400));
        namequiz.setBounds(40,50,550,300);
        namequiz.setBackground(mainColor);

        JPanel name = new JPanel(null);
        name.setBackground(mainColor);
        name.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        namequiz.add(name);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 10, 150, 50);
        nameLabel.setFont(label);
        name.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(80, 60, 400, 50);
        nameField.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        nameField.setEditable(false);
        name.add(nameField);
        
        JPanel quiz = new JPanel(null);
        quiz.setBackground(mainColor);
        quiz.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        namequiz.add(quiz);

        JLabel nameQuiz = new JLabel("Quiz 1");
        nameQuiz.setBounds(20, 10, 150, 50);
        nameQuiz.setFont(label);
        quiz.add(nameQuiz);

        JTextField quizField = new JTextField();
        quizField.setBounds(80, 60, 400, 50);
        quizField.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        quizField.setEditable(false);
        quiz.add(quizField);
        

        JPanel scoreItems = new JPanel(new GridLayout(2, 2,10,10));
        scoreItems.setBackground(mainColor);
        scoreItems.setBounds(650,0,200,400);

        JPanel score = new JPanel(null){
             public void paintComponent(Graphics g) {
                int X=25;
                int Y=25;
                int d=150;
                g.setColor(Color.WHITE); 
                g.fillOval(X, Y, d, d);

                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.BLACK); 
                g2d.setStroke(new BasicStroke(3));
                g2d.drawOval(X, Y, d, d);
            }
        };
        JLabel scoreNo = new JLabel("Score");
        scoreNo.setBounds(73, 55, 100, 100);
        scoreNo.setFont(takes);
        score.add(scoreNo);

        score.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        scoreItems.add(score);

        JPanel items = new JPanel(null){
             public void paintComponent(Graphics g) {
                int X=25;
                int Y=25;
                int d=150;
                g.setColor(Color.WHITE); 
                g.fillOval(X, Y, d, d);

                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.BLACK); 
                g2d.setStroke(new BasicStroke(3));
                g2d.drawOval(X, Y, d, d);
            }
        };
        JLabel scoreit = new JLabel("Items");
        scoreit.setBounds(73, 55, 100, 100);
        scoreit.setFont(takes);
        items.add(scoreit);
        
        items.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));

        scoreItems.add(items);

        panel3.add(scoreItems);
        panel3.add(namequiz);

        JPanel panel4 = new JPanel();
        panel4.setBackground(mainColor);

        JPanel panel5 = new JPanel();
        panel5.setBackground(mainColor);

        panel1.setPreferredSize(new Dimension(100, 200));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(50, 100));
        panel5.setPreferredSize(new Dimension(50, 100));
        panel4.setPreferredSize(new Dimension(40, 100));
        panel5.setPreferredSize(new Dimension(40, 100));

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.CENTER);
        frame.add(panel4,BorderLayout.EAST);
        frame.add(panel5,BorderLayout.WEST);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == takeBtn){
            new Window6(); //DISPLAY WINDOW2 AFTER CLICKING THE BUTTON
            this.dispose(); //THEN DISPOSE/CLOSE THIS FRAME
        }
    }
}
