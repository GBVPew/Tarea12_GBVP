
package fes.aragon.unam;
/**
 *
 * @author Pewalty
 */
public class mem2 {
                private int flag;
	public String numero;
	public int num;
                public int num_simb;
	
        
        public mem2(String n){
              
        }
      private int unidad(String numero){
          switch(numero){
              case "cero":
                  num =  0;
                  break;
              case "uno":
                  num = 1;
                  break;
              case "dos":
                  num = 2;
                  break;
              case "tres":
                  num=3;
                  break;
              case "cuatro":
                  num=4;
                  break;
              case"cinco":
                  num=5;
                  break;
              case "seis":
                  num=6;
                  break;
              case "siete":
                  num = 7;
                  break;
              case "ocho":
                  num = 8;
                  break;
              case "nueve":
                  num = 9;
                  break;
        
               case "diez":
                   num = 10;
                   break;
               case "once":
                   num = 11;
                   break;
               case "doce":
                   num = 12;
                   break;
               case "trece":
                num = 13;
                break; 
               case "catorce":
                   num = 14;
                   break;
               case "quince":
                   num = 15;
                   break;
                case "dieciseis":
                    num = 16;
                    break;
                case "diecisiete":
                    num= 17;
                    break;
                case "dieciocho":
                    num=18;
                    break;
                case "diecinueve":
                    num = 19;
                    break;
               case "veinte":
                   num = 20;
                   break;
               
            }//fin del switch
           return num_simb;
       }
      public int convertirNum(String numeros){
          num_simb = unidad(numeros);
		return num_simb;
      }
}
