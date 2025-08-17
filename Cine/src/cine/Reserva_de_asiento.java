package cine;
 
import javax.swing.ImageIcon;
import java.awt.Image; // Para redimensionar imágenes
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList; 
import javax.swing.JCheckBox;

public class Reserva_de_asiento extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Reserva_de_asiento.class.getName());
    FondoPanel fondo = new FondoPanel();
    // lista global para almacenar asientos seleccionados
    static ArrayList<String> selectedItems = new ArrayList<>();
    
    public Reserva_de_asiento() {
        this.setContentPane(fondo);
        
        initComponents();
        // Texto que aparece al pasar el mouse
        chkAsiento2.setToolTipText("Este asiento no está disponible");
        chkAsiento3.setToolTipText("Este asiento no está disponible");
        
        
        
        //:::::::::Imagen pantalla cine::::::::::
        /*ImageIcon iconoOriginal = new ImageIcon(getClass().getResource("/imagenes/pantalla_de_cine.jpg"));
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(
            lblPantallaCine.getWidth(),
            lblPantallaCine.getHeight(),
            java.awt.Image.SCALE_SMOOTH
        );
        lblPantallaCine.setIcon(new ImageIcon(imagenEscalada));
        */
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        chkAsiento1 = new javax.swing.JCheckBox();
        chkAsiento2 = new javax.swing.JCheckBox();
        chkAsiento3 = new javax.swing.JCheckBox();
        chkAsiento4 = new javax.swing.JCheckBox();
        chkAsiento5 = new javax.swing.JCheckBox();
        chkAsiento10 = new javax.swing.JCheckBox();
        chkAsiento6 = new javax.swing.JCheckBox();
        chkAsiento7 = new javax.swing.JCheckBox();
        chkAsiento8 = new javax.swing.JCheckBox();
        chkAsiento9 = new javax.swing.JCheckBox();
        chkAsiento11 = new javax.swing.JCheckBox();
        chkAsiento12 = new javax.swing.JCheckBox();
        chkAsiento13 = new javax.swing.JCheckBox();
        chkAsiento14 = new javax.swing.JCheckBox();
        chkAsiento15 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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

        chkAsiento4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkAsiento4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento4ActionPerformed(evt);
            }
        });

        chkAsiento5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkAsiento5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento5ActionPerformed(evt);
            }
        });

        chkAsiento10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento10ActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Asientos Seleccionados:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("A");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("B");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("C");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("2");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("1");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("3");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("4");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkAsiento6)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento7)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento8)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento9)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkAsiento1)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento2)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento3)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento4)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkAsiento11)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento12)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento13)
                        .addGap(15, 15, 15)
                        .addComponent(chkAsiento14)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsiento15)))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkAsiento5)
                            .addComponent(chkAsiento4)
                            .addComponent(chkAsiento3)
                            .addComponent(chkAsiento2)
                            .addComponent(chkAsiento1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkAsiento10)
                            .addComponent(chkAsiento9)
                            .addComponent(chkAsiento8)
                            .addComponent(chkAsiento7)
                            .addComponent(chkAsiento6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkAsiento15)
                            .addComponent(chkAsiento14)
                            .addComponent(chkAsiento13)
                            .addComponent(chkAsiento11)
                            .addComponent(chkAsiento12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)))
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkAsiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento1ActionPerformed
        SelectedAsiento(chkAsiento1, "Asiento 1");
    }//GEN-LAST:event_chkAsiento1ActionPerformed

    private void chkAsiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento2ActionPerformed

    private void chkAsiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAsiento3ActionPerformed

    private void chkAsiento4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento4ActionPerformed
        SelectedAsiento(chkAsiento4, "Asiento 4");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {
        private Image imagen;

        public FondoPanel() {
            // Cargar la imagen una sola vez en el constructor
            try {
                java.net.URL imageUrl = Reserva_de_asiento.class.getClassLoader().getResource("imagenes/pantalla_de_cine.jpg");
                System.out.println("URL de la imagen: " + imageUrl); // Línea de depuración
                if (imageUrl != null) {
                                        imagen = ImageIO.read(imageUrl); // Cambiado de new ImageIcon(imageUrl).getImage() // Cambiado de new ImageIcon(imageUrl).getImage()
                } else {
                    System.err.println("La URL de la imagen es null. No se pudo encontrar el recurso.");
                }
            } catch (Exception e) {
                System.err.println("Error al cargar la imagen de fondo: " + e.getMessage());
                e.printStackTrace(); // Imprimir el stack trace completo para más información
                e.printStackTrace(); // Imprimir el stack trace completo para más información
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (imagen != null) {
                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }
    
    public static void SelectedAsiento(JCheckBox chkAsiento, String nombreAsiento) {
        if (chkAsiento.isSelected()) {
            chkAsiento.setIcon(new ImageIcon(Cine.class.getResource("/cine/silla_seleccionada.png")));
            System.out.println("El checkbox " + nombreAsiento + " está seleccionado");
            selectedItems.add(nombreAsiento);
        } else {
            chkAsiento.setIcon(new ImageIcon(Cine.class.getResource("/cine/silla_disponible.png")));
            System.out.println("El checkbox " + nombreAsiento + " NO está seleccionado");
            selectedItems.remove(nombreAsiento);
        }

        // imprimir la lista de asientos seleccionados
        System.out.println("Asientos seleccionados: " + selectedItems);
    }
    
    /*public static void SelectedAsiento(String[] asiento) {
        string asientoSeleccionado = asiento; 
        
        if(chkAsiento1.isSelected()) {
            chkAsiento1.setIcon(new ImageIcon(getClass().getResource("/cine/silla_seleccionada.png")));
            System.out.println("El checkbox está seleccionado");
            selectedItems.add("Documento 1");
            System.out.println(selectedItems);
        } else {
            chkAsiento1.setIcon(new ImageIcon(getClass().getResource("/cine/silla_disponible.png")));
            System.out.println("El checkbox NO está seleccionado");
            selectedItems.remove("Documento 2");
        }
    }*/
    
    
}
