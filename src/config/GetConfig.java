/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.io.*;
import static java.lang.System.exit;
import java.rmi.server.RMIClassLoader;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Dineth
 */
public class GetConfig {

    public static void main(String[] args) throws IOException {
        
        FileReader reader = new FileReader("src\\config\\configure.properties");
        Properties prop=new Properties();
        prop.load(reader);
        System.out.println(prop.getProperty("r7_sd"));
        System.out.println(prop.getProperty("r7_rt"));
        System.out.println(prop.getProperty("r7_status"));
     /*   String y= prop.getProperty("reg_valve");
        int x=Integer.parseInt(y);*/
        File file=new File("src\\config\\configure.properties");
        OutputStream out =new FileOutputStream(file);
        prop.setProperty("r1_sd","4567");
        prop.setProperty("r1_rt","1234");
        prop.store(out,null);
        
        System.out.println(prop.getProperty("reg_valve"));
        
    }
}
