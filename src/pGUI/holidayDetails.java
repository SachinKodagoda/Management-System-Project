
package pGUI;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import pcode.Dbconnect;

/**
 *
 * @author sajith
 */
    public class holidayDetails extends javax.swing.JFrame {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int xMouse;
        int yMouse;
    
    public holidayDetails() {
        
        initComponents();
        con = Dbconnect.dconnect();
        tableHoliday();
        this.getContentPane().setBackground(Color.white);
        this.setDefaultCloseOperation ( holidayDetails.DISPOSE_ON_CLOSE );
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date_txt = new com.toedter.calendar.JDateChooser();
        close = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        hoverBar = new javax.swing.JLabel();
        deleteAll = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date_txt.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 325, 140, 23));

        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 8, 35, 35));

        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        getContentPane().add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 8, 35, 35));

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
        getContentPane().add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 862, 30));

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btnAdd1.png"))); // NOI18N
        add.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addMouseMoved(evt);
            }
        });
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addMouseReleased(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 120, 99));

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btnDelete1.png"))); // NOI18N
        delete.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deleteMouseMoved(evt);
            }
        });
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteMouseReleased(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 98, 105));

        hoverBar.setForeground(new java.awt.Color(255, 255, 255));
        hoverBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(hoverBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 504, 410, 20));

        deleteAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btnDeleteAll3.png"))); // NOI18N
        deleteAll.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deleteAllMouseMoved(evt);
            }
        });
        deleteAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAllMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteAllMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteAllMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteAllMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteAllMouseReleased(evt);
            }
        });
        getContentPane().add(deleteAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 183, 43));

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btnUpdate1.png"))); // NOI18N
        update.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                updateMouseMoved(evt);
            }
        });
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updateMouseReleased(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 106, 115));

        name_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name_txt.setBorder(null);
        name_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                name_txtMouseMoved(evt);
            }
        });
        name_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name_txtKeyTyped(evt);
            }
        });
        getContentPane().add(name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 372, 140, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 320, 110));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Holidayz.png"))); // NOI18N
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 862, 548));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int r = jTable1.getSelectedRow();
        
        Date date = (Date) jTable1.getValueAt(r, 0);
        String name= jTable1.getValueAt(r, 1).toString();
        date_txt.setDate(date);
        name_txt.setText(name);
    }//GEN-LAST:event_jTable1MouseClicked

    private void name_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_txtKeyTyped
        
         char c = evt.getKeyChar();
         if((!(Character.isLetter(c))&& !(Character.isWhitespace(c)))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
             evt.consume();
         }
    }//GEN-LAST:event_name_txtKeyTyped

    private void deleteAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllMouseClicked
            
         
        int c = JOptionPane.showConfirmDialog(null,"Do you want to delete all ?");
        
        if(c==0){
        
        
        
        String sql5 = "delete from holidaydetails  ";
        
        try{
            pst = con.prepareStatement(sql5);
            pst.execute();
            tableHoliday();
            JOptionPane.showMessageDialog(null,"Deleted");
        
        }catch(SQLException | HeadlessException e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
        }
    }//GEN-LAST:event_deleteAllMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
          int c = JOptionPane.showConfirmDialog(null,"Do you want to delete this ?");
        
        if(c==0){
        
        String date = ((JTextField)date_txt.getDateEditor().getUiComponent()).getText();
        
        String sql4 = "delete from holidaydetails where Date ='"+date+"' ";
        
        try{
            pst = con.prepareStatement(sql4);
            pst.execute();
            tableHoliday();
            JOptionPane.showMessageDialog(null,"Deleted");
        
        }catch(SQLException | HeadlessException e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
      int c = JOptionPane.showConfirmDialog(null,"Do you want to update this ?");
        
        if(c==0){
        
        String date = ((JTextField)date_txt.getDateEditor().getUiComponent()).getText();
        String name = name_txt.getText();
        
        String sql3 ="update holidaydetails set Name = '"+name+"' where Date ='"+date+"'";
        
         try{
            pst = con.prepareStatement(sql3);
            pst.execute();
            tableHoliday();
            JOptionPane.showMessageDialog(null,"Successfully Updated");
        
        }catch(SQLException | HeadlessException e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
        }
    }//GEN-LAST:event_updateMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
                  
       String date = ((JTextField)date_txt.getDateEditor().getUiComponent()).getText();
        String name = name_txt.getText();
        
        String sql2 ="insert into holidaydetails values ('"+date+"','"+name+"')";
        
        try{
            pst = con.prepareStatement(sql2);
            pst.execute();
            tableHoliday();
            
            JOptionPane.showMessageDialog(null,"Successfully Added");
        
        }catch(SQLException | HeadlessException e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
    }//GEN-LAST:event_addMouseClicked

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

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("btnDelete2.png"));
        delete.setIcon(II); 
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
       ImageIcon II = new ImageIcon(getClass().getResource("btnDelete1.png"));
        delete.setIcon(II); 
    }//GEN-LAST:event_deleteMouseExited

    private void deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("btnDelete3.png"));
        delete.setIcon(II); 
    }//GEN-LAST:event_deleteMousePressed

    private void deleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("btnDelete4.png"));
        delete.setIcon(II); 
    }//GEN-LAST:event_deleteMouseReleased

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
       ImageIcon II = new ImageIcon(getClass().getResource("btnUpdate2.png"));
        update.setIcon(II); 
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
       ImageIcon II = new ImageIcon(getClass().getResource("btnUpdate1.png"));
        update.setIcon(II); 
    }//GEN-LAST:event_updateMouseExited

    private void updateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("btnUpdate3.png"));
       update.setIcon(II); 
    }//GEN-LAST:event_updateMousePressed

    private void updateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("btnUpdate4.png"));
       update.setIcon(II); 
    }//GEN-LAST:event_updateMouseReleased

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("btnAdd2.png"));
        add.setIcon(II); 
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("btnAdd1.png"));
        add.setIcon(II); 
    }//GEN-LAST:event_addMouseExited

    private void addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMousePressed
       ImageIcon II = new ImageIcon(getClass().getResource("btnAdd3.png"));
         add.setIcon(II); 
    }//GEN-LAST:event_addMousePressed

    private void addMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("btnAdd4.png"));
        add.setIcon(II); 
    }//GEN-LAST:event_addMouseReleased

    private void deleteAllMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("btnDeleteAll1.png"));
        deleteAll.setIcon(II); 
    }//GEN-LAST:event_deleteAllMouseEntered

    private void deleteAllMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("btnDeleteAll3.png"));
        deleteAll.setIcon(II); 
    }//GEN-LAST:event_deleteAllMouseExited

    private void deleteAllMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllMousePressed
       ImageIcon II = new ImageIcon(getClass().getResource("btnDeleteAll2.png"));
        deleteAll.setIcon(II); 
    }//GEN-LAST:event_deleteAllMousePressed

    private void deleteAllMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("btnDeleteAll1.png"));
       deleteAll.setIcon(II); 
    }//GEN-LAST:event_deleteAllMouseReleased

    private void deleteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseMoved
        hoverBar.setText("Delete a Holiday");
    }//GEN-LAST:event_deleteMouseMoved

    private void updateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseMoved
        hoverBar.setText("Update Holiday Detalis");
    }//GEN-LAST:event_updateMouseMoved

    private void addMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseMoved
        hoverBar.setText("Add new Holiday");
    }//GEN-LAST:event_addMouseMoved

    private void deleteAllMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAllMouseMoved
        hoverBar.setText("Delete All Holidays");
    }//GEN-LAST:event_deleteAllMouseMoved

    private void name_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_txtMouseMoved
         hoverBar.setText("Enter the Holiday Name");
         name_txt.grabFocus();
    }//GEN-LAST:event_name_txtMouseMoved

       public void tableHoliday(){
    
        try {
            
            String sql = "select * from holidaydetails ";
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
            java.util.logging.Logger.getLogger(holidayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(holidayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(holidayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(holidayDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new holidayDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private com.toedter.calendar.JDateChooser date_txt;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel deleteAll;
    private javax.swing.JLabel drag;
    private javax.swing.JLabel hoverBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mini;
    private javax.swing.JTextField name_txt;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
