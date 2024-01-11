        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CacaNiquel;

import Cadastro_e_Login.UsuarioBancoCL;
import MenuUsuario.MetodosHistoricoMU;
import MenuUsuario.TelaHistoricoMU;
import MenuUsuario.TelaInicialMU;

public class TelaCN extends javax.swing.JFrame {

    int ID;
    double Valorsaldo;
    double ValorsaldoInicial;
    double valorPremio;
    public UsuarioBancoCL banco;
    TelaHistoricoMU historico;
    TelaInicialMU inin;
    MetodosHistoricoMU ComandosHist = new MetodosHistoricoMU();

    public double getValorsaldoInicial() {
        return ValorsaldoInicial;
    }

    public double getValorsaldo() {
        return Valorsaldo;
    }
    
    public void setInin(TelaInicialMU inin) {
        this.inin = inin;
    }

    public void setHistorico(TelaHistoricoMU historico) {
        this.historico = historico;
    }
    
    public void setBanco(UsuarioBancoCL banco) {
        this.banco = banco;
    }
    
    public int getID() {
        return ID;
    }

    public double getSaldo() {
        return Valorsaldo;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSaldo(double saldo) {
        this.Valorsaldo = saldo;
    }
    
    public void mostrarSaldo() {
        saldo.setText(String.valueOf(Valorsaldo));
    }
    
    public TelaCN() {
        setTitle("Caça níquel");
        initComponents();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        premio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        display = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Resultado_1 = new javax.swing.JLabel();
        resu1mais = new javax.swing.JLabel();
        resu1menos = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Resultado_2 = new javax.swing.JLabel();
        resu2mais = new javax.swing.JLabel();
        resu2menos = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Resultado_3 = new javax.swing.JLabel();
        resu3menos = new javax.swing.JLabel();
        resu3mais = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        btn_depositar = new javax.swing.JButton();
        btn_jogar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        voltarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("R$ ");

        premio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        premio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        premio.setText("542");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Prêmio");
        jLabel7.setIconTextGap(8);
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(premio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(premio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 160, 160));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        display.setForeground(new java.awt.Color(255, 153, 51));
        display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display.setText("...");
        jPanel2.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 402, 42));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        Resultado_1.setFont(new java.awt.Font("OCR A Extended", 0, 28)); // NOI18N
        Resultado_1.setForeground(new java.awt.Color(255, 255, 255));
        Resultado_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Resultado_1.setText("0");
        Resultado_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        resu1mais.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        resu1mais.setForeground(new java.awt.Color(204, 204, 204));
        resu1mais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resu1mais.setText("1");

        resu1menos.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        resu1menos.setForeground(new java.awt.Color(204, 204, 204));
        resu1menos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resu1menos.setText("9");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Resultado_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(resu1mais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(resu1menos, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(resu1mais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resultado_1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resu1menos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(124, 124));

        Resultado_2.setFont(new java.awt.Font("OCR A Extended", 0, 28)); // NOI18N
        Resultado_2.setForeground(new java.awt.Color(255, 255, 255));
        Resultado_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Resultado_2.setText("0");
        Resultado_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        resu2mais.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        resu2mais.setForeground(new java.awt.Color(204, 204, 204));
        resu2mais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resu2mais.setText("1");

        resu2menos.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        resu2menos.setForeground(new java.awt.Color(204, 204, 204));
        resu2menos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resu2menos.setText("9");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Resultado_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resu2mais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(resu2menos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(resu2mais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Resultado_2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resu2menos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 124, 193));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        Resultado_3.setFont(new java.awt.Font("OCR A Extended", 0, 28)); // NOI18N
        Resultado_3.setForeground(new java.awt.Color(255, 255, 255));
        Resultado_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Resultado_3.setText("0");
        Resultado_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        resu3menos.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        resu3menos.setForeground(new java.awt.Color(204, 204, 204));
        resu3menos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resu3menos.setText("9");

        resu3mais.setFont(new java.awt.Font("OCR A Extended", 0, 15)); // NOI18N
        resu3mais.setForeground(new java.awt.Color(204, 204, 204));
        resu3mais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resu3mais.setText("1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resu3mais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Resultado_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resu3menos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(resu3mais, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resultado_3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resu3menos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 19, 124, 193));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 490, 280));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Saldo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 70, -1));

        saldo.setForeground(new java.awt.Color(255, 255, 255));
        saldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saldo.setText("0");
        jPanel1.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 50, -1));

        btn_depositar.setText("Recarregar");
        btn_depositar.setToolTipText("");
        btn_depositar.setAutoscrolls(true);
        btn_depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_depositarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_depositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 100, -1));

        btn_jogar.setBackground(new java.awt.Color(255, 102, 0));
        btn_jogar.setFont(new java.awt.Font("OCR A Extended", 0, 30)); // NOI18N
        btn_jogar.setText("Jogar");
        btn_jogar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_jogar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jogarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_jogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 170, 70));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("R$ 20,00");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 450, 100, -1));

        voltarMenu.setText("Voltar ao menu inicial");
        voltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMenuActionPerformed(evt);
            }
        });
        jPanel1.add(voltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jogarActionPerformed
        MetodosCN jogar = new MetodosCN();
        ValorsaldoInicial = Valorsaldo;
        
        jogar.rodarRoleta(this);
        
        if (ValorsaldoInicial >= 20) {
        ComandosHist.inserirHistSorteio(this, banco, historico);
        }
    }//GEN-LAST:event_btn_jogarActionPerformed

    private void btn_depositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_depositarActionPerformed
        TelaDepositoCN telaDep = new TelaDepositoCN();
        telaDep.setBanco(this.banco);
        telaDep.setID(this.ID);
        telaDep.setTelaJogo(this);
        telaDep.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_depositarActionPerformed

    private void voltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMenuActionPerformed
        inin.login.setPremioCacaNiquel(Double.parseDouble(premio.getText()));
        banco.bancoDados[ID - 1].setSaldoCacaNiquel(Double.parseDouble(saldo.getText()));
        dispose();
    }//GEN-LAST:event_voltarMenuActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Resultado_1;
    public javax.swing.JLabel Resultado_2;
    public javax.swing.JLabel Resultado_3;
    public javax.swing.JButton btn_depositar;
    private javax.swing.JButton btn_jogar;
    public javax.swing.JLabel display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    public javax.swing.JLabel premio;
    public javax.swing.JLabel resu1mais;
    public javax.swing.JLabel resu1menos;
    public javax.swing.JLabel resu2mais;
    public javax.swing.JLabel resu2menos;
    public javax.swing.JLabel resu3mais;
    public javax.swing.JLabel resu3menos;
    public javax.swing.JLabel saldo;
    private javax.swing.JButton voltarMenu;
    // End of variables declaration//GEN-END:variables
}