/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coen359.vendingmachine.user.management;

import coen359.vendingmachine.admin.LoginView;
import coen359.vendingmachine.admin.log.AdminLogView;
import coen359.vendingmachine.admin.userfeedback.UserFeedbackView;
import coen359.vendingmachine.admin.vmmanagement.AddVendingMachineView;
import coen359.vendingmachine.user.feedback.UserFeedbackInput;
import coen359.vendingmachine.user.foodsuggestion.FoodSuggestionGUI;
import coen359.vendingmachine.user.foodsuggestion.ThumbnailIcon;
import coen359.vendingmachine.user.payment.CashPaymentGUI;
import coen359.vendingmachine.user.payment.PayByCash;
import coen359.vendingmachine.user.payment.SmartCardGUI;
import coen359.vendingmachine.user.payment.VMandPayMediator;
import coen359.vendingmachine.user.smartcard.UserAddSmartCard;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Index extends javax.swing.JFrame {

    public final static String SEARCH_PANEL = "Search";
    public final static String vmSelect = "VMSelection";
    public final static String foodSuggestion = "foodSuggest";
    public final static String USER_FEEDBACK = "userFeedback";
    public final static String ADMIN_LOGIN = "AdminLogin";
    public final static String PURCHASE_SMART_CARD = "purchaseSmartCard";
    public final static String Vending_MachineView = "VMView";
    public final static String PAY_BY_CASH = "CashPayment";
    public final static String THANK_YOU = "ThankYou";
    public final static String PAY_BY_SMART = "PayBySmart";
    public final static String TOTAL_PRICE = "TotalPrice";
//


    /**
     * Creates new form Login
     */
    public VMandPayMediator vmMediator;
    public Index() {
        initComponents();
        VendingMachineGUI vmGUI = new VendingMachineGUI();
        vmMediator=vmGUI.getMediator();
        String vmImage="coen359\\\\vendingmachine\\\\resources\\\\Vending Machine.png";
        ThumbnailIcon warnIcon = new ThumbnailIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource(vmImage)), 180);
        vendingMachineLabel.setIcon(warnIcon);

        // Set the layout of dynamic Panel as Card Layout
        dynamicPanel.setLayout(new CardLayout());

        JPanel vmSelectionJPanel = new VendingMachineSelection();
        dynamicPanel.add(vmSelectionJPanel, vmSelect);

        // Create an instance of these UI's and add them to the dynamic Panel for switching
        JPanel vendingMachineMainJPanel = new VendingMachineGUI();
        dynamicPanel.add(vendingMachineMainJPanel, Vending_MachineView);

        JPanel foodSuggestionJPanel = new FoodSuggestionGUI();
        dynamicPanel.add(foodSuggestionJPanel, foodSuggestion);

        //user feedback just give the name of ur panel
        JPanel userFeedBackJPanel = new UserFeedbackInput("VM1");
        dynamicPanel.add(userFeedBackJPanel, USER_FEEDBACK);
        
        JPanel purchaseSmartCard = new UserAddSmartCard();
        dynamicPanel.add(purchaseSmartCard, PURCHASE_SMART_CARD);
        
        JPanel thankYouJPanel = new Thankyou();
        dynamicPanel.add(thankYouJPanel, THANK_YOU);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        vendingMachineLabel = new javax.swing.JLabel();
        purchaseSmartCardButt = new javax.swing.JButton();
        projectButton = new javax.swing.JButton();
        userFeedBackButt = new javax.swing.JButton();
        foodSuggestButt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ExitButt1 = new javax.swing.JButton();
        AdminLognButt = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();
        midPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dynamicPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Smart Vending Machine");
        setBackground(new java.awt.Color(141, 47, 47));
        setPreferredSize(new java.awt.Dimension(1360, 760));
        setLocation(200, 150);
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginView.class.getResource("/coen359/vendingmachine/resources/Vending Machine.png")));	


        mainPanel.setBackground(new java.awt.Color(48, 115, 215));

        topPanel.setBackground(new java.awt.Color(48, 115, 215));
        topPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        topPanel.setForeground(new java.awt.Color(48, 115, 215));
        topPanel.setOpaque(false);

        vendingMachineLabel.setBackground(new java.awt.Color(48, 115, 215));

        purchaseSmartCardButt.setBackground(new java.awt.Color(255, 255, 255));
        purchaseSmartCardButt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        purchaseSmartCardButt.setText("Purchase SmartCard");
        purchaseSmartCardButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        purchaseSmartCardButt.setPreferredSize(new java.awt.Dimension(60, 23));
        purchaseSmartCardButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseSmartCardButtActionPerformed(evt);
            }
        });

        projectButton.setBackground(new java.awt.Color(255, 255, 255));
        projectButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        projectButton.setText("Home");
        projectButton.setBorder(new javax.swing.border.MatteBorder(null));
        projectButton.setPreferredSize(new java.awt.Dimension(60, 23));
        projectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectButtonActionPerformed(evt);
            }
        });

        userFeedBackButt.setBackground(new java.awt.Color(255, 255, 255));
        userFeedBackButt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userFeedBackButt.setText("User FeedBack");
        userFeedBackButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userFeedBackButt.setPreferredSize(new java.awt.Dimension(60, 23));
        userFeedBackButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFeedBackButtActionPerformed(evt);
            }
        });

        foodSuggestButt.setBackground(new java.awt.Color(255, 255, 255));
        foodSuggestButt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        foodSuggestButt.setText("Food Suggestion");
        foodSuggestButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        foodSuggestButt.setPreferredSize(new java.awt.Dimension(60, 23));
        foodSuggestButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodSuggestButtActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(48, 115, 215));
        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Smart Vending Machine");
        jLabel1.setOpaque(true);

        ExitButt1.setBackground(new java.awt.Color(255, 255, 255));
        ExitButt1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ExitButt1.setText("Exit");
        ExitButt1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitButt1.setPreferredSize(new java.awt.Dimension(60, 23));
        ExitButt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButt1ActionPerformed(evt);
            }
        });

        AdminLognButt.setBackground(new java.awt.Color(255, 255, 255));
        AdminLognButt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AdminLognButt.setText("Admin Login");
        AdminLognButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AdminLognButt.setPreferredSize(new java.awt.Dimension(60, 23));
        AdminLognButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLognButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(vendingMachineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(projectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(foodSuggestButt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(purchaseSmartCardButt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userFeedBackButt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdminLognButt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitButt1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        topPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AdminLognButt, ExitButt1, foodSuggestButt, projectButton, purchaseSmartCardButt, userFeedBackButt});

        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(purchaseSmartCardButt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userFeedBackButt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodSuggestButt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdminLognButt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExitButt1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(vendingMachineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        topPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AdminLognButt, ExitButt1, foodSuggestButt, projectButton, purchaseSmartCardButt, userFeedBackButt});

        bottomPanel.setBackground(new java.awt.Color(48, 115, 215));

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        midPanel.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout midPanelLayout = new javax.swing.GroupLayout(midPanel);
        midPanel.setLayout(midPanelLayout);
        midPanelLayout.setHorizontalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        midPanelLayout.setVerticalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        dynamicPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dynamicPanelLayout = new javax.swing.GroupLayout(dynamicPanel);
        dynamicPanel.setLayout(dynamicPanelLayout);
        dynamicPanelLayout.setHorizontalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1454, Short.MAX_VALUE)
        );
        dynamicPanelLayout.setVerticalGroup(
            dynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(dynamicPanel);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(midPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(midPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void projectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectButtonActionPerformed
      
        CardLayout cl = (CardLayout) (Index.getDynamicPanel().getLayout());
        cl.show(Index.getDynamicPanel(), Index.Vending_MachineView);
    }//GEN-LAST:event_projectButtonActionPerformed

    private void userFeedBackButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFeedBackButtActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (Index.getDynamicPanel().getLayout());
        cl.show(Index.getDynamicPanel(), Index.USER_FEEDBACK);
    }//GEN-LAST:event_userFeedBackButtActionPerformed

    private void AdminLognButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLognButtActionPerformed
        // TODO add your handling code here:
//        CardLayout cl = (CardLayout) (Index.getDynamicPanel().getLayout());
//        cl.show(Index.getDynamicPanel(), Index.ADMIN_LOGIN);
        this.setVisible(false);
        // this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        LoginView loginView = new LoginView();
        loginView.setVisible(true);
    }//GEN-LAST:event_AdminLognButtActionPerformed

    private void foodSuggestButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodSuggestButtActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (Index.getDynamicPanel().getLayout());
        cl.show(Index.getDynamicPanel(), Index.foodSuggestion);
    }//GEN-LAST:event_foodSuggestButtActionPerformed

    private void purchaseSmartCardButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseSmartCardButtActionPerformed
        CardLayout cl = (CardLayout) (Index.getDynamicPanel().getLayout());
        cl.show(Index.getDynamicPanel(), Index.PURCHASE_SMART_CARD);
    }//GEN-LAST:event_purchaseSmartCardButtActionPerformed

    private void ExitButt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButt1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButt1ActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton AdminLognButt;
    private static javax.swing.JButton ExitButt1;
    private javax.swing.JPanel bottomPanel;
    private static javax.swing.JPanel dynamicPanel;
    private static javax.swing.JButton foodSuggestButt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel midPanel;
    private static javax.swing.JButton projectButton;
    private static javax.swing.JButton purchaseSmartCardButt;
    private javax.swing.JPanel topPanel;
    private static javax.swing.JButton userFeedBackButt;
    private javax.swing.JLabel vendingMachineLabel;
    // End of variables declaration//GEN-END:variables

    
    
    public static void showPayByCash(CashPaymentGUI paybyCashGUI){
         JPanel payByCashJPanel = paybyCashGUI ;
        dynamicPanel.add(payByCashJPanel, PAY_BY_CASH);
    }
    
    public static void showPayBySmartCard(SmartCardGUI paybySmartGUI){
         JPanel payBySmartCardJPanel = paybySmartGUI ;
        dynamicPanel.add(payBySmartCardJPanel, PAY_BY_SMART);
    }
    
     public static void showTotalPrice(TotalPrice totPriceGUI){
         JPanel totPriceGUIJPanel = totPriceGUI ;
        dynamicPanel.add(totPriceGUIJPanel, TOTAL_PRICE);
    }
    
    public static JButton getProjectButton() {
        return projectButton;
    }

    public static void setProjectButton(JButton projectButton) {
        Index.projectButton = projectButton;
    }

    public static JButton getSearchButton() {
        return foodSuggestButt;
    }

    public static void setSearchButton(JButton searchButton) {
        Index.foodSuggestButt = searchButton;
    }

    public static JButton getTagButton() {
        return AdminLognButt;
    }

    public static void setTagButton(JButton tagButton) {
        Index.AdminLognButt = tagButton;
    }

    public static JButton getUserButton() {
        return userFeedBackButt;
    }

    public static void setUserButton(JButton userButton) {
        Index.userFeedBackButt = userButton;
    }

    public static JButton getLogoutButton() {
        return purchaseSmartCardButt;
    }

    public static void setLogoutButton(JButton logoutButton) {
        Index.purchaseSmartCardButt = logoutButton;
    }

//    public static JButton getMessageButton() {
//        return searchButt;
//    }
//
//    public static void setMessageButton(JButton messageButton) {
//        Index.searchButt = messageButton;
//    }

    public static JPanel getDynamicPanel() {
        return dynamicPanel;
    }

    public static void setDynamicPanel(JPanel dynamicPanel) {
        Index.dynamicPanel = dynamicPanel;
    }

}
