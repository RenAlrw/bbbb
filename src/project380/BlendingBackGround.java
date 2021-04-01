/*
RENAD ALDHASE 1806983
 */
package project380;

import cpit380practice.*;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Rnd21
 */
public class BlendingBackGround extends javax.swing.JFrame {

    //static
    static String image1;
    static Picture pic1;
    static String image2;
    static Picture pic2;
    
    public BlendingBackGround() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Blending & Background");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Before1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Before = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        sliderBlending = new javax.swing.JSlider();
        BackgroundSubtraction = new javax.swing.JButton();
        After = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 231, 238));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rightarrow-01.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        Before1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 181, 189)));

        jButton1.setBackground(new java.awt.Color(222, 222, 222));
        jButton1.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Before.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 181, 189)));

        jToggleButton1.setBackground(new java.awt.Color(222, 222, 222));
        jToggleButton1.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(102, 102, 102));
        jToggleButton1.setText("Choose A Second Pic");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Blend ");

        sliderBlending.setMajorTickSpacing(10);
        sliderBlending.setPaintLabels(true);
        sliderBlending.setPaintTicks(true);
        sliderBlending.setValue(10);
        sliderBlending.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sliderBlending.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBlendingStateChanged(evt);
            }
        });

        BackgroundSubtraction.setBackground(new java.awt.Color(222, 222, 222));
        BackgroundSubtraction.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        BackgroundSubtraction.setForeground(new java.awt.Color(102, 102, 102));
        BackgroundSubtraction.setText("Background Subtraction");
        BackgroundSubtraction.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BackgroundSubtraction.setHideActionText(true);
        BackgroundSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackgroundSubtractionActionPerformed(evt);
            }
        });

        After.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 181, 189)));

        jLabel16.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("Output Picture");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Before1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(BackgroundSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(sliderBlending, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1)
                    .addComponent(Before, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(357, 357, 357)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(After, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Before, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addComponent(Before1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sliderBlending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BackgroundSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(After, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new picPart().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Pic1
        image1 = FileChooser.pickAFile();
        pic1 = new Picture(image1);
        Before1.setIcon(new ImageIcon(pic1.getImage().getScaledInstance(Before1.getWidth(), Before1.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        image2 = FileChooser.pickAFile();
        pic2 = new Picture(image2);
        Before.setIcon(new ImageIcon(pic2.getImage().getScaledInstance(After.getWidth(), After.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void sliderBlendingStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBlendingStateChanged
        // TODO add your handling code here:

        pic1 = new Picture(image1);

        int sValue = sliderBlending.getValue();
        double copy = (100 - sValue) / 2;
        double blend = 100 - copy;

        copy = copy / 100;
        blend = blend / 100;

        Picture targert = new Picture(pic1.getWidth(), pic1.getHeight());
        Pixel pixel1 = null;
        Pixel pixel2 = null;
        Pixel targetPixel = null;

        // copy the first pic1
        int end1 = (int) (pic1.getWidth() * copy);
        for (int x = 0; x < end1; x++) {
            for (int y = 0; y < pic1.getHeight(); y++) {
                pixel1 = pic1.getPixel(x, y);
                targetPixel = targert.getPixel(x, y);
                targetPixel.setColor(pixel1.getColor());
            }
        }

        // now blend pic1 and pic2
        int end2 = (int) (pic1.getWidth() * blend);
        for (int x = end1; x < end2; x++) {
            for (int y = 0; y < pic1.getHeight(); y++) {
                pixel1 = pic1.getPixel(x, y);
                pixel2 = pic2.getPixel(x, y);
                targetPixel = targert.getPixel(x, y);
                targetPixel.setColor(new Color(pixel1.getRed() / 2
                    + pixel2.getRed() / 2,
                    pixel1.getGreen() / 2
                    + pixel2.getGreen() / 2,
                    pixel1.getBlue() / 2
                    + pixel2.getBlue() / 2));
        }
        }

        // copy pic2
        for (int x = end2; x < pic2.getWidth(); x++) {
            for (int y = 0; y < pic2.getHeight(); y++) {
                pixel2 = pic2.getPixel(x, y);
                targetPixel = targert.getPixel(x, y);
                targetPixel.setColor(pixel2.getColor());
            }
        }

        After.setIcon(new ImageIcon(targert.getImage().getScaledInstance(After.getWidth(), After.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_sliderBlendingStateChanged

    private void BackgroundSubtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackgroundSubtractionActionPerformed
        // TODO add your handling code here:
        pic1 = new Picture(image1);
        pic1.chromakey(pic2);
        After.setIcon(new ImageIcon(pic1.getImage().getScaledInstance(After.getWidth(), After.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_BackgroundSubtractionActionPerformed

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
            java.util.logging.Logger.getLogger(BlendingBackGround.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlendingBackGround.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlendingBackGround.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlendingBackGround.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlendingBackGround().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel After;
    private javax.swing.JButton BackgroundSubtraction;
    private javax.swing.JLabel Before;
    private javax.swing.JLabel Before1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JSlider sliderBlending;
    // End of variables declaration//GEN-END:variables
}
