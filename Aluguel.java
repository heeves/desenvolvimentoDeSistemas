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
public class Aluguel {
    private Filme filme;
    private int diasAlugada;

    public Aluguel(Filme filme, int diasAlugada) {
        this.filme = filme;
        this.diasAlugada = diasAlugada;
    }
    public Filme getFilme() {
        return filme;
    }
    public int getDiasAlugada() {
        return diasAlugada;
    }
}

 


