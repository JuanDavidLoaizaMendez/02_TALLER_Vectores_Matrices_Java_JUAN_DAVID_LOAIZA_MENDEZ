import java.util.Scanner;


public class Reto1 {
    public static void main(String[] args) {
        int repeticiones=4;
        int i;
        int vida=4;
        String palabraescondida="vida";
        Scanner lectura = new Scanner(System.in);

        String[] palabra = new String[] { "v","i","d","a" };
        String[] letrasSeparadas = new String[4];
       
        for (i = 0; i < repeticiones; i++) {
            System.out.println("por favor digite la letra ");
            System.out.println("tienes  " + vida + " vidas");
            letrasSeparadas[i]=lectura.next();

            if(letrasSeparadas[i].equals(palabra[0])){
    
            }else if(letrasSeparadas[i].equals(palabra[1])){
                
              } else if(letrasSeparadas[i].equals(palabra[2])){
                
                } else if(letrasSeparadas[i].equals(palabra[3])){
                
                   }
            
          
            
            else if (letrasSeparadas[i].equals(palabraescondida)){
                System.out.println("excelente descubriste la palabra oculta que es "+palabraescondida);

        System.out.println(palabra[0]);

        System.out.println(palabra[1]);

        System.out.println(palabra[2]);

        System.out.println(palabra[3]);break;

                
            }
            else if(vida==0){

                vida=repeticiones;
                
                break;
            }
            else if(letrasSeparadas[i]!=palabra[i]){
                System.out.println("no has asertado pierdes un vida "+ (vida --));
            }
        }
    
        System.out.println("muchas gracias por jugar :)");
       
       lectura.close(); 
    } 
}
     
