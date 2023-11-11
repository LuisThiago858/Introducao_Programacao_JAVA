package exercicios_01;
import java.util.Scanner;
public class MainMedia {
    public static void main(String[] args){
        Media notasAluno=new Media();
        Scanner ler=new Scanner(System.in);
        notasAluno.calculoMedia(0, 0, 0, 0);
        ler.close();
    }
}
