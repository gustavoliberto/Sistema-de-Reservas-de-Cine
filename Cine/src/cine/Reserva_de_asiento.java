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
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblAsientosSeleccionados = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        chkAsiento10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        chkAsiento7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkAsiento7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento7ActionPerformed(evt);
            }
        });

        chkAsiento8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkAsiento8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento8ActionPerformed(evt);
            }
        });

        chkAsiento9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkAsiento9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento9ActionPerformed(evt);
            }
        });

        chkAsiento11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkAsiento11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento11ActionPerformed(evt);
            }
        });

        chkAsiento12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        chkAsiento14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkAsiento14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento14ActionPerformed(evt);
            }
        });

        chkAsiento15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkAsiento15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cine/silla_disponible.png"))); // NOI18N
        chkAsiento15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAsiento15ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Asientos Seleccionados:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("1");

        jButton1.setText("Reservar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblAsientosSeleccionados.setText("- ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("4");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("2");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("3");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("5");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("6");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("7");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("8");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("9");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("10");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("11");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("12");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("14");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("13");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("15");

        jLabel2.setText("Usuario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblAsientosSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 415, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkAsiento1)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(chkAsiento2)))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkAsiento3)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkAsiento4))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkAsiento5)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(chkAsiento11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(chkAsiento6)
                                                .addGap(20, 20, 20))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(chkAsiento7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(chkAsiento12, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(chkAsiento13)
                                                            .addComponent(chkAsiento8))
                                                        .addGap(20, 20, 20))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(chkAsiento14)
                                                    .addComponent(chkAsiento9))))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(chkAsiento10)
                                                .addComponent(chkAsiento15)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(401, 401, 401)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkAsiento5)
                    .addComponent(chkAsiento4)
                    .addComponent(chkAsiento3)
                    .addComponent(chkAsiento2)
                    .addComponent(chkAsiento1))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkAsiento9)
                            .addComponent(chkAsiento8)
                            .addComponent(chkAsiento7)
                            .addComponent(chkAsiento6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkAsiento14)
                            .addComponent(chkAsiento13)
                            .addComponent(chkAsiento11)
                            .addComponent(chkAsiento12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAsiento10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkAsiento15)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(lblAsientosSeleccionados))
                .addContainerGap())
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
                .addGap(0, 165, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        SelectedAsiento(chkAsiento5, "Asiento 5");
    }//GEN-LAST:event_chkAsiento5ActionPerformed

    private void chkAsiento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento6ActionPerformed
        SelectedAsiento(chkAsiento6, "Asiento 6");
    }//GEN-LAST:event_chkAsiento6ActionPerformed

    private void chkAsiento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento7ActionPerformed
        SelectedAsiento(chkAsiento7, "Asiento 7");
    }//GEN-LAST:event_chkAsiento7ActionPerformed

    private void chkAsiento8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento8ActionPerformed
        SelectedAsiento(chkAsiento8, "Asiento 8");
    }//GEN-LAST:event_chkAsiento8ActionPerformed

    private void chkAsiento9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento9ActionPerformed
        SelectedAsiento(chkAsiento9, "Asiento 9");
    }//GEN-LAST:event_chkAsiento9ActionPerformed

    private void chkAsiento10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento10ActionPerformed
        SelectedAsiento(chkAsiento10, "Asiento 10");
    }//GEN-LAST:event_chkAsiento10ActionPerformed

    private void chkAsiento11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento11ActionPerformed
        SelectedAsiento(chkAsiento11, "Asiento 11");
    }//GEN-LAST:event_chkAsiento11ActionPerformed

    private void chkAsiento12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento12ActionPerformed
        SelectedAsiento(chkAsiento12, "Asiento 12");
    }//GEN-LAST:event_chkAsiento12ActionPerformed

    private void chkAsiento13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento13ActionPerformed
        SelectedAsiento(chkAsiento13, "Asiento 13");
    }//GEN-LAST:event_chkAsiento13ActionPerformed

    private void chkAsiento14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento14ActionPerformed
        SelectedAsiento(chkAsiento14, "Asiento 14");
    }//GEN-LAST:event_chkAsiento14ActionPerformed

    private void chkAsiento15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAsiento15ActionPerformed
        SelectedAsiento(chkAsiento15, "Asiento 15");
    }//GEN-LAST:event_chkAsiento15ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAsientosSeleccionados;
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
