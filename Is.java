    import java.util.Scanner;
    public class Is {
        public static void main(String args[]){
    Scanner scr = new Scanner(System.in);
    String str = "";
    do{str = scr.nextLine();
        System.out.print(verifica_vogal(str) + " ");
        System.out.print(verifica_consoante(str)+ " ");
        System.out.print(verificar_inteiro(str)+ " ");
        System.out.println(verifica_double(str));

    }while(!verificafim(str)); 
        }
        

        public static boolean verificafim(String str){
            boolean fim = false;
            if(str.length() == 3 && str.charAt(0) == 'F' && str.charAt(1) == 'I' && str.charAt(2) == 'M'){
                fim = true;
            }
        return fim;}
        
        public static String verifica_vogal(String str){
            String resposta = "";
            int a = 0;
            for(int i = 0;i<str.length();i++ ){
                if( str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e' || str.charAt(i) == 'I'|| str.charAt(i) == 'i'|| str.charAt(i) == 'O'|| str.charAt(i) == 'o'|| str.charAt(i) == 'U'|| str.charAt(i) == 'u' ){
    a++;
                }
            }
            if(a == str.length()){
                resposta = "SIM";
            }else{
                resposta = "NAO";
            }
                return resposta;
        }
        public static String verifica_consoante(String str){
            str = str.replace(',', '.');
            String resposta = "";
            int a = 0;
            for(int i = 0;i<str.length();i++ ){
                if( str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e' || str.charAt(i) == 'I'|| str.charAt(i) == 'i'|| str.charAt(i) == 'O'|| str.charAt(i) == 'o'|| str.charAt(i) == 'U'|| str.charAt(i) == 'u' ){
        a++;
                }
            }
            if(a == 0){
                resposta = "SIM";
            }else{
                resposta = "NAO";
            }
            try {
                Integer.parseInt(str);
                resposta = "NAO";
            } catch (NumberFormatException e) {
                resposta = resposta;
            }
        
            try {
                    Double.parseDouble(str);
                    resposta = "NAO";
                } catch (NumberFormatException e) {
                    resposta = resposta;
                }
                return resposta;
                
        }
        
        public static String verificar_inteiro(String str) {
            String resposta = "";
            try {
                Integer.parseInt(str);
                resposta = "SIM";
            } catch (NumberFormatException e) {
                resposta = "NAO";
            }
            return resposta;
        }
        public static String verifica_double(String str) {
            str = str.replace(',', '.');
            String resposta = "";
            try {
                Double.parseDouble(str);
                resposta = "SIM";
            } catch (NumberFormatException e) {
                resposta = "NAO";
            }
            try {
                Integer.parseInt(str);
                resposta = "NAO";
            } catch (NumberFormatException e) {
                resposta = resposta;
            }
            return resposta;
        }
    }



