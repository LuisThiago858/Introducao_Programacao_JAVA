/*
 * Enunciado
Treinando com matrizes II
Crie uma classe chamada Matriz.
Sua classe deve ter dois atributo linhas e colunas do tipo int.
Sua classe deve ter o atributo mat do tipo (int[][]).
Crie os métodos gets/sets.
Crie um método chamado somaValores que imprime a soma de todos os valores presente na matriz e também a soma dos valores da diagonal principal.
Crie um método chamado imprimeMatriz  que deve apenas imprimir todos os os valores da matriz.
Dicas
Fique atento aos casos de teste

Exemplos de Entrada e Saída
Entrada	
5 5
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
Saída	
Matriz
1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 1 
Soma Matriz: 25
Soma Diagonal: 5
 */
package Lista13;

import java.util.Scanner;

public class Matriz2 {
    private int [][]matriz;
	private int tamLinha;
	private int tamColuna; 
	
	Matriz2(int l, int c){
		this.setTamLinhas(l);
		this.setTamColunas(c);
		matriz=new int[this.getTamLinhas()][this.getTamColunas()];
	}
	
	public void setTamLinhas(int novol){
		this.tamLinha=novol;
	}
	public int getTamLinhas(){
		return this.tamLinha;
	}
	
	public void setTamColunas(int novoc){
		this.tamColuna=novoc;
	}
	public int getTamColunas(){
		return this.tamColuna;
	}
	
	public void setMatriz(int l, int c, int novov){
		this.matriz[l][c]=novov;
	}
	public int getMatriz(int l, int c){
		return this.matriz[l][c];
	}
	public void inicializa(Scanner ler){
		for(int i=0; i<this.getTamLinhas(); i++){
			for(int j=0 ; j<this.getTamColunas(); j++){
				int valor=ler.nextInt();
				this.setMatriz(i, j, valor);
			}
		}
	}
	
	public void imprimeMatriz(){
		System.out.println("Matriz");
		for(int i=0; i<this.getTamLinhas(); i++){
			for(int j=0; j<this.getTamColunas(); j++){
				System.out.print(this.getMatriz(i, j)+" ");
			}
			System.out.println();
		}
	}
	
	public void somaValores(){
		int somaTodos=0;
		int somaDiagonal=0;
		
		for(int i=0; i<this.getTamLinhas(); i++){
			for(int j=0; j<this.getTamColunas(); j++){
				somaTodos+=this.getMatriz(i, j);
			}
		}
		
		for(int i=0; i<this.getTamLinhas(); i++){
			somaDiagonal+=this.getMatriz(i, i);
		}
		
		System.out.println("Soma Matriz: "+ somaTodos);
		System.out.println("Soma Diagonal: "+ somaDiagonal);
	}
	
	
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int linha=ler.nextInt();
		int coluna=ler.nextInt();
		Matriz2 mat=new Matriz2(linha, coluna);
		
		mat.inicializa(ler);
		mat.imprimeMatriz();
		mat.somaValores();
		
	}
}
