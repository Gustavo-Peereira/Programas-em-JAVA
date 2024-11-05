/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author alunos
 */
public class Val_CPF {
  public static void funci(){
 /*pegando o cpf da caixa de texto*/
 String cpf1 = view.Tela1_GUI.val_box.getText();

        
        // Obtendo o tamanho da string
       
        if ( cpf1.length()==11){
         // Criando um array de inteiros com o mesmo tamanho da string
        int[] arrayInt = new int[11];
        
        // Convertendo cada caractere da string em um inteiro e armazenando no array
        for (int i = 0; i < 11; i++) {
            arrayInt[i] = Character.getNumericValue(cpf1.charAt(i));
        }
        
       int n11,n12;
       int[] conta = new int[11];
       int soma = 0;
       
       for(int x=0;x<=8;x++){
       conta[x]=(10-x)*arrayInt[x];
       soma+=conta[x];
       }
       int res = soma%11;
       if(res<2){
           n11=0;
       }
       else{
       n11=11-(soma%11);
       }
       soma=0;
        
       for(int x=0;x<=9;x++){
     
       conta[x]=(11-x)*arrayInt[x];
       soma+=conta[x];
       }
       res = soma%11;
       if(res<2){
           n12=0;
       }
       else{
       n12=11-res;
       }
       
       if(n11==arrayInt[9]&& n12==arrayInt[10]){
       view.Tela1_GUI.Val_text.setText("CPF valido");      
       }
       else{
       view.Tela1_GUI.Val_text.setText("CPF invalido");
       }
        }
        else{
            JOptionPane.showMessageDialog(null,"Quantidade de caracteres invalidos","ERRO",0);
            view.Tela1_GUI.val_box.setText("");
       
       
 
  }
  }
}
