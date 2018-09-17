/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author Alexandre Francisco
 */
public class Aula1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        
        double perimeter = returnPerimeter(2,2);
        System.out.println(perimeter);
        
        double volume = returnVolume(2,2,2);
        System.out.println(volume);
        
        double temperatura = returnTemperatura(40);
        System.out.println(temperatura);
        
        int seconds = returnSeconds(5,54,26);
        System.out.println(seconds);
        
        int[] numeros = {10, 3 ,4 , 2, 20};
        int max = returnMax(numeros);
        System.out.println(max);
        int min = returnMin(numeros);
        System.out.println(min);
        double med = returnMed(numeros);
        System.out.println(med);
        
    }
    
    private static double returnPerimeter(int al1, int al2) {
        return (al1 * 2) + (al2 * 2);    
    }

    private static double returnVolume(int c, int a, int l) {
        return (c*a*l);
    }

    private static double returnTemperatura(int farenheit) {
        return (farenheit-32)*5/9;
    }

    private static int returnSeconds(int hour, int minute, int second) {
        return (hour * 3600)+(minute *60)+ second;
    }

    private static int returnMax(int[] numeros) {
        int max = numeros[0];
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]>max){
                max=numeros[i];
            }
        }
        return max;
    }

    private static int returnMin(int[] numeros) {
        int min = numeros[0];
        for (int i=0; i<numeros.length; i++){
            if (numeros[i]<min){
                min=numeros[i];
            }
        }
        return min;
    }

    private static double returnMed(int[] numeros) {
        double soma=0;
        for (int i=0;i<numeros.length; i++){
            soma = soma +numeros[i];
        }
        double media = soma / numeros.length;
        return media;
    }
    
    
}
