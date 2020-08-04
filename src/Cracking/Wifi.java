/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cracking;

/**
 *
 * @author Dineth
 */
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Wifi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socket soc = new Socket();
        InetSocketAddress add = new InetSocketAddress("www.google.com",8080);
        try {
            soc.connect(add,3000);
            System.out.println("okay");
        } catch (Exception e) {
            System.out.println("unable to reach  "+ e);
        }
        finally{
            try {
                soc.close();
            } catch (IOException ex) {
                Logger.getLogger(Wifi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    

}
