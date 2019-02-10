
package pGUI;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import pcode.Dbconnect;

/**
 *
 * @author sajith
 */
    public class leaveBookingAdmin extends javax.swing.JFrame {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int xMouse;
        int yMouse;
    
    public leaveBookingAdmin() {
        initComponents();
        con = Dbconnect.dconnect();
        this.getContentPane().setBackground(Color.white);
         tableLeave();
        this.setDefaultCloseOperation ( leaveBookingAdmin.DISPOSE_ON_CLOSE );
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        hoverBar = new javax.swing.JLabel();
        viewAll = new javax.swing.JLabel();
        searchid_txt = new javax.swing.JTextField();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 810, 160));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btns1.png"))); // NOI18N
        search.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                searchMouseMoved(evt);
            }
        });
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 226, 44, 37));

        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 20, 35, 35));

        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        getContentPane().add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 20, 35, 35));

        drag.setText("jLabel1");
        drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragMouseDragged(evt);
            }
        });
        drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragMousePressed(evt);
            }
        });
        getContentPane().add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 862, 20));

        hoverBar.setForeground(new java.awt.Color(255, 255, 255));
        hoverBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(hoverBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 502, 490, 18));

        viewAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btnViewAllz3.png"))); // NOI18N
        viewAll.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                viewAllMouseMoved(evt);
            }
        });
        viewAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewAllMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewAllMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewAllMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                viewAllMouseReleased(evt);
            }
        });
        getContentPane().add(viewAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 188, 48));

        searchid_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchid_txt.setBorder(null);
        searchid_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                searchid_txtMouseMoved(evt);
            }
        });
        searchid_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchid_txtKeyPressed(evt);
            }
        });
        getContentPane().add(searchid_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 232, 129, 23));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LeavePlan.png"))); // NOI18N
        back.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backMouseMoved(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 862, 548));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        String id = searchid_txt.getText();
        
        String sql2 = "select * from leavebooking where Emp_Id='"+id+"'";
        
        try{
            pst = con.prepareStatement(sql2);
            rs =pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
    }//GEN-LAST:event_searchMouseClicked

    private void viewAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllMouseClicked
        tableLeave();
    }//GEN-LAST:event_viewAllMouseClicked

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragMousePressed

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_dragMouseDragged

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
      this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void viewAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("btnViewAllz1.png"));
        viewAll.setIcon(II);
    }//GEN-LAST:event_viewAllMouseEntered

    private void viewAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllMouseExited
       ImageIcon II = new ImageIcon(getClass().getResource("btnViewAllz3.png"));
        viewAll.setIcon(II);
    }//GEN-LAST:event_viewAllMouseExited

    private void viewAllMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("btnViewAllz2.png"));
        viewAll.setIcon(II);
    }//GEN-LAST:event_viewAllMousePressed

    private void viewAllMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("btnViewAllz1.png"));
        viewAll.setIcon(II);
    }//GEN-LAST:event_viewAllMouseReleased

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
       ImageIcon II = new ImageIcon(getClass().getResource("btns2.png"));
        search.setIcon(II);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
       ImageIcon II = new ImageIcon(getClass().getResource("btns1.png"));
        search.setIcon(II);
    }//GEN-LAST:event_searchMouseExited

    private void backMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseMoved
        hoverBar.setText("");
    }//GEN-LAST:event_backMouseMoved

    private void viewAllMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllMouseMoved
        hoverBar.setText("Search ALL requested Leaves");
    }//GEN-LAST:event_viewAllMouseMoved

    private void searchid_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchid_txtMouseMoved
        hoverBar.setText("Enter Employee ID");
    }//GEN-LAST:event_searchid_txtMouseMoved

    private void searchMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseMoved
        hoverBar.setText("Search for individual Leaves");
    }//GEN-LAST:event_searchMouseMoved

    private void searchid_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchid_txtKeyPressed
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           String id = searchid_txt.getText();
        
        String sql2 = "select * from leavebooking where Emp_Id='"+id+"'";
        
        try{
            pst = con.prepareStatement(sql2);
            rs =pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
       }
    }//GEN-LAST:event_searchid_txtKeyPressed

    
     public void tableLeave(){
    
        try {
            
            String sql = "select * from leavebooking";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,e);
        }
    
    }
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
            java.util.logging.Logger.getLogger(leaveBookingAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(leaveBookingAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(leaveBookingAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(leaveBookingAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new leaveBookingAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private javax.swing.JLabel drag;
    private javax.swing.JLabel hoverBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchid_txt;
    private javax.swing.JLabel viewAll;
    // End of variables declaration//GEN-END:variables
}
