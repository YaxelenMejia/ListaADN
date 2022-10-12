import java.util.Scanner;
public class MainADN
{
    public static void main(String [] args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dame una secuencia de ADN: ");
        String adnString = (teclado.nextLine()).toUpperCase();
        System.out.println("One by one ");
        for(int i=0; i<adnString.length(); i++){
            System.out.print(adnString.charAt(i));
            System.out.print(adnString.charAt(i));
        }
        System.out.println("");
       
    }
}
