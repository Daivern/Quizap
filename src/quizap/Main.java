/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizap;
import javax.swing.UIManager;

/**
 *
 * @author brian
 */
public class Main {

    
    public static void main(String[] args){
        
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (Exception ee) {
            System.out.println(ee);
        }
        
        //CALL YOUR WINDOW HERE
        new Window1();
    }
}
