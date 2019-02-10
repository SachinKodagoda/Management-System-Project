
package pGUI;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author sajith
 */
public class adminLogin extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
   
         public adminLogin() {
             
             initComponents();
             this.setDefaultCloseOperation ( adminLogin.DISPOSE_ON_CLOSE );
             this.getContentPane().setBackground(Color.ORANGE);
             
        }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minMin = new javax.swing.JLabel();
        maxMax = new javax.swing.JLabel();
        dragMe = new javax.swing.JLabel();
        hoverBar = new javax.swing.JLabel();
        loginBtn = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        backjLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(398, 462));
        setMinimumSize(new java.awt.Dimension(398, 462));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMinMouseClicked(evt);
            }
        });
        getContentPane().add(minMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 12, 36, 37));

        maxMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxMaxMouseClicked(evt);
            }
        });
        getContentPane().add(maxMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 12, 32, 37));

        dragMe.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragMeMouseDragged(evt);
            }
        });
        dragMe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragMeMousePressed(evt);
            }
        });
        getContentPane().add(dragMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 398, 30));

        hoverBar.setForeground(new java.awt.Color(255, 255, 255));
        hoverBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(hoverBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 427, 350, 20));

        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/login1.png"))); // NOI18N
        loginBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginBtnMouseMoved(evt);
            }
        });
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginBtnMouseReleased(evt);
            }
        });
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 129, 38));

        id_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_txt.setBorder(null);
        id_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                id_txtMouseMoved(evt);
            }
        });
        id_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_txtKeyPressed(evt);
            }
        });
        getContentPane().add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 135, 140, 18));

        password_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_txt.setBorder(null);
        password_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                password_txtMouseMoved(evt);
            }
        });
        password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_txtKeyPressed(evt);
            }
        });
        getContentPane().add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 190, 140, 20));

        backjLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/adminPass.png"))); // NOI18N
        backjLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backjLblMouseMoved(evt);
            }
        });
        getContentPane().add(backjLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 398, 462));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dragMeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMeMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragMeMousePressed

    private void dragMeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMeMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_dragMeMouseDragged

    private void minMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMinMouseClicked
       this.setState(menu.ICONIFIED);
    }//GEN-LAST:event_minMinMouseClicked

    private void maxMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxMaxMouseClicked
         dispose();
    }//GEN-LAST:event_maxMaxMouseClicked

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        String id = id_txt.getText();
        String password=password_txt.getText();
        if("admin".equals(id) && "123".equals(password)){
            
            menu m = new menu();
            m.setVisible(true);
            this.dispose();
        }
        else{
        
        JOptionPane.showMessageDialog(null,"User ID Or Password Invalid");
        
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("login2.png"));
        loginBtn.setIcon(II);
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("login1.png"));
        loginBtn.setIcon(II);
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("login3.png"));
        loginBtn.setIcon(II);
    }//GEN-LAST:event_loginBtnMousePressed

    private void loginBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("login2.png"));
        loginBtn.setIcon(II);
    }//GEN-LAST:event_loginBtnMouseReleased

    private void id_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_txtKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           password_txt.grabFocus();
       }
    }//GEN-LAST:event_id_txtKeyPressed

    private void password_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        String id = id_txt.getText();
        String password=password_txt.getText();
        if("admin".equals(id) && "123".equals(password)){
            
            menu m = new menu();
            m.setVisible(true);
            this.dispose();
        }
        else{
        
        JOptionPane.showMessageDialog(null,"User ID Or Password Invalid");
        
        }
       }
    }//GEN-LAST:event_password_txtKeyPressed

    private void id_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_txtMouseMoved
        hoverBar.setText("Enter Employee ID");
        id_txt.grabFocus();
    }//GEN-LAST:event_id_txtMouseMoved

    private void password_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_txtMouseMoved
        hoverBar.setText("Enter Employee Password");
        password_txt.grabFocus();
    }//GEN-LAST:event_password_txtMouseMoved

    private void loginBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseMoved
        hoverBar.setText("Login As Admin");
    }//GEN-LAST:event_loginBtnMouseMoved

    private void backjLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backjLblMouseMoved
       hoverBar.setText("");
    }//GEN-LAST:event_backjLblMouseMoved

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
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @SuppressWarnings("override")
            public void run() {
                new adminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backjLbl;
    private javax.swing.JLabel dragMe;
    private javax.swing.JLabel hoverBar;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JLabel maxMax;
    private javax.swing.JLabel minMin;
    private javax.swing.JPasswordField password_txt;
    // End of variables declaration//GEN-END:variables
}
