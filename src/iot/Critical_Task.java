/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iot;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dinet
 */
public class Critical_Task {

    public Critical_Task() {
        try {
            getDataP() ;
        } catch (IOException ex) {
            Logger.getLogger(Critical_Task.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    int r1_status = 0, r1_sd = 0, r1_rt = 0, r1_tt = 0;
    int r2_status = 0, r2_sd = 0, r2_rt = 0, r2_tt = 0;
    int r3_status = 0, r3_sd = 0, r3_rt = 0, r3_tt = 0;
    int r4_status = 0, r4_sd = 0, r4_rt = 0, r4_tt = 0;
    int r5_status = 0, r5_sd = 0, r5_rt = 0, r5_tt = 0;
    int r6_status = 0, r6_sd = 0, r6_rt = 0, r6_tt = 0;
    int r7_status = 0, r7_sd = 0, r7_rt = 0, r7_tt = 0;

    int p1_status = 0, p1_sd = 0, p1_rt = 0, p1_tt = 0;
    int p2_status = 0, p2_sd = 0, p2_rt = 0, p2_tt = 0;
    int p3_status = 0, p3_sd = 0, p3_rt = 0, p3_tt = 0;
    int p4_status = 0, p4_sd = 0, p4_rt = 0, p4_tt = 0;
    int p5_status = 0, p5_sd = 0, p5_rt = 0, p5_tt = 0;
    int p6_status = 0, p6_sd = 0, p6_rt = 0, p6_tt = 0;
    int p7_status = 0, p7_sd = 0, p7_rt = 0, p7_tt = 0;
    
    int q1_sd = 0, q1_rt = 0, q1_status = 0;
    int q2_sd = 0, q2_rt = 0, q2_status = 0;
    int q3_sd = 0, q3_rt = 0, q3_status = 0;
    int q4_sd = 0, q4_rt = 0, q4_status = 0;
    int q5_sd = 0, q5_rt = 0, q5_status = 0;
    int q6_sd = 0, q6_rt = 0, q6_status = 0;
    int q7_sd = 0, q7_rt = 0, q7_status = 0;

    
    
        public int getDataP() throws IOException {
        int critical_time=0;
        FileReader reader = new FileReader("src\\config\\configure.properties");
        Properties prop = new Properties();
        prop.load(reader);

        this.p1_sd = Integer.valueOf(prop.getProperty("p1_sd"));
        this.p1_rt = Integer.valueOf(prop.getProperty("p1_rt"));
        this. p1_tt =this.p1_rt+this.p1_sd;
        
        this.p2_sd = Integer.valueOf(prop.getProperty("p2_sd"));
        this.p2_rt = Integer.valueOf(prop.getProperty("p2_rt"));
        this. p2_tt =this.p2_rt+this.p2_sd;
         
        this.p3_sd = Integer.valueOf(prop.getProperty("p3_sd"));
        this.p3_rt = Integer.valueOf(prop.getProperty("p3_rt"));
        this. p3_tt =this.p3_rt+this.p3_sd;
        
        this.p4_sd = Integer.valueOf(prop.getProperty("p4_sd"));
        this.p4_rt = Integer.valueOf(prop.getProperty("p4_rt"));
        this. p4_tt =this.p4_rt+this.p4_sd;

        this.p5_sd = Integer.valueOf(prop.getProperty("p5_sd"));
        this.p5_rt = Integer.valueOf(prop.getProperty("p5_rt"));
        this. p5_tt =this.p5_rt+this.p5_sd;

        this.p6_sd = Integer.valueOf(prop.getProperty("p6_sd"));
        this.p6_rt = Integer.valueOf(prop.getProperty("p6_rt"));
        this. p6_tt =this.p6_rt+this.p6_sd;

        this.p7_sd = Integer.valueOf(prop.getProperty("p7_sd"));
        this.p7_rt = Integer.valueOf(prop.getProperty("p7_rt"));
        this. p7_tt =this.p7_rt+this.p7_sd;
        
        
        int arr[]={this.p1_tt,this.p2_tt,this.p3_tt,this.p4_tt,this.p5_tt,this.p6_tt,this.p7_tt};
        Arrays.sort(arr);
        critical_time=arr[6];
        reader.close();
        return critical_time;
    }

    
}
