/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iot;

import java.awt.Event;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.lang.Math;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import static java.lang.System.exit;
import static java.lang.Thread.sleep;
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
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 *
 * @author Dineth
 */
public class Deinfection extends javax.swing.JFrame {

    Socket soc;
    int aASCII = 97;
    int command = 0;
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    int c4 = 0;
    int c5 = 0;
    int c6 = 0;
    int c7 = 0;
    int c8 = 0;
    int conn = 0;

    /**
     * Creates new form Interface
     */
    Connection con = null;
    PreparedStatement pst = null;

    public Deinfection() throws IOException {
        initComponents();
        
        con = DbConnect.connect();

    }

    int r1_status = 0, r1_sd = 0, r1_rt = 0;
    int r2_status = 0, r2_sd = 0, r2_rt = 0;
    int r3_status = 0, r3_sd = 0, r3_rt = 0;
    int r4_status = 0, r4_sd = 0, r4_rt = 0;
    int r5_status = 0, r5_sd = 0, r5_rt = 0;
    int r6_status = 0, r6_sd = 0, r6_rt = 0;
    int r7_status = 0, r7_sd = 0, r7_rt = 0;

    int q1_sd = 0, q1_rt = 0, q1_status = 0;
    int q2_sd = 0, q2_rt = 0, q2_status = 0;
    int q3_sd = 0, q3_rt = 0, q3_status = 0;
    int q4_sd = 0, q4_rt = 0, q4_status = 0;
    int q5_sd = 0, q5_rt = 0, q5_status = 0;
    int q6_sd = 0, q6_rt = 0, q6_status = 0;
    int q7_sd = 0, q7_rt = 0, q7_status = 0;
    
    int p1_sd = 0, p1_rt = 0, p1_status = 0;
    int p2_sd = 0, p2_rt = 0, p2_status = 0;
    int p3_sd = 0, p3_rt = 0, p3_status = 0;
    int p4_sd = 0, p4_rt = 0, p4_status = 0;
    int p5_sd = 0, p5_rt = 0, p5_status = 0;
    int p6_sd = 0, p6_rt = 0, p6_status = 0;
    int p7_sd = 0, p7_rt = 0, p7_status = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 300));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 300));
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_shutdown_25px.png"))); // NOI18N
        jLabel4.setText("<Html>By the Faculty of Technology <br> University of Ruhuna</html>");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 700, -1, -1));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_standing_man_127px_1.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jLabel1MouseWheelMoved(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 120, 150));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_standing_man_127px_1.png"))); // NOI18N
        jLabel3.setOpaque(true);
        jLabel3.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jLabel3MouseWheelMoved(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 150));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_standing_man_127px_1.png"))); // NOI18N
        jLabel5.setOpaque(true);
        jLabel5.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jLabel5MouseWheelMoved(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 120, 150));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 300));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_battle_net_25px.png"))); // NOI18N
        jLabel2.setText("JIOT Manipulator ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
String reg_valve = null, reg_move = null, reg_first_delay = null;

    public void getconfigdata() throws IOException {
        FileReader reader = new FileReader("src\\config\\configure.properties");
        Properties prop = new Properties();
        prop.load(reader);
        this.reg_valve = prop.getProperty("reg_valve");
        this.reg_move = prop.getProperty("reg_move");
        this.reg_first_delay = prop.getProperty("reg_first_delay");
        String y = prop.getProperty("reg_valve");
        int x = Integer.parseInt(y);
        File file = new File("src\\config\\configure.properties");
        OutputStream out = new FileOutputStream(file);
        prop.setProperty("reg_valve", "16203");
        prop.store(out, null);

        System.out.println(prop.getProperty("reg_valve"));
    }

    private void closeConnecition() {
        // If connected close the connection
        if (soc != null) {
            if (soc.isConnected()) {
                try {
                    soc.close();
                    //	txtStatus.setText("Socket closed");
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                    //txtStatus.setText("Error closing socket");
                }
            }
        }

    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = graphics.getDefaultScreenDevice();
        device.setFullScreenWindow(this);*/

    }//GEN-LAST:event_formWindowOpened

    
    
    
    
        Runnable run21 = new Runnable() {
        public void run() {
            try {
                if (p7_sd == 0) {
                    System.out.println("time = 0");
                } else {
                    Thread.sleep(p7_sd);
                }
                writeCommand(aASCII + 6); // device power on
                Thread.sleep(p7_rt);
                writeCommand(aASCII + 13); // device power off
                System.out.println("P7 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("P7 error");
            }
        }
    };

    Runnable run20 = new Runnable() {
        public void run() {
            try {
                command = aASCII;
                if (p6_sd == 0) {
                    System.out.println("time = 0");
                } else {
                    Thread.sleep(p6_sd);
                }
                writeCommand(aASCII + 5); // device power on
                command = aASCII + 7;
                Thread.sleep(p6_rt);
                writeCommand(aASCII + 12); // device power off
                System.out.println("P6 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("P6 error");
            }
        }
    };

    Runnable run19 = new Runnable() {
        public void run() {
            try {
                command = aASCII;
                if (p5_sd == 0) {
                    System.out.println("time = 0");
                } else {
                    Thread.sleep(p5_sd);
                }
                writeCommand(aASCII + 4); // device power on

                Thread.sleep(p5_rt);
                writeCommand(aASCII + 11); // device power off
                System.out.println("P5 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("P5 error");
            }
        }
    };

    Runnable run18 = new Runnable() {
        public void run() {
            try {
                command = aASCII;
                if (p4_sd == 0) {
                    System.out.println("time = 0");
                } else {
                    Thread.sleep(p4_sd);
                }
                writeCommand(aASCII + 3); // device power on
                Thread.sleep(p4_rt);
                writeCommand(aASCII + 10); // device power off
                System.out.println("P4 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("P4 error");
            }
        }
    };

    Runnable run17 = new Runnable() {
        public void run() {
            try {
                command = aASCII;
                if (p3_sd == 0) {

                } else {
                    Thread.sleep(p3_sd);
                }
                writeCommand(aASCII + 2); // device power on
                Thread.sleep(p3_rt);
                writeCommand(aASCII + 9); // device power off
                System.out.println("P3 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("P3 error");
            }
        }
    };

    Runnable run16 = new Runnable() {
        public void run() {
            try {
                command = aASCII;
                if (p2_sd == 0) {

                } else {
                    Thread.sleep(p2_sd);
                }
                writeCommand(aASCII + 1); // device power on
                Thread.sleep(p2_rt);
                writeCommand(aASCII + 8); // device power off
                System.out.println("P2 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("P2 error");
            }
        }
    };

    Runnable run15 = new Runnable() {
        public void run() {
            try {
                if (p1_sd == 0) {

                } else {
                    Thread.sleep(p1_sd);
                }
                writeCommand(aASCII); // device power on
                Thread.sleep(p1_rt);
                writeCommand(aASCII + 7); // device power off
                System.out.println("P1 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("P1 error");
            }
        }
    };
    
    
    
    Runnable run14 = new Runnable() {
        public void run() {
            try {
                if (q7_sd == 0) {
                    System.out.println("time = 0");
                } else {
                    Thread.sleep(q7_sd);
                }
                writeCommand(aASCII + 6); // device power on
                Thread.sleep(q7_rt);
                writeCommand(aASCII + 13); // device power off
                System.out.println("Q7 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("Q7 error");
            }
        }
    };

    Runnable run13 = new Runnable() {
        public void run() {
            try {
                command = aASCII;
                if (q6_sd == 0) {
                    System.out.println("time = 0");
                } else {
                    Thread.sleep(q6_sd);
                }
                writeCommand(aASCII + 5); // device power on
                command = aASCII + 7;
                Thread.sleep(q6_rt);
                writeCommand(aASCII + 12); // device power off
                System.out.println("Q6 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("Q6 error");
            }
        }
    };

    Runnable run12 = new Runnable() {
        public void run() {
            try {
                command = aASCII;
                if (q5_sd == 0) {
                    System.out.println("time = 0");
                } else {
                    Thread.sleep(q5_sd);
                }
                writeCommand(aASCII + 4); // device power on

                Thread.sleep(q5_rt);
                writeCommand(aASCII + 11); // device power off
                System.out.println("Q5 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("Q5 error");
            }
        }
    };

    Runnable run11 = new Runnable() {
        public void run() {
            try {
                command = aASCII;
                if (q4_sd == 0) {
                    System.out.println("time = 0");
                } else {
                    Thread.sleep(q4_sd);
                }
                writeCommand(aASCII + 3); // device power on
                Thread.sleep(q4_rt);
                writeCommand(aASCII + 10); // device power off
                System.out.println("Q4 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("Q4 error");
            }
        }
    };

    Runnable run10 = new Runnable() {
        public void run() {
            try {
                command = aASCII;
                if (q3_sd == 0) {

                } else {
                    Thread.sleep(q3_sd);
                }
                writeCommand(aASCII + 2); // device power on
                Thread.sleep(q3_rt);
                writeCommand(aASCII + 9); // device power off
                System.out.println("Q3 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("Q3 error");
            }
        }
    };

    Runnable run9 = new Runnable() {
        public void run() {
            try {
                command = aASCII;
                if (q2_sd == 0) {

                } else {
                    Thread.sleep(q2_sd);
                }
                writeCommand(aASCII + 1); // device power on
                Thread.sleep(q2_rt);
                writeCommand(aASCII + 8); // device power off
                System.out.println("Q2 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("Q2 error");
            }
        }
    };

    Runnable run8 = new Runnable() {
        public void run() {
            try {
                if (q1_sd == 0) {

                } else {
                    Thread.sleep(q1_sd);
                }
                writeCommand(aASCII); // device power on
                Thread.sleep(q1_rt);
                writeCommand(aASCII + 7); // device power off
                System.out.println("Q1 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("Q1 error");
            }
        }
    };

    Runnable run7 = new Runnable() {
        public void run() {
            try {
                command = aASCII + 6;
                if (r7_sd == 0) {
                } else {
                    Thread.sleep(r7_sd);
                }
                writeCommand(aASCII + 6); // device power on
                Thread.sleep(r7_rt);
                writeCommand(aASCII + 13); // device power off
                System.out.println("R7 operation successfull");
            } catch (InterruptedException ex) {
                Logger.getLogger(Deinfection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };

    Runnable run6 = new Runnable() {
        public void run() {
            try {
                command = aASCII + 5;
                if (r6_sd == 0) {

                } else {
                    Thread.sleep(r6_sd);
                }
                writeCommand(aASCII + 5); // device power on

                Thread.sleep(r6_rt);
                writeCommand(aASCII + 12); // device power of f
                System.out.println("R6 operation successf zx/ull");
            } catch (InterruptedException ex) {
                Logger.getLogger(Deinfection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };

    Runnable run5 = new Runnable() {
        public void run() {
            try {
                command = aASCII + 4;
                if (r5_sd == 0) {

                } else {
                    Thread.sleep(r5_sd);
                }
                writeCommand(aASCII + 4); // device power on
                command = aASCII + 7 + 4;
                Thread.sleep(r5_rt);
                writeCommand(aASCII + 11); // device power off
                System.out.println("R5 operation successfull");
            } catch (InterruptedException ex) {
                Logger.getLogger(Deinfection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };

    Runnable run4 = new Runnable() {
        public void run() {
            try {
                command = aASCII + 3;
                if (r4_sd == 0) {

                } else {
                    Thread.sleep(r4_sd);
                }
                writeCommand(aASCII + 3); // device power on
                command = aASCII + 7 + 3;
                Thread.sleep(r4_rt);
                writeCommand(aASCII + 10); // device power off
                System.out.println("R4 operation successfull");
            } catch (InterruptedException ex) {
                Logger.getLogger(Deinfection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };

    Runnable run3 = new Runnable() {
        public void run() {
            try {
                command = aASCII + 2;
                if (r3_sd == 0) {
                } else {
                    Thread.sleep(r3_sd);
                }
                writeCommand(aASCII + 2); // device power on
                command = aASCII + 7 + 2;
                Thread.sleep(r3_rt);
                writeCommand(aASCII + 9); // device power off
                System.out.println("R3 operation successfull");
            } catch (InterruptedException ex) {
                Logger.getLogger(Deinfection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };

    Runnable run2 = new Runnable() {
        public void run() {
            try {
                command = aASCII + 1;
                if (r2_sd == 0) {
                } else {
                    Thread.sleep(r2_sd);
                }
                writeCommand(aASCII + 1); // device power on
                command = aASCII + 7 + 1;
                Thread.sleep(r2_rt);
                writeCommand(aASCII + 8); // device power off
                System.out.println("R2 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("R2 error");
            }
        }
    };

    Runnable run1 = new Runnable() {
        public void run() {
            try {
                command = aASCII;
                if (r1_sd == 0) {
                    System.out.println("time = 0");
                } else {
                    Thread.sleep(r1_sd);
                }
                writeCommand(aASCII); // device power on
                global_time_r1 = r1_rt;
                command = aASCII + 7;
                Thread.sleep(r1_rt);
                writeCommand(aASCII + 7); // device power off
                System.out.println("R1 operation successfull");
            } catch (InterruptedException ex) {
                System.out.println("R1 error");
            }
        }
    };
    int global_time_r1 = 0, global_time_r2 = 0, global_time_r3 = 0, global_time_r4 = 0, global_time_r5 = 0, global_time_r6 = 0, global_time_r7 = 0;
    int temp = 2;
    int min_index = 8;

    public void getcon() {

        try {
            soc = new Socket("192.168.4.1", 1987);
            this.temp = 1;
        } catch (NoRouteToHostException el) {
            System.out.println("no root");// NOI18N

        } catch (SocketException el) {
            System.out.println("power on wifi");

        } catch (UnknownHostException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        }

    }

    public void getDataP() throws IOException {
        FileReader reader = new FileReader("src\\config\\configure.properties");
        Properties prop = new Properties();
        prop.load(reader);

        this.p1_status = Integer.valueOf(prop.getProperty("p1_status"));
        this.p1_sd = Integer.valueOf(prop.getProperty("p1_sd"));
        this.p1_rt = Integer.valueOf(prop.getProperty("p1_rt"));

        this.p2_status = Integer.valueOf(prop.getProperty("p2_status"));
        this.p2_sd = Integer.valueOf(prop.getProperty("p2_sd"));
        this.p2_rt = Integer.valueOf(prop.getProperty("p2_rt"));

        this.p3_status = Integer.valueOf(prop.getProperty("p3_status"));
        this.p3_sd = Integer.valueOf(prop.getProperty("p3_sd"));
        this.p3_rt = Integer.valueOf(prop.getProperty("p3_rt"));

        this.p4_status = Integer.valueOf(prop.getProperty("p4_status"));
        this.p4_sd = Integer.valueOf(prop.getProperty("p4_sd"));
        this.p4_rt = Integer.valueOf(prop.getProperty("p4_rt"));

        this.p5_status = Integer.valueOf(prop.getProperty("p5_status"));
        this.p5_sd = Integer.valueOf(prop.getProperty("p5_sd"));
        this.p5_rt = Integer.valueOf(prop.getProperty("p5_rt"));

        this.p6_status = Integer.valueOf(prop.getProperty("p6_status"));
        this.p6_sd = Integer.valueOf(prop.getProperty("p6_sd"));
        this.p6_rt = Integer.valueOf(prop.getProperty("p6_rt"));

        this.p7_status = Integer.valueOf(prop.getProperty("p7_status"));
        this.p7_sd = Integer.valueOf(prop.getProperty("p7_sd"));
        this.p7_rt = Integer.valueOf(prop.getProperty("p7_rt"));
        reader.close();
    }
    
    
    
    public void getDataR() throws IOException {
        FileReader reader = new FileReader("src\\config\\configure.properties");
        Properties prop = new Properties();
        prop.load(reader);

        this.r1_status = Integer.valueOf(prop.getProperty("r1_status"));
        this.r1_sd = Integer.valueOf(prop.getProperty("r1_sd"));
        this.r1_rt = Integer.valueOf(prop.getProperty("r1_rt"));

        this.r2_status = Integer.valueOf(prop.getProperty("r2_status"));
        this.r2_sd = Integer.valueOf(prop.getProperty("r2_sd"));
        this.r2_rt = Integer.valueOf(prop.getProperty("r2_rt"));

        this.r3_status = Integer.valueOf(prop.getProperty("r3_status"));
        this.r3_sd = Integer.valueOf(prop.getProperty("r3_sd"));
        this.r3_rt = Integer.valueOf(prop.getProperty("r3_rt"));

        this.r4_status = Integer.valueOf(prop.getProperty("r4_status"));
        this.r4_sd = Integer.valueOf(prop.getProperty("r4_sd"));
        this.r4_rt = Integer.valueOf(prop.getProperty("r4_rt"));

        this.r5_status = Integer.valueOf(prop.getProperty("r5_status"));
        this.r5_sd = Integer.valueOf(prop.getProperty("r5_sd"));
        this.r5_rt = Integer.valueOf(prop.getProperty("r5_rt"));

        this.r6_status = Integer.valueOf(prop.getProperty("r6_status"));
        this.r6_sd = Integer.valueOf(prop.getProperty("r6_sd"));
        this.r6_rt = Integer.valueOf(prop.getProperty("r6_rt"));

        this.r7_status = Integer.valueOf(prop.getProperty("r7_status"));
        this.r7_sd = Integer.valueOf(prop.getProperty("r7_sd"));
        this.r7_rt = Integer.valueOf(prop.getProperty("r7_rt"));
        reader.close();
    }
    public void getDataQ() throws IOException{
        //second program
        
        FileReader reader = new FileReader("src\\config\\configure.properties");
        Properties prop = new Properties();
        prop.load(reader);
        this.q1_status = Integer.valueOf(prop.getProperty("q1_status"));
        this.q1_sd = Integer.valueOf(prop.getProperty("q1_sd"));
        this.q1_rt = Integer.valueOf(prop.getProperty("q1_rt"));

        this.q2_status = Integer.valueOf(prop.getProperty("q2_status"));
        this.q2_sd = Integer.valueOf(prop.getProperty("q2_sd"));
        this.q2_rt = Integer.valueOf(prop.getProperty("q2_rt"));

        this.q3_status = Integer.valueOf(prop.getProperty("q3_status"));
        this.q3_sd = Integer.valueOf(prop.getProperty("q3_sd"));
        this.q3_rt = Integer.valueOf(prop.getProperty("q3_rt"));

        this.q4_status = Integer.valueOf(prop.getProperty("q4_status"));
        this.q4_sd = Integer.valueOf(prop.getProperty("q4_sd"));
        this.q4_rt = Integer.valueOf(prop.getProperty("q4_rt"));

        this.q5_status = Integer.valueOf(prop.getProperty("q5_status"));
        this.q5_sd = Integer.valueOf(prop.getProperty("q5_sd"));
        this.q5_rt = Integer.valueOf(prop.getProperty("q5_rt"));

        this.q6_status = Integer.valueOf(prop.getProperty("q6_status"));
        this.q6_sd = Integer.valueOf(prop.getProperty("q6_sd"));
        this.q6_rt = Integer.valueOf(prop.getProperty("q6_rt"));

        this.q7_status = Integer.valueOf(prop.getProperty("q7_status"));
        this.q7_sd = Integer.valueOf(prop.getProperty("q7_sd"));
        this.q7_rt = Integer.valueOf(prop.getProperty("q7_rt"));


        /* String y = prop.getProperty("reg_valve");
        String x = Integer.parseInt(y);
        File file = new File("src\\config\\configure.properties");
        OutputStream out = new FileOutputStream(file);
        prop.setProperty("reg_valve", "162null3");
        prop.store(out, null);

        System.out.prStringln(prop.getProperty("reg_valve"));*/
        reader.close();
    }

    int[] priority_array = new int[7];

    public void priority1() {
        int[] sd = {this.r1_sd, this.r2_sd, this.r3_sd, this.r4_sd, this.r5_sd, this.r6_sd, this.r7_sd};
        int[] sd_sort = sd;
        Arrays.sort(sd_sort);
        List<Integer> arrList = IntStream.of(sd_sort).boxed().collect(Collectors.toList());
        System.out.println(sd_sort[0]);
        int min = sd_sort[0];

        for (int x = 0; x < 7; x++) {
            for (int i = 0; i < 7; i++) {
                if (sd_sort[x] == sd[i]) {
                    if (i == 0) {
                        if (r1_status == 1) {
                            Thread t1 = new Thread(run1);
                            t1.start();
                        }
                    } else if (i == 1) {
                        if (r2_status == 1) {
                            Thread t2 = new Thread(run2);
                            t2.start();
                        }
                    } else if (i == 2) {
                        if (r3_status == 1) {
                            Thread t3 = new Thread(run3);
                            t3.start();
                        }
                    } else if (i == 3) {
                        if (r4_status == 1) {
                            Thread t4 = new Thread(run4);
                            t4.start();
                        }
                    } else if (i == 4) {
                        if (r5_status == 1) {
                            Thread t5 = new Thread(run5);
                            t5.start();
                        }
                    } else if (i == 5) {
                        if (r6_status == 1) {
                            Thread t6 = new Thread(run6);
                            t6.start();
                        }
                    } else if (i == 6) {
                        if (r7_status == 1) {
                            Thread t7 = new Thread(run7);
                            t7.start();
                        }
                    }

                }
            }

        }
    }
    // for 2nd program

    public void priority2() {
        int[] q2_sd_arr = {this.q1_sd, this.q2_sd, this.q3_sd, this.q4_sd, this.q5_sd, this.q6_sd, this.q7_sd};
        int[] q2_sd_sort = q2_sd_arr;
        Arrays.sort(q2_sd_sort);
        System.out.println(q2_sd_sort[0]);
        int min = q2_sd_sort[0];

        for (int p = 0; p < 7; p++) {
            System.out.println(q2_sd_sort[p]);
        }

        for (int x = 0; x < 7; x++) {
            for (int i = 0; i < 7; i++) {
                if (q2_sd_sort[x] == q2_sd_arr[i]) {
                    if (i == 0) {
                        if (q1_status == 1) {
                            Thread t8 = new Thread(run8);
                            t8.start();
                        }
                    } else if (i == 1) {
                        if (q2_status == 1) {
                            Thread t9 = new Thread(run9);
                            t9.start();
                        }
                    } else if (i == 2) {
                        if (q3_status == 1) {
                            Thread t10 = new Thread(run10);
                            t10.start();
                        }
                    } else if (i == 3) {
                        if (q4_status == 1) {
                            Thread t11 = new Thread(run11);
                            t11.start();
                        }
                    } else if (i == 4) {
                        if (q5_status == 1) {
                            Thread t12 = new Thread(run12);
                            t12.start();
                        }
                    } else if (i == 5) {
                        if (q6_status == 1) {
                            Thread t13 = new Thread(run13);
                            t13.start();
                        }
                    } else if (i == 6) {
                        if (q7_status == 1) {
                            Thread t14 = new Thread(run14);
                            t14.start();
                        }

                    }
                }

            }

            /*     for (int terms = 0; terms < 8; terms++) {
            priority_array[terms] = this.min_index;
        }*/
        }//JOptionPane.showMessageDialog(null, "Completed");
    }


    // schedule 03
    
    
      public void priority3() {
        int[] p2_sd_arr = {this.p1_sd, this.p2_sd, this.p3_sd, this.p4_sd, this.p5_sd, this.p6_sd, this.p7_sd};
        int[] p2_sd_sort = p2_sd_arr;
        Arrays.sort(p2_sd_sort);
        System.out.println(p2_sd_sort[0]);
        int min = p2_sd_sort[0];

        for (int p = 0; p < 7; p++) {
            System.out.println(p2_sd_sort[p]);
        }

        for (int x = 0; x < 7; x++) {
            for (int i = 0; i < 7; i++) {
                if (p2_sd_sort[x] == p2_sd_arr[i]) {
                    if (i == 0) {
                        if (p1_status == 1) {
                            Thread t15 = new Thread(run15);
                            t15.start();
                        }
                    } else if (i == 1) {
                        if (p2_status == 1) {
                            Thread t16 = new Thread(run16);
                            t16.start();
                        }
                    } else if (i == 2) {
                        if (p3_status == 1) {
                            Thread t17 = new Thread(run17);
                            t17.start();
                        }
                    } else if (i == 3) {
                        if (p4_status == 1) {
                            Thread t18 = new Thread(run18);
                            t18.start();
                        }
                    } else if (i == 4) {
                        if (p5_status == 1) {
                            Thread t19 = new Thread(run19);
                            t19.start();
                        }
                    } else if (i == 5) {
                        if (p6_status == 1) {
                            Thread t20 = new Thread(run20);
                            t20.start();
                        }
                    } else if (i == 6) {
                        if (p7_status == 1) {
                            Thread t21 = new Thread(run21);
                            t21.start();
                        }

                    }
                }

            }

            /*     for (int terms = 0; terms < 8; terms++) {
            priority_array[terms] = this.min_index;
        }*/
        }//JOptionPane.showMessageDialog(null, "Completed");
    }
    
    
    
    
    
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            getDataQ();
        } catch (IOException ex) {
            Logger.getLogger(Deinfection.class.getName()).log(Level.SEVERE, null, ex);
        }
        priority2();

    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        for (int i = 0; i < 8; i++) {
            command = aASCII + i + 7;
            writeCommand(command);
            System.out.println("command send" + i);
        }
    }//GEN-LAST:event_formWindowClosed

    private void jLabel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jLabel1MouseWheelMoved

    }//GEN-LAST:event_jLabel1MouseWheelMoved

    private void jLabel3MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jLabel3MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseWheelMoved

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            getDataR();
        } catch (IOException ex) {
            Logger.getLogger(Deinfection.class.getName()).log(Level.SEVERE, null, ex);
        }
        priority1();

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        try {
            soc = new Socket("192.168.4.1", 1987);
            this.temp = 1;
            System.out.println("    connected");
        } catch (NoRouteToHostException el) {
            System.out.println("no root");// NOI18N

        } catch (SocketException el) {
            System.out.println("power on wifi");

        } catch (UnknownHostException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
      
    }//GEN-LAST:event_formMouseWheelMoved

    private void jLabel5MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jLabel5MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseWheelMoved

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            getDataP();
        } catch (IOException ex) {
            Logger.getLogger(Deinfection.class.getName()).log(Level.SEVERE, null, ex);
        }
        priority3();
    }//GEN-LAST:event_jLabel5MouseClicked

    private boolean isConnected() {
        // TCheck is socket is connected to server
        if (soc != null) {
            if (soc.isConnected()) {
                return true;
            }
        }
        return false;
    }

    private void writeCommand(int command) {
        // If no socket is null return
        if (soc == null) {
            return;
        }
        // if socket is connected send command
        if (soc.isConnected()) {
            byte[] cmdByte = new byte[2];
            cmdByte[0] = (byte) command;
            byte[] temp;
            try {
                temp = "!".getBytes("US-ASCII");
                cmdByte[1] = temp[0];
                //txtStatus.setText("Message sent");
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                //txtStatus.setText("Error");
            }
            try {
                soc.getOutputStream().write(cmdByte);
                //txtStatus.setText("Message sent");
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
                //txtStatus.setText("Error");
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
            java.util.logging.Logger.getLogger(Deinfection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deinfection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deinfection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deinfection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Deinfection().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Deinfection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
