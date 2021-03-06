/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identificador;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alpha
 */
public class IdentificadorVentana extends javax.swing.JFrame {

    /**
     * Creates new form IdentificadorVentana
     */
    
    private String[] cadenafinal;
    File ruta = new File("Aiourssu.txt");
    private JTextField[][] muestra;
    private JTextField[][] simbolos=new JTextField[1][2] ;
    private JPanel fondo=new JPanel();
    private int contador=0;
    private int inicio=0;
    private int posY=35;
    
    
    public IdentificadorVentana() {
        initComponents();
        simbolos[0][0]= new JTextField();
        simbolos[0][1]= new JTextField();
        PaneMuestra.add(simbolos[0][0]);
        PaneMuestra.add(simbolos[0][1]);
        simbolos[0][0].setBorder(null);
        simbolos[0][0].setBackground(null);
        simbolos[0][1].setBorder(null);
        simbolos[0][1].setBackground(null);
        simbolos[0][0].setBounds(15, 15, 72, 25);
        simbolos[0][1].setBounds(90, 15, 72, 25);
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ScrollMuestra = new javax.swing.JScrollPane();
        PaneMuestra = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Historial = new javax.swing.JMenuItem();
        regresar = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Identificador");

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jButton1.setText("Identificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ScrollMuestra.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        PaneMuestra.setNextFocusableComponent(ScrollMuestra);
        PaneMuestra.setPreferredSize(new java.awt.Dimension(258, 200));

        javax.swing.GroupLayout PaneMuestraLayout = new javax.swing.GroupLayout(PaneMuestra);
        PaneMuestra.setLayout(PaneMuestraLayout);
        PaneMuestraLayout.setHorizontalGroup(
            PaneMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        PaneMuestraLayout.setVerticalGroup(
            PaneMuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        ScrollMuestra.setViewportView(PaneMuestra);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollMuestra)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(107, 107, 107))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(21, 21, 21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        Historial.setText("Historial");
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });
        jMenu1.add(Historial);

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jMenu1.add(regresar);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LimpiarArreglo();
        inicio=1;
        CadenaLeida(jTextField1.getText());
        if (!jTextField1.getText().equalsIgnoreCase("")) {
                try {
                    BufferedWriter pw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ruta,true), "utf-8"));

                    pw.write(jTextField1.getText()+"\n");
            
                    pw.close();
                    
                } catch (IOException ex) {
                System.out.println(ex.getMessage());
                }
            }else{
            JOptionPane.showMessageDialog(this, "Casilla Vacia");
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        jPanel1.setVisible(false);
        fondo.setVisible(true);
        this.add(fondo);
        fondo.setLayout(null);
        fondo.repaint();
        fondo.setBounds(10, 10, 400, 1000);
        HistorialPalabras a1 = new HistorialPalabras();
        a1.Tama??o();
        int tama??o= a1.arreglotama??o();
        JLabel[] a2 = new JLabel[tama??o];
        int posY= 50;
        a2[0] = new JLabel();
        fondo.add(a2[0]);
        a2[0].setBounds(20, 15, 300, 25);
        a2[0].setText("Cadenas Ingresadas");        
        for (int i = 1; i < tama??o; i++) {
            a2[i] = new JLabel();
            fondo.add(a2[i]);
            a2[i].setBounds(20, posY, 300, 25);
            posY+=25;
            a2[i].setText(a1.Linea(i));
        }
        
    }//GEN-LAST:event_HistorialActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        fondo.setVisible(false);
        jPanel1.setVisible(true);
        fondo.removeAll();
        
    }//GEN-LAST:event_regresarActionPerformed
    
    public void CadenaLeida(String cadena){
        StringTokenizer token=new StringTokenizer(cadena, " ");
        int conta=token.countTokens();
        contador=0;
        posY=35;
        muestra= new JTextField[conta][2];
        cadenafinal = new String[conta];
        for (int i = 0; i < conta; i++) {
            muestra[contador][0]= new JTextField();
            muestra[contador][1]= new JTextField();
            muestra[contador][1].setBorder(null);
            muestra[contador][1].setBackground(null);
            muestra[contador][0].setBorder(null);
            muestra[contador][0].setBackground(null);
            cadenafinal[i]=token.nextToken();
            AnalizarToken(cadenafinal[i]);
        }
    }
    
    public void AnalizarToken(String palabra){
        char[] arreglo = palabra.toCharArray();
        for (int i = 0; i < palabra.length(); i++) {
            if(arreglo[i]=='[' || arreglo[i]==']' || arreglo[i]==';' || arreglo[i]==','){
                Escribirsimbolos(arreglo[i]);
            }
        }
        if (Character.getNumericValue(arreglo[0])<10) {
            DiferenciaDecimal(palabra);
        }else if (Character.getNumericValue(arreglo[0])>=10 && Character.getNumericValue(arreglo[0])<36) {
            CrearLabel(palabra, "id");
        }
    }
    
    public void DiferenciaDecimal(String Palabra){
        char[] arreglo = Palabra.toCharArray();
        boolean entero=true;
        boolean error = false;
        for (int i = 0; i < Palabra.length(); i++) {
            if (Character.getNumericValue(arreglo[i])>=10) {
                CrearLabel(Palabra, "error");
                error = true;
                i=Palabra.length()-1;
            }else if(Character.getNumericValue(arreglo[i])==-1 && i>1){
                
                if (Character.getNumericValue(arreglo[i-1])<0 || Character.getNumericValue(arreglo[i-1])>9) {
                    entero=false;
                }
                
            }
        }
        if(entero==false && error==false) {
            CrearLabel(Palabra, "decimal");
        }else if(entero==true && error==false){
            CrearLabel(Palabra, "Entero");
        }
    }
    
    public void LimpiarArreglo(){
        if (inicio!=0) {
            for (int i = 0; i < muestra.length; i++) {
                for (int j = 0; j < 2; j++) {
                    
                    PaneMuestra.remove(muestra[i][j]);
                }
            }
        }
        ScrollMuestra.repaint();
    }
    
    public void CrearLabel(String Palabra, String tipo){
        for (Tipo t:Tipo.values()){
            if (t.getClasificacion().equalsIgnoreCase(tipo)) {
                muestra[contador][0].setText(t.getClasificacion());
            }
        }
        muestra[contador][0].setBounds(15, posY, 72, 25);
        muestra[contador][1].setBounds(90, posY, 75, 25);
        muestra[contador][1].setText(Palabra);
        PaneMuestra.add(muestra[contador][0]);
        PaneMuestra.add(muestra[contador][1]);
        contador++;
        posY+=25;
    }
    
    public void Escribirsimbolos(char simbo){
        simbolos[0][0].setText(Tipo.SYMBOLO.getClasificacion());
        simbolos[0][1].setText(""+simbo);
    }
    
        
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Historial;
    private javax.swing.JPanel PaneMuestra;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JScrollPane ScrollMuestra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem regresar;
    // End of variables declaration//GEN-END:variables
}
