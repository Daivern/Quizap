/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizap;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author brian
 */
public class Window6 extends JFrame{
    Window6(){
        
        Border panelborder = LineBorder.createBlackLineBorder();
        
        //JPANEL SETTINGS 
        JPanel panel = new JPanel();
            panel.setBackground(Color.YELLOW);
            panel.setBounds(0, 0, 1000, 800);
            panel.setLayout(null);
            
        JPanel panel2 = new JPanel();
            panel2.setBackground(Color.WHITE);
            panel2.setBorder(panelborder);
            panel2.setBounds(50, 100, 900, 300);
            panel2.setLayout(null);
            panel2.setOpaque(false);
        
        //LABEL SETTINGS    
        JLabel label = new JLabel();
            label.setText("Details:");
            label.setFont(new Font("Sitka Text", Font.BOLD, 50));
            label.setBounds(400, 20, 500, 60);
            
        JLabel label2 = new JLabel();
            label2.setText("Input your name:");
            label2.setFont(new Font("Sitka Text", Font.BOLD, 40));
            label2.setBounds(20, 60, 350, 60);
        
        //TEXTFIELD SETTINGS
        JTextField textfield = new RoundJTextField(15);
            textfield.setText("  ");
            textfield.setFont(new Font("Sitka Text", Font.BOLD, 40));
            textfield.setBounds(100, 120, 700, 50);
            textfield.setCaretPosition(2);
            
        //BUTTON SETTINGS
        JButton button = new JButton();
            button.setText("SEE RESULT");
            button.setBounds(401, 600, 160, 40);
            button.setBackground(Color.WHITE);
            button.setFont(new Font(null, Font.BOLD, 20));
            button.setFocusable(false);
        
        //JFRAME SETTINGS
        this.setTitle("Window 6");
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
            panel2.add(textfield);
            panel.add(button);
    }
}
