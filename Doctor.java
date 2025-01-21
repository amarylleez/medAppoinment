package MediCareClinic_package;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Doctor extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null, St1=null;
ResultSet rs = null, Rs1=null;
private Object Rs;
private String PatName;
int Key = 0;

    public Doctor() {
        initComponents();
        Fillcombo();
        DisplayTreatments();
        TreatCount();
    }

    protected void Fillcombo() {
        try {
            // Initialize connection
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");

            // Prepare SQL query to select patient names from PatientTbl
            String query = "SELECT PatName FROM PatientTbl";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            // Loop through the result set and add each patient name to the JComboBox
            while (rs.next()) {
                String name = rs.getString("PatName"); // Fetch patient name
                PatNameList.addItem(name); // Add patient name to JComboBox
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching patient names: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
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
        AppoIN = new javax.swing.JLabel();
        logOutS = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TreatTbl = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        SaveDrBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        UpdateDrBtn = new javax.swing.JButton();
        PatNameList = new javax.swing.JComboBox<>();
        TreatTb = new javax.swing.JTextField();
        MedTb = new javax.swing.JTextField();
        DrNameTb = new javax.swing.JTextField();
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
        jLabel6.setText("Doctor");

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

        AppoIN.setFont(new java.awt.Font("Sitka Text", 0, 20)); // NOI18N
        AppoIN.setForeground(new java.awt.Color(255, 255, 255));
        AppoIN.setText("Appoinment");
        AppoIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppoINMouseClicked(evt);
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

        logOut.setBackground(new java.awt.Color(255, 255, 255));
        logOut.setFont(new java.awt.Font("SimSun-ExtG", 1, 19)); // NOI18N
        logOut.setForeground(new java.awt.Color(204, 0, 0));
        logOut.setText("LOGOUT");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PatIN)
                            .addComponent(PresIN)
                            .addComponent(AppoIN)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(logOutS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(logOut))
                                .addComponent(DashIN))))
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
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(PatIN)
                .addGap(32, 32, 32)
                .addComponent(AppoIN)
                .addGap(29, 29, 29)
                .addComponent(PresIN)
                .addGap(37, 37, 37)
                .addComponent(DashIN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOutS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOut))
                .addGap(38, 38, 38))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 149, 181));
        jLabel5.setText("Doctor");

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(55, 149, 181));
        jLabel7.setText("Dr Name");

        jLabel13.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(55, 149, 181));
        jLabel13.setText("Patient");

        jLabel14.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(55, 149, 181));
        jLabel14.setText("Treatment");

        TreatTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Dr Available", "Patient Name", "Treatment", "Medicines"
            }
        ));
        TreatTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreatTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TreatTbl);

        jLabel17.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(55, 149, 181));
        jLabel17.setText("Treatment List");

        jLabel19.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(55, 149, 181));
        jLabel19.setText("Medicines");

        SaveDrBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        SaveDrBtn.setForeground(new java.awt.Color(55, 149, 181));
        SaveDrBtn.setText("SAVE");
        SaveDrBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveDrBtnMouseClicked(evt);
            }
        });
        SaveDrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveDrBtnActionPerformed(evt);
            }
        });

        DelBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        DelBtn.setForeground(new java.awt.Color(55, 149, 181));
        DelBtn.setText("DELETE");
        DelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelBtnMouseClicked(evt);
            }
        });
        DelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBtnActionPerformed(evt);
            }
        });

        UpdateDrBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        UpdateDrBtn.setForeground(new java.awt.Color(55, 149, 181));
        UpdateDrBtn.setText("UPDATE");
        UpdateDrBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateDrBtnMouseClicked(evt);
            }
        });
        UpdateDrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDrBtnActionPerformed(evt);
            }
        });

        PatNameList.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        PatNameList.setForeground(new java.awt.Color(55, 149, 181));

        DrNameTb.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        DrNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrNameTbActionPerformed(evt);
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(104, 104, 104))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(DrNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PatNameList, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(TreatTb, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel19))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(MedTb, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(248, 248, 248))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(SaveDrBtn)
                .addGap(26, 26, 26)
                .addComponent(UpdateDrBtn)
                .addGap(18, 18, 18)
                .addComponent(DelBtn)
                .addGap(18, 18, 18)
                .addComponent(ClearBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PatNameList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DrNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TreatTb, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(MedTb))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveDrBtn)
                    .addComponent(DelBtn)
                    .addComponent(UpdateDrBtn)
                    .addComponent(ClearBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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

    private void SaveDrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveDrBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveDrBtnActionPerformed

    private void DelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelBtnActionPerformed

    private void UpdateDrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDrBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateDrBtnActionPerformed

    private void DrNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrNameTbActionPerformed

     // Clear Input Fields
    private void Clear() {
        DrNameTb.setText("");
        TreatTb.setText("");
        MedTb.setText("");
        PatNameList.setSelectedIndex(-1);
    }
    
    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        Clear();
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void SaveDrBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveDrBtnMouseClicked
       if (DrNameTb.getText().isEmpty() || TreatTb.getText().isEmpty() || MedTb.getText().isEmpty() || PatNameList.getSelectedItem() == null) {
         JOptionPane.showMessageDialog(this, "All fields are required.");
         return;
        }

         try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
            PreparedStatement add = con.prepareStatement(
                "INSERT INTO TreatTbl (TreatID, DrName, PatName, Treatment, Medicines) VALUES (?, ?, ?, ?, ?)");
            add.setInt(1, TreatId); // Corrected index
            add.setString(2, DrNameTb.getText());
            add.setString(3, PatNameList.getSelectedItem().toString());
            add.setString(4, TreatTb.getText());
            add.setString(5, MedTb.getText());

            add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Doctor's record saved successfully!");

            DisplayTreatments(); // Refresh table
            Clear(); // Reset fields
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
    }//GEN-LAST:event_SaveDrBtnMouseClicked

    private void TreatTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreatTblMouseClicked

        DefaultTableModel model = (DefaultTableModel) TreatTbl.getModel();
        int MyIndex = TreatTbl.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        DrNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        PatNameList.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        TreatTb.setText(model.getValueAt(MyIndex, 3).toString());
        MedTb.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_TreatTblMouseClicked

    private void UpdateDrBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateDrBtnMouseClicked
        if (Key == 0) {
            JOptionPane.showMessageDialog(this, "Select The Patient");
            return;
        }

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");

            String Query = "UPDATE tyra.TreatTbl SET "
            + "DrName='" + DrNameTb.getText() + "', "
            + "PatName='" + PatNameList.getSelectedItem().toString() + "', "
            + "Treatment='" + TreatTb.getText() + "', "
            + "Medicines='" + MedTb.getText() + "' "
            + "WHERE TreatID = " + Key;

            Statement stmt = con.createStatement();
            stmt.executeUpdate(Query);

            JOptionPane.showMessageDialog(this, "Treament List Updated Successfully!");
            DisplayTreatments();
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
    }//GEN-LAST:event_UpdateDrBtnMouseClicked

    private void DelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelBtnMouseClicked
         if (Key == 0) {
            JOptionPane.showMessageDialog(this, "Select The Patient");
            return;
        }

        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
            String Query = "DELETE FROM tyra.TreatId WHERE TreatId = " + Key;

            Statement stmt = con.createStatement();
            stmt.executeUpdate(Query);

            JOptionPane.showMessageDialog(this, "List Deleted Successfully!");
            DisplayTreatments();
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
    }//GEN-LAST:event_DelBtnMouseClicked

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
         System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    private void PatINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatINMouseClicked
        this.dispose(); // Dispose of the current window
        new Patients().setVisible(true);
    }//GEN-LAST:event_PatINMouseClicked

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        this.dispose(); // Dispose of the current window
        new Login().setVisible(true);
    }//GEN-LAST:event_logOutMouseClicked

    private void AppoINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppoINMouseClicked
        this.dispose(); // Dispose of the current window
        new Appointment().setVisible(true);
    }//GEN-LAST:event_AppoINMouseClicked

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

    int TreatId=0;    
    private void TreatCount(){
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
            St1 = con.createStatement();
            Rs1 = St1.executeQuery("SELECT MAX(TREATID) FROM tyra.TreatTbl");
            if (Rs1.next()) {
                TreatId = Rs1.getInt(1) + 1; // Increment the maximum ID by 1
            } else {
                TreatId = 1; // Start with ID 1 if the table is empty
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
    
    private void DisplayTreatments() {
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
            St1 = con.createStatement();
            Rs1 = St1.executeQuery("SELECT * FROM TreatTbl");

            DefaultTableModel model = (DefaultTableModel) TreatTbl.getModel();
            model.setRowCount(0);

            while (Rs1.next()) {
                model.addRow(new Object[]{
                    Rs1.getInt("TreatID"),
                    Rs1.getString("DrName"),
                    Rs1.getString("PatName"),
                    Rs1.getString("Treatment"),
                    Rs1.getString("Medicines")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching treatments: " + e.getMessage());
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
       java.awt.EventQueue.invokeLater(() -> new Doctor().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppoIN;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel DashIN;
    private javax.swing.JButton DelBtn;
    private javax.swing.JTextField DrNameTb;
    private javax.swing.JTextField MedTb;
    private javax.swing.JLabel PatIN;
    private javax.swing.JComboBox<String> PatNameList;
    private javax.swing.JLabel PresIN;
    private javax.swing.JButton SaveDrBtn;
    private javax.swing.JTextField TreatTb;
    private javax.swing.JTable TreatTbl;
    private javax.swing.JButton UpdateDrBtn;
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
