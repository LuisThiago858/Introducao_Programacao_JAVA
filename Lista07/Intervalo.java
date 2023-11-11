/*
 * Enunciado
Brincando com loops

Crie uma classe que contém somente um atributo.
Seu programa deve ler um número inteiro positivo e imprimir todos os números inteiros entre 0 e o número lido.
Dicas
É obrigatório o uso do comando for.
Exemplos de Entrada e Saída
Entrada	
1
Saída	
0 1
Entrada	
3
Saída	
0 1 2 3
 */
package Lista07;

import java.util.Scanner;

public class Intervalo {
    private int positivo;

	public int getPositivo(){
		return this.positivo;
	}
	public void setPositivo(int novoPositivo){
		this.positivo=novoPositivo;
	}
	
	public void intervalo(){
		int tempPositivo=this.getPositivo();
		
		for(int i=0; i<=tempPositivo; i++){
			System.out.print(i+" ");
			
		}
	}
	public static void main(String[] args){
		Intervalo pos=new Intervalo();
		Scanner ler=new Scanner(System.in);
		
		int num=ler.nextInt();
		pos.setPositivo(num);
		pos.intervalo();
	}
}
