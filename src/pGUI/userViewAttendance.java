
package pGUI;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import pcode.Dbconnect;

/**
 *
 * @author sajith
 */
    public class userViewAttendance extends javax.swing.JFrame {
   
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int xMouse;
        int yMouse;

   
    public userViewAttendance() {
        
        initComponents();
        con = Dbconnect.dconnect();
        this.setDefaultCloseOperation ( userViewAttendance.DISPOSE_ON_CLOSE );
        this.getContentPane().setBackground(Color.black);
        id_txt.grabFocus();
    }
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        close = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        hoverBar = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(862, 548));
        setMinimumSize(new java.awt.Dimension(862, 548));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "InTime", "Date", "OutTime"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 840, 180));

        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 18, 35, 35));

        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        getContentPane().add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 70, 35, 35));

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
        getContentPane().add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 30));

        hoverBar.setForeground(new java.awt.Color(255, 255, 255));
        hoverBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(hoverBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 498, 640, 30));

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
        getContentPane().add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 256, 135, 18));

        password_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_txt.setToolTipText("");
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
        getContentPane().add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 256, 135, 18));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/attendanceRecordsEmp.png"))); // NOI18N
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
     String sql = "select * from employee_details where emp_ID = ? && password =? ";
       
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,id_txt.getText() );
            pst.setString(2,password_txt.getText() );
            rs = pst.executeQuery();
            password_txt.setText("");
            
            if(rs.next()){
                
                String id = id_txt.getText();
                String sql2 = "select InTime,date,OutTime from attendance where emp_id ='"+id+"' order by date desc";
                pst =con.prepareCall(sql2);
                rs= pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                
                
            
            }
            else{
            
                JOptionPane.showMessageDialog(null,"User ID Or Password Invalid");
            }
        } catch (SQLException | HeadlessException e) {
           
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchMouseClicked

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        ImageIcon ff = new ImageIcon(getClass().getResource("btnSearch1.png"));
        search.setIcon(ff);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        ImageIcon ff = new ImageIcon(getClass().getResource("btnSearch3.png"));
        search.setIcon(ff);
    }//GEN-LAST:event_searchMouseExited

    private void searchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMousePressed
        ImageIcon ff = new ImageIcon(getClass().getResource("btnSearch2.png"));
        search.setIcon(ff);
    }//GEN-LAST:event_searchMousePressed

    private void searchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseReleased
        ImageIcon ff = new ImageIcon(getClass().getResource("btnSearch1.png"));
        search.setIcon(ff);
    }//GEN-LAST:event_searchMouseReleased

    private void searchMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseMoved
       hoverBar.setText("View Your Attendance");
    }//GEN-LAST:event_searchMouseMoved

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragMousePressed

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_dragMouseDragged

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void id_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_txtMouseMoved
        hoverBar.setText("Enter Employee ID");
        id_txt.grabFocus();
    }//GEN-LAST:event_id_txtMouseMoved

    private void password_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_txtMouseMoved
        hoverBar.setText("Enter Your Password");
        password_txt.grabFocus();
    }//GEN-LAST:event_password_txtMouseMoved

    private void backMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseMoved
       hoverBar.setText("");
    }//GEN-LAST:event_backMouseMoved

    private void id_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_txtKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          password_txt.grabFocus();
       }
    }//GEN-LAST:event_id_txtKeyPressed

    private void password_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             String sql = "select * from employee_details where emp_ID = ? && password =? ";
       
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,id_txt.getText() );
            pst.setString(2,password_txt.getText() );
            rs = pst.executeQuery();
            password_txt.setText("");
            
            if(rs.next()){
                
                String id = id_txt.getText();
                String sql2 = "select InTime,date,OutTime from attendance where emp_id ='"+id+"' order by date desc";
                pst =con.prepareCall(sql2);
                rs= pst.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                
                
            
            }
            else{
            
                JOptionPane.showMessageDialog(null,"User ID Or Password Invalid");
            }
        } catch (SQLException | HeadlessException e) {
           
            JOptionPane.showMessageDialog(null,e);
        }
       }
    }//GEN-LAST:event_password_txtKeyPressed

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
            java.util.logging.Logger.getLogger(userViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new userViewAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private javax.swing.JLabel drag;
    private javax.swing.JLabel hoverBar;
    private javax.swing.JTextField id_txt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mini;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JLabel search;
    // End of variables declaration//GEN-END:variables
}
