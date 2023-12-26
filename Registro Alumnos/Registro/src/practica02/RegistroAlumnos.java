/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practica02;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;




public class RegistroAlumnos extends javax.swing.JFrame {  
    
    DefaultTableModel modelo=new DefaultTableModel();
            
    ArrayList<Alumno>listaAlumnos;
    
    public RegistroAlumnos() {
        this.listaAlumnos=new ArrayList<>();
        initComponents();
        this.setTitle(" REGISTRO DE ALUMNOS ");
        this.setSize(630, 550);
        this.setLocationRelativeTo(null);
        modelo.addColumn("Nombre ");
        modelo.addColumn("Carrera ");
        modelo.addColumn("Grupo ");
        modelo.addColumn("Semestre ");
        modelo.addColumn("Promedio ");
        
        refrescarTabla();
        
    }

    @SuppressWarnings("unchecked")
    public final void refrescarTabla() {
        DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("Nombre ");
            modelo.addColumn("Carrera ");
            modelo.addColumn("Grupo ");
            modelo.addColumn("Semestre ");
            modelo.addColumn("Promedio ");

    for (Alumno alumno:listaAlumnos) {
        Object[] a=new Object[5];
            a[0]=alumno.getNombre();
            a[1]=alumno.getCarrera();
            a[2]=alumno.getGrupo();
            a[3]=alumno.getSemestre();
            a[4]=alumno.getPromedio();

        modelo.addRow(a);
    }

    tblRegistroAlumnos.setModel(modelo);
}
    private void limpiarLista() {
    listaAlumnos.clear(); // Limpia la lista de alumnos
    refrescarTabla(); // Actualiza la tabla para reflejar los cambios

    double promedio = 8.123456; // Este es tu valor de promedio
    DecimalFormat df = new DecimalFormat("#.##");
    String promedioFormateado = df.format(promedio);


    
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreAlumno = new javax.swing.JTextField();
        spnPromedioAlumno = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cboGrupoAlumno = new javax.swing.JComboBox<>();
        cboCarrera = new javax.swing.JComboBox<>();
        cboSemestreAlumno = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRegistroAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRegistroAlumnos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 187, 610, 250));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Carrera:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 60, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Grupo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 60, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Semestre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 70, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Promedio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, 20));

        txtNombreAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 220, -1));

        spnPromedioAlumno.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 10.0d, 0.01d));
        getContentPane().add(spnPromedioAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 80, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 160, 100));

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 160, 50));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Yawy");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 180, 50));

        cboGrupoAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None [-]", "Grupo 1", "Grupo 2", "Grupo 3", "Grupo 4", "Grupo 5", "Grupo 6", "Grupo 7", "Grupo 8" }));
        cboGrupoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGrupoAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(cboGrupoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 80, -1));

        cboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None [-]", "Telecomunicaciones", "Tecnologia de Informacion y Comunicaciones", "Electronica", "Software y Automatizacion" }));
        cboCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCarreraActionPerformed(evt);
            }
        });
        getContentPane().add(cboCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 220, -1));

        cboSemestreAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None [-]", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno" }));
        getContentPane().add(cboSemestreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtNombreAlumno.setText("");
        cboCarrera.setSelectedIndex(0);
        cboGrupoAlumno.setSelectedIndex(0);
        cboSemestreAlumno.setSelectedIndex(0);
        spnPromedioAlumno.setValue(0);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
          try {
        Object promedioObj = spnPromedioAlumno.getValue();
        double promedio = ((Number) promedioObj).doubleValue();

        // Formatear el valor del promedio a dos decimales
        DecimalFormat df = new DecimalFormat("#.##");
        String promedioFormateado = df.format(promedio);

        // Configurar el promedio formateado en el objeto Alumno
        Alumno alumno = new Alumno(
            txtNombreAlumno.getText(),
            cboCarrera.getSelectedItem().toString(),
            Integer.parseInt(cboGrupoAlumno.getSelectedItem().toString().replace("Grupo ", "")),
            cboSemestreAlumno.getSelectedItem().toString(),
            Double.parseDouble(promedioFormateado) // Configurar el promedio formateado en el objeto Alumno
        );

        listaAlumnos.add(alumno);
        refrescarTabla(); // Asegúrate de actualizar la tabla después de agregar un alumno
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Surgio un error al agregar alumno");
    }


   
       
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAlumnoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                                        
    limpiarLista();
       
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cboGrupoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGrupoAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGrupoAlumnoActionPerformed

    private void cboCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCarreraActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistroAlumnos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCarrera;
    private javax.swing.JComboBox<String> cboGrupoAlumno;
    private javax.swing.JComboBox<String> cboSemestreAlumno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnPromedioAlumno;
    private javax.swing.JTable tblRegistroAlumnos;
    private javax.swing.JTextField txtNombreAlumno;
    // End of variables declaration//GEN-END:variables

    private void setText(String none) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

      
        }
    

