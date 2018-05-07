package fes.aragon.unam;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Pewalty
 */
public class NumALetras {
	public static void main(String Arg[ ]) throws IOException{
	mem numero;
                
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int num;
	String res;
        System.out.print("Ingrese numero : ");
        num = Integer.parseInt(in.readLine( ));
		numero = new mem(num);
		res = numero.convertirLetras(num);
		System.out.print(res);
		System.out.println("\n");
        System.out.print("Ingrese nombre de numero : ");
        
        int resu;
        mem2 numeros;
        Scanner reader = new Scanner(System.in);
                String nuum = reader.next();
                numeros = new mem2(nuum);
                resu = numeros.convertirNum(nuum);
                System.out.println(resu);
                
	}
        
        
          
	
    }
