/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busmanagement;

/**
 *
 * @author musta
 */
public class BusManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MainScreen mr=new MainScreen();     //making an object fro MainScreen jFrame 
        mr.setLocationRelativeTo(null);     //call setLocationRelativeTo(null) method for showing the frame middle point on the screen
        mr.setVisible(true);                ////and also use setVisible(true) method for showing the frame
    }
    
}
