
package pGUI;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import pcode.Dbconnect;

/**
 *
 * @author sajith
 */
    public class department extends javax.swing.JFrame {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int xMouse;
        int yMouse;
   
    public department() {
        
        initComponents();
        con = Dbconnect.dconnect();
        this.getContentPane().setBackground(Color.white);
        tableDept();
        this.setDefaultCloseOperation ( department.DISPOSE_ON_CLOSE );
        did_txt.grabFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mini = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        drag = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        hoverBar = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        did_txt = new javax.swing.JTextField();
        dname_txt = new javax.swing.JTextField();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        getContentPane().add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 18, 35, 35));

        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 18, 35, 35));

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
        add.setToolTipText("Add");
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
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 120, 99));

        hoverBar.setForeground(new java.awt.Color(255, 255, 255));
        hoverBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(hoverBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 503, 480, 20));

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btnUpdate1.png"))); // NOI18N
        update.setToolTipText("Update");
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
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 106, 115));

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/btnDelete1.png"))); // NOI18N
        delete.setToolTipText("Delete");
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
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 98, 105));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 340, 100));

        did_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        did_txt.setBorder(null);
        did_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                did_txtMouseMoved(evt);
            }
        });
        did_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                did_txtKeyPressed(evt);
            }
        });
        getContentPane().add(did_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 287, 150, 23));

        dname_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dname_txt.setBorder(null);
        dname_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                dname_txtMouseMoved(evt);
            }
        });
        getContentPane().add(dname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 354, 150, 23));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/depdetails.png"))); // NOI18N
        back.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backMouseMoved(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 862, 548));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        
        int r = jTable1.getSelectedRow();
        
        String did = jTable1.getValueAt(r, 0).toString();
        String name= jTable1.getValueAt(r, 1).toString();
        did_txt.setText(did);
        dname_txt.setText(name);
    }//GEN-LAST:event_jTable1MouseClicked

    
    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
          String did = did_txt.getText();
        String dName = dname_txt.getText();
        
        String sql2 ="insert into department values ('"+did+"','"+dName+"')";
        
        try{
            pst = con.prepareStatement(sql2);
            pst.execute();
            tableDept();
            JOptionPane.showMessageDialog(null,"Successfully Added");
        
        }catch(SQLException | HeadlessException e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
    }//GEN-LAST:event_addMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
       
        int c = JOptionPane.showConfirmDialog(null,"Do you want to update this ?");
        if(c==0){
        
        String did = did_txt.getText();
        String dName = dname_txt.getText();
        
        String sql3 ="update department set dName = '"+dName+"' where dID ='"+did+"'";
        
         try{
            pst = con.prepareStatement(sql3);
            pst.execute();
            tableDept();
            JOptionPane.showMessageDialog(null,"Successfully Updated");
        
        }catch(SQLException | HeadlessException e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
        }
    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
               int c = JOptionPane.showConfirmDialog(null,"Do you want to delete this ?");
        if(c==0){
        
        String did = did_txt.getText();
        
        String sql4 = "delete from department where dID ='"+did+"' ";
        
        try{
            pst = con.prepareStatement(sql4);
            pst.execute();
            tableDept();
            JOptionPane.showMessageDialog(null,"Deleted");
        
        }catch(SQLException | HeadlessException e){
        
            JOptionPane.showMessageDialog(null,e);
        
        }
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
      this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragMousePressed

    private void dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_dragMouseDragged

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

    private void addMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseMoved
      hoverBar.setText("Add Department Details");
    }//GEN-LAST:event_addMouseMoved

    private void updateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseMoved
        hoverBar.setText("Update Department Details");
    }//GEN-LAST:event_updateMouseMoved

    private void deleteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseMoved
         hoverBar.setText("Delete a Department");
    }//GEN-LAST:event_deleteMouseMoved

    private void did_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_did_txtMouseMoved
        hoverBar.setText("Enter Department ID");
        did_txt.grabFocus();
    }//GEN-LAST:event_did_txtMouseMoved

    private void dname_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dname_txtMouseMoved
        hoverBar.setText("Enter Department Name");
        dname_txt.grabFocus();
    }//GEN-LAST:event_dname_txtMouseMoved

    private void backMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseMoved
       hoverBar.setText("");
    }//GEN-LAST:event_backMouseMoved

    private void did_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_did_txtKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          dname_txt.grabFocus();
       }
    }//GEN-LAST:event_did_txtKeyPressed

    public void tableDept(){
    
        try {
            String sql = "select * from department";
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
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new department().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private javax.swing.JLabel delete;
    private javax.swing.JTextField did_txt;
    private javax.swing.JTextField dname_txt;
    private javax.swing.JLabel drag;
    private javax.swing.JLabel hoverBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
