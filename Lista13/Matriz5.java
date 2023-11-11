/*
 * Enunciado
Treinando com matrizes V
Crie uma classe chamada Matriz.
Sua classe deve ter dois atributo linhas e colunas do tipo int.
Sua classe deve ter o atributo mat do tipo (int[][]).
Crie os métodos gets/sets.
Crie um método chamado buscaRepetidos que verifica se há algum elemento repetido na matriz e informa o resultado da busca ao usuário.
Crie um método chamado imprimeMatriz  que deve apenas imprimir todos os os valores da matriz.
Dicas
fique atento aos casos de teste

Exemplos de Entrada e Saída
Entrada	
1 1
0 

Saída	
Matriz
0 
Nao tem elementos repetidos!!
Entrada	
2 2
13 5 
12 13 

Saída	
Matriz
13 5 
12 13 
Tem elementos repetidos!!
 */
package Lista13;

import java.util.Scanner;

public class Matriz5 {
    private int [][]matriz;
	private int tamLinha;
	private int tamColuna; 
	
	Matriz5(int l, int c){
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
	
	public void buscaRepetidos(){
		int atual=this.getMatriz(0, 0);
		int cont=0;
		for(int i=1; i<this.getTamLinhas(); i++){
			for(int j=1; j<this.getTamColunas(); j++){
				if(atual==this.getMatriz(i,j)){
					cont++;
				}
			}
		}
		if(cont>0){
			System.out.println("Tem elementos repetidos!!");
		}else{
			System.out.println("Nao tem elementos repetidos!!");
		}
	}
	
	
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int linha=ler.nextInt();
		int coluna=ler.nextInt();
		Matriz5 mat=new Matriz5(linha, coluna);
		
		mat.inicializa(ler);
		mat.imprimeMatriz();
		mat.buscaRepetidos();
		
	}
}
