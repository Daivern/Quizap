/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizap;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author brian
 */
public class Window2 extends JFrame implements ActionListener{
    JButton button;
    Window2(){
        
        Border panelborder = LineBorder.createBlackLineBorder();
        
        //JPANEL SETTINGS 
        JPanel panel = new JPanel();
            panel.setBackground(Color.YELLOW);
            panel.setBounds(0, 0, 1000, 800);
            panel.setLayout(null);
            
        JPanel panel2 = new JPanel();
            panel2.setBackground(Color.WHITE);
            panel2.setBorder(panelborder);
            panel2.setBounds(50, 75, 900, 350);
            panel2.setLayout(null);
            
        //LABEL SETTINGS    
        JLabel label = new JLabel();
            label.setText("Quiz 1");
            label.setFont(new Font("Sitka Text", Font.BOLD, 50));
            label.setBounds(430, 20, 200, 60);
        
        JLabel label2 = new JLabel();
            label2.setText("Question 1:");
            label2.setFont(new Font("Sitka Text", Font.BOLD, 40));
            label2.setBounds(20, 10, 350, 60);
        
        //RADIO BUTTON SETTINGS   
        JRadioButton radioB = new JRadioButton("A. Sample Answer");
            radioB.setBounds(100, 440, 350, 50);
            radioB.setOpaque(false);
            radioB.setFont(new Font("Sitka Text ", Font.PLAIN, 30));
            radioB.setFocusable(false);
            
        JRadioButton radioB2 = new JRadioButton("B. Sample Answer");
            radioB2.setBounds(100, 500, 350, 50);
            radioB2.setOpaque(false);
            radioB2.setFont(new Font("Sitka Text ", Font.PLAIN, 30));
            radioB2.setFocusable(false);
            
        JRadioButton radioB3 = new JRadioButton("C. Sample Answer");
            radioB3.setBounds(600, 440, 350, 50);
            radioB3.setOpaque(false);
            radioB3.setFont(new Font("Sitka Text ", Font.PLAIN, 30));
            radioB3.setFocusable(false);
            
        JRadioButton radioB4 = new JRadioButton("D. Sample Answer");
            radioB4.setBounds(600, 500, 350, 50);
            radioB4.setOpaque(false);
            radioB4.setFont(new Font("Sitka Text ", Font.PLAIN, 30));
            radioB4.setFocusable(false);
        
        //RADIOBUTTON GROUPINGS    
        ButtonGroup group = new ButtonGroup();
            group.add(radioB);
            group.add(radioB2);
            group.add(radioB3);
            group.add(radioB4);
        
        //BUTTON SETTINGS
            button = new JButton();
            button.setText("DONE");
            button.setBounds(450, 600, 100, 40);
            button.setBackground(Color.WHITE);
            button.setFont(new Font(null, Font.BOLD, 20));
            button.setFocusable(false);
            button.addActionListener(this); // BUTTON LISTENER
        
        //JFRAME SETTINGS
        this.setTitle("Window 2");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT OUT OF APPLICATION
            this.setLayout(null); //SETUP LAYOUT AS NOTHING
            this.setBounds(260, 50, 0, 0);
            this.setSize(1000, 700); 
            this.setBackground(Color.yellow);
            this.setResizable(false);
            this.setVisible(true);
        
        //DISPLAY COMPONENTS    
            this.add(panel);
            panel.add(label);
            panel.add(panel2);
            panel2.add(label2);
            panel.add(radioB);
            panel.add(radioB2);
            panel.add(radioB3);
            panel.add(radioB4);
            panel.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            new Window3(); //DISPLAY WINDOW2 AFTER CLICKING THE BUTTON
            this.dispose(); //THEN DISPOSE/CLOSE THIS FRAME
        }
    }
}
