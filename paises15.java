import java.util.Scanner;
public class paises15 {
public static void main(String[] args){
Scanner entrada = new Scanner (System.in);
String[] paisesDistintos = new String[15];

for (int indice = 0; indice < paisesDistintos.length; indice++){
    System.out.println((indice + 1) +"-"+ " Digite 15 paises distintos" + ": " );
    String pais = entrada.nextLine();
    paisesDistintos[indice] = pais;
    System.out.println("El pais introducido es " + paisesDistintos[indice]);
}
}
}