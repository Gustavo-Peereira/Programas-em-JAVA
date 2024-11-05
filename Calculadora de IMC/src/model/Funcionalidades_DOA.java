/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;

/**
 *
 * @author alunos
 */
public class Funcionalidades_DOA {


public static void funci(){
 double peso =  Double.parseDouble(view.tela1_GUI.Peso_DOA.getText());
 double alt = Double.parseDouble(view.tela1_GUI.Altura_DOA.getText());
 double imc_DOA = peso/(alt*alt);
 

 DecimalFormat df = new DecimalFormat("0.00");
    String imcString = ("Imc: "+df.format(imc_DOA));


 if (imc_DOA<= 15.5 && imc_DOA<=18.5){
     view.tela1_GUI.IMC_TXT.setText(imcString );
   view.tela1_GUI.magro_IMG.setVisible(true);
 
 }
else if( imc_DOA<=24.9){
 view.tela1_GUI.IMC_TXT.setText(imcString);
 view.tela1_GUI.normal_IMG.setVisible(true);//
 }
else if( imc_DOA<=29.9){
 view.tela1_GUI.IMC_TXT.setText(imcString);
 view.tela1_GUI.acimaDoPeso.setVisible(true);//
 }
 
else if(imc_DOA<=39.9){
 view.tela1_GUI.IMC_TXT.setText(imcString);
   view.tela1_GUI.Obeso1_img.setVisible(true);
 }
 else if (imc_DOA>40 ){
view.tela1_GUI.IMC_TXT.setText(imcString);
 view.tela1_GUI.Obeso2_IMG.setVisible(true); 
 }

}


}
