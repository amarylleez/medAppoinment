package MediCareClinic_package;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Appointment extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null, St1=null;
ResultSet rs = null, Rs1=null;
private Object Rs;
int Key = 0;

    public Appointment() {
        initComponents();
        Fillcombo();
        DisplayAppointments();
        AppoCount();
    }
    
    private void Fillcombo() {
        Connection con = null;
        Statement stmt1 = null, stmt2 = null;
        ResultSet rs1 = null, rs2 = null;

        try {
            // Initialize connection
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");

            // Query 1: Fetch PatName and AppoDate from PatientTbl
            String query1 = "SELECT PatName, AppoDate FROM PatientTbl";
            stmt1 = con.createStatement();
            rs1 = stmt1.executeQuery(query1);

            while (rs1.next()) {
                String patName = rs1.getString("PatName");
                String appoDate = rs1.getString("AppoDate");

                PatNameList.addItem(patName); // Add patient name to PatNameList JComboBox
                DateList.addItem(appoDate);  // Add appointment date to DateList JComboBox
            }

            // Query 2: Fetch DrName from TreatTbl
            String query2 = "SELECT DrName FROM TreatTbl";
            stmt2 = con.createStatement();
            rs2 = stmt2.executeQuery(query2);

            while (rs2.next()) {
                String drName = rs2.getString("DrName");
                DrList.addItem(drName); // Add doctor name to DrList JComboBox
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources for Query 1
            try {
                if (rs1 != null) rs1.close();
                if (stmt1 != null) stmt1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Close resources for Query 2
            try {
                if (rs2 != null) rs2.close();
                if (stmt2 != null) stmt2.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Close connection
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
        PatIN = new javax.swing.JLabel();
        DocIN = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        logOutS = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PatNameList = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        AppoTable = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        DrList = new javax.swing.JComboBox<>();
        SaveAppoBtn = new javax.swing.JButton();
        DelAppoBtn = new javax.swing.JButton();
        UpdateAppoBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        TimeList = new javax.swing.JComboBox<>();
        DateList = new javax.swing.JComboBox<>();
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
        jLabel6.setText("Appointment");

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

        PatIN.setFont(new java.awt.Font("Sitka Text", 0, 20)); // NOI18N
        PatIN.setForeground(new java.awt.Color(255, 255, 255));
        PatIN.setText("Patients");
        PatIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatINMouseClicked(evt);
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
                        .addGap(45, 45, 45)
                        .addComponent(logOutS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logOut))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PatIN)
                            .addComponent(DashIN)
                            .addComponent(PresIN)
                            .addComponent(DocIN)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(116, 116, 116)
                .addComponent(PatIN)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(DocIN)
                        .addGap(29, 29, 29)
                        .addComponent(PresIN)
                        .addGap(37, 37, 37)
                        .addComponent(DashIN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOutS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOut)))
                .addGap(45, 45, 45))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 149, 181));
        jLabel5.setText("Appointment");

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(55, 149, 181));
        jLabel7.setText("Date");

        jLabel13.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(55, 149, 181));
        jLabel13.setText("Patient");

        jLabel14.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(55, 149, 181));
        jLabel14.setText("Time");

        PatNameList.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        PatNameList.setForeground(new java.awt.Color(55, 149, 181));

        AppoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Date", "Patient Name", "Time", "Dr Available"
            }
        ));
        AppoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppoTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(AppoTable);

        jLabel17.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(55, 149, 181));
        jLabel17.setText("Appointments List");

        jLabel19.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(55, 149, 181));
        jLabel19.setText("Dr Available");

        DrList.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        DrList.setForeground(new java.awt.Color(55, 149, 181));

        SaveAppoBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        SaveAppoBtn.setForeground(new java.awt.Color(55, 149, 181));
        SaveAppoBtn.setText("SAVE");
        SaveAppoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveAppoBtnMouseClicked(evt);
            }
        });
        SaveAppoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAppoBtnActionPerformed(evt);
            }
        });

        DelAppoBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        DelAppoBtn.setForeground(new java.awt.Color(55, 149, 181));
        DelAppoBtn.setText("DELETE");
        DelAppoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelAppoBtnMouseClicked(evt);
            }
        });
        DelAppoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelAppoBtnActionPerformed(evt);
            }
        });

        UpdateAppoBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        UpdateAppoBtn.setForeground(new java.awt.Color(55, 149, 181));
        UpdateAppoBtn.setText("UPDATE");
        UpdateAppoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateAppoBtnMouseClicked(evt);
            }
        });
        UpdateAppoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateAppoBtnActionPerformed(evt);
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

        TimeList.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        TimeList.setForeground(new java.awt.Color(55, 149, 181));
        TimeList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00am", "09:00am", "10:00am", "11:00am", "12:00am", "01:00pm", "02:00pm", "03:00pm", "04:00pm" }));

        DateList.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        DateList.setForeground(new java.awt.Color(55, 149, 181));
        DateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateListActionPerformed(evt);
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaveAppoBtn)
                .addGap(26, 26, 26)
                .addComponent(UpdateAppoBtn)
                .addGap(18, 18, 18)
                .addComponent(DelAppoBtn)
                .addGap(18, 18, 18)
                .addComponent(ClearBtn)
                .addGap(128, 128, 128))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel17)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(125, 125, 125))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(DateList, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(PatNameList, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(TimeList, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel19))
                            .addComponent(DrList, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DrList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PatNameList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TimeList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DateList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel7))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveAppoBtn)
                    .addComponent(DelAppoBtn)
                    .addComponent(UpdateAppoBtn)
                    .addComponent(ClearBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void SaveAppoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAppoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveAppoBtnActionPerformed

    private void DelAppoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelAppoBtnActionPerformed
                                         
        if (Key == 0) {
            JOptionPane.showMessageDialog(this, "Select The Appointment");
            return;
        }

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");

            // Correct query to delete appointment based on Key
            String Query = "DELETE FROM tyra.AppoTbl WHERE AppoId = " + Key;

            Statement stmt = con.createStatement();
            stmt.executeUpdate(Query);

            JOptionPane.showMessageDialog(this, "Appointment Deleted Successfully!");
            DisplayAppointments();  // Refresh the displayed appointments
            Clear();  // Clear any selected data or fields
            Key = 0;  // Reset Key after deletion
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
    }//GEN-LAST:event_DelAppoBtnActionPerformed

    private void UpdateAppoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateAppoBtnActionPerformed
        if (Key == 0) {
            JOptionPane.showMessageDialog(this, "Select the Appointment to Update");
            return;
        }

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");

            // SQL query
            String query = "UPDATE tyra.AppoTbl SET AppoDate = ?, PatName = ?, AppoTime = ?, DrName = ? WHERE AppoId = ?";
            PreparedStatement pstmt = con.prepareStatement(query);

            // Set parameters
            pstmt.setString(1, DateList.getSelectedItem().toString());
            pstmt.setString(2, PatNameList.getSelectedItem().toString());
            pstmt.setString(3, TimeList.getSelectedItem().toString());
            pstmt.setString(4, DrList.getSelectedItem().toString());
            pstmt.setInt(5, Key);

            // Execute the query
            int rowsUpdated = pstmt.executeUpdate();

            // Check rows updated
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Appointment Updated Successfully!");
                DisplayAppointments();  // Update the appointment list
                Clear();  // Clear selected fields
            } else {
                JOptionPane.showMessageDialog(this, "No Appointment Found with the Provided ID.");
            }
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
    }//GEN-LAST:event_UpdateAppoBtnActionPerformed
    


// Clear Input Fields
    private void Clear() {
        DateList.setSelectedIndex(-1);
        PatNameList.setSelectedIndex(-1);
        TimeList.setSelectedIndex(-1);
        DrList.setSelectedIndex(-1);
    }
    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
      Clear();
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void DateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateListActionPerformed

    private void SaveAppoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveAppoBtnMouseClicked

        if (DateList.getSelectedItem() == null || PatNameList.getSelectedItem() == null ||
               TimeList.getSelectedItem() == null || DrList.getSelectedItem() == null) {
               JOptionPane.showMessageDialog(this, "All fields are required.");
               return;
           }

           Connection con = null;

           try {
               // Connect to the database
               con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");

               // Parse and format the date
               String dateInput = DateList.getSelectedItem().toString(); // Assume the input is like "2025-02-04"
               LocalDate formattedDate = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

               // SQL query
               String query = "INSERT INTO AppoTbl (AppoId, AppoDate, PatName, AppoTime, DrName) VALUES (?, ?, ?, ?, ?)";
               PreparedStatement add = con.prepareStatement(query);

               // Set parameters
               add.setInt(1, AppoId); // Ensure AppoId is generated or incremented properly
               add.setDate(2, java.sql.Date.valueOf(formattedDate)); // Convert LocalDate to SQL Date
               add.setString(3, PatNameList.getSelectedItem().toString());
               add.setString(4, TimeList.getSelectedItem().toString());
               add.setString(5, DrList.getSelectedItem().toString());

               // Execute the query
               add.executeUpdate();

               // Success message
               JOptionPane.showMessageDialog(this, "Appointment record saved successfully!");

               // Refresh table and clear fields
               DisplayAppointments();
               Clear();
           } catch (SQLException e) {
               JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
               e.printStackTrace();
           } catch (DateTimeParseException e) {
               JOptionPane.showMessageDialog(this, "Invalid date format. Please select a valid date.");
               e.printStackTrace();
           } finally {
               // Close resources
               if (con != null) {
                   try {
                       con.close();
                   } catch (SQLException e) {
                       e.printStackTrace();
                   }
               }
           }

    }//GEN-LAST:event_SaveAppoBtnMouseClicked

    private void UpdateAppoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateAppoBtnMouseClicked
       
    }//GEN-LAST:event_UpdateAppoBtnMouseClicked

    private void DelAppoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelAppoBtnMouseClicked
        
    }//GEN-LAST:event_DelAppoBtnMouseClicked

    private void AppoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppoTableMouseClicked
        int selectedRow = AppoTable.getSelectedRow();
    if (selectedRow != -1) {
        // Assuming AppoId is in the first column (index 0)
        Key = (int) AppoTable.getValueAt(selectedRow, 0);
        System.out.println("Selected Appointment ID: " + Key);
    }

    }//GEN-LAST:event_AppoTableMouseClicked

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
         System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        this.dispose(); // Dispose of the current window
        new Login().setVisible(true);     
    }//GEN-LAST:event_logOutMouseClicked

    private void PatINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatINMouseClicked
        this.dispose(); // Dispose of the current window
        new Patients().setVisible(true);
    }//GEN-LAST:event_PatINMouseClicked

    private void DocINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocINMouseClicked
        this.dispose(); // Dispose of the current window
        new Doctor().setVisible(true);
    }//GEN-LAST:event_DocINMouseClicked

    private void DashINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashINMouseClicked
        this.dispose(); // Dispose of the current window
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_DashINMouseClicked

    private void logOutSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutSMouseClicked
        this.dispose(); // Dispose of the current window
        new Login().setVisible(true);
    }//GEN-LAST:event_logOutSMouseClicked

    private void PresINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PresINMouseClicked
        this.dispose(); // Dispose of the current window
        new Prescription().setVisible(true);
    }//GEN-LAST:event_PresINMouseClicked

   int AppoId = 0;    
    private void AppoCount() {
        Connection con = null;
        Statement St1 = null;
        ResultSet Rs1 = null;

        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
            St1 = con.createStatement();
            Rs1 = St1.executeQuery("SELECT MAX(APPOID) FROM tyra.AppoTbl");

            if (Rs1.next()) {
                AppoId = Rs1.getInt(1) + 1; // Increment the maximum ID by 1
            } else {
                AppoId = 1; // Start with ID 1 if the table is empty
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error retrieving appointment count: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (Rs1 != null) Rs1.close();
                if (St1 != null) St1.close();
                if (con != null) con.close(); // Ensure connection is closed
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } 
    }

    
    
     private void DisplayAppointments() {
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
            St1 = con.createStatement();
            Rs1 = St1.executeQuery("SELECT * FROM AppoTbl");

            DefaultTableModel model = (DefaultTableModel) AppoTable.getModel();
            model.setRowCount(0);

            while (Rs1.next()) {
                model.addRow(new Object[]{
                    Rs1.getInt("AppoID"),
                    Rs1.getString("AppoDate"),
                    Rs1.getString("PatName"),
                    Rs1.getString("AppoTime"),
                    Rs1.getString("DrName")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching appointments: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (Rs1 != null) Rs1.close();
                if (St1 != null) St1.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
    }
        
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> new Appointment().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppoTable;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel DashIN;
    private javax.swing.JComboBox<String> DateList;
    private javax.swing.JButton DelAppoBtn;
    private javax.swing.JLabel DocIN;
    private javax.swing.JComboBox<String> DrList;
    private javax.swing.JLabel PatIN;
    private javax.swing.JComboBox<String> PatNameList;
    private javax.swing.JLabel PresIN;
    private javax.swing.JButton SaveAppoBtn;
    private javax.swing.JComboBox<String> TimeList;
    private javax.swing.JButton UpdateAppoBtn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
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
