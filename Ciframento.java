import java.util.Scanner;
public class Ciframento {
    public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
String str = "";
do{str = MyIO.readLine();
MyIO.println(""+ciframento(str));

}while(!verificafim(str));
scanner.close();


  }
  public static boolean verificafim(String str) {
    return str.length() == 3 && str.equals("FIM");
    }
public static String ciframento(String str){
    int chave = 3;
    String ciframento = "";
    int ola = 0;
    for(int i = 0;i<str.length();i++){
       ola = (int)str.charAt(i) + chave;
        ciframento += (char)ola;
    }
       return ciframento;
}
}


