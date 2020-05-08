/**
 * 
 * @author Carlos Alberto Ro'Pe
 */
package mail.sender;

import javax.swing.JOptionPane;

public class MailConfigurationView extends javax.swing.JFrame {

    public MailConfigurationView(boolean isFilled) {
        initComponents();
        if (isFilled) {
            txtSmtpHost.setText(MailConfiguration.getValue("mail.smtp.host"));
            chk.setSelected(Boolean.parseBoolean(MailConfiguration.getValue("mail.smtp.starttls.enable")));
            txtPort.setText(MailConfiguration.getValue("mail.smtp.port"));
            txtUser.setText(MailConfiguration.getValue("mail.smtp.user"));
            chkAuth.setSelected(Boolean.parseBoolean(MailConfiguration.getValue("mail.smtp.auth")));
            txtSmtpTrust.setText(MailConfiguration.getValue("mail.smtp.ssl.trust"));
            txtPassword.setText(MailConfiguration.getValue("mail.smtp.password"));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSmtpHost = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPort = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblAuth = new javax.swing.JLabel();
        lblSmtpTrust = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        chkAuth = new javax.swing.JCheckBox();
        txtSmtpHost = new javax.swing.JTextField();
        chk = new javax.swing.JCheckBox();
        txtUser = new javax.swing.JTextField();
        txtSmtpTrust = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtPort = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mail configuration data");
        setAlwaysOnTop(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        lblSmtpHost.setText("SMTP Server:");

        jLabel2.setText("TLS:");

        lblPort.setText("Port:");

        lblUser.setText("Email account:");

        lblAuth.setText("Authentication:");

        lblSmtpTrust.setText("SMTP Trust server:");

        lblPassword.setText("Password:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtPort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPortKeyTyped(evt);
            }
        });

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Mail configuration data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAuth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSmtpTrust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSmtpHost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chkAuth)
                            .addComponent(txtSmtpHost, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(chk)
                            .addComponent(txtUser)
                            .addComponent(txtSmtpTrust)
                            .addComponent(txtPassword)
                            .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSmtpHost)
                    .addComponent(txtSmtpHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(chk))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPort)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuth)
                    .addComponent(chkAuth))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSmtpTrust)
                    .addComponent(txtSmtpTrust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int ans = JOptionPane.showConfirmDialog(this, "Close this window"
                + " without\nsaving changes these will be lost.\nDo you want to"
                + " close it anyway?", "CONFIRMATION",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(ans == 0){
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String value[] = new String[7];
        value[0] = txtSmtpHost.getText().trim();
        value[1] = String.valueOf(chk.isSelected());
        value[2] = txtPort.getText().trim();
        value[3] = txtUser.getText().trim();
        value[4] = String.valueOf(chkAuth.isSelected());
        value[5] = txtSmtpTrust.getText().trim();
        value[6] = txtPassword.getText();
        
        String key[] = new String[7];
        key[0] = "mail.smtp.host";
        key[1] = "mail.smtp.starttls.enable";
        key[2] = "mail.smtp.port";
        key[3] = "mail.smtp.user";
        key[4] = "mail.smtp.auth";
        key[5] = "mail.smtp.ssl.trust";
        key[6] = "mail.smtp.password";
        
        MailConfiguration.setConfiguration(key, value);
        this.dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtPortKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPortKeyTyped
        char character = evt.getKeyChar();
        if (character < '0' || character > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtPortKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chk;
    private javax.swing.JCheckBox chkAuth;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAuth;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPort;
    private javax.swing.JLabel lblSmtpHost;
    private javax.swing.JLabel lblSmtpTrust;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtSmtpHost;
    private javax.swing.JTextField txtSmtpTrust;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
