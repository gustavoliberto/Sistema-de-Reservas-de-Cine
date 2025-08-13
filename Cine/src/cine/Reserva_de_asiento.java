package cine;
 
import javax.swing.ImageIcon;
import java.awt.Image; // Para redimensionar imágenes


public class Reserva_de_asiento extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Reserva_de_asiento.class.getName());
 
    public Reserva_de_asiento() {
        initComponents();
        // Texto que aparece al pasar el mouse
        chkAsiento2.setToolTipText("Este asiento no está disponible");
        chkAsiento3.setToolTipText("Este asiento no está disponible");
        
        
        //:::::::::Imagen pantalla cine::::::::::
        ImageIcon iconoOriginal = new ImageIcon(getClass().getResource("/cine/pantalla_de_cine.jpg"));
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(
            lblPantallaCine.getWidth(),
            lblPantallaCine.getHeight(),
            java.awt.Image.SCALE_SMOOTH
        );
        lblPantallaCine.setIcon(new ImageIcon(imagenEscalada));
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chkAsiento1 = new javax.swing.JCheckBox();
        chkAsiento2 = new javax.swing.JCheckBox();
        chkAsiento3 = new javax.swing.JCheckBox();
        chkAsiento4 = new javax.swing.JCheckBox();
        chkAsiento5 = new javax.swing.JCheckBox();
        chkAsiento6 = new javax.swing.JCheckBox();
        chkAsiento7 = new javax.swing.JCheckBox();
        chkAsiento8 = new javax.swing.JCheckBox();
        chkAsiento9 = new javax.swing.JCheckBox();
        chkAsiento10 = new javax.swing.JCheckBox();
        chkAsiento11 = new javax.swing.JCheckBox();
        chkAsiento12 = new javax.swing.JCheckBox();
        chkAsiento13 = new javax.swing.JCheckBox();
        chkAsiento14 = new javax.swing.JCheckBox();
        chkAsiento15 = new javax.swing.JCheckBox();
        lblPantallaCine = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Reserva_de_asiento"); // NOI18N

        chkAsiento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkAsiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento1ActionPerformed(evt);
            }
        });

        chkAsiento2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        chkAsiento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_ocupada_regular.png"))); // NOI18N
        chkAsiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento2ActionPerformed(evt);
            }
        });

        chkAsiento3.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        chkAsiento3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_ocupada_discapacidad.png"))); // NOI18N
        chkAsiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento3ActionPerformed(evt);
            }
        });

        chkAsiento4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento4ActionPerformed(evt);
            }
        });

        chkAsiento5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento5ActionPerformed(evt);
            }
        });

        chkAsiento6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkAsiento6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento6ActionPerformed(evt);
            }
        });

        chkAsiento7.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        chkAsiento7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento7ActionPerformed(evt);
            }
        });

        chkAsiento8.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        chkAsiento8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento8ActionPerformed(evt);
            }
        });

        chkAsiento9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento9ActionPerformed(evt);
            }
        });

        chkAsiento10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento10ActionPerformed(evt);
            }
        });

        chkAsiento11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento11ActionPerformed(evt);
            }
        });

        chkAsiento12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento12ActionPerformed(evt);
            }
        });

        chkAsiento13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkAsiento13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento13ActionPerformed(evt);
            }
        });

        chkAsiento14.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        chkAsiento14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento14ActionPerformed(evt);
            }
        });

        chkAsiento15.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        chkAsiento15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento15ActionPerformed(evt);
            }
        });

        lblPantallaCine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPantallaCine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/pantalla_de_cine.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPantallaCine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkAsiento6)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento7)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento8)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento9)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkAsiento1)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento2)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento3)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento4)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkAsiento11)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento12)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento13)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento14)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento15)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPantallaCine, javax.swing.GroupLayout.PREFERRED_SIZE, 86, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkAsiento5)
                    .addComponent(chkAsiento4)
                    .addComponent(chkAsiento3)
                    .addComponent(chkAsiento2)
                    .addComponent(chkAsiento1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkAsiento10)
                    .addComponent(chkAsiento9)
                    .addComponent(chkAsiento8)
                    .addComponent(chkAsiento7)
                    .addComponent(chkAsiento6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkAsiento15)
                    .addComponent(chkAsiento14)
                    .addComponent(chkAsiento13)
                    .addComponent(chkAsiento11)
                    .addComponent(chkAsiento12))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkAsiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento1ActionPerformed
        if (chkAsiento1.isSelected()) {
            chkAsiento1.setIcon(new ImageIcon(getClass().getResource("/cine/silla_seleccionada.png")));
            System.out.println("El checkbox está seleccionado");
        } else {
            chkAsiento1.setIcon(new ImageIcon(getClass().getResource("/cine/silla_disponible.png")));
            System.out.println("El checkbox NO está seleccionado");
        }
    }//GEN-LAST:event_chkAsiento1ActionPerformed

    private void chkAsiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento2ActionPerformed

    private void chkAsiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento3ActionPerformed

    private void chkAsiento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento4ActionPerformed

    private void chkAsiento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento5ActionPerformed

    private void chkAsiento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento6ActionPerformed

    private void chkAsiento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento7ActionPerformed

    private void chkAsiento8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento8ActionPerformed

    private void chkAsiento9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento9ActionPerformed

    private void chkAsiento10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento10ActionPerformed

    private void chkAsiento11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento11ActionPerformed

    private void chkAsiento12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento12ActionPerformed

    private void chkAsiento13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento13ActionPerformed

    private void chkAsiento14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento14ActionPerformed

    private void chkAsiento15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento15ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Reserva_de_asiento().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkAsiento1;
    private javax.swing.JCheckBox chkAsiento10;
    private javax.swing.JCheckBox chkAsiento11;
    private javax.swing.JCheckBox chkAsiento12;
    private javax.swing.JCheckBox chkAsiento13;
    private javax.swing.JCheckBox chkAsiento14;
    private javax.swing.JCheckBox chkAsiento15;
    private javax.swing.JCheckBox chkAsiento2;
    private javax.swing.JCheckBox chkAsiento3;
    private javax.swing.JCheckBox chkAsiento4;
    private javax.swing.JCheckBox chkAsiento5;
    private javax.swing.JCheckBox chkAsiento6;
    private javax.swing.JCheckBox chkAsiento7;
    private javax.swing.JCheckBox chkAsiento8;
    private javax.swing.JCheckBox chkAsiento9;
    private javax.swing.JLabel lblPantallaCine;
    // End of variables declaration//GEN-END:variables
}
