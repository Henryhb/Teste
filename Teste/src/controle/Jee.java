/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.ModeloWeb;

/**
 *
 * @author 24105162014.5
 */
public class Jee {

    /**
     * @param args the command line arguments
     */
    public String mostrarNome(ModeloWeb model){
        String nome = model.getNome();
        return nome;
    }
    
}
