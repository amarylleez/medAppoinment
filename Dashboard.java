package MediCareClinic_package;

import java.sql.*;
import java.util.*;

public class Dashboard extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null, St1=null, St2=null;
ResultSet rs = null, Rs1=null, Rs2=null;
    
    public Dashboard() {
        initComponents();
        getData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PresIN = new javax.swing.JLabel();
        DocIN = new javax.swing.JLabel();
        PatIN = new javax.swing.JLabel();
        AppoIN = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        logOutS = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        PatNumLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TNumLabel = new javax.swing.JLabel();
        PNumLabel = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
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
        jLabel6.setText("Dashboard");

        PresIN.setFont(new java.awt.Font("Sitka Text", 0, 20)); // NOI18N
        PresIN.setForeground(new java.awt.Color(255, 255, 255));
        PresIN.setText("Prescription");
        PresIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PresINMouseClicked(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PatIN)
                            .addComponent(PresIN)
                            .addComponent(DocIN)
                            .addComponent(AppoIN)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(logOutS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logOut))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(119, 119, 119)
                .addComponent(PatIN)
                .addGap(32, 32, 32)
                .addComponent(AppoIN)
                .addGap(33, 33, 33)
                .addComponent(DocIN)
                .addGap(33, 33, 33)
                .addComponent(PresIN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOutS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOut, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 149, 181));
        jLabel5.setText("Dashboard");

        jLabel13.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(55, 149, 181));
        jLabel13.setText("Treatments");

        jLabel19.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(55, 149, 181));
        jLabel19.setText("Prescriptions");

        PatNumLabel.setFont(new java.awt.Font("Sitka Text", 1, 28)); // NOI18N
        PatNumLabel.setForeground(new java.awt.Color(102, 0, 0));
        PatNumLabel.setText("Num");

        jLabel16.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(55, 149, 181));
        jLabel16.setText("Patients");

        TNumLabel.setFont(new java.awt.Font("Sitka Text", 1, 28)); // NOI18N
        TNumLabel.setForeground(new java.awt.Color(102, 0, 0));
        TNumLabel.setText("Num");

        PNumLabel.setFont(new java.awt.Font("Sitka Text", 1, 28)); // NOI18N
        PNumLabel.setForeground(new java.awt.Color(102, 0, 0));
        PNumLabel.setText("Num");

        jLabel21.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MediCareClinic_package/prescription128px.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MediCareClinic_package/medical-team128px.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MediCareClinic_package/patient128px.png"))); // NOI18N

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
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(PNumLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(PatNumLabel)))
                        .addGap(52, 52, 52)
                        .addComponent(jLabel23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(TNumLabel)))
                        .addGap(85, 85, 85))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PatNumLabel))
                    .addComponent(jLabel24)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(TNumLabel))
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PNumLabel)))
                .addGap(135, 135, 135))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void logOutSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutSMouseClicked
        this.dispose(); // Dispose of the current window
        new Login().setVisible(true);
    }//GEN-LAST:event_logOutSMouseClicked

    private void PresINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PresINMouseClicked
        this.dispose(); // Dispose of the current window
        new Prescription().setVisible(true);
    }//GEN-LAST:event_PresINMouseClicked

   private void getData() {
        try {
            // Establish database connection
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/MedDb", "tyra", "1234");
            stmt = con.createStatement();
            St1 = con.createStatement();
            St2 = con.createStatement();

            // Execute queries
            rs = stmt.executeQuery("select count(*) from tyra.PatientTbl");
            if (rs.next()) {
                PatNumLabel.setText("" + rs.getInt(1));
            }

            Rs1 = St1.executeQuery("select count(*) from tyra.TreatTbl");
            if (Rs1.next()) {
                TNumLabel.setText("" + Rs1.getInt(1));
            }

            Rs2 = St2.executeQuery("select count(*) from tyra.PresTbl");
            if (Rs2.next()) {
                PNumLabel.setText("" + Rs2.getInt(1));
            }

        } catch (Exception Ex) {
            Ex.printStackTrace(); // Log the exception
        } finally {
            // Close resources to prevent resource leaks
            try {
                if (rs != null) rs.close();
                if (Rs1 != null) Rs1.close();
                if (Rs2 != null) Rs2.close();
                if (stmt != null) stmt.close();
                if (St1 != null) St1.close();
                if (St2 != null) St2.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Log any exceptions during cleanup
            }
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppoIN;
    private javax.swing.JLabel DocIN;
    private javax.swing.JLabel PNumLabel;
    private javax.swing.JLabel PatIN;
    private javax.swing.JLabel PatNumLabel;
    private javax.swing.JLabel PresIN;
    private javax.swing.JLabel TNumLabel;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel logOutS;
    // End of variables declaration//GEN-END:variables
}
