
package pGUI;
import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import pcode.Dbconnect;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author sajith
 */
    public class Login extends javax.swing.JFrame {

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int xMouse;
        int yMouse;


    public Login() {
        initComponents();
        //connect to dn
        con = Dbconnect.dconnect();
        //call current date method
        currentDate();
        this.getContentPane().setBackground(Color.BLACK);
        id_txt.grabFocus();
    }

 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minBtnx = new javax.swing.JLabel();
        clsBtnx = new javax.swing.JLabel();
        dragLblx = new javax.swing.JLabel();
        changePassx = new javax.swing.JLabel();
        AttendaceRecordx = new javax.swing.JLabel();
        hoverBar = new javax.swing.JLabel();
        leavePlanx = new javax.swing.JLabel();
        adminx = new javax.swing.JLabel();
        sideBar = new javax.swing.JLabel();
        outBtnx = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inBtnx = new javax.swing.JLabel();
        date_txt = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        clock_txt = new javax.swing.JLabel();
        backLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(862, 548));
        setMinimumSize(new java.awt.Dimension(862, 548));
        setUndecorated(true);
        getContentPane().setLayout(null);

        minBtnx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minBtnxMouseClicked(evt);
            }
        });
        getContentPane().add(minBtnx);
        minBtnx.setBounds(768, 20, 27, 28);

        clsBtnx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clsBtnxMouseClicked(evt);
            }
        });
        getContentPane().add(clsBtnx);
        clsBtnx.setBounds(820, 20, 27, 28);

        dragLblx.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragLblxMouseDragged(evt);
            }
        });
        dragLblx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragLblxMousePressed(evt);
            }
        });
        getContentPane().add(dragLblx);
        dragLblx.setBounds(0, 0, 862, 20);

        changePassx.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                changePassxMouseMoved(evt);
            }
        });
        changePassx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePassxMouseClicked(evt);
            }
        });
        getContentPane().add(changePassx);
        changePassx.setBounds(55, 155, 36, 45);

        AttendaceRecordx.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AttendaceRecordxMouseMoved(evt);
            }
        });
        AttendaceRecordx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AttendaceRecordxMouseClicked(evt);
            }
        });
        getContentPane().add(AttendaceRecordx);
        AttendaceRecordx.setBounds(55, 235, 38, 50);

        hoverBar.setForeground(new java.awt.Color(255, 255, 255));
        hoverBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(hoverBar);
        hoverBar.setBounds(260, 507, 400, 20);

        leavePlanx.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                leavePlanxMouseMoved(evt);
            }
        });
        leavePlanx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leavePlanxMouseClicked(evt);
            }
        });
        getContentPane().add(leavePlanx);
        leavePlanx.setBounds(55, 315, 38, 45);

        adminx.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                adminxMouseMoved(evt);
            }
        });
        adminx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminxMouseClicked(evt);
            }
        });
        getContentPane().add(adminx);
        adminx.setBounds(55, 400, 38, 50);

        sideBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/sidii.png"))); // NOI18N
        sideBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                sideBarMouseMoved(evt);
            }
        });
        sideBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sideBarMouseReleased(evt);
            }
        });
        getContentPane().add(sideBar);
        sideBar.setBounds(-5, 130, 170, 350);

        outBtnx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/out.png"))); // NOI18N
        outBtnx.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                outBtnxMouseMoved(evt);
            }
        });
        outBtnx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outBtnxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                outBtnxMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                outBtnxMouseReleased(evt);
            }
        });
        getContentPane().add(outBtnx);
        outBtnx.setBounds(650, 280, 88, 38);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(500, 400, 80, 50);

        inBtnx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pGUI/inx.png"))); // NOI18N
        inBtnx.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                inBtnxMouseMoved(evt);
            }
        });
        inBtnx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inBtnxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inBtnxMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                inBtnxMouseReleased(evt);
            }
        });
        getContentPane().add(inBtnx);
        inBtnx.setBounds(650, 230, 88, 38);

        date_txt.setBackground(new java.awt.Color(255, 0, 0));
        date_txt.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        date_txt.setForeground(new java.awt.Color(69, 176, 255));
        date_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date_txt.setText("2016/03/31");
        getContentPane().add(date_txt);
        date_txt.setBounds(580, 20, 150, 25);

        id_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_txt.setBorder(null);
        id_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        id_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                id_txtMouseMoved(evt);
            }
        });
        id_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_txtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_txtKeyTyped(evt);
            }
        });
        getContentPane().add(id_txt);
        id_txt.setBounds(448, 238, 140, 20);

        password_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_txt.setBorder(null);
        password_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                password_txtMouseMoved(evt);
            }
        });
        password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                password_txtKeyTyped(evt);
            }
        });
        getContentPane().add(password_txt);
        password_txt.setBounds(444, 291, 145, 20);

        clock_txt.setFont(new java.awt.Font("DS-Digital", 0, 22)); // NOI18N
        clock_txt.setForeground(new java.awt.Color(0, 165, 255));
        clock_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clock_txt.setText("03:50:20 ");
        getContentPane().add(clock_txt);
        clock_txt.setBounds(14, 502, 130, 30);

        backLbl.setFont(new java.awt.Font("DS-Digital", 0, 8)); // NOI18N
        backLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mainPage.png"))); // NOI18N
        backLbl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backLblMouseMoved(evt);
            }
        });
        getContentPane().add(backLbl);
        backLbl.setBounds(0, 0, 862, 548);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minBtnxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minBtnxMouseClicked
       this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_minBtnxMouseClicked

    private void clsBtnxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clsBtnxMouseClicked
        System.exit(0);
    }//GEN-LAST:event_clsBtnxMouseClicked

    private void dragLblxMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragLblxMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_dragLblxMouseDragged

 
    
    private void dragLblxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragLblxMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragLblxMousePressed

    private void outBtnxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outBtnxMouseClicked
       
        String sql = "select * from employee_details where emp_ID = ? && password =? ";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,id_txt.getText() );
            pst.setString(2,password_txt.getText() );
            rs = pst.executeQuery();
            password_txt.setText("");
            if(rs.next()){
                String id = id_txt.getText();
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String outTime = sdf.format(cal.getTime());
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf1.format(cal.getTime());

                String sql2 = "update attendance set OutTime ='"+outTime+"' where emp_id = '"+id+"' and date ='"+date+"' ";
                pst = con.prepareStatement(sql2);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Successfull Added");

            }
            else{

                JOptionPane.showMessageDialog(null,"User ID Or Password Invalid");
            }
        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_outBtnxMouseClicked

    private void inBtnxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inBtnxMouseClicked
        
        String sql = "select * from employee_details where emp_ID = ? && password =? ";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1,id_txt.getText() );
            pst.setString(2,password_txt.getText() );
            rs = pst.executeQuery();
            password_txt.setText("");

            if(rs.next()){
                String id = id_txt.getText();
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String inTime = sdf.format(cal.getTime());
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf1.format(cal.getTime());

                String sql1 = "insert into attendance (emp_id,InTime,date) values('"+id+"','"+inTime+"','"+date+"') ";
                pst= con.prepareStatement(sql1);
                pst.execute();



                JOptionPane.showMessageDialog(null,"Successfull Added ");

            }
            else{

                JOptionPane.showMessageDialog(null,"User ID Or Password Invalid");
            }
        } catch (SQLException | HeadlessException e) {

            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_inBtnxMouseClicked

    private void adminxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminxMouseClicked
        this.setState(menu.ICONIFIED); 
        adminLogin a = new adminLogin();
        a.setVisible(true);
          
       
    }//GEN-LAST:event_adminxMouseClicked

    private void leavePlanxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavePlanxMouseClicked
        leaveBookingView l = new leaveBookingView();
        l.setVisible(true);

    }//GEN-LAST:event_leavePlanxMouseClicked

    private void AttendaceRecordxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AttendaceRecordxMouseClicked
        userViewAttendance n = new userViewAttendance();
        n.setVisible(true);
    }//GEN-LAST:event_AttendaceRecordxMouseClicked

    private void changePassxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassxMouseClicked
        ChangePassword p = new ChangePassword();
        p.setVisible(true);
        this.setState(leaveBookingView.ICONIFIED);
    }//GEN-LAST:event_changePassxMouseClicked

    private void sideBarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBarMouseReleased
       
    }//GEN-LAST:event_sideBarMouseReleased

    private void backLblMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseMoved
       AnimationClass anix = new AnimationClass ();
       
       changePassx.setVisible(false);
       AttendaceRecordx.setVisible(false);
       leavePlanx.setVisible(false);
       adminx.setVisible(false);
       anix.jLabelXLeft(-5, -145, 8, 2, sideBar);
       hoverBar.setText("");
       //anix.jLabelXLeft(65,-100, 8, 2, changePassx);
       //anix.jLabelXLeft(65,-100, 8, 2, AttendaceRecordx);
       //anix.jLabelXLeft(65,-100, 8, 2, leavePlanx);
       //anix.jLabelXLeft(65,-100, 8, 2, adminx);
       
    }//GEN-LAST:event_backLblMouseMoved

    private void sideBarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideBarMouseMoved
       AnimationClass ani = new AnimationClass ();
       
       changePassx.setVisible(true);
       AttendaceRecordx.setVisible(true);
       leavePlanx.setVisible(true);
       adminx.setVisible(true);
       ani.jLabelXRight(-145, -5, 8, 2, sideBar);
       //ani.jLabelXRight(-100, 65, 8, 2, changePassx);
       //ani.jLabelXRight(-100, 65, 8, 2, AttendaceRecordx);
       //ani.jLabelXRight(-100, 65, 8, 2, leavePlanx);
       //ani.jLabelXRight(-100, 65, 8, 2, adminx);
       
       //sideBar.setLocation(10, 130);
       //ani.jLabelXLeft(5, -145, 8, 2, sideBar);
    }//GEN-LAST:event_sideBarMouseMoved

    private void inBtnxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inBtnxMousePressed
        ImageIcon ff = new ImageIcon(getClass().getResource("inx2.png"));
        inBtnx.setIcon(ff);
    }//GEN-LAST:event_inBtnxMousePressed

    private void inBtnxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inBtnxMouseReleased
        ImageIcon ff = new ImageIcon(getClass().getResource("inx.png"));
        inBtnx.setIcon(ff);
    }//GEN-LAST:event_inBtnxMouseReleased

    private void outBtnxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outBtnxMousePressed
       ImageIcon ff = new ImageIcon(getClass().getResource("out2.png"));
        outBtnx.setIcon(ff);
    }//GEN-LAST:event_outBtnxMousePressed

    private void outBtnxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outBtnxMouseReleased
        ImageIcon ff = new ImageIcon(getClass().getResource("out.png"));
        outBtnx.setIcon(ff);
    }//GEN-LAST:event_outBtnxMouseReleased

    private void changePassxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassxMouseMoved
       hoverBar.setText("Employees Can Update the Passwords");
    }//GEN-LAST:event_changePassxMouseMoved

    private void AttendaceRecordxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AttendaceRecordxMouseMoved
       hoverBar.setText("Employees Can Check the Attendace");
    }//GEN-LAST:event_AttendaceRecordxMouseMoved

    private void leavePlanxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavePlanxMouseMoved
        hoverBar.setText("Employees Can requiest leaves");
    }//GEN-LAST:event_leavePlanxMouseMoved

    private void adminxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminxMouseMoved
       hoverBar.setText("Administrator privilege");
    }//GEN-LAST:event_adminxMouseMoved

    private void id_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_txtMouseMoved
        hoverBar.setText("Enter Employee ID");
        id_txt.grabFocus();
    }//GEN-LAST:event_id_txtMouseMoved

    private void password_txtMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_txtMouseMoved
        hoverBar.setText("Enter Employee Password");
        password_txt.grabFocus();
    }//GEN-LAST:event_password_txtMouseMoved

    private void inBtnxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inBtnxMouseMoved
        hoverBar.setText("Employees Can mark the IN");
    }//GEN-LAST:event_inBtnxMouseMoved

    private void outBtnxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outBtnxMouseMoved
        hoverBar.setText("Employees Can mark the OUT");
    }//GEN-LAST:event_outBtnxMouseMoved

    private void id_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_txtKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           password_txt.grabFocus();
       }
    }//GEN-LAST:event_id_txtKeyPressed

    private void id_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_txtKeyTyped
         char c = evt.getKeyChar();
         if(!(Character.isLetterOrDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
         
             evt.consume();
         }
    }//GEN-LAST:event_id_txtKeyTyped

    private void password_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyTyped
         char c = evt.getKeyChar();
         if(!(Character.isLetterOrDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)){
         
             evt.consume();
         }
    }//GEN-LAST:event_password_txtKeyTyped

    public  void currentDate()
    {
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/ MM/ dd");
        String d = sdf1.format(cal.getTime());


        date_txt.setText(d);

        Thread clock = new Thread(){
        @SuppressWarnings("SleepWhileInLoop")
        @Override
        public void run(){

            for(;;){
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String t = sdf.format(cal.getTime());
     
            clock_txt.setText(t);

                try {

                    sleep(1000);

                } catch (InterruptedException ex) {

                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }


        };

        clock.start();


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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AttendaceRecordx;
    private javax.swing.JLabel adminx;
    private javax.swing.JLabel backLbl;
    private javax.swing.JLabel changePassx;
    private javax.swing.JLabel clock_txt;
    private javax.swing.JLabel clsBtnx;
    private javax.swing.JLabel date_txt;
    private javax.swing.JLabel dragLblx;
    private javax.swing.JLabel hoverBar;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel inBtnx;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel leavePlanx;
    private javax.swing.JLabel minBtnx;
    private javax.swing.JLabel outBtnx;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JLabel sideBar;
    // End of variables declaration//GEN-END:variables
}
