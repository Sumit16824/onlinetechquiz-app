/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author RC
 */
public class SplashScreenFrame extends javax.swing.JFrame {
        SplashThread sp;
    /**
     * Creates new form SplashScreenFrame
     */
    public SplashScreenFrame() {
        initComponents();
         setTitle("Quiz Application");
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image img=tk.getImage("E:\\onlineexam\\online_exam_logo.png");
        setIconImage(img);
        this.setLocationRelativeTo(null);
        jProgressBar1.setStringPainted(true);
        jProgressBar1.setForeground(Color.white);
        Color bkColor=new Color(47,79,79);
        ColorUIResource colorResource=new ColorUIResource(bkColor); //it convert Color object to ColorUIResource
        UIManager.put("nimbusOrange", colorResource); //by default it take an argument of ColorUIResouce object
        
        sp=new SplashThread();
        sp.start();  
    }
    class SplashThread extends Thread
    {
        public void run()
        {
            int count=0;
            Random r=new Random();
            while(jProgressBar1.getValue()<jProgressBar1.getMaximum())
            {
                try
                {
                    jProgressBar1.setValue(count);
                    Thread.sleep(2000);
                    count=count+r.nextInt(100);
                }
                catch(InterruptedException e)
                {
                    JOptionPane.showMessageDialog(null, "Exception In Thread:"+e,"error!",JOptionPane.ERROR_MESSAGE);
                }
            }
            dispose();
            Login loginFrame=new Login();
            loginFrame.setVisible(true);
            
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\onlineexam\\Online-Examination1.jpg")); // NOI18N

        jProgressBar1.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreenFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
