/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author elduq
 */
public class Manejadores extends javax.swing.JFrame {

    /**
     * Creates new form Manejadores
     */
    public Manejadores() {
        initComponents();
        textoResultado.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoX = new javax.swing.JTextField();
        textoY = new javax.swing.JTextField();
        textoResultado = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnyalaX = new javax.swing.JButton();
        btnRaizy = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnRaizx = new javax.swing.JButton();
        btnXmodY = new javax.swing.JButton();
        btnXalaY = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("SubPrograma");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Y");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Resultado");

        textoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoXActionPerformed(evt);
            }
        });

        textoResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoResultadoActionPerformed(evt);
            }
        });

        btnSumar.setText("+");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnRestar.setText("-");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnyalaX.setText("y a la x");
        btnyalaX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyalaXActionPerformed(evt);
            }
        });

        btnRaizy.setText("Raiz y");
        btnRaizy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizyActionPerformed(evt);
            }
        });

        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnRaizx.setText("Raiz x");
        btnRaizx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizxActionPerformed(evt);
            }
        });

        btnXmodY.setText("x mod y ");
        btnXmodY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXmodYActionPerformed(evt);
            }
        });

        btnXalaY.setText("x a la y");
        btnXalaY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXalaYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textoX)
                                .addGap(8, 8, 8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(textoY, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                .addComponent(btnDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnXalaY))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnyalaX)
                            .addComponent(btnRaizx)
                            .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRaizy)
                            .addComponent(btnXmodY)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSumar)
                    .addComponent(btnRestar)
                    .addComponent(btnMultiplicar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRaizy)
                    .addComponent(btnRaizx)
                    .addComponent(btnDividir))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXalaY)
                    .addComponent(btnyalaX)
                    .addComponent(btnXmodY))
                .addGap(0, 58, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoXActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_textoXActionPerformed

    private void textoResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoResultadoActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        // TODO add your handling code here:
        String textX = textoX.getText();
        String textY = textoY.getText();
        double x = Double.parseDouble(textX);
        double y = Double.parseDouble(textY);
        double resultado = x + y;
        String resultadoXY = Double.toString(resultado);
        textoResultado.setText(resultadoXY);

    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        // TODO add your handling code here:
        String textX = textoX.getText();
        String textY = textoY.getText();
        double x = Double.parseDouble(textX);
        double y = Double.parseDouble(textY);
        double resultado = x - y;
        String resultadoXY = Double.toString(resultado);
        textoResultado.setText(resultadoXY);
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        // TODO add your handling code here:
        String textX = textoX.getText();
        String textY = textoY.getText();
        double x = Double.parseDouble(textX);
        double y = Double.parseDouble(textY);
        double resultado = x * y;
        String resultadoXY = Double.toString(resultado);
        textoResultado.setText(resultadoXY);
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        // TODO add your handling code here:
        String textX = textoX.getText();
        String textY = textoY.getText();
        double x = Double.parseDouble(textX);
        double y = Double.parseDouble(textY);
        double resultado = x / y;
        String resultadoXY = Double.toString(resultado);
        textoResultado.setText(resultadoXY);
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnRaizxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizxActionPerformed
        // TODO add your handling code here:
        String textX = textoX.getText();
        double x = Double.parseDouble(textX);
        double raizX = Math.sqrt(x);
        String resultadoRaizX = String.format("%.2f", raizX);
        textoResultado.setText(resultadoRaizX);
    }//GEN-LAST:event_btnRaizxActionPerformed

    private void btnRaizyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizyActionPerformed
        // TODO add your handling code here:
        String textY = textoY.getText();
        double y = Double.parseDouble(textY);
        double raizY = Math.sqrt(y);
        String resultadoRaizY = String.format("%.2f", raizY);
        textoResultado.setText(resultadoRaizY);
    }//GEN-LAST:event_btnRaizyActionPerformed

    private void btnXalaYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXalaYActionPerformed
        // TODO add your handling code here:
        String textX = textoX.getText();
        String textY = textoY.getText();
        double x = Double.parseDouble(textX);
        double y = Double.parseDouble(textY);
        double resultado = Math.pow(x, y);
        String resultadoXY = String.format("%.2f", resultado);
        textoResultado.setText(resultadoXY);
    }//GEN-LAST:event_btnXalaYActionPerformed

    private void btnyalaXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyalaXActionPerformed
        // TODO add your handling code here:
         String textX = textoX.getText();
        String textY = textoY.getText();
        double x = Double.parseDouble(textX);
        double y = Double.parseDouble(textY);
        double resultado = Math.pow(y, x);
        String resultadoXY = String.format("%.2f", resultado);
        textoResultado.setText(resultadoXY);
    }//GEN-LAST:event_btnyalaXActionPerformed

    private void btnXmodYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXmodYActionPerformed
        // TODO add your handling code here:
        String textX = textoX.getText();
        String textY = textoY.getText();
        double x = Double.parseDouble(textX);
        double y = Double.parseDouble(textY);
        double resultado = x % y;
        String resultadoXmodY = Double.toString(resultado);
        textoResultado.setText(resultadoXmodY);
    }//GEN-LAST:event_btnXmodYActionPerformed

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
            java.util.logging.Logger.getLogger(Manejadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manejadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manejadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manejadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manejadores().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnRaizx;
    private javax.swing.JButton btnRaizy;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnXalaY;
    private javax.swing.JButton btnXmodY;
    private javax.swing.JButton btnyalaX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textoResultado;
    private javax.swing.JTextField textoX;
    private javax.swing.JTextField textoY;
    // End of variables declaration//GEN-END:variables
}
