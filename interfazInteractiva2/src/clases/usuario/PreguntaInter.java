/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.usuario;

/**
 *
 * @author Asus VivoBook
 */
public class PreguntaInter {
    private int numero;
    private String pregunta;
    private String ruta;
    private boolean op1;
    private boolean op2;
    private String historia;
    private String textoop1;
    private String textoop2;

    public PreguntaInter(int numero, String pregunta, String ruta, boolean op1, boolean op2, String historia, String textoop1, String textoop2) {
        this.numero = numero;
        this.pregunta = pregunta;
        this.ruta = ruta;
        this.op1 = op1;
        this.op2 = op2;
        this.historia = historia;
        this.textoop1 = textoop1;
        this.textoop2 = textoop2;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public boolean isOp1() {
        return op1;
    }

    public void setOp1(boolean op1) {
        this.op1 = op1;
    }

    public boolean isOp2() {
        return op2;
    }

    public void setOp2(boolean op2) {
        this.op2 = op2;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getTextoop1() {
        return textoop1;
    }

    public void setTextoop1(String textoop1) {
        this.textoop1 = textoop1;
    }

    public String getTextoop2() {
        return textoop2;
    }

    public void setTextoop2(String textoop2) {
        this.textoop2 = textoop2;
    }

    
        
      
    
}