package Lista01;
/*
 * Enunciado
Crie uma classe chamada Salario, essa classe deverá ter:

Um atributo do tipo int.
Um atributo do tipo float.
Os métodos gets/sets.
Um método chamado imprimeSalario que calcule e imprima o total do seu salário no referido mês.
Dicas
Seu programa irá receber o quanto você ganha por hora e o número de horas trabalhadas no mês.

Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
16.75 30
Saída	
O total do salario eh: 502.50
Entrada	
55.05 50
Saída	
O total do salario eh: 2752.50
Resultado
 */

import java.util.Scanner;

public class Salario{
	private float num1;
	private int num2;
	
	public void setNum1(float novoNum1){
		this.num1=novoNum1;
	}
	public float getNum1(){
		return this.num1;
	}
	public void setNum2(int novoNum2){
		this.num2=novoNum2;
	}
	public int getNum2(){
		return this.num2;
	}
	
	public void imprimeSalario(){
		float temp1=this.getNum1();
		int temp2=this.getNum2();
		
		float resultado=(temp1)*(temp2);
		
		System.out.printf("O total do salario eh: %.2f", resultado);
	}
	
	public static void main(String[] args){
		Salario num = new Salario();
		Scanner ler = new Scanner(System.in);
		
		float temp1=ler.nextFloat();
		int temp2=ler.nextInt();
		
		num.setNum1(temp1);
		num.setNum2(temp2);
		
		num.imprimeSalario();
        ler.close();
	}
}
