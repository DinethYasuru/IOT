/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cracking;

import com.sun.corba.se.spi.ior.WriteContents;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.NoRouteToHostException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dineth
 */
public class D_net_IOT_II_crack {

    public D_net_IOT_II_crack() {
    
    }
 
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

    public void connect() {
        try {
            Socket soc = new Socket("192.168.4.1", 6377);
            Scanner val = new Scanner(System.in);
            int x = val.nextInt();

            writeCommand(x, soc);

        } catch (NoRouteToHostException el) {
            System.out.println("no root");// NOI18N

        } catch (SocketException el) {
            System.out.println("power on wifi");

        } catch (UnknownHostException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            System.out.println("no host");
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            System.out.println("unable to connect");
        }
    }

    public static void writeCommand(int command, Socket soc) {
        // If no socket is null return

        byte[] cmdByte = new byte[2];
        cmdByte[0] = (byte) command;
        byte[] temp;
        try {
            temp = "!".getBytes("US-ASCII");
            cmdByte[1] = temp[0];
            System.out.println("code out complete");

        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block

        }
        try {
            soc.getOutputStream().write(cmdByte);

        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        }
    }

}
