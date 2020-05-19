package mayin_tarlasi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class mayin_tarlasi extends javax.swing.JFrame {

    private JPanel contentPane1;

    int sayi = 0;
    int ilk, iki;
    double puan = 0;
    String basari;

    public mayin_tarlasi() {
        initComponents();
        tarlaDoldur();
    }

    public String puan(double puan) {
        puan = (puan * 100) / 81;
        if (puan < 10){
            String a = "0" + puan;
            basari = a.substring(0,5);
        }else{
            String a = puan + "";
        basari = a.substring(0,5);
        }

        

        return basari;
    }

    public static int[] random(int x[]) {
        int[] array;
        array = new int[11];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            do {
                int a;
                a = r.nextInt(87) + 1;
                if (a % 10 == 0) {
                    a = a + 1;
                }
                if (a < 11) {
                    array[i] = a + 10;
                }
                array[i] = a + 10;
            } while (array.equals(array[i]));
        }
        for (int i = 1; i < 11; i++) {
            Arrays.sort(array);

        }
        return array;
    }

    private void tarlaDoldur() {

        int[] arrs;
        arrs = new int[11];

        for (int i = 0; i < 10; i++) {

        }
        int arr[] = random(arrs);

        contentPane1 = new JPanel();
        contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane1);
        contentPane1.setLayout(null);
        int x = 64, y = 150;

        contentPane1.add(jButton1);
        contentPane1.add(jLabel1);
        contentPane1.add(jButton2);

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {

                JButton btn = new JButton();
                btn.setFont(new Font("Thoma", Font.PLAIN, 30));
                btn.setBounds(x, y, 64, 64);
                btn.setBackground(Color.BLACK);
                btn.setForeground(Color.gray);
                String ad = i + ".satir " + "" + j + ".sutun";
                btn.setName(ad);
                contentPane1.add(btn);
                x = x + 64;

                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        puan++;
                        puan(puan);
                        jLabel1.setText("başarınız %" + basari);
                        btn.setEnabled(false);

                    }
                });

                for (int k = 1; k < 11; k++) {
                    String s = arr[k] + "5";
                    ilk = Integer.valueOf(s.substring(0, 1));
                    iki = Integer.valueOf(s.substring(1, 2));

                    //sol üst için 
                    int sol_ust = Integer.valueOf(s.substring(0, 2));
                    sol_ust = sol_ust - 11;
                    String sayi_i = sol_ust + "2";

                    String sol_us = sayi_i.substring(0, 1);
                    String sol_us1 = sayi_i.substring(1, 2);

                    int us = Integer.valueOf(sol_us);
                    int us1 = Integer.valueOf(sol_us1);

                    if (i == us & j == us1) {
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch (btn.getText()) {
                                    case "":
                                        btn.setText("1");
                                        break;
                                    case "1":
                                        btn.setText("2");
                                        break;
                                    case "2":
                                        btn.setText("3");
                                        break;
                                    case "3":
                                        btn.setText("4");
                                        break;
                                    default:
                                        break;
                                }
                            }
                        });
                    }
                    // üst için 
                    int ust = Integer.valueOf(s.substring(0, 2));
                    ust = ust - 10;
                    String ust_sayii = ust + "2";

                    String us_ustt = ust_sayii.substring(0, 1);
                    String as_ust = ust_sayii.substring(1, 2);

                    int intt_us = Integer.valueOf(us_ustt);
                    int intt_as = Integer.valueOf(as_ust);

                    if (i == intt_us & j == intt_as) {
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch (btn.getText()) {
                                    case "":
                                        btn.setText("1");

                                        break;
                                    case "1":
                                        btn.setText("2");
                                        break;
                                    case "2":
                                        btn.setText("3");
                                        break;
                                    case "3":
                                        btn.setText("4");
                                        break;
                                    default:
                                        break;
                                }
                            }
                        });
                    }
                    // sağ üst için 
                    int sag_ust = Integer.valueOf(s.substring(0, 2));
                    sag_ust = sag_ust - 9;
                    String sag_ust_sayii = sag_ust + "2";

                    String us_sag_ustt = sag_ust_sayii.substring(0, 1);
                    String as_sag_ust = sag_ust_sayii.substring(1, 2);

                    int intt_sag_us = Integer.valueOf(us_sag_ustt);
                    int intt_sag_as = Integer.valueOf(as_sag_ust);

                    if (i == intt_sag_us & j == intt_sag_as) {
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch (btn.getText()) {
                                    case "":
                                        btn.setText("1");
                                        break;
                                    case "1":
                                        btn.setText("2");
                                        break;
                                    case "2":
                                        btn.setText("3");
                                        break;
                                    case "3":
                                        btn.setText("4");
                                        break;
                                    default:
                                        break;
                                }
                            }
                        });
                    }
                    //sol alt için 
                    int sol_alt = Integer.valueOf(s.substring(0, 2));
                    sol_alt = sol_alt + 9;
                    String sol_alt_sayi = sol_alt + "2";

                    String sol_alt_us = sol_alt_sayi.substring(0, 1);
                    String sol_alt_as = sol_alt_sayi.substring(1, 2);

                    int sol_alt_ussayi = Integer.valueOf(sol_alt_us);
                    int sol_alt_assayi = Integer.valueOf(sol_alt_as);

                    if (i == sol_alt_ussayi & j == sol_alt_assayi) {
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch (btn.getText()) {
                                    case "":
                                        btn.setText("1");
                                        break;
                                    case "1":
                                        btn.setText("2");
                                        break;
                                    case "2":
                                        btn.setText("3");
                                        break;
                                    case "3":
                                        btn.setText("4");
                                        break;
                                    default:
                                        break;
                                }
                            }
                        });
                    }
                    // alt için 
                    int alt = Integer.valueOf(s.substring(0, 2));
                    alt = alt + 10;
                    String alt_sayii = alt + "2";

                    String us_alt = alt_sayii.substring(0, 1);
                    String as_alt = alt_sayii.substring(1, 2);

                    int intt_us_alt = Integer.valueOf(us_alt);
                    int intt_as_alt = Integer.valueOf(as_alt);

                    if (i == intt_us_alt & j == intt_as_alt) {
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch (btn.getText()) {
                                    case "":
                                        btn.setText("1");
                                        break;
                                    case "1":
                                        btn.setText("2");
                                        break;
                                    case "2":
                                        btn.setText("3");
                                        break;
                                    case "3":
                                        btn.setText("4");
                                        break;
                                    default:
                                        break;
                                }
                            }
                        });
                    }
                    // sağ alt için 
                    int sag_alt = Integer.valueOf(s.substring(0, 2));
                    sag_alt = sag_alt + 11;
                    String sag_alt_sayii = sag_alt + "2";

                    String us_sag_alt = sag_alt_sayii.substring(0, 1);
                    String as_sag_alt = sag_alt_sayii.substring(1, 2);

                    int intt_us_sag_alt = Integer.valueOf(us_sag_alt);
                    int intt_as_sag_alt = Integer.valueOf(as_sag_alt);

                    if (i == intt_us_sag_alt & j == intt_as_sag_alt) {
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch (btn.getText()) {
                                    case "":
                                        btn.setText("1");
                                        break;
                                    case "1":
                                        btn.setText("2");
                                        break;
                                    case "2":
                                        btn.setText("3");
                                        break;
                                    case "3":
                                        btn.setText("4");
                                        break;
                                    default:
                                        break;
                                }
                            }
                        });
                    }
                    //sol için 
                    int sol = Integer.valueOf(s.substring(0, 2));
                    sol = sol - 1;
                    String sol_sayi = sol + "2";

                    String soll_us = sol_sayi.substring(0, 1);
                    String sol_as = sol_sayi.substring(1, 2);

                    int sol_ussayi = Integer.valueOf(soll_us);
                    int sol_assayi = Integer.valueOf(sol_as);

                    if (i == sol_ussayi & j == sol_assayi) {
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch (btn.getText()) {
                                    case "":
                                        btn.setText("1");
                                        break;
                                    case "1":
                                        btn.setText("2");
                                        break;
                                    case "2":
                                        btn.setText("3");
                                        break;
                                    case "3":
                                        btn.setText("4");
                                        break;
                                    default:
                                        break;
                                }
                            }
                        });
                    }
                    //sag için 
                    int sag = Integer.valueOf(s.substring(0, 2));
                    sag = sag + 1;
                    String sag_sayi = sag + "2";

                    String sag_us = sag_sayi.substring(0, 1);
                    String sag_as = sag_sayi.substring(1, 2);

                    int sag_ussayi = Integer.valueOf(sag_us);
                    int sag_assayi = Integer.valueOf(sag_as);

                    if (i == sag_ussayi & j == sag_assayi) {
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                switch (btn.getText()) {
                                    case "":
                                        btn.setText("1");
                                        break;
                                    case "1":
                                        btn.setText("2");
                                        break;
                                    case "2":
                                        btn.setText("3");
                                        break;
                                    case "3":
                                        btn.setText("4");
                                        break;
                                    default:
                                        break;
                                }
                            }
                        });
                    }
                    
                    if (i == ilk & j == iki) {
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                btn.setText("☣");
                                bitti op = new bitti();
                                op.setVisible(true);

                            }
                        });
                    }
                }

            }
            y = y + 64;
            x = 64;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setMaximumSize(new java.awt.Dimension(700, 800));
        setMinimumSize(new java.awt.Dimension(700, 800));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(null);

        jButton1.setText("Tekrar Oyna");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 30, 104, 26);

        jButton2.setText("Çıkış");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(590, 30, 62, 26);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BAŞARI");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(241, 40, 170, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mayin_tarlasi m = new mayin_tarlasi();
        m.setVisible(true);
        m.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(mayin_tarlasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mayin_tarlasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mayin_tarlasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mayin_tarlasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mayin_tarlasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    void add() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
