package Prova01;
import java.util.Scanner;
public class QuitarDividas {
    private float valorDivida;
    private int diasAtraso;
    private float multaD;

    public float getValorDivida(){
        return this.valorDivida;
    }
    public void setValorDivida(float novoValorDivida){
        this.valorDivida=novoValorDivida;
    }
    public int getDiasAtraso(){
        return this.diasAtraso;
    }
    public void setDiasAtraso(int novoDiasAtraso){
        this.diasAtraso=novoDiasAtraso;
    }
    public float getMultaD(){
        return this.multaD;
    }
    public void setMultaD(float novaMultaD){
        this.multaD=novaMultaD;
    }

    public void mostrarDividaAtual(){
        float tempValorDivida=this.getValorDivida();
        int tempDias=this.getDiasAtraso();
        float tempMulta=this.getMultaD();

        float novaDivida=(float)(tempDias*tempMulta)+tempValorDivida;
        System.out.printf("O valor da sua divida atual eh: %.2f", novaDivida);
    }

    public static void main(String[] args){
        QuitarDividas divida=new QuitarDividas();
        Scanner ler = new Scanner(System.in);

        float tempValorD=ler.nextFloat();
        int tempDiasAtraso=ler.nextInt();
        float tempMultaD=ler.nextFloat();

        divida.setValorDivida(tempValorD);
        divida.setDiasAtraso(tempDiasAtraso);
        divida.setMultaD(tempMultaD);

        divida.mostrarDividaAtual();

    }

}
