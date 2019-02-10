
package pGUI;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author sajith
 */
public class menu extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    

    
   
    
    public menu() {
        
        initComponents();
        this.setDefaultCloseOperation ( menu.DISPOSE_ON_CLOSE );
        this.getContentPane().setBackground(Color.RED);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leaveLbl = new javax.swing.JLabel();
        holidayLbl = new javax.swing.JLabel();
        departmentsLbl = new javax.swing.JLabel();
        hoverBar = new javax.swing.JLabel();
        empLbl = new javax.swing.JLabel();
        aniLbl = new javax.swing.JLabel();
        attendanceLbl = new javax.swing.JLabel();
        reportsLbl = new javax.swing.JLabel();
        miniyBtn = new javax.swing.JLabel();
        closeyLbl = new javax.swing.JLabel();
        dragyLbl = new javax.swing.JLabel();
        backyLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(860, 546));
        setMinimumSize(new java.awt.Dimension(860, 546));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(860, 546));
        setResizable(false);
        getContentPane().setLayout(null);

        leaveLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/pen1.png"))); // NOI18N
        leaveLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                leaveLblMouseMoved(evt);
            }
        });
        leaveLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leaveLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leaveLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leaveLblMouseExited(evt);
            }
        });
        getContentPane().add(leaveLbl);
        leaveLbl.setBounds(320, 90, 92, 92);

        holidayLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/clock1.png"))); // NOI18N
        holidayLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                holidayLblMouseMoved(evt);
            }
        });
        holidayLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                holidayLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                holidayLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                holidayLblMouseExited(evt);
            }
        });
        getContentPane().add(holidayLbl);
        holidayLbl.setBounds(310, 220, 99, 89);

        departmentsLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/men1.png"))); // NOI18N
        departmentsLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                departmentsLblMouseMoved(evt);
            }
        });
        departmentsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmentsLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                departmentsLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                departmentsLblMouseExited(evt);
            }
        });
        getContentPane().add(departmentsLbl);
        departmentsLbl.setBounds(300, 330, 106, 106);

        hoverBar.setForeground(new java.awt.Color(255, 255, 255));
        hoverBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(hoverBar);
        hoverBar.setBounds(220, 510, 440, 20);

        empLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/empdetail1.png"))); // NOI18N
        empLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                empLblMouseMoved(evt);
            }
        });
        empLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empLblMouseExited(evt);
            }
        });
        getContentPane().add(empLbl);
        empLbl.setBounds(670, 80, 84, 106);

        aniLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/output_h0ZSIF.gif"))); // NOI18N
        getContentPane().add(aniLbl);
        aniLbl.setBounds(0, 503, 98, 28);

        attendanceLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/step1.png"))); // NOI18N
        attendanceLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                attendanceLblMouseMoved(evt);
            }
        });
        attendanceLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendanceLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                attendanceLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                attendanceLblMouseExited(evt);
            }
        });
        getContentPane().add(attendanceLbl);
        attendanceLbl.setBounds(660, 190, 100, 106);

        reportsLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/teach1.png"))); // NOI18N
        reportsLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                reportsLblMouseMoved(evt);
            }
        });
        reportsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsLblMouseExited(evt);
            }
        });
        getContentPane().add(reportsLbl);
        reportsLbl.setBounds(660, 340, 101, 103);

        miniyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniyBtnMouseClicked(evt);
            }
        });
        getContentPane().add(miniyBtn);
        miniyBtn.setBounds(750, 10, 35, 35);

        closeyLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeyLblMouseClicked(evt);
            }
        });
        getContentPane().add(closeyLbl);
        closeyLbl.setBounds(790, 10, 35, 35);

        dragyLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragyLblMouseDragged(evt);
            }
        });
        dragyLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragyLblMousePressed(evt);
            }
        });
        getContentPane().add(dragyLbl);
        dragyLbl.setBounds(0, 0, 860, 30);

        backyLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backyLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/jbab.png"))); // NOI18N
        backyLbl.setMaximumSize(new java.awt.Dimension(860, 550));
        backyLbl.setMinimumSize(new java.awt.Dimension(860, 550));
        backyLbl.setPreferredSize(new java.awt.Dimension(860, 550));
        getContentPane().add(backyLbl);
        backyLbl.setBounds(0, -2, 860, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miniyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniyBtnMouseClicked
       this.setState(menu.ICONIFIED);
    }//GEN-LAST:event_miniyBtnMouseClicked

    private void closeyLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeyLblMouseClicked
        dispose();
    }//GEN-LAST:event_closeyLblMouseClicked

    private void dragyLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragyLblMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragyLblMousePressed

    private void dragyLblMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragyLblMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_dragyLblMouseDragged

    private void leaveLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveLblMouseClicked
        leaveBookingAdmin l = new leaveBookingAdmin();
        l.setVisible(true);
    }//GEN-LAST:event_leaveLblMouseClicked

    private void holidayLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_holidayLblMouseClicked
        holidayDetails h = new holidayDetails();
        h.setVisible(true);
    }//GEN-LAST:event_holidayLblMouseClicked

    private void attendanceLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceLblMouseClicked
       attendanceDetails a = new attendanceDetails();
       a.setVisible(true);
    }//GEN-LAST:event_attendanceLblMouseClicked

    private void empLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empLblMouseClicked
        employeeDetails e = new employeeDetails();
        e.setVisible(true);
    }//GEN-LAST:event_empLblMouseClicked

    private void departmentsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentsLblMouseClicked
        department d = new department();
        d.setVisible(true);
    }//GEN-LAST:event_departmentsLblMouseClicked

    private void reportsLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsLblMouseClicked
        Report r = new Report();
        r.setVisible(true);
        this.setState(menu.ICONIFIED);
    }//GEN-LAST:event_reportsLblMouseClicked

    private void leaveLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveLblMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("pen2.png"));
        leaveLbl.setIcon(II);
    }//GEN-LAST:event_leaveLblMouseEntered

    private void leaveLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveLblMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("pen1.png"));
        leaveLbl.setIcon(II);
    }//GEN-LAST:event_leaveLblMouseExited

    private void holidayLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_holidayLblMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("clock2.png"));
        holidayLbl.setIcon(II);
    }//GEN-LAST:event_holidayLblMouseEntered

    private void holidayLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_holidayLblMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("clock1.png"));
        holidayLbl.setIcon(II);
    }//GEN-LAST:event_holidayLblMouseExited

    private void departmentsLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentsLblMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("men2.png"));
        departmentsLbl.setIcon(II);
    }//GEN-LAST:event_departmentsLblMouseEntered

    private void departmentsLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentsLblMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("men1.png"));
        departmentsLbl.setIcon(II);
    }//GEN-LAST:event_departmentsLblMouseExited

    private void empLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empLblMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("empdetail2.png"));
        empLbl.setIcon(II);
    }//GEN-LAST:event_empLblMouseEntered

    private void empLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empLblMouseExited
       ImageIcon II = new ImageIcon(getClass().getResource("empdetail1.png"));
        empLbl.setIcon(II);
    }//GEN-LAST:event_empLblMouseExited

    private void attendanceLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceLblMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("step2.png"));
        attendanceLbl.setIcon(II);
    }//GEN-LAST:event_attendanceLblMouseEntered

    private void attendanceLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceLblMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("step1.png"));
        attendanceLbl.setIcon(II);
    }//GEN-LAST:event_attendanceLblMouseExited

    private void reportsLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsLblMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("teach2.png"));
        reportsLbl.setIcon(II);
    }//GEN-LAST:event_reportsLblMouseEntered

    private void reportsLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsLblMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("teach1.png"));
        reportsLbl.setIcon(II);
    }//GEN-LAST:event_reportsLblMouseExited

    private void leaveLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveLblMouseMoved
       hoverBar.setText("Confirm Employee Leaves");
    }//GEN-LAST:event_leaveLblMouseMoved

    private void holidayLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_holidayLblMouseMoved
        hoverBar.setText("Manage Holidays");
    }//GEN-LAST:event_holidayLblMouseMoved

    private void departmentsLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentsLblMouseMoved
       hoverBar.setText("Change the department codes");
    }//GEN-LAST:event_departmentsLblMouseMoved

    private void empLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empLblMouseMoved
       hoverBar.setText("Check Employee details");
    }//GEN-LAST:event_empLblMouseMoved

    private void attendanceLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceLblMouseMoved
        hoverBar.setText("Check Employee attendance details");
    }//GEN-LAST:event_attendanceLblMouseMoved

    private void reportsLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsLblMouseMoved
        hoverBar.setText("Generate Employee attendance Report");
    }//GEN-LAST:event_reportsLblMouseMoved

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aniLbl;
    private javax.swing.JLabel attendanceLbl;
    private javax.swing.JLabel backyLbl;
    private javax.swing.JLabel closeyLbl;
    private javax.swing.JLabel departmentsLbl;
    private javax.swing.JLabel dragyLbl;
    private javax.swing.JLabel empLbl;
    private javax.swing.JLabel holidayLbl;
    private javax.swing.JLabel hoverBar;
    private javax.swing.JLabel leaveLbl;
    private javax.swing.JLabel miniyBtn;
    private javax.swing.JLabel reportsLbl;
    // End of variables declaration//GEN-END:variables
}
