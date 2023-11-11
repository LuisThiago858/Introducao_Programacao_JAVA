package exercicios_01;
import java.util.Scanner;
public class MainCalculo {
    public static void main(String[] args){
        System.out.println("O programa de calculo foi inicializado!!");
        Calculo calc=new Calculo();
        Scanner ler=new Scanner(System.in);
        float dado=ler.nextFloat();
        calc.conversorDeCelsiusFarenheit(dado);
        ler.close();
    }
}
