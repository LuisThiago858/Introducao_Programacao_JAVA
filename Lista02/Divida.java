package Lista02;
/*
 * Enunciado
Crie uma classe chamada Divida, essa classe deverá ter:

Um atributos do tipo int.
Dois atributos do tipo float.
Os métodos gets/sets.
Um método chamado imprimeDividaAtual que imprime o valor da divida atual.
 

Dicas
Faça um programa que calcule o valor a ser pago por uma dívida em atraso. Seu programa deve ler do teclado o valor original da dívida, a quantidade de dias em atraso e o valor da multa diária.

Use o método System.out.printf() para executar a impressão.

Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
4.25
120
0.55
Saída	
O valor da sua divida atual eh: 70.25
Entrada	
754.65
240
0.96
Saída	
O valor da sua divida atual eh: 985.05
Entrada	
2549.79
120
2.26
Saída	
O valor da sua divida atual eh: 2820.99
Resultado
 */
import java.util.Scanner;

public class Divida{
	
	private float valorDivida;
	private int diasAtraso;
	private float multaAtraso;
	
	public void setValorDivida(float novoValorDivida){
		this.valorDivida=novoValorDivida;
	}
	public float getValorDivida(){
		return this.valorDivida;
	}
	
	public void setDiasAtraso(int novoDiasAtraso){
		this.diasAtraso=novoDiasAtraso;
	}
	public int getDiasAtraso(){
		return this.diasAtraso;
	}
	
	public void setMultaAtraso(float novoMultaAtraso){
		this.multaAtraso=novoMultaAtraso;
	}
	public float getMultaAtraso(){
		return this.multaAtraso;
	}
	
	public void imprimeDividaAtual(){
		float valorDivida=this.getValorDivida();
		int dias=this.getDiasAtraso();
		float multaDiaria=this.getMultaAtraso();
		
		float novaDivida=(float)((dias*multaDiaria)+valorDivida);
		System.out.printf("O valor da sua divida atual eh: %.2f\n", novaDivida);
	}
	
	
	public static void main(String[] args){
		Divida num=new Divida();
		Scanner ler=new Scanner(System.in);
		
		float temp4=ler.nextFloat();
		int temp5=ler.nextInt();
		float temp6=ler.nextFloat();
		
		num.setValorDivida(temp4);
		num.setDiasAtraso(temp5);
		num.setMultaAtraso(temp6);
		
		num.imprimeDividaAtual();

        ler.close();
		
	}
}
