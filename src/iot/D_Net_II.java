/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iot;

import java.awt.Event;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import static java.lang.System.exit;
import java.net.NoRouteToHostException;
//import java.net.NoRouteToHostException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 *
 * @author Dineth
 */
public class D_Net_II extends  javax.swing.JFrame  {
   Socket soc;
   int aASCII=97; 
   int command=0;
   int c1=0;
   int c2=0;
   int c3=0;
   int c4=0;
   int c5=0;
   int c6=0;
   int c7=0;
   int c8=0;
   int conn=0;
   
   
    /**
     * Creates new form Interface
     */
   Connection con=null;
   PreparedStatement pst=null;
    public D_Net_II() {
        initComponents();
        con=DbConnect.connect();
        
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        sw6 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        connect = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sw6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sw6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch/6r.png"))); // NOI18N
        sw6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sw6MouseClicked(evt);
            }
        });
        jPanel1.add(sw6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        txtStatus.setBackground(new java.awt.Color(0, 153, 153));
        txtStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(255, 255, 255));
        txtStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtStatus.setOpaque(true);
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 440, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_battle_net_25px.png"))); // NOI18N
        jLabel2.setText("JIOT Manipulator ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_close_window_25px_2.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 0, 30, 30));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_broom_90px.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 120, 120));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        connect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        connect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_disconnected_2_70px_1.png"))); // NOI18N
        connect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connectMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(connect, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(connect, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, 120));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_shutdown_25px.png"))); // NOI18N
        jLabel4.setText("<Html>By the Faculty of Technology <br> University of Ruhuna</html>");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_64bit_25px.png"))); // NOI18N
        jLabel5.setText("Version 1.0");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jToggleButton1.setText("jToggleButton1");
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeConnecition() {
		// If connected close the connection
					if(soc!=null)
					{
						if(soc.isConnected())
						{
							try {
								soc.close();
								txtStatus.setText("Socket closed");
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
								txtStatus.setText("Error closing socket");
							}
						}
					}
		
	}
    
    private void connectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectMouseClicked
        conn++;
       if(conn%2==1){
        try {
                    soc=new Socket("192.168.4.1",1987);
                    txtStatus.setText("Connected");
                    connect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_connection_sync_60px.png")));
            } 
            catch (NoRouteToHostException el){
                System.out.println("no root");// NOI18N
                
            }
            catch (SocketException el){
                System.out.println("power on wifi");
                txtStatus.setText("Power on the WI-FI");
            }
            catch (UnknownHostException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                    txtStatus.setText("Can not connect");
                    txtStatus.setText("Unknown Host");
            } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                    txtStatus.setText("Can not connect");
                    txtStatus.setText("Data Reading faliure");
            } 
      }
       else{
               closeConnecition();
               txtStatus.setText("Disconnected"); 
               connect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_disconnected_2_70px_1.png")));
               
        }
    }//GEN-LAST:event_connectMouseClicked
    
    private void sw6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sw6MouseClicked
                c6++;
                   if(c6%2==1){
                       sw6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch/6b.png")));
                       command=aASCII;
                       writeCommand(command);
                       System.out.println(command + " off ");
                   }
                   else{
                       sw6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch/6r.png")));
                       command=aASCII+1;
                       writeCommand(command);
                       System.out.println(command + " on ");
                   }  
               String sql="insert into data(sw,st)"+ " values(?,?)";
      
       try {
           pst=con.prepareStatement(sql);
          //Statement stmt=con.createStatement();
           System.out.println(c6);
           pst.setString(1,"c6");
           pst.setString(2,Integer.toString(c6));
           pst.execute();
       } catch (SQLException ex) {
           Logger.getLogger(D_Net_II.class.getName()).log(Level.SEVERE, null, ex);
       }
       catch (Exception ex){
           System.out.println(ex.getMessage());
       }
               
                   
    }//GEN-LAST:event_sw6MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.conn=0;
        connect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_disconnected_60px.png"))); 
    }//GEN-LAST:event_formWindowActivated

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
       jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_broom_100px.png"))); // NOI18N

    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
      jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_broom_90px.png"))); // NOI18N
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        for (int i = 0; i < 8; i++) {
             command=aASCII+i+7;
            writeCommand(command);
            System.out.println("command send"+ i);
        }
      
       sw6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch/6r.png"))); // NOI18N
     
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        for (int i = 0; i < 7; i++) {
             command=aASCII+i;
            writeCommand(command);
            System.out.println("command send for on "+ i);
        }
    }//GEN-LAST:event_jLabel1MouseDragged
 
  private boolean isConnected() {
		// TCheck is socket is connected to server
		if(soc!=null)
		{
			if(soc.isConnected())
				return true;
		}
		return false;
	}  
    
  
  private void writeCommand(int command) {
		// If no socket is null return
		if(soc==null)
			return;
		// if socket is connected send command
		if(soc.isConnected())
		{
			byte[] cmdByte=new byte[2];
			cmdByte[0]=(byte)command;
			byte[] temp;
			try {
				temp = "!".getBytes("US-ASCII");
				cmdByte[1]=temp[0];
				txtStatus.setText("Message sent");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				txtStatus.setText("Error");
			}
			try {
				soc.getOutputStream().write(cmdByte);
				txtStatus.setText("Message sent");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				txtStatus.setText("Error");
			}
		}
	}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(D_Net_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_Net_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_Net_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_Net_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new D_Net_II().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel connect;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel sw6;
    private javax.swing.JLabel txtStatus;
    // End of variables declaration//GEN-END:variables
}
