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
public class FilmesWEB {

       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Filme eraGelo= new Filme("Era do Gelo", Filme.Tipo.infantil);
       System.out.println(eraGelo.getTitulo());
        
        
    }
    
}
