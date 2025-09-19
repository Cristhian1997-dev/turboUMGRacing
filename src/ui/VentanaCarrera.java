/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.UIManager.get;
/**
 *
 * @author mucun
 */
public class VentanaCarrera extends javax.swing.JFrame {
    
    private final JLabel moto1;
    private final JLabel autosport;
    private final JLabel camioneta;

    /**
     * Creates new form VentanaCarrera
     */
    FondoPanel fondo = new FondoPanel();
    public VentanaCarrera(){ 
        
        initComponents();
        jPanel1 = new FondoPanel(); 
        jPanel1.setLayout(null); 
        
        this.setContentPane(fondo); 
        this.getContentPane().setLayout(new java.awt.BorderLayout()); 
        this.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER); 
        
        setTitle("Pista"); 
        setSize(1000,700); 
        setLocationRelativeTo(null); 
  

        
        ImageIcon iconoOriginal = new ImageIcon(getClass().getResource("/imagenes/moto2.png")); 
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon iconoReducido = new ImageIcon(imagenEscalada); 
        moto1 = new JLabel(iconoReducido); 
        jPanel1.add(moto1);
        
        //vehiculo 2 
        
        ImageIcon iconoOriginal2 = new ImageIcon(getClass().getResource("/imagenes/autosport.png")); 
        Image imagenEscalada2 = iconoOriginal2.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon iconoReducido2 = new ImageIcon(imagenEscalada2);
        autosport = new JLabel(iconoReducido2); 
        jPanel1.add(autosport);
    
        //vehiculos 3 
        ImageIcon iconoOriginal3 = new ImageIcon(getClass().getResource("/imagenes/camioneta.png")); 
        Image imagenEscalada3 = iconoOriginal3.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon iconoReducido3 = new ImageIcon(imagenEscalada3); 
        camioneta = new JLabel(iconoReducido3); 
        jPanel1.add(camioneta); 
        
        
        
        moto1.setBounds(50, 150, iconoReducido.getIconWidth(), iconoReducido.getIconHeight()); 
        autosport.setBounds(50, 250,iconoReducido2.getIconWidth(), iconoReducido2.getIconHeight()); 
        camioneta.setBounds(50,350,iconoReducido3.getIconWidth(), iconoReducido3.getIconHeight());
        
        // Habilitar control de teclado 
        
        addKeyListener(new java.awt.event.KeyAdapter() 
        { @Override public void keyPressed(java.awt.event.KeyEvent evt) 
        { 
            movervehiculos(evt);
            
        } 
        });
  
        setFocusable(true);
        
        // Para que reciba eventos del teclado 
        setFocusTraversalKeysEnabled(false); } 
        private void movervehiculos(java.awt.event.KeyEvent evt) 
        { 
            int key = evt.getKeyCode();
        

        // Coordenadas actuales 
        int x1 = moto1.getX(); 
        int y1 = moto1.getY(); 
        int x2 = autosport.getX(); 
        int y2 = autosport.getY(); 
        int x3 = camioneta.getX(); 
        int y3 = camioneta.getY(); 

        // Movimiento vehiculo Moto 1 con flechas 
        
        if (key == java.awt.event.KeyEvent.VK_UP) 
        { 
           moto1.setLocation(x1, y1 - 10); } 
        if (key == java.awt.event.KeyEvent.VK_DOWN) 
         { 
          moto1.setLocation(x1, y1 + 10); } 
        if (key == java.awt.event.KeyEvent.VK_LEFT) 
          { moto1.setLocation(x1 - 10, y1); } 
        if (key == java.awt.event.KeyEvent.VK_RIGHT)
        { moto1.setLocation(x1 + 10, y1); } 

        // Movimiento vehiculo autosport con WASD 
        if (key == java.awt.event.KeyEvent.VK_W) 
        { autosport.setLocation(x2, y2 - 10); } 
        if (key == java.awt.event.KeyEvent.VK_S) 
        { autosport.setLocation(x2, y2 + 10); } 
        if (key == java.awt.event.KeyEvent.VK_A) 
        { autosport.setLocation(x2 - 10, y2); } 
        if (key == java.awt.event.KeyEvent.VK_D) 
        { autosport.setLocation(x2 + 10, y2); } 

        // Movimiento vehiculo 3 camioneta con IKJL 
        if (key == java.awt.event.KeyEvent.VK_I) 
        { camioneta.setLocation(x3, y3 - 10); }
        if (key == java.awt.event.KeyEvent.VK_K) 
        { camioneta.setLocation(x3, y3 + 10); } 
        if (key == java.awt.event.KeyEvent.VK_J) 
        { camioneta.setLocation(x3 - 10, y3); } 
        if (key == java.awt.event.KeyEvent.VK_L) 
        { camioneta.setLocation(x3 + 10, y3); } 
       
        int limiteX = jPanel1.getWidth() - 150; // 200 = ancho del vehículo

            if(moto1.getX() >= limiteX) mostrarGanador("Moto 1");
             if(autosport.getX() >= limiteX) mostrarGanador("Autosport");
             if(camioneta.getX() >= limiteX) mostrarGanador("Camioneta");

        }
            private void mostrarGanador(String nombreVehiculo) {
            // Crear la ventana del ganador
            VentanaGanador ventana = new VentanaGanador();

            // Pasar el nombre del vehículo ganador a la ventana
            ventana.setMensajeGanador(nombreVehiculo);

            // Mostrar la ventana
            ventana.setVisible(true);

            // Opcional: cerrar la ventana de carrera para detener el juego
            this.dispose();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(VentanaCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaCarrera().setVisible(true);
                java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    VentanaCarrera ventana = new VentanaCarrera();
                    ventana.setVisible(true);
                    ventana.requestFocusInWindow(); 
                }
            });

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

        class FondoPanel extends JPanel 
        { private Image imagen;
        @Override 
        public void paint(Graphics g) 
        { 
            imagen = new ImageIcon(getClass().getResource("/imagenes/pista2.jpg")).getImage();
            g.drawImage(imagen,0,0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
        } 
     } 
  }
