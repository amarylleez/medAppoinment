package MediCareClinic_package;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Prescription extends javax.swing.JFrame {
private Connection con = null;
private Statement stmt = null, St1=null;
private ResultSet rs = null, Rs1=null;
private Object Rs;
private String PatName;
private int Key = 0;
private int PresId;
private javax.swing.JTextField CostValue; 

    public Prescription() {
        initComponents();
        Fillcombo();
        DisplayPres();
        PresCount();      
    }

    
    
//fillcombo ni dia amik data from entered patients
private void Fillcombo() {
    try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
         Statement stmt1 = con.createStatement();
         Statement stmt2 = con.createStatement();
         ResultSet rs1 = stmt1.executeQuery("SELECT PatName FROM PatientTbl");
         ResultSet rs2 = stmt2.executeQuery("SELECT Treatment, Medicines FROM TreatTbl")) {

        // Populate PatNameList (Patient Names)
        while (rs1.next()) {
            String patName = rs1.getString("PatName");
            PatNameList.addItem(patName);
        }
        // Populate TreatList (Treatment)
        while (rs2.next()) {
            String treat = rs2.getString("Treatment");
            String med = rs2.getString("Medicines");
            TreatList.addItem(treat);
            MedList.addItem(med);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error fetching data: " + e.getMessage());
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
        DocIN = new javax.swing.JLabel();
        PatIN = new javax.swing.JLabel();
        AppoIN = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        logOutS = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PresTable = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        SavePresBtn = new javax.swing.JButton();
        DelPresBtn = new javax.swing.JButton();
        UpdatePresBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        CostTb = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        PatNameList = new javax.swing.JComboBox<>();
        ClearBtn = new javax.swing.JButton();
        TreatList = new javax.swing.JComboBox<>();
        MedList = new javax.swing.JComboBox<>();
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
        jLabel6.setText("Prescription");

        DashIN.setFont(new java.awt.Font("Sitka Text", 0, 20)); // NOI18N
        DashIN.setForeground(new java.awt.Color(255, 255, 255));
        DashIN.setText("Dashboard");
        DashIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashINMouseClicked(evt);
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
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PatIN)
                    .addComponent(DocIN)
                    .addComponent(AppoIN)
                    .addComponent(DashIN)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logOutS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logOut)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PatIN)
                .addGap(32, 32, 32)
                .addComponent(AppoIN)
                .addGap(29, 29, 29)
                .addComponent(DocIN)
                .addGap(37, 37, 37)
                .addComponent(DashIN)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOutS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOut))
                .addGap(38, 38, 38))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 149, 181));
        jLabel5.setText("Prescription");

        jLabel13.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(55, 149, 181));
        jLabel13.setText("Treatment");

        PresTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "PatientName", "Treatment", "Medicines", "Cost"
            }
        ));
        PresTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PresTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(PresTable);

        jLabel17.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(55, 149, 181));
        jLabel17.setText("Prescriptions List");

        jLabel19.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(55, 149, 181));
        jLabel19.setText("Medicines");

        SavePresBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        SavePresBtn.setForeground(new java.awt.Color(55, 149, 181));
        SavePresBtn.setText("SAVE");
        SavePresBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SavePresBtnMouseClicked(evt);
            }
        });
        SavePresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavePresBtnActionPerformed(evt);
            }
        });

        DelPresBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        DelPresBtn.setForeground(new java.awt.Color(55, 149, 181));
        DelPresBtn.setText("DELETE");
        DelPresBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelPresBtnMouseClicked(evt);
            }
        });
        DelPresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelPresBtnActionPerformed(evt);
            }
        });

        UpdatePresBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        UpdatePresBtn.setForeground(new java.awt.Color(55, 149, 181));
        UpdatePresBtn.setText("UPDATE");
        UpdatePresBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdatePresBtnMouseClicked(evt);
            }
        });
        UpdatePresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePresBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(55, 149, 181));
        jLabel12.setText("Cost");

        CostTb.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        CostTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CostTbMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(55, 149, 181));
        jLabel15.setText("Patient Name");

        PatNameList.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        PatNameList.setForeground(new java.awt.Color(55, 149, 181));
        PatNameList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatNameListActionPerformed(evt);
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

        TreatList.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        TreatList.setForeground(new java.awt.Color(55, 149, 181));

        MedList.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        MedList.setForeground(new java.awt.Color(55, 149, 181));

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
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel17))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(PatNameList, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(TreatList, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(MedList, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(CostTb, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SavePresBtn)
                .addGap(26, 26, 26)
                .addComponent(UpdatePresBtn)
                .addGap(18, 18, 18)
                .addComponent(DelPresBtn)
                .addGap(18, 18, 18)
                .addComponent(ClearBtn)
                .addGap(140, 140, 140))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CostTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PatNameList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TreatList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MedList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SavePresBtn)
                    .addComponent(DelPresBtn)
                    .addComponent(UpdatePresBtn)
                    .addComponent(ClearBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
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

    private void SavePresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavePresBtnActionPerformed
         
    }//GEN-LAST:event_SavePresBtnActionPerformed
  
    private void DelPresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelPresBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelPresBtnActionPerformed

    private void UpdatePresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePresBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdatePresBtnActionPerformed
   private void Clear() {
        PatNameList.setSelectedIndex(-1); // Reset JComboBox selection
        TreatList.setSelectedIndex(-1);  // Reset JComboBox selection
        MedList.setSelectedIndex(-1);    // Reset JComboBox selection
        CostTb.setText("");
    }

               

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        Clear();
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void PatNameListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatNameListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatNameListActionPerformed

    private void PresTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PresTableMouseClicked
    DefaultTableModel model = (DefaultTableModel) PresTable.getModel();
       int MyIndex = PresTable.getSelectedRow();

       try {
           Key = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
           System.out.println("Selected PresId: " + Key); // Debugging line
           PatNameList.setSelectedItem(model.getValueAt(MyIndex, 1).toString());
           TreatList.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
           MedList.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
           CostTb.setText(model.getValueAt(MyIndex, 4).toString());
       } catch (Exception e) {
           JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
           e.printStackTrace(); // Print stack trace for debugging
       }

    }//GEN-LAST:event_PresTableMouseClicked

    private void SavePresBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SavePresBtnMouseClicked
        if (PatNameList.getSelectedItem() == null || TreatList.getSelectedItem() == null ||
            MedList.getSelectedItem() == null || CostTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required.");
            return;
        }

        if (!CostTb.getText().matches("\\d+")) { // Ensure CostTb contains only digits
            JOptionPane.showMessageDialog(this, "Please enter a valid numeric value for Cost.");
            return;
        }

        try (
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
                PreparedStatement add = con.prepareStatement(
                    "INSERT INTO PresTbl (PresId, PatName, Treatment, Medicines, CostValue) VALUES (?, ?, ?, ?, ?)", 
                    PreparedStatement.RETURN_GENERATED_KEYS)) { // Corrected PreparedStatement

            // Manually setting the PresId value
            add.setInt(1, PresId); // Set the PresId value here (it could come from the PresCount method)
            add.setString(2, PatNameList.getSelectedItem().toString());
            add.setString(3, TreatList.getSelectedItem().toString());
            add.setString(4, MedList.getSelectedItem().toString());
            add.setInt(5, Integer.parseInt(CostTb.getText())); // Parse to integer

            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Prescription record saved successfully!");

            PresCount(); // Update the PresId
            DisplayPres(); // Update the table to reflect the saved data
            Clear(); // Clear input fields

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_SavePresBtnMouseClicked

    private void CostTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CostTbMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CostTbMouseClicked

    private void UpdatePresBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatePresBtnMouseClicked
        // Check if a valid PresId is selected (Key should be set to the selected PresId)
        if (Key == 0) {  
            JOptionPane.showMessageDialog(this, "Please select a prescription to update.");
            return;
        }

        // Try to connect to the database and update the record
        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
             PreparedStatement update = con.prepareStatement(
                 "UPDATE PresTbl SET PatName = ?, Treatment = ?, Medicines = ?, CostValue = ? WHERE PresId = ?")) {

            // Set the parameters for the update query
            update.setString(1, PatNameList.getSelectedItem().toString());  // Patient Name
            update.setString(2, TreatList.getSelectedItem().toString());    // Treatment
            update.setString(3, MedList.getSelectedItem().toString());      // Medicines
            update.setInt(4, Integer.parseInt(CostTb.getText()));           // Cost Value
            update.setInt(5, Key);                                         // PresId (selected prescription)

            // Execute the update query
            int row = update.executeUpdate();

            // Check if the update was successful
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Prescription record updated successfully!");
                DisplayPres(); // Refresh the table to reflect the updated data
                Clear();       // Clear the input fields
            } else {
                JOptionPane.showMessageDialog(this, "No prescription found with the selected PresId.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_UpdatePresBtnMouseClicked

    private void DelPresBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelPresBtnMouseClicked
        // Check if a valid PresId is selected (Key should be set to the selected PresId)
        if (Key == 0) {  
            JOptionPane.showMessageDialog(this, "Please select a prescription to delete.");
            return;
        }

        // Try to connect to the database and delete the record
        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
             PreparedStatement delete = con.prepareStatement(
                 "DELETE FROM PresTbl WHERE PresId = ?")) {

            // Set the parameter for the delete query
            delete.setInt(1, Key);  // PresId (selected prescription)

            // Execute the delete query
            int row = delete.executeUpdate();

            // Check if the deletion was successful
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Prescription record deleted successfully!");
                DisplayPres(); // Refresh the table to reflect the data after deletion
                Clear();       // Clear the input fields
            } else {
                JOptionPane.showMessageDialog(this, "No prescription found with the selected PresId.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "SQL Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_DelPresBtnMouseClicked

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

    private void logOutSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutSMouseClicked
        this.dispose(); // Dispose of the current window
        new Login().setVisible(true);
    }//GEN-LAST:event_logOutSMouseClicked

    public void PresCount() {
        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT MAX(PresId) FROM PresTbl")) {

            if (rs.next()) {
                PresId = rs.getInt(1) + 1; // Increment the maximum PresId by 1
            } else {
                PresId = 1; // Start with PresId = 1 if the table is empty
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    private void DisplayPres() {
        try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM PresTbl")) {

            DefaultTableModel model = (DefaultTableModel) PresTable.getModel();
            model.setRowCount(0); // Clear existing rows

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("PresId"),
                    rs.getString("PatName"),
                    rs.getString("Treatment"),
                    rs.getString("Medicines"),
                    rs.getInt("CostValue")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching prescriptions: " + e.getMessage());
            e.printStackTrace();
        }
}

    
    public static void main(String args[]) {        
       java.awt.EventQueue.invokeLater(() -> new Prescription().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppoIN;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JFormattedTextField CostTb;
    private javax.swing.JLabel DashIN;
    private javax.swing.JButton DelPresBtn;
    private javax.swing.JLabel DocIN;
    private javax.swing.JComboBox<String> MedList;
    private javax.swing.JLabel PatIN;
    private javax.swing.JComboBox<String> PatNameList;
    private javax.swing.JTable PresTable;
    private javax.swing.JButton SavePresBtn;
    private javax.swing.JComboBox<String> TreatList;
    private javax.swing.JButton UpdatePresBtn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel logOutS;
    // End of variables declaration//GEN-END:variables
}
