package exercicios_01;
import java.util.Scanner;
public class MainTriangulo {
    public static void main(String[] args){
        int temp;
        Triangulo triangulo=new Triangulo();
        Scanner ler1=new Scanner(System.in);
        System.out.println("Digite o lado A");
        temp=ler1.nextInt();
        triangulo.setNum1(temp);
        System.out.println("Digite o lado B");
        temp=ler1.nextInt();
        triangulo.setNum2(temp);
        System.out.println("Digite o lado C");
        temp=ler1.nextInt();
        triangulo.setNum3(temp);

        ler1.close();
    }
}
