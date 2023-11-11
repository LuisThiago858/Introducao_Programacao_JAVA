/*
 * Enunciado
Treinando com matrizes
Crie uma classe chamada Matriz.
Sua classe deve ter o atributo ordem do tipo int.
Sua classe deve ter o atributo mat do tipo (int[][]).
Crie os métodos gets/sets.
Crie um método chamado somaValores que imprime a soma de todos os valores presente na matriz.
Crie um método chamado imprimeMatriz  que deve apenas imprimir todos os os valores da matriz.
Dicas
fique atento aos casos de teste.

Exemplos de Entrada e Saída
Entrada	
4
1 3 5 8
6 9 1 3
2 74 9 6
3 2 1 4
Saída	
Matriz
1 3 5 8 
6 9 1 3 
2 74 9 6 
3 2 1 4 
Soma: 137
 */
package Lista13;

import java.util.Scanner;

public class Matriz {
    private int [][] matriz;
	private int tamLinhas;
	private int tamColunas;
	
	Matriz(int lc){
		this.setTamLinhas(lc);
		this.setTamColunas(lc);
		matriz = new int[this.getTamLinhas()][this.getTamColunas()];
	}
	
	public void setTamLinhas(int novoTL){
		this.tamLinhas=novoTL;
	}
	public int getTamLinhas(){
		return this.tamLinhas;
	}
	public void setTamColunas(int novoTC){
		this.tamColunas=novoTC;
	}
	public int getTamColunas(){
		return this.tamColunas;
	}
	
	public void setMatriz(int l, int c, int novoV){
		this.matriz[l][c]=novoV;
	}
	public int getMatriz(int l, int c){
		return this.matriz[l][c];
	}
	
	public void inicializa(Scanner ler){
		for(int i=0; i<this.getTamLinhas(); i++){
			for(int j=0; j<this.getTamColunas(); j++){
				int valor=ler.nextInt();
				this.setMatriz(i, j, valor);
			}
		}
	}
	
	public int somaValores(){
		int resultado=0;
		for(int i=0; i<this.getTamLinhas(); i++){
			for(int j=0; j<this.getTamColunas(); j++){
				resultado=resultado+this.getMatriz(i, j);
			}
		}
		return resultado;
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
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int tam = ler.nextInt();
		Matriz sum=new Matriz(tam);
		sum.inicializa(ler);
		int resultado=sum.somaValores();
		sum.imprimeMatriz();
		System.out.println("Soma: "+ resultado);
	}
}
