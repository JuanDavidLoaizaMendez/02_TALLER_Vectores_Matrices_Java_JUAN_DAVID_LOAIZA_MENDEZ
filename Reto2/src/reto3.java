import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        String maquina[][] = new String[4][4];
                            
    
    
    System.out.println("maquina expendedora\n");

    System.out.println("coloque separado el nombre del producto que va a agregar y el precio ");
   
     for (int Fila = 0; Fila < 4; Fila++) {
                
            for (int Columna = 0; Columna < 4; Columna++) {

                
                System.out.println("Digite El nombre del producto y el Precio Del Producto seguido");
                maquina[Fila][Columna] = lectura.next();

            }

        }
       
      
        for (int fila1 = 0; fila1 < 4; fila1++) {

            System.out.println(" _____________");

            System.out.print("|");

            for (int columna1 = 0; columna1 < 4; columna1++) {

                System.out.print(fila1+""+columna1+" "+maquina[fila1][columna1]);
                
                if (columna1 != maquina[fila1].length - 1)System.out.print("\t");      
            }

            System.out.println(" | ");

            System.out.println( " ______________");

        }
        System.out.print("|");

        System.out.println( " ______________");
        lectura.close();
    }
}