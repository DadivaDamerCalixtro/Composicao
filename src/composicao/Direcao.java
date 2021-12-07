/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author IFSC
 */
public class Direcao {
    private String Cor;

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }
    
    public Direcao(){
        Cor = "Amarelo";
    }
    public Direcao (String Cor){
        Cor = Cor;
    }

}
