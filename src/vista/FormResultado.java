 
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Jugador;
import modelo.Ruta;
import modelo.Tablero;
import modelo.TipoImagen;


public class FormResultado extends javax.swing.JFrame {

    private Tablero tablero;
    private TipoImagen jugadorGanador;
    
    public FormResultado(TipoImagen jugadorGanador,Tablero tablero) {
        init();
        this.tablero = tablero;
        this.jugadorGanador = jugadorGanador;
        if(jugadorGanador==TipoImagen.EQUIS){
            imgIzq.setRuta(Ruta.JUGADOREQUIS);
            imgDer.setRuta(Ruta.EQUIS);
            lblNombre.setText(FormTrikiTrake.nameJugadorEquis.getText());
        }
        else if(jugadorGanador==TipoImagen.CIRCULO){
            imgIzq.setRuta(Ruta.JUGADORCIRCULO);
            imgDer.setRuta(Ruta.CIRCULO);
            lblNombre.setText(FormTrikiTrake.nameJugadorCirculo.getText());
        }
        else if(jugadorGanador==TipoImagen.EMPATE){
            imgIzq.setRuta(Ruta.JUGADOREQUIS);
            imgDer.setRuta(Ruta.JUGADORCIRCULO);
            lblNombre.setText("EMPATE");
        }
    }
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        panelFondo.requestFocus();  
        panelFondo.setOpaque(false);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagen2 = new modelo.Imagen();
        imagen3 = new modelo.Imagen();
        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        imagen1 = new modelo.Imagen();
        imgDer = new modelo.Imagen();
        imgIzq = new modelo.Imagen();

        imagen2.setText("imagen1");
        imagen2.setRuta("/resources/JugadorEquis.png");

        imagen3.setText("imagen1");
        imagen3.setRuta("/resources/JugadorEquis.png");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(14, 19, 49));
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        panelFondo.setLayout(null);

        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(240, 192, 255));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        panelFondo.add(lblCierre);
        lblCierre.setBounds(380, 10, 30, 32);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 251, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GANADOR");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(0, 30, 420, 47);

        lblNombre.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(241, 227, 252));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("NOMBRE");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(lblNombre);
        lblNombre.setBounds(90, 90, 250, 50);

        imagen1.setText("imagen1");
        panelFondo.add(imagen1);
        imagen1.setBounds(30, 110, 46, 16);

        imgDer.setText("imagen4");
        imgDer.setRuta("/resources/Equis.png");
        panelFondo.add(imgDer);
        imgDer.setBounds(310, 100, 43, 43);

        imgIzq.setText("imagen4");
        imgIzq.setRuta("/resources/JugadorEquis.png");
        panelFondo.add(imgIzq);
        imgIzq.setBounds(70, 100, 43, 43);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        dispose();
        tablero.reiniciarTablero(jugadorGanador);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_lblCierreMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelo.Imagen imagen1;
    private modelo.Imagen imagen2;
    private modelo.Imagen imagen3;
    private modelo.Imagen imgDer;
    private modelo.Imagen imgIzq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
