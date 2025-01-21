package MediCareClinic_package;

public class LoadingPage extends javax.swing.JFrame {
    
  
    public LoadingPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        LoadingP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        Percentage = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        LoadingP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 149, 181));
        jLabel1.setText("MediCare Clinic Management System");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 149, 181));
        jLabel2.setText("Loading Contents....");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(55, 149, 181));

        Percentage.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        Percentage.setForeground(new java.awt.Color(55, 149, 181));
        Percentage.setText("%");

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MediCareClinic_package/logo load.png"))); // NOI18N
        jLabel5.setText("jLabel3");
        jLabel5.setIconTextGap(2);
        jLabel5.setName("MediCareLogo"); // NOI18N

        javax.swing.GroupLayout LoadingPLayout = new javax.swing.GroupLayout(LoadingP);
        LoadingP.setLayout(LoadingPLayout);
        LoadingPLayout.setHorizontalGroup(
            LoadingPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoadingPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(LoadingPLayout.createSequentialGroup()
                .addGroup(LoadingPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoadingPLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(0, 0, 0)
                        .addComponent(Percentage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(LoadingPLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(LoadingPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LoadingPLayout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(133, Short.MAX_VALUE)))
        );
        LoadingPLayout.setVerticalGroup(
            LoadingPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoadingPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(196, 196, 196)
                .addGroup(LoadingPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(Percentage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 6, Short.MAX_VALUE))
            .addGroup(LoadingPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LoadingPLayout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoadingP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoadingP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked

    public static void main(String args[]) {
    LoadingPage Myload = new LoadingPage();
    Myload.setVisible(true);
    try {
        for (int i = 0; i <= 100; i++) {
            Thread.sleep(40); // Simulates a loading process
            Myload.jProgressBar2.setValue(i); // Update the progress bar
            Myload.Percentage.setText(i + "%"); // Update the percentage label
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    new Login().setVisible(true);
    Myload.dispose(); // Close the loading page when done
}

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoadingP;
    private javax.swing.JLabel Percentage;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
