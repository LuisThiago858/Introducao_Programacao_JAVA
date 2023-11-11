/*
 * Enunciado
Treinando com matrizes III
Crie uma classe chamada Matriz.
Sua classe deve ter dois atributos linhas e colunas do tipo int.
Sua classe deve ter o atributo mat do tipo (int[][]).
Crie os métodos gets/sets.
Crie um método chamado ContaMaiores que imprime quantos valores dessa matriz são maiores que 5.
Crie um método chamado imprimeMatriz  que deve apenas imprimir todos os os valores da matriz.
Dicas
atenção nos casos de teste

Exemplos de Entrada e Saída
Entrada	
1 1
3 
Saída	
Matriz
3 
Numero de elementos maiores que 5: 0
Entrada	
2 2
4 3 
6 4 
Saída	
Matriz
4 3 
6 4 
Numero de elementos maiores que 5: 1
 */
package Lista13;

import java.util.Scanner;

public class Matriz3 {
    private int [][]matriz;
	private int tamLinha;
	private int tamColuna;
	
	Matriz3(int l, int c){
		this.setTamLinhas(l);
		this.setTamColunas(c);
		matriz=new int[this.getTamLinhas()][this.getTamColunas()];
	}
	
	public int getTamLinhas(){
		return this.tamLinha;
	}
	public void setTamLinhas(int noval){
		this.tamLinha=noval;
	}
	public int getTamColunas(){
		return this.tamColuna;
	}
	public void setTamColunas(int novac){
		this.tamColuna=novac;
	}
	public int getMatriz(int l, int c){
		return this.matriz[l][c];
	}
	public void setMatriz(int l, int c, int novov){
		this.matriz[l][c]=novov;
	}
	
	public void inicializa(Scanner ler){
		for(int i=0; i<this.getTamLinhas(); i++){
			for(int j=0; j<this.getTamColunas(); j++){
				int valor=ler.nextInt();
				this.setMatriz(i, j, valor);
			}
		}
	}
	
	public void ContaMaiores(){
		int cont=0;
		for(int i=0; i<this.getTamLinhas(); i++){
			for(int j=0; j<this.getTamColunas(); j++){
				if(this.getMatriz(i, j)>5){
					cont++;
				}
			}
		}
		System.out.println("Numero de elementos maiores que 5: "+cont);
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
		Scanner ler=new Scanner(System.in);
		int linhas=ler.nextInt();
		int colunas=ler.nextInt();
		
		Matriz3 mat=new Matriz3(linhas, colunas);
		
		mat.inicializa(ler);
		mat.imprimeMatriz();
		mat.ContaMaiores();
		
	}
}
