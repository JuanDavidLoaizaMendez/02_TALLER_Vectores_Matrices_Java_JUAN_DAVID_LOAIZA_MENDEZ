import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);

        String[][] calculadora1 = new String[8][6];
        calculadora1[0] = new String [] {" _" ,"_" , "_" ,"_","_"};
        calculadora1[1] = new String [] {"|_","_","_","_","_|"};
        calculadora1[2] = new String [] {"|AC","()","%","/|"};
        calculadora1[3] = new String [] {"| 7", "8" , "9" ," X|"};
        calculadora1[4] = new String [] {"| 4", "5" , "6" ," -|"};
        calculadora1[5] = new String [] {"| 1", "2" , "3" ," +|"};
        calculadora1[6] = new String [] {"| 0", "." , "<x" ,"=|"};
        calculadora1[7] = new String [] {" =", "=" , "=" ,"=","="};

 System.out.print("\t");
System.out.println("Calculadora de celular ");

        for(int i=0; i < calculadora1.length; i++) {
            
            for(int j=0; j < calculadora1[i].length; j++) {
                
                System.out.print(" "+calculadora1[i][j] +"");
            }
            System.out.println();
        }


        System.out.println("Gracias por usar la calculadora");
        lectura.close();


        
    

    }
}