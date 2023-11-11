package exercicios_02;
import java.util.Scanner;
public class MainMultas {
    public static void main(String[] args){
        SistemaDeMultas carro01=new SistemaDeMultas();
        Scanner ler=new Scanner(System.in);
        float VelMaxPista=ler.nextFloat();
        carro01.setVelMaxima(VelMaxPista);
        float VelAferPista=ler.nextFloat();
        carro01.setVelAferida(VelAferPista);

        carro01.sistemaDeMultas();

        ler.close();
    }
}
