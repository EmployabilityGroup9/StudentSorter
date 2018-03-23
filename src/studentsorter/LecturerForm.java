/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsorter;

import connection.classesConnection;
import connection.rolesConnection;
import connection.skillsConnection;
import connection.studentConnection;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author rwals
 */
public class LecturerForm extends javax.swing.JFrame {
    studentConnection sc = new studentConnection("SSDB");
    skillsConnection skc = new skillsConnection("SSDB");
    classesConnection cc = new classesConnection("SSDB");
    rolesConnection rc = new rolesConnection("SSDB");
    
    /**
     * Creates new form LecturerForm
     */
    public LecturerForm() {
        initComponents();
        addSkillsToList();
        addClassesToList();
        addRolesToList();
        JOptionPane.showMessageDialog(null, "Welcome");
    }

    private void addSkillsToList(){
        final String retrieveQuery = "SELECT SKILL from richard.skills";
        skc.setQuery(retrieveQuery);
        skc.runQuery();
        ResultSet output = skc.getResultSet();
        sTxtArea.setEditable(false);
        try{
            if(null != output){
                while(output.next()){
                    String skill = output.getString(1);
                    sTxtArea.append(skill + "\n");
                }
            }
        }catch(SQLException sqle){
            System.err.println("Error adding skills to list: " + sqle.toString());
        }
    }
    
    private void addClassesToList(){
        final String retrieveQuery = "SELECT CLASSNAME from richard.classes";
        cc.setQuery(retrieveQuery);
        cc.runQuery();
        ResultSet output = cc.getResultSet();
        cTxtArea.setEditable(false);
        try{
            if(null != output){
                while(output.next()){
                    String skill = output.getString(1);
                    cTxtArea.append(skill + "\n");
                }
            }
        }catch(SQLException sqle){
            System.err.println("Error adding classes to list: " + sqle.toString());
        }
    }
    
    private void addRolesToList(){
        final String retrieveQuery = "SELECT ROLE from richard.roles";
        rc.setQuery(retrieveQuery);
        rc.runQuery();
        ResultSet output = rc.getResultSet();
        rTxtArea.setEditable(false);
        try{
            if(null != output){
                while(output.next()){
                    String skill = output.getString(1);
                    rTxtArea.append(skill + "\n");
                }
            }
        }catch(SQLException sqle){
            System.err.println("Error adding roles to list: " + sqle.toString());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSkill = new javax.swing.JTextField();
        btnSAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtClass = new javax.swing.JTextField();
        btnCAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnRDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        btnRAdd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        sTxtArea = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        cTxtArea = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        rTxtArea = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtCDelete = new javax.swing.JTextField();
        txtRDelete = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSDelete = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Remove Skills - Roles - Classes");

        jLabel2.setText("Skills");

        btnSDelete.setText("Delete");
        btnSDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSDeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("Skill:");

        btnSAdd.setText("Add Skill");
        btnSAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAddActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setText("Classes");

        btnCDelete.setText("Delete");
        btnCDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Class:");

        btnCAdd.setText("Add Class");
        btnCAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAddActionPerformed(evt);
            }
        });

        jLabel6.setText("Roles");

        btnRDelete.setText("Delete");

        jLabel7.setText("Role:");

        btnRAdd.setText("Add Role");
        btnRAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRAddActionPerformed(evt);
            }
        });

        jLabel8.setText("Add Skills - Roles - Classes");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        sTxtArea.setColumns(20);
        sTxtArea.setRows(5);
        jScrollPane4.setViewportView(sTxtArea);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        cTxtArea.setColumns(20);
        cTxtArea.setRows(5);
        jScrollPane5.setViewportView(cTxtArea);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        rTxtArea.setColumns(20);
        rTxtArea.setRows(5);
        jScrollPane6.setViewportView(rTxtArea);

        jLabel9.setText("Reload the page to see any changes to the lists");

        jLabel10.setText("Class:");

        jLabel11.setText("Role:");

        jLabel12.setText("First Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel12)
                                    .addComponent(txtSDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtCDelete)
                                        .addComponent(btnCDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel10))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtRDelete)
                                        .addComponent(btnRDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnCAdd)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnSAdd)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnRAdd)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCDelete)
                    .addComponent(btnRDelete)
                    .addComponent(btnSDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSkill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSAdd)
                            .addComponent(btnCAdd)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRAdd)))
                .addGap(29, 29, 29)
                .addComponent(btnBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAddActionPerformed
        String skillName = txtSkill.getText();
        boolean r1 = false;
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        if(!txtSkill.getText().equals("")){
            try{
                skc.insertRecord(skillName, r1, r2, r3, r4, r5);
                skc.closeConnection();
                JOptionPane.showMessageDialog(null, "Skill added");
            }catch(Exception e){
                System.out.println("Error finding records: " + e.toString());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please enter new skill");
        }
        
    }//GEN-LAST:event_btnSAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAddActionPerformed
        String className = txtClass.getText();
        if(!txtClass.getText().equals("")){
            try{
                cc.insertRecord(className);
                cc.closeConnection();
                JOptionPane.showMessageDialog(null, "Class added");
            }catch(Exception e){
                System.out.println("Error finding records: " + e.toString());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please enter new skill");
        }
    }//GEN-LAST:event_btnCAddActionPerformed

    private void btnRAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRAddActionPerformed
        String roleName = txtRole.getText();
        if(!txtRole.getText().equals("")){
            try{
                rc.insertRecord(roleName);
                rc.closeConnection();
                JOptionPane.showMessageDialog(null, "Role added");
            }catch(Exception e){
                System.out.println("Error finding records: " + e.toString());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please enter new skill");
        }
    }//GEN-LAST:event_btnRAddActionPerformed

    private void btnSDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSDeleteActionPerformed
        try{
            final String retrieveQuery = "SELECT SKILL from richard.skills";
            skc.setQuery(retrieveQuery);
            skc.runQuery();
            ResultSet output = skc.getResultSet();
            String skill = txtSDelete.getText();
            if(null != output){
                while(output.next()){
                    String s = output.getString("SKILL");
                    if(skill.equals(s)){
                        skc.deleteRecord(skill);
                        skc.closeConnection();
                        JOptionPane.showMessageDialog(null, "Skill deleted");
                    }else{
                        JOptionPane.showMessageDialog(null, "Skill does not exist in the database");
                    }
                }
            }
        }catch(SQLException sqle){
            System.err.println("Error deleting skill from the database: " + sqle.toString());
        }
    }//GEN-LAST:event_btnSDeleteActionPerformed

    private void btnCDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDeleteActionPerformed
        try{
            final String retrieveQuery = "SELECT CLASSNAME from richard.classes";
            cc.setQuery(retrieveQuery);
            cc.runQuery();
            ResultSet output = cc.getResultSet();
            String className = txtCDelete.getText();
            if(null != output){
                while(output.next()){
                    String cName = output.getString("CLASSNAME");
                    if(className.equals(cName)){
                        cc.deleteRecord(className);
                        cc.closeConnection();
                        JOptionPane.showMessageDialog(null, "Class deleted");
                    }else{
                        JOptionPane.showMessageDialog(null, "Class does not exist in the database");
                    }
                }
            }
        }catch(SQLException sqle){
            System.err.println("Error deleting class from the database: " + sqle.toString());
        }
    }//GEN-LAST:event_btnCDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(LecturerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCAdd;
    private javax.swing.JButton btnCDelete;
    private javax.swing.JButton btnRAdd;
    private javax.swing.JButton btnRDelete;
    private javax.swing.JButton btnSAdd;
    private javax.swing.JButton btnSDelete;
    private javax.swing.JTextArea cTxtArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea rTxtArea;
    private javax.swing.JTextArea sTxtArea;
    private javax.swing.JTextField txtCDelete;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtRDelete;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtSDelete;
    private javax.swing.JTextField txtSkill;
    // End of variables declaration//GEN-END:variables
}
