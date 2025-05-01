/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lcbusana;

import java.awt.*;
import lcbusana.auth.FormAuth;

/**
 *
 * @author Acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi Frame
        Layout main = new Layout();
        FormAuth fAuth = new FormAuth();
        
        //Atur agar frame saling berhubungan
        main.setfAuth(fAuth);
        fAuth.setMain(main);
        
        //Tampilkan Layout sebagai frame pertama
        main.setVisible(true);
    }
}
