package MediCareClinic_package;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.Statement;


public class Patients extends javax.swing.JFrame {
    int Key = 0;
    public Patients() {
        initComponents();
        // Initialize the database connection
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
            DisplayPatients();
            PatCount();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error connecting to database: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DashIN = new javax.swing.JLabel();
        PresIN = new javax.swing.JLabel();
        AppoIN = new javax.swing.JLabel();
        DocIN = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        logOutS = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PatNameTb = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        PhoneTb = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        PatAddressTb = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PatGen = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatTable = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        DOB = new com.toedter.calendar.JDateChooser();
        AppoDateTb = new com.toedter.calendar.JDateChooser();
        SaveBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(55, 149, 181));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MediCare Clinic");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MediCareClinic_package/logonav.png"))); // NOI18N
        jLabel4.setIconTextGap(2);
        jLabel4.setMaximumSize(new java.awt.Dimension(70, 60));
        jLabel4.setMinimumSize(new java.awt.Dimension(70, 60));
        jLabel4.setName("MediCareLogo"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Patients");

        DashIN.setFont(new java.awt.Font("Sitka Text", 0, 20)); // NOI18N
        DashIN.setForeground(new java.awt.Color(255, 255, 255));
        DashIN.setText("Dashboard");
        DashIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashINMouseClicked(evt);
            }
        });

        PresIN.setFont(new java.awt.Font("Sitka Text", 0, 20)); // NOI18N
        PresIN.setForeground(new java.awt.Color(255, 255, 255));
        PresIN.setText("Prescription");
        PresIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PresINMouseClicked(evt);
            }
        });

        AppoIN.setFont(new java.awt.Font("Sitka Text", 0, 20)); // NOI18N
        AppoIN.setForeground(new java.awt.Color(255, 255, 255));
        AppoIN.setText("Appointment");
        AppoIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppoINMouseClicked(evt);
            }
        });

        DocIN.setFont(new java.awt.Font("Sitka Text", 0, 20)); // NOI18N
        DocIN.setForeground(new java.awt.Color(255, 255, 255));
        DocIN.setText("Doctor");
        DocIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DocINMouseClicked(evt);
            }
        });

        logOut.setBackground(new java.awt.Color(255, 255, 255));
        logOut.setFont(new java.awt.Font("SimSun-ExtG", 1, 19)); // NOI18N
        logOut.setForeground(new java.awt.Color(204, 0, 0));
        logOut.setText("LOGOUT");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });

        logOutS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MediCareClinic_package/shutdown.png"))); // NOI18N
        logOutS.setIconTextGap(2);
        logOutS.setMaximumSize(new java.awt.Dimension(70, 60));
        logOutS.setMinimumSize(new java.awt.Dimension(70, 60));
        logOutS.setName("MediCareLogo"); // NOI18N
        logOutS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AppoIN)
                            .addComponent(DashIN)
                            .addComponent(PresIN)
                            .addComponent(DocIN)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(logOutS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logOut))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addComponent(AppoIN)
                .addGap(27, 27, 27)
                .addComponent(DocIN)
                .addGap(29, 29, 29)
                .addComponent(PresIN)
                .addGap(37, 37, 37)
                .addComponent(DashIN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOutS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOut))
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 149, 181));
        jLabel5.setText("Patients");

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(55, 149, 181));
        jLabel7.setText("Patient Name");

        PatNameTb.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        PatNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatNameTbActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(55, 149, 181));
        jLabel12.setText("Phone");

        PhoneTb.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        PhoneTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTbActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(55, 149, 181));
        jLabel13.setText("Address");

        PatAddressTb.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        PatAddressTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatAddressTbActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(55, 149, 181));
        jLabel14.setText("DOB");

        jLabel15.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(55, 149, 181));
        jLabel15.setText("Gender");

        jLabel16.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(55, 149, 181));
        jLabel16.setText("Appointment Date");

        PatGen.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        PatGen.setForeground(new java.awt.Color(55, 149, 181));
        PatGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        PatTable.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        PatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Patient Name", "Phone", "Address", "DOB", "Gender", "AppoDate"
            }
        ));
        PatTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatTableMouseClicked(evt);
            }
        });
        PatTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PatTableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(PatTable);

        jLabel17.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(55, 149, 181));
        jLabel17.setText("Patients List");

        SaveBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(55, 149, 181));
        SaveBtn.setText("SAVE");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(55, 149, 181));
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(55, 149, 181));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        ClearBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(55, 149, 181));
        ClearBtn.setText("CLEAR");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MediCareClinic_package/exit12px.png"))); // NOI18N
        closeBtn.setIconTextGap(2);
        closeBtn.setMaximumSize(new java.awt.Dimension(70, 60));
        closeBtn.setMinimumSize(new java.awt.Dimension(70, 60));
        closeBtn.setName("MediCareLogo"); // NOI18N
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(PatNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(PatAddressTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(PatGen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel16)
                            .addComponent(AppoDateTb, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SaveBtn)
                        .addGap(26, 26, 26)
                        .addComponent(UpdateBtn)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBtn))
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addComponent(ClearBtn)
                .addGap(126, 126, 126))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(599, Short.MAX_VALUE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PatAddressTb))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PatGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PatNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AppoDateTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(ClearBtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(591, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PatAddressTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatAddressTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatAddressTbActionPerformed

    private void PhoneTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTbActionPerformed

    private void PatNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatNameTbActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed
   
Connection con = null;
Statement stmt = null, St1=null;
ResultSet rs = null, Rs1=null;
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked

        // Check for empty fields
        if (PatNameTb.getText().isEmpty() || PhoneTb.getText().isEmpty() || PatAddressTb.getText().isEmpty() 
            || DOB.getDate() == null || AppoDateTb.getDate() == null || PatGen.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "All fields are required.");
            return;
        }

        Connection con = null;
        try {
            // Connect to the database
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");

            // Format dates
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dob = sdf.format(DOB.getDate());
            String appoDate = sdf.format(AppoDateTb.getDate());
            
            PatCount();
            // Prepare and execute the SQL insert statement
            PreparedStatement add = con.prepareStatement(
                "INSERT INTO PatientTbl (PATID, PatName, Phone, PatAddress, DOB, PatGen, AppoDate) VALUES (?, ?, ?, ?, ?, ?, ?)"
            );
            add.setInt(1, PatId);
            add.setString(2, PatNameTb.getText());
            add.setString(3, PhoneTb.getText());
            add.setString(4, PatAddressTb.getText());
            add.setString(5, dob);
            add.setString(6, PatGen.getSelectedItem().toString());
            add.setString(7, appoDate);

            add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record saved successfully!");

        } catch (SQLException e) {
            // Handle constraint violations (SQLState: 23505 for UNIQUE constraint violations in Derby)
            if ("23505".equals(e.getSQLState())) {
                JOptionPane.showMessageDialog(this, "Duplicate PATID. Please try again.");
            } else {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            }
            e.printStackTrace();
        } finally {
            // Close the connection in the 'finally' block
            try {
                if (con != null) {
                    con.close();
                    DisplayPatients();
                    Clear();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_SaveBtnMouseClicked

int PatId=0;    
    public void PatCount(){
        try {
            St1 = con.createStatement();
            Rs1 = St1.executeQuery("SELECT MAX(PATID) FROM tyra.PatientTbl");
            if (Rs1.next()) {
                PatId = Rs1.getInt(1) + 1; // Increment the maximum ID by 1
            } else {
                PatId = 1; // Start with ID 1 if the table is empty
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (Rs1 != null) Rs1.close();
                if (St1 != null) St1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
       
    }


private void DisplayPatients() {
    String url = "jdbc:derby://localhost:1527/MedDb";
    String user = "tyra";
    String password = "1234";

    Connection con = null;
    Statement St = null;
    ResultSet Rs = null;

    try {
        con = DriverManager.getConnection(url, user, password);
        St = con.createStatement();
        Rs = St.executeQuery("SELECT * FROM tyra.PatientTbl");

        // Get the model of the JTable and clear existing rows
        DefaultTableModel model = (DefaultTableModel) PatTable.getModel();
        model.setRowCount(0);

        // Populate the JTable with data from the ResultSet
        while (Rs.next()) {
            model.addRow(new Object[]{
                Rs.getInt("PATID"),
                Rs.getString("PatName"),
                Rs.getString("Phone"),
                Rs.getString("PatAddress"),
                Rs.getDate("DOB"),
                Rs.getString("PatGen"),
                Rs.getDate("AppoDate")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error fetching data: " + e.getMessage());
        e.printStackTrace();
    } finally {
        try {
            if (Rs != null) Rs.close();
            if (St != null) St.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


    private void PatTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PatTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatTableKeyPressed

    private void PatTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) PatTable.getModel();
        int MyIndex = PatTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        PatNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        PhoneTb.setText(model.getValueAt(MyIndex, 2).toString());
        PatAddressTb.setText(model.getValueAt(MyIndex, 3).toString());
        // Set DOB (assuming DOB is a JDateChooser)
        DOB.setDate(java.sql.Date.valueOf(model.getValueAt(MyIndex, 4).toString()));
        // Set Gender (assuming PatGen is a JComboBox)
        PatGen.setSelectedItem(model.getValueAt(MyIndex, 5).toString());
        // Set Appointment Date (assuming AppoDateTb is a JDateChooser)
        AppoDateTb.setDate(java.sql.Date.valueOf(model.getValueAt(MyIndex, 6).toString()));
    
    }//GEN-LAST:event_PatTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
         if (Key == 0) {
            JOptionPane.showMessageDialog(this, "Select The Patient");
            return;
        }

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
            String Query = "DELETE FROM tyra.PatientTbl WHERE PATID = " + Key;

            Statement stmt = con.createStatement();
            stmt.executeUpdate(Query);

            JOptionPane.showMessageDialog(this, "Patient Deleted Successfully!");
            DisplayPatients();
            Clear();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
         if (Key == 0) {
            JOptionPane.showMessageDialog(this, "Select The Patient");
            return;
        }

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dob = sdf.format(DOB.getDate());
            String appoDate = sdf.format(AppoDateTb.getDate());

            String Query = "UPDATE tyra.PatientTbl SET "
                    + "PatName='" + PatNameTb.getText() + "', "
                    + "Phone='" + PhoneTb.getText() + "', "
                    + "PatAddress='" + PatAddressTb.getText() + "', "
                    + "DOB='" + dob + "', "
                    + "PatGen='" + PatGen.getSelectedItem().toString() + "', "
                    + "AppoDate='" + appoDate + "' "
                    + "WHERE PATID = " + Key;

            Statement stmt = con.createStatement();
            stmt.executeUpdate(Query);

            JOptionPane.showMessageDialog(this, "Patient Updated Successfully!");
            DisplayPatients();
            Clear();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
    }//GEN-LAST:event_UpdateBtnMouseClicked
    private void Clear(){
        PatNameTb.setText("");
        PhoneTb.setText("");
        PatAddressTb.setText("");
        DOB.setDate(null);
        PatGen.setSelectedItem(null);
        AppoDateTb.setDate(null);
    }
    
    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        Clear();
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        this.dispose(); // Dispose of the current window
        // Create and show the Login window
        new Login().setVisible(true);
    }//GEN-LAST:event_logOutMouseClicked

    private void logOutSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutSMouseClicked
        this.dispose(); // Dispose of the current window
        new Login().setVisible(true);
    }//GEN-LAST:event_logOutSMouseClicked

    private void AppoINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppoINMouseClicked
        this.dispose(); // Dispose of the current window
        new Appointment().setVisible(true);        
    }//GEN-LAST:event_AppoINMouseClicked

    private void DocINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocINMouseClicked
        this.dispose(); // Dispose of the current window
        new Doctor().setVisible(true);
    }//GEN-LAST:event_DocINMouseClicked

    private void DashINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashINMouseClicked
        this.dispose(); // Dispose of the current window
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_DashINMouseClicked

    private void PresINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PresINMouseClicked
        this.dispose(); // Dispose of the current window
        new Prescription().setVisible(true);
    }//GEN-LAST:event_PresINMouseClicked

    
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Patients().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser AppoDateTb;
    private javax.swing.JLabel AppoIN;
    private javax.swing.JButton ClearBtn;
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JLabel DashIN;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JLabel DocIN;
    private javax.swing.JTextField PatAddressTb;
    private javax.swing.JComboBox<String> PatGen;
    private javax.swing.JTextField PatNameTb;
    private javax.swing.JTable PatTable;
    private javax.swing.JTextField PhoneTb;
    private javax.swing.JLabel PresIN;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel logOutS;
    // End of variables declaration//GEN-END:variables
}
