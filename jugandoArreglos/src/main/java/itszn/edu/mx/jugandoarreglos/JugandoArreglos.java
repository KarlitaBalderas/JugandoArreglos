/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package itszn.edu.mx.jugandoarreglos;
import java.util.Arrays;

/**
/*probando el webhook
 *
 * @author Karla Balderas
 */
public class JugandoArreglos {

    public static void main(String[] args) {
        OperacionesArreglos op=new OperacionesArreglos();
        
        float[] pesos={12f, 45f, 3.5f};
        float sum=op.calcularSuma(pesos);
        System.out.println("La suma es "+sum);
    
        float promedio = op.calcularPromedio(pesos);
        System.out.println("El promedio es " + promedio);
        
        float limite = 10f;
        int excedentes = op.recorridoLimite(pesos, limite);
        System.out.println("Elementos que exceden " + limite + ": " + excedentes);
        
        float[] arregloEjemplo = {2f, 1f, 9f, 6f};
        float[] invertido = op.RecorridoInvertido(arregloEjemplo);
        System.out.println("Arreglo original: " + Arrays.toString(arregloEjemplo));
        System.out.println("Arreglo invertido: " + Arrays.toString(invertido));
        
        float[] numerosConNegativos = {2f, -3f, -4f, 5f};
        float[] absolutos = op. ArregloAbsoluto(numerosConNegativos);
        System.out.println("Arreglo original: " + Arrays.toString(numerosConNegativos));
        System.out.println("Valores absolutos: " + Arrays.toString(absolutos));
        
    }
   
}
