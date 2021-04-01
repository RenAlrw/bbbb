/*
RENAD ALDHASE 1806983, AMAL ALHARBI 1815798
 */
package project380;

import cpit380practice.*;
import java.awt.*;

/**
 *
 * @author Rnd21
 */
public class MoviePart extends javax.swing.JFrame {

    public MoviePart() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rectMethod = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 231, 238));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rightarrow-01.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/movie1.png"))); // NOI18N

        rectMethod.setBackground(new java.awt.Color(222, 222, 222));
        rectMethod.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        rectMethod.setForeground(new java.awt.Color(102, 102, 102));
        rectMethod.setText("Recatangle Movie");
        rectMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectMethodActionPerformed(evt);
            }
        });

        Button1.setBackground(new java.awt.Color(222, 222, 222));
        Button1.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        Button1.setForeground(new java.awt.Color(102, 102, 102));
        Button1.setText("Sunset Movie");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setBackground(new java.awt.Color(222, 222, 222));
        Button2.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        Button2.setForeground(new java.awt.Color(102, 102, 102));
        Button2.setText("Edge Detection Movie");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rectMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(rectMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        new mainInterface().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void rectMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectMethodActionPerformed
        // TODO add your handling code here:
        RecatangleMovie();
    }//GEN-LAST:event_rectMethodActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:

        
        MovieMaker m = new MovieMaker();
        // load the picture of the beach
        String pic = FileChooser.pickAFile();
        Picture image = new Picture(pic);
        String directory = "C:\\Users\\AmalA\\Downloads\\FinalProject380\\Project 380\\project380\\Sunset";
        // declare other variables
        Picture target = null;
        FrameSequencer frameSequencer = new FrameSequencer(directory);
        int framesPerSec = 30;
        // loop creating the frames
        for (int i = 0; i < framesPerSec; i++) {
            target = new Picture(image);
            image.makeSunset(0.99);

            //  image.makeSunset2();
            frameSequencer.addFrame(target);
        }
        // play the movie
        frameSequencer.play(15);
        // m.makeSunsetMovie(directory);
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
        // Edge Detection Movie
        MovieMaker m = new MovieMaker();
        String p = FileChooser.pickAFile();
        Picture image = new Picture(p);
        String directory = "C:\\Users\\AmalA\\Downloads\\FinalProject380\\Project 380\\project380\\Edge";
        Picture copyPict = null;
        // declare other variables
        FrameSequencer frameSequencer = new FrameSequencer(directory);
        int framesPerSec = 30;
        // loop creating the frames
        for (int i = 0; i < framesPerSec; i++) {
            copyPict = new Picture(image);
            copyPict.edgeDetection(31 - i);
            frameSequencer.addFrame(copyPict);
        }
        // play the movie
        frameSequencer.play(framesPerSec);
        //   m.makeEdgeDetectMovie(image, directory);
    }//GEN-LAST:event_Button2ActionPerformed

    public void RecatangleMovie() {
        MovieMaker m = new MovieMaker();
        Picture pic = null;
        Graphics g = null;
        int frameS = 30;
        Color c = new Color(58, 164, 164);
        FrameSequencer fs = new FrameSequencer("Movie");

        for (int i = 0; i < 60; i++) {
            pic = new Picture(660, 470);
            g = pic.getGraphics();
            if (i < 20) {
                g.setColor(c);
                g.fillRect(i * 10, i * 15, 70, 70);
            } else {
                g.setColor(c);
                g.fillRect(i * 10, i * 2 + 280, 70, 70);
            }
            fs.addFrame(pic);
        }
        fs.play(frameS);
    }

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
            java.util.logging.Logger.getLogger(MoviePart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoviePart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoviePart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoviePart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoviePart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rectMethod;
    // End of variables declaration//GEN-END:variables
}
