/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;




/**
 *
 * @author T-107
 */
public class Examen extends javax.swing.JFrame {
        
    /**
     * Creates new form Examen
     */
    public Examen() {
        
        initComponents();
        int x=jLabel1.getX();
        int y=jLabel1.getY();
        
        jLabel1.setText("Cordenadas en X: "+ x + ", Y: "+y);
        setSize(300, 180);
        
        Thread t1=new Thread(new Runnable() {

            int xl=6;
            int yl=6;
                
                
            @Override
            public void run() {
                try{
                    
                    while (true) {  
                        Thread.sleep(250);
                         
                        if(xl<=290 && yl==6){
                            xl=xl+1;
                            
                            jLabel1.setLocation(xl, yl);
                            jLabel1.repaint();
                            jLabel1.setText("Cordenadas en X: "+ xl + ", Y: "+yl);
                        }
                        if(xl==290 && yl<=174){
                            yl=yl+1;
                            
                            jLabel1.setLocation(xl, yl);
                            jLabel1.repaint();
                            jLabel1.setText("Cordenadas en X: "+ xl + ", Y: "+yl);
                        }
                        if(xl<=290 && xl>6 && yl==174){
                            xl=xl-1;
                            
                            jLabel1.setLocation(xl, yl);
                            jLabel1.repaint();
                            jLabel1.setText("Cordenadas en X: "+ xl + ", Y: "+yl);
                        }
                        if(xl==6 && yl<=174 && yl>6){
                            yl=yl-1;
                            
                            jLabel1.setLocation(xl, yl);
                            jLabel1.repaint();
                            jLabel1.setText("Cordenadas en X: "+ xl + ", Y: "+yl);
                        }
                        
                    }
                }catch(Exception ex){
                    
                }
            }
        }); t1.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("etiqueta1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(344, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(275, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
