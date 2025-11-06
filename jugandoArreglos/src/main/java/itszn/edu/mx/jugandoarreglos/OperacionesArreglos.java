/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itszn.edu.mx.jugandoarreglos;

/**
 *
 * @author Karla Balderas
 */
public class OperacionesArreglos {
    public float calcularSuma(float[] num){
        float suma = 0f;
        //Recorrer el arreglo
        for (int i = 0; i < num.length; i++){
            suma = suma + num[i];
        }
        return suma;
        }    
    
    public float calcularPromedio(float[] num) {
        float suma = 0f;
        for (int i = 0; i < num.length; i++) {
            suma = suma + num[i];
        }
        return suma / num.length;
    }
    public int recorridoLimite(float[] num, float limite) {
        int contador = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > limite) {
                contador++;
            }
        }
        return contador;
    }
     public float[] RecorridoInvertido(float[] num) {
        float[] invertido = new float[num.length];
        for (int i = 0; i < num.length; i++) {
            invertido[i] = num[num.length - 1 - i];
        }
        return invertido;
    }
     public float[] ArregloAbsoluto(float[] num) {
        float[] absolutos = new float[num.length];
        for (int i = 0; i < num.length; i++) {
            absolutos[i] = Math.abs(num[i]);
        }
        return absolutos;
    }
}

