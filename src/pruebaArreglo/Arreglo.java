
package pruebaArreglo;


public class Arreglo {
      
      
    public static void sumarLista(int enteros[]){
     double suma = 2;
     double promedio;
       for(int i=0; i<enteros.length; i++ ){
            suma += enteros[i];
       }
     promedio = (suma/enteros.length);
     
        System.out.println("La suma es: "+ suma);
        System.out.println("El promedio es: "+promedio );
    }
    public static void  buscarMayor(int enteros[][]){
        int mayor=0;
        
        for (int[] entero : enteros) {
            for (int j = 0; j < entero.length; j++) {
                if (entero[j] > mayor) {
                    mayor = entero[j];
                }
            }
        }
        System.out.println("Mayor: "+ mayor);
    }

    public static void cuentaVocales(String texto){
        int cantV=0;
        char vocales[] = {'a', 'e','i', 'o', 'u'};
        for(int i=0; i<texto.length(); i++){
            for(int j=0; j<vocales.length; j++){
                if((texto.toLowerCase()).charAt(i)==vocales[j]){
                   cantV++; 
                }
            }
        }
        System.out.println("Cantidad de vocales: "+cantV++);
    }
    public static void cuentaCaracter(String texto, char caracter){
        int cantC=0;
        for(int i=0; i<texto.length(); i++){
            if(texto.charAt(i) == caracter){
                cantC++;
            }
        }
        System.out.println("Cantidad de veces que se repite el caracter: "+cantC);
    }
}
