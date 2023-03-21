import java.util.Scanner;


public class Reto2 {
    public static void main(String[] args) {
        String palabra;
        int deIzquierda=0;
        int deDerecha;
        char [] palabraPalindromo;

        
     Scanner lectura = new Scanner(System.in);{

        

         System.out.println("digite la palabra");
         palabra = lectura.next();

         
         palabra = palabra.toLowerCase();
         palabraPalindromo=palabra.toCharArray();


         
         deDerecha=palabraPalindromo.length -1;


         
         while(deIzquierda< deDerecha){
            if(palabraPalindromo[deIzquierda] == palabraPalindromo[deDerecha]){
            
          deDerecha --; deIzquierda ++;
            }
            
             
            
            else{
                System.out.println(" la palabra que digito no es un palindromo es normal");
                break;
            }



         }
         if(deIzquierda ==deDerecha){
            System.out.println(" la palabra que digito "+palabra+" si es un palindrama");
         }



       lectura.close();
    }
}  
 }
    


