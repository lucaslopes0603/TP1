import java.util.Scanner;
public class Palindromo{
    public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
String palindromo = "";
do{
 palindromo = scanner.nextLine();
if(!verificapalindromo(palindromo)){
    System.out.println("NAO");
}else{
    System.out.println("SIM");
}

}while(!verificafim(palindromo));



scanner.close();



    }
    public static boolean verificafim(String palindromo){
        boolean fim = false;
        if(palindromo.length() == 3 && palindromo.charAt(0) == 'F' && palindromo.charAt(1) == 'I' && palindromo.charAt(2) == 'M'){
            fim = true;
        }
        return fim;
    }
    public static boolean verificapalindromo(String palindromo){
        boolean resultado = true; 
        int j = palindromo.length() - 1; 
        int i = 0; 
        while (i < j) {
            if (palindromo.charAt(i) != palindromo.charAt(j)) {
                resultado = false; 
                break; 
            }
            i++;
            j--;
        }
        return resultado;
    }
    
    } 


