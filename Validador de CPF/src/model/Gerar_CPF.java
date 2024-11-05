/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author alunos
 */
public class Gerar_CPF {
    public static void funci(){
    
    Random ale = new Random();
    int[] mat1 = new int[11];
    for (int x=0;x<=8;x++){
    mat1[x] = ale.nextInt(9);
        
    }
     int n11,n12;
       int[] conta = new int[11];
       int soma = 0;
       
       for(int x=0;x<=8;x++){
       conta[x]=(10-x)*mat1[x];
       soma+=conta[x];
       }
       int res = soma%11;
       if(res<2){
           mat1[9]=0;
       }
       else{
      mat1[9]=11-(soma%11);
       }
       soma=0;
        
       for(int x=0;x<=9;x++){
     
       conta[x]=(11-x)*mat1[x];
       soma+=conta[x];
       }
       res = soma%11;
       if(res<2){
          mat1[10]=0;
       }
       else{
       mat1[10]=11-res;
       }
       String cpf="";
       for(int x =0;x<=10;x++){
       cpf+=Integer.toString(mat1[x]);
       }
       view.Tela1_GUI.Gerar_text.setText(cpf);
    
    }
}
