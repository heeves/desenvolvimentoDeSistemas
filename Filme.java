/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmesweb;

/**
 *
 * @author Ana
 */
public class Filme {

    Filme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public enum Tipo {
        normal, lancamento, infantil
    };
    private String titulo;
    private Tipo codigoDePreço;
    public Filme(String titulo, Tipo codigoDePreço) {
        this.titulo = titulo;
        this.codigoDePreço = codigoDePreço;
    }
    public String getTitulo() {
        return titulo;
    }
    public Tipo getCodigoDePreço() {
        return codigoDePreço;
    }
    public void setCodigoDePreço(Tipo codigoDePreço) {
        this.codigoDePreço = codigoDePreço;
    }   
}

