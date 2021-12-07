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
public class Composicao {
  public static void main(String[] args){
      //primeira forma
      Automovel uno = new Automovel();
      Automovel golf = new Automovel(2000);
      
      //segunda forma
      Automovel carro = new Automovel();
      carro.ligarPelaPrimeiraVez();
      carro.ligarPelaPrimeiraVez(1600);
      
      //terceira forma
      Automovel carro2 = new Automovel();
      Motor motor = new Motor();
      Motor motor2 = new Motor(1600);
      
  }  
  
}
