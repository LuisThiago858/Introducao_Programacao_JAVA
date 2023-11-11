/*
 * Enunciado
Preparando a ordenação de um vetor!
Para completar esta questão será necessário:

1) Criar a classe Vetor com 2 atributos:

vet: um array de inteiros.
 tamanho: inteiro.
2) Criar os métodos get e set para todos os atributos

Para o atributo vet, crie os métodos getElemento() e setElemento().
Crie um método construtor que inicializa o vetor com tamanho 10.
3) Criar o método "imprimeMenorElemento()".

Este método deve varrer o vetor e imprimir o o menor elemento que estiver armazenado!
Objetivo: Implementar o comportamento de impressão do menor numero encontrado no vetor. Para isso, leia 10 numeros inteiros. Eles devem ser utilizados para preencher os elementos do vetor. Depois, executar o método "imprimeMenorElemento()".

Dicas
1) Leia os numeros da entrada e utilize o método "setElemento()" do objeto vetor que foi criado. Assim, você não vai quebrar o encapsulamento!

2) Lembre sempre de utilizar o getTamanho() para saber o tamanho do vetor quando estiver andando pela estrutura..

3)Os números das entradas são inteiros (podem ser negativos, zero ou positivos).

Exemplos de Entrada e Saída
Entrada	
9 5 8 4 7 3 6 2 0 1
Saída	
0
 */
package Lista09;

import java.util.Scanner;

public class Vetor{
	private int [] vet;
	private int tamanho;
	
	Vetor(){
		this.setTamanho(10);
		vet = new int[this.getTamanho()];
	}
	public int getTamanho(){
		return this.tamanho;
	}
	
	private void setTamanho(int novoValor){
		this.tamanho = novoValor;
	}
	
	public int getElemento(int index){
		return this.vet[index];
	}
	public void setElemento(int index, int novoValor){
		this.vet[index] = novoValor;
	}
	public void imprimeMenorElemento(){
		int cont;
		int indMenor=0;
		for(cont = 1; cont < this.getTamanho(); cont++){
			if(this.getElemento(cont) < this.getElemento(indMenor)){
        			indMenor = cont;
        		}      		
		}
		System.out.print(this.getElemento(indMenor)+" ");
	}
	public void inicializa(){
		Scanner ler = new Scanner(System.in);
		int cont;
		int valor;
		for(cont = 0; cont < this.getTamanho(); cont++){
			valor = ler.nextInt();	
			this.setElemento(cont, valor);
		}
	}
	public static void main(String[] args){
		Vetor num=new Vetor();
		num.inicializa();
		num.imprimeMenorElemento();
	}
}
