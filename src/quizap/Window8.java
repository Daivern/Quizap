/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizap;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author brian
 */
public class Window8 extends JFrame implements ActionListener{
    JButton button;
            
    public Window8() {
    
    Border panelborder = LineBorder.createBlackLineBorder();
    //BUTTON SETTINGS
            button = new JButton();
            button.setText("DONE");
            button.setBounds(701, 600, 100, 40);
            button.setBackground(Color.WHITE);
            button.setFont(new Font(null, Font.BOLD, 20));
            button.setFocusable(false);
            button.addActionListener(this);
            
        JButton button2 = new JButton();
            button2.setText("ADD");
            button2.setBounds(50, 600, 100, 40);
            button2.setBackground(Color.WHITE);
            button2.setFont(new Font(null, Font.BOLD, 20));
            button2.setFocusable(false);
            
        JButton button3 = new JButton();
            button3.setText("EDIT");
            button3.setBounds(825, 131, 150, 40);
            button3.setBackground(Color.WHITE);
            button3.setFont(new Font(null, Font.BOLD, 20));
            button3.setFocusable(false);
            
        JButton button4 = new JButton();
            button4.setText("REMOVE");
            button4.setBounds(825, 180, 150, 40);
            button4.setBackground(Color.WHITE);
            button4.setFont(new Font(null, Font.BOLD, 20));
            button4.setFocusable(false);
        
        JButton button5 = new JButton();
            button5.setText("EDIT");
            button5.setBounds(825, 291, 150, 40);
            button5.setBackground(Color.WHITE);
            button5.setFont(new Font(null, Font.BOLD, 20));
            button5.setFocusable(false);
            
        JButton button6 = new JButton();
            button6.setText("REMOVE");
            button6.setBounds(825, 341, 150, 40);
            button6.setBackground(Color.WHITE);
            button6.setFont(new Font(null, Font.BOLD, 20));
            button6.setFocusable(false);
            
        JButton button7 = new JButton();
            button7.setText("EDIT");
            button7.setBounds(825, 451, 150, 40);
            button7.setBackground(Color.WHITE);
            button7.setFont(new Font(null, Font.BOLD, 20));
            button7.setFocusable(false);
            
        JButton button8 = new JButton();
            button8.setText("REMOVE");
            button8.setBounds(825, 500, 150, 40);
            button8.setBackground(Color.WHITE);
            button8.setFont(new Font(null, Font.BOLD, 20));
            button8.setFocusable(false);
            
        JButton button9 = new JButton();
            button9.setText("<");
            button9.setBounds(50, 40, 75, 40);
            button9.setBackground(Color.WHITE);
            button9.setFont(new Font(null, Font.BOLD, 20));
            button9.setFocusable(false);
            
    //LABEL SETTINGS    
        JLabel label = new JLabel();
            label.setText("QUIZ 1");
            label.setFont(new Font("Sitka Text", Font.BOLD, 50));
            label.setBounds(30, 50, 500, 60);
        
        JLabel label2 = new JLabel();
            label2.setText("QUIZ 2");
            label2.setFont(new Font("Sitka Text", Font.BOLD, 50));
            label2.setBounds(30, 50, 500, 60);
            
        JLabel label3 = new JLabel();
            label3.setText("QUIZ 3");
            label3.setFont(new Font("Sitka Text", Font.BOLD, 50));
            label3.setBounds(30, 50, 500, 60);
            
        JLabel label4 = new JLabel();
            label4.setText("Amount of Question: 10");
            label4.setFont(new Font("Sitka Text", Font.BOLD, 30));
            label4.setBounds(350, 20, 400, 60);
            
        JLabel label5 = new JLabel();
            label5.setText("Amount of Question: 30");
            label5.setFont(new Font("Sitka Text", Font.BOLD, 30));
            label5.setBounds(350, 20, 400, 60);
            
        JLabel label6 = new JLabel();
            label6.setText("Amount of Question: 50");
            label6.setFont(new Font("Sitka Text", Font.BOLD, 30));
            label6.setBounds(350, 20, 400, 60);
            
        JLabel label7 = new JLabel();
            label7.setText("Sample Title of Questionnaire");
            label7.setFont(new Font("Sitka Text", Font.BOLD, 30));
            label7.setBounds(280, 60, 450, 60);
            
        JLabel label8 = new JLabel();
            label8.setText("Sample Title of Questionnaire");
            label8.setFont(new Font("Sitka Text", Font.BOLD, 30));
            label8.setBounds(280, 60, 450, 60);
            
        JLabel label9 = new JLabel();
            label9.setText("Sample Title of Questionnaire");
            label9.setFont(new Font("Sitka Text", Font.BOLD, 30));
            label9.setBounds(280, 60, 450, 60);
            
    //JPANEL SETTINGS 
        JPanel panel = new JPanel();
            panel.setBackground(Color.YELLOW);
            panel.setBounds(0, 0, 1000, 800);
            panel.setLayout(null);
        
        JPanel panel2 = new JPanel();
            panel2.setBackground(Color.WHITE);
            panel2.setBorder(panelborder);
            panel2.setBounds(50, 100, 750, 150);
            panel2.setLayout(null);
            panel2.setOpaque(false);
            
        JPanel panel3 = new JPanel();
            panel3.setBackground(Color.WHITE);
            panel3.setBorder(panelborder);
            panel3.setBounds(50, 260, 750, 150);
            panel3.setLayout(null);
            panel3.setOpaque(false);
            
        JPanel panel4 = new JPanel();
            panel4.setBackground(Color.WHITE);
            panel4.setBorder(panelborder);
            panel4.setBounds(50, 420, 750, 150);
            panel4.setLayout(null);
            panel4.setOpaque(false);
            
    //JFRAME SETTINGS
        this.setTitle("Window 8");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT OUT OF APPLICATION
            this.setLayout(null); //SETUP LAYOUT AS NOTHING
            this.setBounds(260, 50, 0, 0);
            this.setSize(1000, 700); 
            this.setBackground(Color.yellow);
            this.setResizable(false);
            this.setVisible(true);
            
    //DISPLAY COMPONENTS    
            this.add(panel);
            panel.add(panel2);
            panel.add(panel3);
            panel.add(panel4);
            panel2.add(label);
            panel3.add(label2);
            panel4.add(label3);
            panel2.add(label4);
            panel3.add(label5);
            panel4.add(label6);
            panel2.add(label7);
            panel3.add(label8);
            panel4.add(label9);
            panel.add(button);
            panel.add(button2);
            panel.add(button3);
            panel.add(button4);
            panel.add(button5);
            panel.add(button6);
            panel.add(button7);
            panel.add(button8);
            panel.add(button9);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            new Window9();
            this.dispose();
        }
    }
}
