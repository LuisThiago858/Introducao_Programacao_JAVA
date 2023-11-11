/*
 * Enunciado
Brincando com loops v3
Crie uma classe que deve ter apenas um atibuto do tipo inteiro.
Seu programa deve ler um número N e, ao final, escrever quantos estão entre 0 e 100, quantos estão entre 101 e 200 e quantos são maiores de 200, conforme mostrado nos exemplos de saídas.
Dicas
É obrigatório o uso do comando for.
Exemplos de Entrada e Saída
Entrada	
1
Saída	
Entre 0 e 100: 1
Entre 101 e 200: 0
Maior que 200: 0
Entrada	
120
Saída	
Entre 0 e 100: 99
Entre 101 e 200: 19
Maior que 200: 0
 */
package Lista07;

import java.util.Scanner;

public class Loops {
    private int numN;
	public void setNumN(int novoNumN){
		this.numN=novoNumN;
	}
	public int getNumN(){
		return this.numN;
	}
	
	public void intervalo(){
		int tempN=this.getNumN();
		int cont0a100=0;
		int cont101a200=0;
		int cont200=0;
		for(int i=0; i<tempN; i++){
			if((i>=0)&&(i<99)){
				cont0a100++;
			}if((i>100)&&(i<200)){
				cont101a200++;
			}if(i>200){
				cont200++;
			}
		}
		System.out.println("Entre 0 e 100: "+cont0a100);
		System.out.println("Entre 101 e 200: "+cont101a200);
		System.out.println("Maior que 200: "+cont200);
	}
	public static void main(String[] args){
		Loops num = new Loops();
		Scanner ler = new Scanner(System.in);
		
		int temp=ler.nextInt();
		num.setNumN(temp);
		num.intervalo();
	}
}
