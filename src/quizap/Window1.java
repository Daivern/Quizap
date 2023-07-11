/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizap;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 *
 * @author brian
 */
public class Window1 extends JFrame implements ActionListener{
    
    /**
     *
     * @param g
     * @param c
     */ 
    JButton b1;
    
    Window1(){
        
        //INITIALIZE ICON/PHOTO
        ImageIcon icon = new ImageIcon("admin.png");
        ImageIcon icon2 = new ImageIcon("settings.png");
        
        //JPANEL SETTINGS 
        JPanel panel = new JPanel();
            panel.setBackground(Color.YELLOW);
            panel.setBounds(0, 0, 1000, 800);
            panel.setLayout(null);
        
        //LABEL SETTINGS
        JLabel label = new JLabel();
            label.setText("Quizap");
            label.setBounds(260, 150, 600,200);
            label.setFont(new Font("MV Boli", Font.BOLD, 150));
            
        //BUTTON SETTINGS
         b1 = new JButton("Quiz with Me?");
            b1.setBounds(395, 340, 230, 40);
            b1.setBackground(Color.WHITE);
            b1.setFont(new Font(null, Font.BOLD, 20));
            b1.setFocusable(false);
            
        b1.addActionListener(this); //B1 BUTTON LISTENER
        
        JButton b2 = new JButton(icon);
            b2.setBounds(830,600, 65,40);
            b2.setBackground(Color.WHITE);
            b2.setFont(new Font(null, Font.BOLD, 20));
            b2.setFocusable(false);
        
        JButton b3 = new JButton(icon2);
            b3.setBounds(901, 600, 65,40);
            b3.setBackground(Color.WHITE);
            b3.setFont(new Font(null, Font.BOLD, 20));
            b3.setFocusable(false);
        
        //JFRAME SETTINGS
        this.setTitle("Window 1");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT OUT OF APPLICATION
            this.setLayout(null); //SETUP LAYOUT AS NOTHING
            this.setBounds(260, 50, 0, 0);
            this.setSize(1000, 700); 
            this.setBackground(Color.yellow);
            this.setResizable(false);
            this.setVisible(true);
            
        //DISPLAY COMPONENTS
            this.add(label);
            this.add(panel);
            panel.add(b1);
            panel.add(b2);
            panel.add(b3);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            new Window2(); //DISPLAY WINDOW2 AFTER CLICKING THE BUTTON
            this.dispose(); //THEN DISPOSE/CLOSE THIS FRAME
        }
    }
}
