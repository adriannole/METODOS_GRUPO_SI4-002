
package ejercicio10metodos;


public class Ejercicio10Metodos {

    
    public static void main(String[] args) {
        int bits = 0xBF400000;
        float value = Float.intBitsToFloat(bits);
        System.out.println(value);
    }   
}
