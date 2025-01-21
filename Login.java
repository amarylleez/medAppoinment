package MediCareClinic_package;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PassTb = new javax.swing.JPasswordField();
        UserTb = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ResetBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(55, 149, 181));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 149, 181));
        jLabel1.setText("UserName:");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 149, 181));
        jLabel2.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(55, 149, 181));
        jLabel3.setText("MediCare Clinic");

        PassTb.setText("jPasswordField1");
        PassTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassTbActionPerformed(evt);
            }
        });

        LoginBtn.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(55, 149, 181));
        LoginBtn.setText("LOGIN");
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBtnMouseClicked(evt);
            }
        });
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MediCareClinic_package/logo load.png"))); // NOI18N
        jLabel4.setText("jLabel3");
        jLabel4.setIconTextGap(2);
        jLabel4.setName("MediCareLogo"); // NOI18N

        ResetBtn.setFont(new java.awt.Font("Sitka Text", 1, 13)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(55, 149, 181));
        ResetBtn.setText("RESET");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(106, 106, 106))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(82, 82, 82)))
                                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LoginBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResetBtn)
                                .addGap(126, 126, 126))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UserTb))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PassTb, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserTb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PassTb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginBtn)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void PassTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassTbActionPerformed

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
      UserTb.setText("");
      PassTb.setText("");
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void LoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseClicked
                                          
         if (UserTb.getText().isEmpty() || PassTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in the UserName and Password");
        } else if (UserTb.getText().equals("admin") && PassTb.getText().equals("1234")) {         
            Dashboard dash = new Dashboard();
            dash.setVisible(true);
            this.dispose();
            
        } else {
            JOptionPane.showMessageDialog(this, "Wrong UserName OR Password");
            UserTb.setText("");
            PassTb.setText("");
        }

    }//GEN-LAST:event_LoginBtnMouseClicked

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPasswordField PassTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JTextField UserTb;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
