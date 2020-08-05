/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazinteractiva2;

import clases.usuario.PreguntaInter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Asus VivoBook
 */
public class ventana2 extends javax.swing.JDialog {
     List<PreguntaInter> lista = new ArrayList<>();
    private  List<JButton> botones;
    private int indice;
    private int contador;

    /**
     * Creates new form ventana2
     */
  
    public ventana2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
         initComponents();
              botones = new ArrayList<>();
              indice=0;
              
              contador=0;
              
              PreguntaInter p1 = new PreguntaInter (1,"¿Crees que es bueno tener de amigo una sola mano?","ruta",true,true,"Este es Kiko. A su lado esta el amigo de kiko: la mano. 'Pero ¿de que serviria tener una sola mano como amigo?'. Pregunta kiko. 'Pronto lo descubriras', responde la mano","Si, seria bueno","No, no lo estaria");
                                        //numero, descripcion,ruta_imagen,resultados,historia,respuestas 
              PreguntaInter p2 = new PreguntaInter (2,"¿Te gustaria volar?","D://interfaz/volar.jpg",true,true,"'¡Hola mano! Quiero volar, pero no tengo alas', dice Kiko","Claro,¡Me encantaria!","No, me da miedo");
              PreguntaInter p3 = new PreguntaInter (3,"¿Como crees tu que suena el avion?","D://interfaz/volando.jpg",true,true,"'De acuerdo, Kiko', dice la mano. 'Yo sere tu avion. Puedes embarcar ahora, porque despego ya.' SSSSSSS, suena el avion","SSSSSS, asi suena el avion","No lo sé");
              PreguntaInter p4 = new PreguntaInter (4,"¿Te gusta bailar?","D://interfaz/piano.jpg",true,true,"“¡Hola, mano! Mis piernas quieren bailar pero no\n" +
"tengo música”, dice Kiko.\n" +
"“De acuerdo, Kiko”, dice la mano.\n" +
"“Seré tu músico. Tengo un piano y mis dedos\n" +
"saben cómo hacer cantar a las teclas.”\n" +
"PLING, PLONG, PLING, suena el piano.","¡Si!, me encanta","No, no se bailar :(");
              PreguntaInter p5 = new PreguntaInter (5,"A ti, ¿Te gustan los dulces?","D://interfaz/comida.jpg",true,true,"“¡Hola mano!, Quiero comer algo rico,\n" +
"pero no sé qué”, dice Kiko. “De acuerdo, Kiko”, dice la mano. “¿Quieres una tarta\n" +
"de manzana, de chocolate, de regaliz o de plátano?”\n" +
"“¡Quiero una tarta de manzana, chocolate, regaliz y \n" +
"plátano!”, grita Kiko.\n","Si, ¡Me encanta!","No los como mucho");
              PreguntaInter p6 = new PreguntaInter (6,"¿Tienes amigos de juegos?","D://interfaz/cabeza.jpg",true,true,"“¡Hola, mano! Quiero jugar al corre que te\n" +
"pillo, pero no puedo jugar solo”, dice Kiko.\n" +
"“De acuerdo, Kiko. Seré tu compañero\n" +
"de juegos”, dice la mano.","Si","No");
              PreguntaInter p7 = new PreguntaInter (7,"¿Esta bien lo que hace la mano?","D://interfaz/cabeza.jpg",true,true,"“¿Puedo tocarte el pelo?”,\n" +
"pregunta la mano.\n" +
"“Sí, claro que puedes”, dice Kiko.","Si, solo estan jugando","no me parece bien");
              PreguntaInter p8= new PreguntaInter (8,"Que opinas de esto, ¿esta bien?","D://interfaz/nariz.jpg",true,true,"“¿Puedo tocarte la nariz?”, pregunta la mano.\n" +
"“Sí, claro”, dice Kiko.","Si, lo está","No, no me gusta que me toquen");
              PreguntaInter p9 = new PreguntaInter(9 , "¿Podria un amigo tuyo tocarte la mano?"  , "D://interfaz/mano.jpg", true, true, "“¿Puedo tocarte la mano?”,\n" +
"pregunta la mano.\n" +
"“Sí, claro”, dice Kiko", "Si, no veo nada mal en eso", "No, eso es raro");
              PreguntaInter p10 = new PreguntaInter(10 ,"¿Esta bien lo que la mano quiso hacer?", "D://interfaz/no.jpg", true, true, "“Y, ¿puedo tocarte dentro de tu ropa interior?”,\n" +
"pregunta la mano.\n" +
"“¡NO!”, grita Kiko.\n" +
" “¡ESO SÍ QUE NO!”", "No, ¡No lo está!", "Si, me parece bien");
              PreguntaInter p11 = new PreguntaInter(11 , "Analiza y responde, ¿Crees que esta bien lo que hizo Kiko?", "D://interfaz/bien.jpg", true, true, "“Muy bien, Kiko”, dice la mano.\n" +
"“Nadie puede tocarte dentro de tu ropa interior.\n" +
"Esa es la “Regla de Kiko”.\n" +
"Y si una persona lo hace, cuéntaselo a alguien.\n" +
"No lo mantengas en secreto.”", "Si, esta bien, nadie tiene derecho a tocarte tus partes intimas", "No, Kiko es un exagerado");
              PreguntaInter p12 = new PreguntaInter(12 , "¿Te gusto la historia de Kiko y la mano?", "D://interfaz/final.jpg", true, true, "“¡Hola, mano! Quiero viajar al país de los sueños,\n" +
"pero no sé cómo llegar allí”, dice Kiko.\n" +
"“De acuerdo, Kiko. Te enseñaré el camino,” dice la mano\n" +
"“Túmbate en la cama, cierra los ojos y llegarás allí tú solo.”", "Si, me encanto y me sirvio de mucho", "No, estuvo aburrida");
              
              lista.add(p1);
              lista.add(p2);
              lista.add(p3);
              lista.add(p4);
              lista.add(p5);
              lista.add(p6);
              lista.add(p7);
              lista.add(p8);
              lista.add(p9);
              lista.add(p10);
              lista.add(p11);
              lista.add(p12);
              
              
              
              jLabel1.setText(lista.get(contador).getHistoria() );
              jLabel3.setText(lista.get(contador).getPregunta() );
              jRadioButton1.setEnabled(lista.get(contador).isOp1());
              jRadioButton1.setText(lista.get(contador).getTextoop1());
              jRadioButton2.setEnabled(lista.get(contador).isOp2());
              jRadioButton2.setText(lista.get(contador).getTextoop2());
              

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuenoMalo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("ESTE ES KIKO.\nY A SU LADO EL AMIGO DE KIKO: LA MANO\n\"PERO, ¿DE QUE SIRVE TENER UNA SOLA MANO COMO AMIGA?\",\nPREGUNTA KIKO.\n\"PRONTO LO DESCUBRIRAS\", RESPONDE LA MANO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/segundaImagen.jpg"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 102, 51));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ES BUENO TENER UNA MANO DE AMIGA, ¿QUE RESPONDERIAS TU?");

        jRadioButton1.setBackground(new java.awt.Color(255, 102, 51));
        BuenoMalo.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jRadioButton1.setText("SI, ES MUY BUENO");

        jRadioButton2.setBackground(new java.awt.Color(255, 102, 51));
        BuenoMalo.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jRadioButton2.setText("NO, NO LO ES");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jButton1.setText("SIGUIENTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         contador++;
         jLabel3.setText(lista.get(contador).getPregunta() );
         jLabel1.setText(lista.get(contador).getHistoria() );
         jRadioButton1.setText(lista.get(contador).getTextoop1());
         jRadioButton2.setText(lista.get(contador).getTextoop2());
         String a = lista.get(contador).getRuta();
         jLabel2.setIcon(new ImageIcon(a));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventana2 dialog = new ventana2(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BuenoMalo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
