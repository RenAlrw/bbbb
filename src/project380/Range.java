/*
AMAL ALHARBI 1815798 , Renad Aldahasi 1806983
 */
package project380;

import cpit380practice.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;

public class Range extends javax.swing.JFrame {

    //static
    static String image1;
    static Picture pic1;
    static int xs =0 ;
    static int xe=0;
    static int ys=0;
    static int ye=0;

    public Range() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Range");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        red = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        green = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        blue = new javax.swing.JTextField();
        Set = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        After = new javax.swing.JLabel();
        Copy = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        EdgeDetection = new javax.swing.JButton();
        removeRedEye = new javax.swing.JButton();
        Effect = new javax.swing.JComboBox<>();
        Binary = new javax.swing.JButton();
        range = new javax.swing.JTextField();
        Before1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Width = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        Hieght = new javax.swing.JLabel();
        num = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 231, 238));

        jLabel3.setFont(new java.awt.Font("Modern No. 20", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Select The Effect");

        red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Modern No. 20", 2, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Red Value");

        jLabel5.setFont(new java.awt.Font("Modern No. 20", 2, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Green Value");

        green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Modern No. 20", 2, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Blue Value");

        Set.setBackground(new java.awt.Color(222, 222, 222));
        Set.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        Set.setForeground(new java.awt.Color(102, 102, 102));
        Set.setText("Set");
        Set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        After.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 181, 189)));

        Copy.setBackground(new java.awt.Color(222, 222, 222));
        Copy.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        Copy.setForeground(new java.awt.Color(102, 102, 102));
        Copy.setText("Copy");
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Change The Value Of Colors \"0 - 255\"");

        EdgeDetection.setBackground(new java.awt.Color(222, 222, 222));
        EdgeDetection.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        EdgeDetection.setForeground(new java.awt.Color(102, 102, 102));
        EdgeDetection.setText("Edge Detection");
        EdgeDetection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdgeDetectionActionPerformed(evt);
            }
        });

        removeRedEye.setBackground(new java.awt.Color(222, 222, 222));
        removeRedEye.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        removeRedEye.setForeground(new java.awt.Color(102, 102, 102));
        removeRedEye.setText("Remove Red Eye");
        removeRedEye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRedEyeActionPerformed(evt);
            }
        });

        Effect.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        Effect.setForeground(new java.awt.Color(102, 102, 102));
        Effect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------", "Sunset", "Darker", "Brightness", "GrayScale", "SepiaTint" }));
        Effect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                EffectItemStateChanged(evt);
            }
        });
        Effect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EffectActionPerformed(evt);
            }
        });

        Binary.setBackground(new java.awt.Color(222, 222, 222));
        Binary.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        Binary.setForeground(new java.awt.Color(102, 102, 102));
        Binary.setText("Binary");
        Binary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinaryActionPerformed(evt);
            }
        });

        range.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangeActionPerformed(evt);
            }
        });

        Before1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 181, 189)));
        Before1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Before1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Before1MouseReleased(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 153));
        jLabel19.setText("The Amount");

        jButton2.setBackground(new java.awt.Color(222, 222, 222));
        jButton2.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Histogram");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Width.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Width.setForeground(new java.awt.Color(84, 101, 101));
        Width.setToolTipText("");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rightarrow-01.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("Output Picture");

        jLabel18.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));

        Hieght.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Hieght.setForeground(new java.awt.Color(84, 101, 101));
        Hieght.setToolTipText("");

        num.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        num.setForeground(new java.awt.Color(84, 101, 101));
        num.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(228, 228, 228))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Before1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(removeRedEye, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Binary, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Effect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Copy, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(blue, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(Set, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(88, 88, 88)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Hieght, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Width, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(EdgeDetection, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(range, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6)))
                .addGap(18, 18, 18)
                .addComponent(After, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(After, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Before1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Width, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hieght, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(Set))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(blue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Binary)
                            .addComponent(Copy, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Effect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeRedEye)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EdgeDetection)
                            .addComponent(range, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Histogram
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        Histogram h = new Histogram();
        h.displayHisto();
        h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rangeActionPerformed
    // Binary
    private void BinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinaryActionPerformed
        // TODO add your handling code here:

        pic1 = new Picture(image1);

        Pixel pixel = null;
        int r = 0;
        for (int x =xs; x < xe; x++) {
            for (int y = ys; y < ye; y++) {
                pixel = pic1.getPixel(x, y);
                r = pixel.getRed() + pixel.getGreen() + pixel.getBlue();
                if (r >= 300) {
                    pixel.setColor(Color.white);
                } else {
                    pixel.setColor(Color.black);
                }
            }
        }

        After.setIcon(new ImageIcon(pic1.getImage().getScaledInstance(After.getWidth(), After.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_BinaryActionPerformed

    private void EffectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EffectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EffectActionPerformed
    // 5 Effects
    private void EffectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_EffectItemStateChanged
        // TODO add your handling code here:
          // TODO add your handling code here:
        pic1 = new Picture(image1);
        
        String effect = Effect.getSelectedItem().toString();

        if (effect.equalsIgnoreCase("GrayScale")) {
            Pixel pixel = null;
            int intensity = 0;
            // loop through all the pixels
            for (int x = xs; x < xe; x++) {
                for (int y = ys; y < ye; y++) {
                    pixel = pic1.getPixel(x, y);
                    // compute the intensity of the pixel (average value)
                    intensity = (int) ((pixel.getRed() + pixel.getGreen()
                            + pixel.getBlue()) / 3);

                    // set the pixel color to the new color
                    pixel.setColor(new Color(intensity, intensity, intensity));
                }
            }
        } else if (effect.equalsIgnoreCase("Lighten")) {
            Pixel pixel = null;
            Color color = null;
            // loop through the columns (x direction)
            for (int x = xs; x < xe; x++) {
                for (int y = ys; y < ye; y++) {
                    // get pixel at the x and y location
                    pixel = pic1.getPixel(x, y);

                    // get the current color
                    color = pixel.getColor();

                    // get a lighter color
                    color = color.brighter();

                    // set the pixel color to the lighter color
                    pixel.setColor(color);
                }
            }
        } else if (effect.equalsIgnoreCase("Darker")) {
            Pixel pixel = null;
            Color color = null;
            // loop through the columns (x direction)
            for (int x = xs; x < xe; x++) {
                for (int y = ys; y < ye; y++) {
                    // get pixel at the x and y location
                    pixel = pic1.getPixel(x, y);

                    // get the current color
                    color = pixel.getColor();

                    // get a lighter color
                    color = color.darker();

                    // set the pixel color to the lighter color
                    pixel.setColor(color);
                }
            }
        } else if (effect.equalsIgnoreCase("SepiaTint")) {
                    pic1.sepiaTint(xs, ys, xe, ye);
                    
        } else if (effect.equalsIgnoreCase("Sunset")) {
            Pixel pixel = null;
            int value = 0;
            int i = 0;
            for (int x = xs; x < xe; x++) {
                for (int y = ys; y < ye; y++) {
                    pixel = pic1.getPixel(x, y);
                    // change the blue value
                    value = pixel.getBlue();
                    pixel.setBlue((int) (value * 0.7));
                    // change the green value
                    value = pixel.getGreen();
                    pixel.setGreen((int) (value * 0.7));
                    // increment the index
                    i++;
                }
            }
        }
        After.setIcon(new ImageIcon(pic1.getImage().getScaledInstance(After.getWidth(), After.getHeight(), 1)));
    }//GEN-LAST:event_EffectItemStateChanged
    // Red eye reduction using range
    private void removeRedEyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRedEyeActionPerformed

        pic1 = new Picture(image1);
   
        Pixel pixel = null;

        pic1.removeRedEye(xs, ys, xe , ye, Color.LIGHT_GRAY);
        
        After.setIcon(new ImageIcon(pic1.getImage().getScaledInstance(After.getWidth(), After.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_removeRedEyeActionPerformed

    // EdgeDetection
    private void EdgeDetectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdgeDetectionActionPerformed
        // TODO add your handling code here:

        pic1 = new Picture(image1);
        int amount = Integer.parseInt(range.getText());
        pic1.edgeDetection(amount);

        After.setIcon(new ImageIcon(pic1.getImage().getScaledInstance(After.getWidth(), After.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_EdgeDetectionActionPerformed

    // Copy a specific part
    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed
        // TODO add your handling code here:

        pic1 = new Picture(image1);
        pic1.createCollage(pic1);
        
         Picture target = new Picture(pic1.getWidth(), pic1.getHeight());
         target.copyNonWhitePixels(pic1, xs, ys, xe, ye, 0, 0);


        After.setIcon(new ImageIcon(target.getImage().getScaledInstance(After.getWidth(), After.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_CopyActionPerformed
    // Choose picture1
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Pic1
        image1 = FileChooser.pickAFile();
        pic1 = new Picture(image1);
        Before1.setIcon(new ImageIcon(pic1.getImage().getScaledInstance(After.getWidth(), After.getHeight(), Image.SCALE_SMOOTH)));
        //Picture Information
        Width.setText("Width " + pic1.getHeight());
        Hieght.setText("Height " + pic1.getWidth());
        num.setText("Pixels No " + pic1.getPixels().length);
        jLabel18.setText("Image Information:");
    }//GEN-LAST:event_jButton1ActionPerformed

    // SET RGB Colors
    private void SetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetActionPerformed
        // TODO add your handling code here:
        pic1 = new Picture(image1);
        
        Pixel pixel = null;
        int r = Integer.parseInt(red.getText());
        int g = Integer.parseInt(green.getText());
        int b = Integer.parseInt(blue.getText());
        if (r <= 255 && g <= 255 && b <= 255) {
            for (int x= xs; x < xe; x++) {
                for (int y = ys; y < ye; y++) {
                    pixel = pic1.getPixel(x, y);
                    pixel.setRed((pixel.getRed() * r)/255);
                    pixel.setGreen((pixel.getGreen() * g)/255);
                    pixel.setBlue((pixel.getBlue() * b)/255);
                }
            }
        }

        After.setIcon(new ImageIcon(pic1.getImage().getScaledInstance(After.getWidth(), After.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_SetActionPerformed
    private void greenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greenActionPerformed
    private void redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        new picPart().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void Before1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Before1MousePressed
        // TODO add your handling code here:
        xs = evt.getX();
        ys = evt.getY();
    }//GEN-LAST:event_Before1MousePressed

    private void Before1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Before1MouseReleased
        // TODO add your handling code here:
        xe = evt.getX();
        ye = evt.getY();
    }//GEN-LAST:event_Before1MouseReleased

    //Main
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
            java.util.logging.Logger.getLogger(Range.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Range.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Range.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Range.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Range().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel After;
    private javax.swing.JLabel Before1;
    private javax.swing.JButton Binary;
    private javax.swing.JButton Copy;
    private javax.swing.JButton EdgeDetection;
    private javax.swing.JComboBox<String> Effect;
    private javax.swing.JLabel Hieght;
    private javax.swing.JButton Set;
    private javax.swing.JLabel Width;
    private javax.swing.JTextField blue;
    private javax.swing.JTextField green;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel num;
    private javax.swing.JTextField range;
    private javax.swing.JTextField red;
    private javax.swing.JButton removeRedEye;
    // End of variables declaration//GEN-END:variables
}
