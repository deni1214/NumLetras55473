/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numletras55473;

/**
 *
 * @author Denilson
 */
import java.util.Scanner;
public class NumLetras55473 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = entrada.nextInt();

        String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] decena = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve", "veinte"};
        String[] decenas ={"veinti", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};

        if(num >= 0 && num <= 9){
            System.out.println(unidades[num]);
                    
        } else if(num >= 10 && num <= 20){
            System.out.println(decena[num - 10]);
                    
        } else if(num >= 21 && num <= 29){
            System.out.println(decenas[0] + unidades[num - 20]);
                    
        } else if(num >= 31 && num <= 39){
            System.out.println(decenas[1] + " y " + unidades[num - 30]);
                  
        } else if(num >= 41 && num <= 49){
            System.out.println(decenas[2] + " y " + unidades[num - 40]);
                    
        } else if(num >= 51 && num<= 59){
            System.out.println(decenas[3] + " y " + unidades[num - 50]);
                    
        } else if(num >= 61 && num <= 69){
            System.out.println(decenas[4] + " y " + unidades[num - 60]);
                    
        } else if(num >= 71 && num <= 79){
            System.out.println(decenas[5] + " y " + unidades[num - 70]);
                    
        } else if(num >= 81 && num <= 89){
            System.out.println(decenas[6] + " y " + unidades[num - 80]);
                    
        } else if(num >= 91 && num <= 99){
            System.out.println(decenas[7] + " y " + unidades[num - 90]);
                    
        }
            
        switch (num) {
                
            case 30:
                System.out.println(decenas[1]);
                break;
                
            case 40:
                System.out.println(decenas[2]);
                break;
                
            case 50:
                System.out.println(decenas[3]);
                break;
                    
            case 60:
                System.out.println(decenas[4]);
                break;
                    
            case 70:
                System.out.println(decenas[5]);
                break;
                    
            case 80:
                System.out.println(decenas[6]);
                break;
                    
            case 90:
                System.out.println(decenas[7]);
                default:
                    
        }
    } 
    
}
