/*
 * Enunciado
Brincando com loops v2
Crie uma classe que deverá ter dois atributos.
Seu programa deverá ler dois números inteiros e imprimir todos os números positivos existentes entre eles.
Dicas
É obrigatório o uso do comando for.
O usuário pode digitar os dois números inteiros positivos quaisquer, mas se ele digitar primeiro o maior, a impressão deve ser do maior para o menor, se ele digitar o menor primeiro, a impressão deve ser do menor para o maior
Exemplos de Entrada e Saída
Entrada	
1 3
Saída	
1 2 3
 */

package Lista07;

import java.util.Scanner;

public class Intervalo2 {
    private int pInter;
	private int sInter;
	
	public int getP(){
		return this.pInter;
	}
	public int getS(){
		return this.sInter;
	}
	
	public void setP(int novoP){
		this.pInter=novoP;
	}
	public void setS(int novoS){
		this.sInter=novoS;
	}
	
	public void qualIntervalo(){
		int num1=this.getP();
		int num2=this.getS();
		
		if(num1<num2){
			for(int i=num1; i<=num2; i++){
				System.out.print(i+" ");
			}
		}else if(num1>num2){
			for(int j=num1; j>=num2; j--){
				System.out.print(j+" ");
			}
		}
	}
	public static void main(String[] args){
		Intervalo2 num = new Intervalo2();
		Scanner ler = new Scanner(System.in);
		
		int temp1=ler.nextInt();
		int temp2=ler.nextInt();
		
		num.setP(temp1);
		num.setS(temp2);
		
		num.qualIntervalo();
	}
}
