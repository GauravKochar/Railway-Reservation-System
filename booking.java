/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import static Resources.trainavailable.jTextField10;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Gaurav
 */
public class booking extends javax.swing.JFrame {

    /**
     * Creates new form booking
     */
     
       public  String a=null,b=null,c=null,d=null,amount=null,PNRID=null,cardid=null,CVV=null,type=null,ValidMON=null,ValidYEAR=null;
       String []array=new String[10];
       String name=null,NAme=null,NAME=null,Name=null;
       int NUMBER=0;
      
    public booking() {
        initComponents();
        fill();
        ID();
        clock cl=new clock();
        cl.start();
       jPanel5.setVisible(false);
       
    }

      
    public void fill()
    {
          jPanel6.setVisible(false);   
          
           jPanel7.setVisible(false);   
             jPanel9.setVisible(false);
            jPanel8.setVisible(false);   
             jPanel4.setVisible(false);
              jLabel34.setVisible(false);
             
           
    }
            @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField17 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTextField27 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTextField30 = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTextField33 = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground((new Color(0,0,0,123)));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Distance  :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Class :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Destination Station :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 130, -1));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 130, -1));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 130, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Source Station :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Select Train :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 20));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 130, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("No. of Seats :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, -1));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 130, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Date of Journey :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Departure Time :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Arrival Time :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 90, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Fare :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 130, 20));

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 130, -1));

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 130, -1));

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 130, -1));

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 130, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Seats Left  :");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 130, -1));

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 130, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No. of Passanger :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No. of seats left :");

        jTextField1.setEditable(false);

        jPanel3.setBackground(new Color(0,0,0,0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sl.no");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 13, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Age");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 13, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sex");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 13, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Amount (Rs)");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 13, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 32, 405, -1));

        jPanel6.setOpaque(false);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField17KeyPressed(evt);
            }
        });

        jTextField21.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("2.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField21, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 40));

        jPanel7.setOpaque(false);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jTextField28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField28KeyPressed(evt);
            }
        });

        jTextField29.setEditable(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("1.");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField29, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 40, -1, 38));

        jPanel8.setOpaque(false);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jTextField31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField31KeyPressed(evt);
            }
        });

        jTextField32.setEditable(false);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("3.");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField32, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 32));

        jPanel9.setOpaque(false);

        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jTextField34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField34KeyPressed(evt);
            }
        });

        jTextField35.setEditable(false);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("4.");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField35, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 34));

        jPanel4.setOpaque(false);

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Total ");

        jTextField25.setEditable(false);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Tax (5%)");

        jTextField26.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField25, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jTextField26))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, 50));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 60, 20));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Click here for Payment");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 217, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/9hiulbuiv.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("PNR ");

        jPanel5.setBackground(new Color(0,0,0,150));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Debit Card");
        jPanel5.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 107, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Card No  :");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 20));

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField14KeyPressed(evt);
            }
        });
        jPanel5.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 180, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Valid Upto  :");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 20));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        jPanel5.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel5.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 80, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("mon");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 30, 20));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("year");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 30, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("CVV  :");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField15KeyPressed(evt);
            }
        });
        jPanel5.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 80, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Total Amount  :");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 20));
        jPanel5.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 180, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("PAY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 90, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Credit Card");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 114, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("PRINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 80, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Payment ID  :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jLabel24)
                .addGap(1298, 1298, 1298)
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(517, 517, 517)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 720));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tumblr_nder0icE0V1sg0ygjo1_500.gif"))); // NOI18N
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1290, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        String item=(String)jComboBox1.getSelectedItem();
       String seats= jTextField19.getText();
             
       int x=Integer.parseInt(item);
        int y=Integer.parseInt(seats);
        int z=y-x;
        if(z<0)
        {
            JOptionPane.showMessageDialog(null,"Sorry ,Now,Train don't have much Reserved tickets");
        }
        else
        {
        jTextField1.setText(String.valueOf(z));
        String amount=   jTextField5.getText();
   // String  first=jTextField29.getText();
     double one= Double.parseDouble(amount);
          
     
        if(item.equals("0"))
        {
            fill();
                    }
        else if(item.equals("1"))
        {
            jPanel6.setVisible(false);  
          jPanel7.setVisible(true);  
           jPanel4.setVisible(true);
          jPanel8.setVisible(false);   
             jPanel9.setVisible(false); 
             
             double tax=0.05*one;
             double totalfare=tax+one;
             String Tax=String.valueOf(tax);
             jTextField29.setText(amount);
             String am=String.valueOf(one);
         jTextField25.setText(am);
        jTextField26.setText(Tax);
     String  totalamount=String.valueOf(totalfare);
        
        jLabel34.setText(totalamount);
                 
        }
        else if(item.equals("2"))
        {
            jPanel6.setVisible(true);   
           jPanel7.setVisible(true); 
           jPanel4.setVisible(true);
           jPanel8.setVisible(false);   
             jPanel9.setVisible(false); 
              jTextField29.setText(amount);
              jTextField21.setText(amount);
              double two=one*2;
              double tax=0.05*two;
              double totalfare=tax+two;
              String Tax=String.valueOf(tax);
              
           String amo=String.valueOf(two);
            jTextField25.setText(amo);
             jTextField26.setText(Tax);
               String  totalamount=String.valueOf(totalfare);
        jLabel34.setText(totalamount);
                     
        }
        else if(item.equals("3"))
        {
          
             jPanel6.setVisible(true);   
           jPanel7.setVisible(true);   
            jPanel8.setVisible(true); 
            jPanel4.setVisible(true);
            jPanel9.setVisible(false); 
              jTextField29.setText(amount);
              jTextField21.setText(amount);
              jTextField32.setText(amount);
              double three=one*3;
              double tax=0.05*three;
              double totalfare=tax+three;
              String Tax=String.valueOf(tax);
              
           String amo=String.valueOf(three);
            jTextField25.setText(amo);
             jTextField26.setText(Tax);
                String  totalamount=String.valueOf(totalfare);
        jLabel34.setText(totalamount);
            
        }
        else if(item.equals("4"))
        {
             jPanel6.setVisible(true);   
           jPanel7.setVisible(true);   
           jPanel4.setVisible(true);
            jPanel8.setVisible(true);   
             jPanel9.setVisible(true); 
              jTextField29.setText(amount);
              jTextField21.setText(amount);
              jTextField32.setText(amount);
             jTextField35.setText(amount);
         
              double two=one*4;
              double tax=0.05*two;
                double totalfare=tax+two;
              String Tax=String.valueOf(tax);
           String amo=String.valueOf(two);
            jTextField25.setText(amo);
             jTextField26.setText(Tax);
              String  totalamount=String.valueOf(totalfare);
        jLabel34.setText(totalamount);
        }
      
          jLabel34.setVisible(true);
         
        
          
        }  
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyPressed
        // TODO add your handling code here:\ int key=evt.getKeyCode();
        int key=evt.getKeyCode();
        if(((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||(key==KeyEvent.VK_BACK_SPACE))&&(jTextField14.getText().length()<16))
        {
            
            jTextField14.setEditable(true);
        }
        else 
        {
            if(key==KeyEvent.VK_BACK_SPACE)
            {
                jTextField14.setEditable(true);
            }
            else
            {
                jTextField14.setEditable(false);
            }
        }
                               
        
    }//GEN-LAST:event_jTextField14KeyPressed

    private void jTextField15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||(key==KeyEvent.VK_BACK_SPACE))&&(jTextField15.getText().length()<3))
        {
            
            jTextField15.setEditable(true);
        }
        else 
        {
            if(key==KeyEvent.VK_BACK_SPACE)
            {
                jTextField15.setEditable(true);
            }
            else
            {
                jTextField15.setEditable(false);
            }
        }
        
    }//GEN-LAST:event_jTextField15KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        cardid=jTextField14.getText();
       type=null;
        if(jRadioButton1.isSelected())
        {
            type="Credit Card";
        }
        else if(jRadioButton2.isSelected())
        {
            type="Debit Card";
        }
        
        CVV=jTextField15.getText();
        String amount=jTextField16.getText();
         ValidMON=(String)jComboBox4.getSelectedItem();
         ValidYEAR=(String)jComboBox3.getSelectedItem();
       PNRID=  jLabel19.getText();
       if((CVV.equals(""))||(amount.equals(""))||(cardid.equals(""))||(type.equals("")))
       {
           JOptionPane.showMessageDialog(null,"Some TextField is empty");
       }
       else {
            int lseats=0;
         try {
            Connection con = connection.connect.getconnection();
            String sql = "select * from  routefare where train=? and class =?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, jTextField4.getText());
             pst.setString(2,jTextField20.getText() );
            
            ResultSet rst = pst.executeQuery();
            if (rst.next()) {
                String leftseats = rst.getString("seatsleft");
                
                lseats=Integer.parseInt(leftseats);
            }
         }
            catch(Exception e)
            {
                System.out.println(e);
            }
         
         
         String src=jTextField12.getText();
         String dest=jTextField2.getText();
        String Tname=jTextField4.getText();
      String No=(String)jComboBox1.getSelectedItem();
          int no=Integer.parseInt(No);
          int leftSEATS=lseats-no;
          if(leftSEATS<0)
          {
              leftSEATS=0;
          }
          String LEFTSEATS=String.valueOf(leftSEATS);
          if(no>lseats)
          {
            int diff=no-lseats;
           
             for(int i=0;i<lseats;i++)
               {
                     int  seatno= lseats+i;
                     if(i==0)
                     {
                         a="S-"+seatno;
                     }
                     else if(i==1)
                     {
                         b="S-"+seatno;
                     }
                     else if(i==2)

                     {
                         c="S-"+seatno;
                     }
                     
               }
            for(int j=0;j<diff;j++)
            {
            
             try
             {
                 String TRAINNAME=jTextField4.getText(),CLASS=jTextField20.getText(),SEAT=null;
                 Connection con=connection.connect.getconnection();
                 String sql3="select * from  cancelledseats where trainname='"+TRAINNAME+"'&&class='"+CLASS+"'";
                 PreparedStatement pst=con.prepareStatement(sql3);
         
                 ResultSet rst=pst.executeQuery();
                 if(rst.next())
                 {
                   SEAT = rst.getString("seatno");
                    TRAINNAME =  rst.getString("trainname");
                      CLASS = rst.getString("class");
                      if(j==0)
                      {
                          if(a==null)
                          {
                          a=SEAT;
                          }
                          else if(b==null)
                          {
                              b=SEAT;
                          }
                          else if(c==null)
                          {
                              c=SEAT;
                          }
                          else if(d==null)
                          {
                              d=SEAT;
                          }
                      }
                      else if(j==1)
                      {
                         if(a==null)
                          {
                          a=SEAT;
                          }
                          else if(b==null)
                          {
                              b=SEAT;
                          }
                          else if(c==null)
                          {
                              c=SEAT;
                          }
                          else if(d==null)
                          {
                              d=SEAT;
                          }
                      }
                      else if(j==2)
                      {
                         if(a==null)
                          {
                          a=SEAT;
                          }
                          else if(b==null)
                          {
                              b=SEAT;
                          }
                          else if(c==null)
                          {
                              c=SEAT;
                          }
                          else if(d==null)
                          {
                              d=SEAT;
                          }
                          
                      }
                      else if(j==3)
                      {
                          if(a==null)
                          {
                          a=SEAT;
                          }
                          else if(b==null)
                          {
                              b=SEAT;
                          }
                          else if(c==null)
                          {
                              c=SEAT;
                          }
                          else if(d==null)
                          {
                              d=SEAT;
                          }
                      }
                 }
                 
                  Connection conn=connection.connect.getconnection();
                 String sql4=" delete from  cancelledseats   where trainname='"+TRAINNAME+"' and   class='"+CLASS+"' and seatno='"+SEAT+"'";
                 
                 PreparedStatement pst3=con.prepareStatement(sql4);
                
               pst3.executeUpdate();
                 
               JOptionPane.showMessageDialog(null,"Update Successfully");
                 
             }
             catch(Exception e)
             {
                 System.out.println(e);
             }
            }
             
          }
          else
          {
        
         for(int i=0;i<no;i++)
         {
             
           int  seatno=lseats+i;
         
           if(i==0)
           {
               a="S-"+seatno;
           }
           else if(i==1)
           {
               b="S-"+seatno;
           }
           else if(i==2)
               
           {
               c="S-"+seatno;
           }
           else if(i==3)
           {
               d="S-"+seatno;
           }
         }
          }
          
        
                         
        try
        {
           Connection con=connection.connect.getconnection();
           String SQL="update routefare set seatsleft='"+LEFTSEATS+"' where source='"+src+"' and dest='"+dest+"' and train ='"+Tname+"'";
    PreparedStatement pst=con.prepareStatement(SQL);
    pst.executeUpdate();
   // JOptionPane.showMessageDialog(null,"Successfully Updated");
     
    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
          
          try
        {
            String TRAIN=jTextField4.getText();
            Connection con=connection.connect.getconnection();
            String sql="select COUNT(pnr) as number from booking where pnr='"+PNRID+"' and trainname='"+TRAIN+"'"; 
              PreparedStatement pst=con.prepareStatement(sql);
  ResultSet rst=  pst.executeQuery();
  if(rst.next())
  {
      String countt=rst.getString("number");
    
       NUMBER=Integer.parseInt(countt);
  }
        }
        
        
      catch(Exception e)
      {
          System.out.println(e);
      }
        if(NUMBER==0)
        {
        
       if(No.equals("1"))
       {
           updatefirst();
       }
        
      
        else   if(No.equals("2"))
                {
                 
                 updatefirst();
                 updatesecond();
                
                }
         else  if(No.equals("3"))
                {
                     updatefirst();
                 updatesecond();
                  updatethird();
                
                }
          else    if(No.equals("4"))
                {
                     updatefirst();
                 updatesecond();
                  updatethird();
                  updatefourth();
                }
        
         NEW();
        
       }
        else if(NUMBER==1)
        {
            if(No.equals("1"))
       {
           updatefirst();
           NEW();
       }
        
      
        else   if(No.equals("2"))
                {
                 
                 updatefirst();
                 updatesecond();
                 NEW();
                
                }
         else  if(No.equals("3"))
                {
                     updatefirst();
                 updatesecond();
                  updatethird();
                  NEW();
                
                }
          else    if(No.equals("4"))
                {
                 
                 JOptionPane.showMessageDialog(null,"Sorry you can't reserve more  tickets in this train  ");
                }
        
         
        }
       
         else if(NUMBER==2)
         {
        if(No.equals("1"))
       {
           updatefirst();
           NEW();
       }
        
      
        else   if(No.equals("2"))
                {
                 
                 updatefirst();
                 updatesecond();
                 NEW();
                
                }
         else  if(No.equals("3"))
                {
                   JOptionPane.showMessageDialog(null,"Sorry you cant reserve more  tickets in this train  ");
                
                }
          else    if(No.equals("4"))
                {
                    JOptionPane.showMessageDialog(null,"Sorry you cant reserve more  tickets in this train  ");
                }
        
        
       
        }
         else if(NUMBER==3)
         {
                  if(No.equals("1"))
       {
           updatefirst();
           NEW();
       }
        
        else   if(No.equals("2")||No.equals("3")||No.equals("4"))
                {
                 
                 JOptionPane.showMessageDialog(null,"Sorry you cant reserve more  tickets in this train  ");
                
                }
        
        
        }
       
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         ID1();
        jPanel5.setVisible(true);
       jTextField16.setText(jLabel34 .getText());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField28KeyPressed
        // TODO add your handling code here:
         int key=evt.getKeyCode();
        if(((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||(key==KeyEvent.VK_BACK_SPACE))&&(jTextField28.getText().length()<3))
        {
            
            jTextField28.setEditable(true);
        }
        else 
        {
            if(key==KeyEvent.VK_BACK_SPACE)
            {
                jTextField28.setEditable(true);
            }
            else
            {
                jTextField28.setEditable(false);
            }
        }
        
    }//GEN-LAST:event_jTextField28KeyPressed

    private void jTextField17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyPressed
        // TODO add your handling code here:
        
         int key=evt.getKeyCode();
        if(((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||(key==KeyEvent.VK_BACK_SPACE))&&(jTextField17.getText().length()<3))
        {
            
            jTextField17.setEditable(true);
        }
        else 
        {
            if(key==KeyEvent.VK_BACK_SPACE)
            {
                jTextField17.setEditable(true);
            }
            else
            {
                jTextField17.setEditable(false);
            }
        }
    }//GEN-LAST:event_jTextField17KeyPressed

    private void jTextField31KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField31KeyPressed
        // TODO add your handling code here:
         int key=evt.getKeyCode();
        if(((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||(key==KeyEvent.VK_BACK_SPACE))&&(jTextField31.getText().length()<3))
        {
            
            jTextField31.setEditable(true);
        }
        else 
        {
            if(key==KeyEvent.VK_BACK_SPACE)
            {
                jTextField31.setEditable(true);
            }
            else
            {
                jTextField31.setEditable(false);
            }
        }
    }//GEN-LAST:event_jTextField31KeyPressed

    private void jTextField34KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField34KeyPressed
        // TODO add your handling code here:
         int key=evt.getKeyCode();
        if(((key>=evt.VK_0&&key<=evt.VK_9)||(key>=evt.VK_NUMPAD0&&key<=evt.VK_NUMPAD9)||(key==KeyEvent.VK_BACK_SPACE))&&(jTextField34.getText().length()<3))
        {
            
            jTextField34.setEditable(true);
        }
        else 
        {
            if(key==KeyEvent.VK_BACK_SPACE)
            {
                jTextField34.setEditable(true);
            }
            else
            {
                jTextField34.setEditable(false);
            }
        }
    }//GEN-LAST:event_jTextField34KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         String source=jTextField12.getText();
         String destination=jTextField2.getText();
        String Trainname=jTextField4.getText();
         String PNR= jLabel19.getText();
         String   sex =(String)jComboBox6.getSelectedItem();
                  String age=jTextField28.getText();
                   String seat=jTextField1.getText();
                    String No=(String)jComboBox1.getSelectedItem();
                    jPanel6.setVisible(false);
              jPanel7.setVisible(false);
              jPanel8.setVisible(false);
              jPanel9.setVisible(false);
              jPanel4.setVisible(false);
              
        array[0]=PNR;
        array[1]=Trainname;
        array[2]=source;
        array[3]=destination;
        array[4]=name;
        array[5]=Name;
        
        array[6]=NAme;
        array[7]=NAME;
        array[8]=amount;
        array[9]=No;
        
        JFrame yourComponent = new printticket(array);
        yourComponent.setVisible(true);
        PrinterJob pjob = PrinterJob.getPrinterJob();
      PageFormat preformat = pjob.defaultPage();
       preformat.setOrientation(PageFormat.LANDSCAPE);
      PageFormat postformat = pjob.pageDialog(preformat);
      
        //If user does not hit cancel then print.
       // if (preformat != postformat) {
            //Set print component
            pjob.setPrintable(new Printer(yourComponent), postformat);
            if (pjob.printDialog()) {
                try {
                    pjob.print();
                } catch (PrinterException ex) {
                  System.out.println(ex); // Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
     
       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here
        this.dispose();
        new trainavailable().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

   
         public void updatefirst()
       {  String source=jTextField12.getText();
         String destination=jTextField2.getText();
        String Trainname=jTextField4.getText();
       
                 String PNR= jLabel19.getText();
                  String   name =jTextField27.getText();
                  String   sex =(String)jComboBox6.getSelectedItem();
                  String age=jTextField28.getText();
                   String amount=jTextField29.getText();
                   String seat=jTextField1.getText();
                    double am=Double.parseDouble(amount);
                  double tax=0.05*am;
                  double totalamount1=am+tax;
              String    TFARE=String.valueOf(totalamount1);
              try
              {
                  Connection con=connection.connect.getconnection();
                  String sql="insert into booking(trainname,Source,Destination,Name,Age ,Sex,amount,seatno,username,DOJ,Departtime,arrivaltime,class,pnr) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                  PreparedStatement pstt=con.prepareStatement(sql);
                  pstt.setString(1,Trainname);
                  pstt.setString(2,source);
                  pstt.setString(3,destination);
                  pstt.setString(4,name);
                  pstt.setString(5,age);
                  pstt.setString(6,sex);
                  pstt.setString(7,TFARE);
                   pstt.setString(8,a);
                   pstt.setString(9,Login.user);
                    pstt.setString(10,jTextField9.getText());
                           pstt.setString(11,jTextField6.getText());
                           pstt.setString(12,jTextField8.getText());
                            pstt.setString(13,jTextField20.getText());
                            pstt.setString(14,PNR);
                  pstt.execute();
                  
                  
              }
              catch(Exception e)
              {
                  System.out.println(e);
              }
                }   
          public void updatesecond()
                 {
                       String source=jTextField12.getText();
         String destination=jTextField2.getText();
        String Trainname=jTextField4.getText();
                      String PNR1= jLabel19.getText();
                  String   name1 =jTextField13.getText();
                  String   sex1 =(String)jComboBox2.getSelectedItem();
                  String age1=jTextField17.getText();
                   String amount1=jTextField21.getText();
                   String seat1=jTextField1.getText();
                   
                 
                    double am1=Double.parseDouble(amount1);
                  double tax1=0.05*am1;
                  double totalamount2=am1+tax1;
              String    TFARE1=String.valueOf(totalamount2);
              try
              {
                  Connection conn=connection.connect.getconnection();
                  String sqll="insert into booking(trainname,Source,Destination,Name,Age ,Sex,amount,seatno,username,doj,departtime,arrivaltime,class,pnr) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                  PreparedStatement pstt=conn.prepareStatement(sqll);
                  pstt.setString(1,Trainname);
                  pstt.setString(2,source);
                  pstt.setString(3,destination);
                  pstt.setString(4,name1);
                  pstt.setString(5,age1);
                  pstt.setString(6,sex1);
                  pstt.setString(7,TFARE1);
                   pstt.setString(8,b);
                   pstt.setString(9,Login.user);
                    pstt.setString(10,jTextField9.getText());
                           pstt.setString(11,jTextField6.getText());
                           pstt.setString(12,jTextField8.getText());
                            pstt.setString(13,jTextField20.getText());
                            pstt.setString(14,PNR1);
                  pstt.execute();
                 
              }
              catch(Exception e)
              {
                  System.out.println(e);
              }
                 }
                
           public void updatethird()
                 {
                       String source=jTextField12.getText();
         String destination=jTextField2.getText();
        String Trainname=jTextField4.getText();
                      String PNR1= jLabel19.getText();
                  String   name1 =jTextField30.getText();
                  String   sex2 =(String)jComboBox7.getSelectedItem();
                  String age1=jTextField31.getText();
                   String amount1=jTextField32.getText();
                   String seat1=jTextField1.getText();
                    double am1=Double.parseDouble(amount1);
                  double tax1=0.05*am1;
                  double totalamount2=am1+tax1;
              String    TFARE1=String.valueOf(totalamount2);
              try
              {
                  Connection conn=connection.connect.getconnection();
                  String sqll="insert into booking(trainname,Source,Destination,Name,Age ,Sex,amount,seatno,username,doj,departtime,arrivaltime,class,pnr) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                  PreparedStatement pstt=conn.prepareStatement(sqll);
                pstt.setString(1,Trainname);
                  pstt.setString(2,source);
                  pstt.setString(3,destination);
                  pstt.setString(4,name1);
                  pstt.setString(5,age1);
                  pstt.setString(6,sex2);
                  pstt.setString(7,TFARE1);
                   pstt.setString(8,c);
                   pstt.setString(9,Login.user);
                    pstt.setString(10,jTextField9.getText());
                           pstt.setString(11,jTextField6.getText());
                           pstt.setString(12,jTextField8.getText());
                            pstt.setString(13,jTextField20.getText());
                            pstt.setString(14,PNR1);
                  pstt.execute();
                
              }
              catch(Exception e)
              {
                  System.out.println(e);
              }
                 }
               public void updatefourth()
                 {
                       String source=jTextField12.getText();
         String destination=jTextField2.getText();
        String Trainname=jTextField4.getText();
                      String PNR1= jLabel19.getText();
                  String   name1 =jTextField33.getText();
                  String   sex3 =(String)jComboBox8.getSelectedItem();
                  String age1=jTextField34.getText();
                   String amount1=jTextField35.getText();
                   String seat1=jTextField1.getText();
                    double am1=Double.parseDouble(amount1);
                  double tax1=0.05*am1;
                  double totalamount2=am1+tax1;
              String    TFARE1=String.valueOf(totalamount2);
              try
              {
                  Connection conn=connection.connect.getconnection();
                  String sqll="insert into booking(trainname,Source,Destination,Name,Age ,Sex,amount,seatno,username,doj,departtime,arrivaltime,class,pnr) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                  PreparedStatement pstt=conn.prepareStatement(sqll);
                  
                  pstt.setString(1,Trainname);
                  pstt.setString(2,source);
                  pstt.setString(3,destination);
                  pstt.setString(4,name1);
                  pstt.setString(5,age1);
                  pstt.setString(6,sex3);
                  pstt.setString(7,TFARE1);
                   pstt.setString(8,d);
                   pstt.setString(9,Login.user);
                    pstt.setString(10,jTextField9.getText());
                           pstt.setString(11,jTextField6.getText());
                           pstt.setString(12,jTextField8.getText());
                            pstt.setString(13,jTextField20.getText());
                            pstt.setString(14,PNR1);
                  pstt.execute();
                     
                  
              }
              catch(Exception e)
              {
                  System.out.println(e);
              }
                  
                 }
               public void NEW()
               {
                    try
         {
             Connection conn=connection.connect.getconnection();
             String sql="insert into payment(cardno,cardtype,cvv,paid,validmon,validyear,pnr) values(?,?,?,?,?,?,?)";
             PreparedStatement pst=conn.prepareStatement(sql);
            
            
              pst.setString(1,cardid);
              pst.setString(2,type); 
              pst.setString(3,CVV);
              pst.setString(4,amount);
               pst.setString(5,ValidMON);
               pst.setString(6,ValidYEAR);
               pst.setString(7,PNRID);
              
              pst.execute();
              JOptionPane.showMessageDialog(null,"Your Tickets has been booked");
            
             
                       name =jTextField27.getText();
                     Name =jTextField13.getText();
                       NAme =jTextField30.getText();
                         NAME =jTextField33.getText();
                           amount=jTextField29.getText();
                         
                 //    jTextField1.setText("");
               //    jComboBox1.setSelectedIndex(0);
                    fill();
                            jTextField14.setText("");
                              jTextField15.setText("");
                               jTextField1.setText("");
                                jTextField16.setText("");
                                jTextField27.setText("");
                                jTextField28.setText("");
                                jTextField13.setText("");
                                jTextField17.setText("");
                                jTextField31.setText("");
                                jTextField33.setText("");
                                jTextField30.setText("");
                                jTextField34.setText("");
                                
                                 jComboBox3.setSelectedIndex(0);
                                  jComboBox4.setSelectedIndex(0);
                                  jComboBox6.setSelectedIndex(0);
                                  jComboBox2.setSelectedIndex(0);
                                  jComboBox7.setSelectedIndex(0);
                                  jComboBox8.setSelectedIndex(0);
                                  
                                  
                           
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
        }
               
                      
     public void ID1()
     {
      long num=(long)Math.floor(Math.random()*900000000L)+10000000L;
      jLabel38.setText(""+num);
   
   }
   public void ID()
   {
       try
       {
           String USER=Login.user;
           Connection connn=connection.connect.getconnection();
           String sql="select * from  booking where username='"+USER+"'";
           PreparedStatement psst=connn.prepareStatement(sql);
           ResultSet rst=psst.executeQuery();
           if(rst.next())
           {
                jLabel19.setText(rst.getString("pnr"));
           }
           else
           {
               long num=(long)Math.floor(Math.random()*9000000000000000L)+100000000000000L;
      jLabel19.setText(""+num);
           }
           
           
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
      
   }
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
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    public static javax.swing.JComboBox jComboBox1;
    public static javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    public static javax.swing.JComboBox jComboBox6;
    public static javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    public static javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField11;
    public static javax.swing.JTextField jTextField12;
    public static javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    public static javax.swing.JTextField jTextField17;
    public static javax.swing.JTextField jTextField19;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField20;
    public static javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    public static javax.swing.JTextField jTextField27;
    public static javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField30;
    public static javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    public static javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
