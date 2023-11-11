/*
 * Enunciado
Valor de E
 

Crie uma classe com dois atibutos um do tipo inteiro e outro do tipo float.
Seu programa deverá descobrir o valor de E por meio do valor N que o usuário informar.
Sabemos que a fórmula para achar o valor de E é:

E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + ... + 1 / N!

Dicas
É obrigatório o uso do comando for.
A impressão deve ser feita com oito casas decimais.
Exemplos de Entrada e Saída
Entrada	
1
Saída	
Valor de E: 2.00000000
Entrada	
4
Saída	
Valor de E: 2.70833349
 */
package Lista07;

import java.util.Scanner;

public class ValorE {
    private int num;
	
	public int getNum(){
		return this.num;
	}
	public void setNum(int novoNum){
		this.num=novoNum;
	}
	
	public void valorE(){
		int tempN=this.getNum();
		float e=1.0f;
		float termo=1.0f;
		int fatorial=1;
		for(int i=1; i<=tempN; i++){
			fatorial*=i;
			termo=(float)(1.0f/fatorial);
			e+=termo;
		}
		System.out.printf("Valor de E: %.8f\n", e);
	}
	public static void main(String[] args){
		ValorE num = new ValorE();
		Scanner ler = new Scanner(System.in);
		
		int temp1=ler.nextInt();
		num.setNum(temp1);
		num.valorE();
	}
}
