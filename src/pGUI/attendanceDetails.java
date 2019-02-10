
package pGUI;

import java.awt.Color;
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
    public class attendanceDetails extends javax.swing.JFrame {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int xMouse;
        int yMouse;
    
    public attendanceDetails() {
       
        initComponents();
        con = Dbconnect.dconnect();
        this.getContentPane().setBackground(Color.white);
        tableAttend();
        this.setDefaultCloseOperation ( attendanceDetails.DISPOSE_ON_CLOSE );
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        close = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        serchAll = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        hoverBar = new javax.swing.JLabel();
        searchid_txt = new javax.swing.JTextField();
        backLblx = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(860, 550));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 840, 180));

        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 22, 35, 35));

        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        getContentPane().add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 75, 30, 30));

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
        getContentPane().add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 20));

        serchAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btnViewAll3.png"))); // NOI18N
        serchAll.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                serchAllMouseMoved(evt);
            }
        });
        serchAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serchAllMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                serchAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                serchAllMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                serchAllMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                serchAllMouseReleased(evt);
            }
        });
        getContentPane().add(serchAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 244, 183, 43));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btnSearch3.png"))); // NOI18N
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchMouseReleased(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 129, 38));

        hoverBar.setBackground(new java.awt.Color(255, 255, 255));
        hoverBar.setForeground(new java.awt.Color(255, 255, 255));
        hoverBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(hoverBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 505, 200, 20));

        searchid_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchid_txt.setBorder(null);
        searchid_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                searchid_txtMouseMoved(evt);
            }
        });
        getContentPane().add(searchid_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 255, 130, 20));

        backLblx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/xxxx.png"))); // NOI18N
        backLblx.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backLblxMouseMoved(evt);
            }
        });
        getContentPane().add(backLblx, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    
    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        String id = searchid_txt.getText();
        
        String sql2 = "select * from attendance where emp_ID='"+id+"'";
        
        try{
            pst = con.prepareStatement(sql2);
            rs =pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
    }//GEN-LAST:event_searchMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
       this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void serchAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serchAllMouseClicked
         tableAttend();
    }//GEN-LAST:event_serchAllMouseClicked

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("btnSearch1.png"));
        search.setIcon(II);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("btnSearch3.png"));
        search.setIcon(II);
    }//GEN-LAST:event_searchMouseExited

    private void searchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("btnSearch2.png"));
        search.setIcon(II);
    }//GEN-LAST:event_searchMousePressed

    private void searchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("btnSearch1.png"));
        search.setIcon(II);
    }//GEN-LAST:event_searchMouseReleased

    private void serchAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serchAllMouseEntered
       ImageIcon II = new ImageIcon(getClass().getResource("btnViewAll1.png"));
        serchAll.setIcon(II);
    }//GEN-LAST:event_serchAllMouseEntered

    private void serchAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serchAllMouseExited
         ImageIcon II = new ImageIcon(getClass().getResource("btnViewAll3.png"));
        serchAll.setIcon(II);
    }//GEN-LAST:event_serchAllMouseExited

    private void serchAllMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serchAllMousePressed
          ImageIcon II = new ImageIcon(getClass().getResource("btnViewAll2.png"));
        serchAll.setIcon(II);
    }//GEN-LAST:event_serchAllMousePressed

    private void serchAllMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serchAllMouseReleased
         ImageIcon II = new ImageIcon(getClass().getResource("btnViewAll1.png"));
        serchAll.setIcon(II);
    }//GEN-LAST:event_serchAllMouseReleased

    private void searchMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseMoved
       hoverBar.setText("Search for Employee Attendance");
    }//GEN-LAST:event_searchMouseMoved

    private void serchAllMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serchAllMouseMoved
        hoverBar.setText("Search for ALL Employees Attendance");
    }//GEN-LAST:event_serchAllMouseMoved

    private void searchid_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchid_txtMouseMoved
        hoverBar.setText("Enter the Employee Id");
    }//GEN-LAST:event_searchid_txtMouseMoved

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragMousePressed

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_dragMouseDragged

    private void backLblxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblxMouseMoved
          hoverBar.setText("");
    }//GEN-LAST:event_backLblxMouseMoved

    
     public void tableAttend(){
    
        try {
            String sql = "select * from attendance order by date desc";
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
            java.util.logging.Logger.getLogger(attendanceDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendanceDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendanceDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendanceDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new attendanceDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLblx;
    private javax.swing.JLabel close;
    private javax.swing.JLabel drag;
    private javax.swing.JLabel hoverBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchid_txt;
    private javax.swing.JLabel serchAll;
    // End of variables declaration//GEN-END:variables
}
