/*
 * Copyright (C) 2016 David Vargas Carrillo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package GUI;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;

/**
 * This class manages the authorization window and parameters to log in with
 * a Twitter account
 * @author David Vargas Carrillo
 */
public class Authorization extends javax.swing.JFrame {
    
    // Consumer Keys
    private String OAuthCK = "";  // OAuth Consumer Key
    private String OAuthCS = "";  // OAuth Consumer Secret Key
    
    // Configuration file path
    private final String configFilePath = System.getProperty("user.home") + 
        "/tquest_auth.txt";
    
    private ConfigurationBuilder configBuilder;     // Twitter4J configuration
    private RequestToken requestToken = null;
    private AccessToken accessToken = null;
    private String authURL = null;
    private Twitter OAuthTwitter = null;
    
    /**
     * Creates new form Authorization and configures Twitter4J in order to
     * log in with Twitter properly
     */
    public Authorization() {
        initComponents();
        
        // Related to the window appearance
        this.setTitle("TQuest Login");
        this.setLocationRelativeTo(null);
        
        // Hides the PIN-related controls
        pinField.setVisible(false);
        goButton.setVisible(false);
        infoLabel4.setVisible(false);
        
        // Twitter4J and app configuration
        configBuilder = new ConfigurationBuilder();
        configBuilder.setDebugEnabled(rootPaneCheckingEnabled);
        configBuilder.setOAuthConsumerKey(OAuthCK);
        configBuilder.setOAuthConsumerSecret(OAuthCS);
        OAuthTwitter = new TwitterFactory(configBuilder.build()).getInstance();
        try {
            requestToken = OAuthTwitter.getOAuthRequestToken();
            System.out.println("Request token obtained succesfully");
            authURL = requestToken.getAuthorizationURL();
        } catch (TwitterException ex) {
            Logger.getLogger(Authorization.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        appLogo = new javax.swing.JLabel();
        infoLabel1 = new javax.swing.JLabel();
        infoLabel2 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        infoLabel3 = new javax.swing.JLabel();
        pinField = new javax.swing.JTextField();
        goButton = new javax.swing.JButton();
        infoLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        infoLabel5 = new javax.swing.JLabel();
        infoLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        titlePanel.setBackground(new java.awt.Color(51, 204, 255));

        appLogo.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        appLogo.setForeground(new java.awt.Color(255, 255, 255));
        appLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appLogo.setText("TQuest");

        infoLabel1.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel1.setText("Welcome to TQuest");

        infoLabel2.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel2.setText("Log in with Twitter to start");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infoLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infoLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        loginButton.setText("Log in with Twitter");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        infoLabel3.setForeground(new java.awt.Color(153, 153, 153));
        infoLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel3.setText("A new window will be opened");

        pinField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        pinField.setForeground(new java.awt.Color(102, 102, 102));
        pinField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinFieldActionPerformed(evt);
            }
        });

        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        infoLabel4.setForeground(new java.awt.Color(153, 153, 153));
        infoLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel4.setText("Enter your PIN code below");

        infoLabel5.setForeground(new java.awt.Color(153, 153, 153));
        infoLabel5.setText("TQuest v0.5");

        infoLabel6.setForeground(new java.awt.Color(153, 153, 153));
        infoLabel6.setText("github.com/dvcarrillo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infoLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infoLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(infoLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(loginButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(pinField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infoLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pinField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoLabel5)
                    .addComponent(infoLabel6))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try {
            Desktop.getDesktop().browse(new URI(authURL));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(Authorization.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Shows the PIN-related controls
        pinField.setVisible(true);
        goButton.setVisible(true);
        infoLabel4.setVisible(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void pinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinFieldActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        String pincode = pinField.getText();

        // Obtains the access token according to the pincode given in the pinField
        if (pincode.length() > 0) {
            try {
                accessToken = OAuthTwitter.getOAuthAccessToken(requestToken, pincode);
            } catch (TwitterException ex) {
                Logger.getLogger(Authorization.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            try {
                accessToken = OAuthTwitter.getOAuthAccessToken(requestToken);
            } catch (TwitterException ex) {
                Logger.getLogger(Authorization.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Writes the current configuration to the configuration file
        if (accessToken != null) {
            FileOutputStream fileOS = null;
            File file;
            // Content to write in the file
            String content = accessToken.getToken() + "\n" +
            accessToken.getTokenSecret();
            try {
                file = new File(configFilePath.replace("\\","/"));
                    fileOS = new FileOutputStream(file);
                    // Creates the file if it does not exists
                    if (!file.exists())
                    file.createNewFile();
                    // Obtains content in bytes and writes it to the file
                    byte[] contentB = content.getBytes();
                    fileOS.write(contentB);
                    fileOS.flush();
                    fileOS.close();
                } catch(IOException ex) {
                } finally {
                    try {
                        if (fileOS != null) {
                            fileOS.close();
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(Authorization.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
            else {
                pinField.setText("");
            }
    }//GEN-LAST:event_goButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Authorization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authorization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authorization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authorization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authorization().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appLogo;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JLabel infoLabel2;
    private javax.swing.JLabel infoLabel3;
    private javax.swing.JLabel infoLabel4;
    private javax.swing.JLabel infoLabel5;
    private javax.swing.JLabel infoLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField pinField;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
