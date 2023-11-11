package Prova01;

import java.util.Scanner;

public class Carro {
    private float custoF;
    public float getCustoF(){
        return this.custoF;
    }
    public void setCustF(float novoCustoF){
        this.custoF=novoCustoF;
    }

    public void custoFinal(){
        float tcusto=this.getCustoF();
        float ificms(tcusto*(45.0f/100.0f));
        float lucrofabrica=(tcusto*(12.0f/100.0f));
        float valorTotal=((tcusto)+(ificms)+(lucrofabrica));
        System.out.printf("%.2f", valorTotal);
    }

    public static void main(String[] args){
        Carro carro01=new Carro();
        Scanner ler=new Scanner(System.in);
        float C=ler.nextFloat();
        carro01.setCustF(C);
        carro01.custoFinal();
    }
}
