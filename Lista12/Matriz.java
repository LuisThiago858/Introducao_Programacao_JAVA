/*
 * Enunciado
Crie a classe Matriz com o atributo matriz (int[][]), tamanhoLinha e tamanhoColuna junto dos seus métodos de acesso e modificação (gets e sets). Como a matriz é um tipo composto de dados, o método get recebe como parâmetro dois inteiros que são a sua linha e coluna e retorna o valor da matriz nos indices informados. Exemplo: public int getMatriz(int linha, int coluna). A mesma situação ocorre para o método set, que recebe três valores inteiros como parâmetro que são sua linha, coluna e o valor a ser atribuido nos indices informados. Exemplo: public void setMatriz(int linha, int coluna, int valor). Crie támbem o método imprimeMatriz() que imprime todos os avalores da matriz.

Dicas
Entrada
A entrada inicialmente contém 2 valores inteiros N e M, que são respectivamente a quantidade de linhas e colunas. Logo em seguida leia N*M inteiros e atribuia esses valores a matriz como nos exemplos.

Saída
Imprima a matriz como nos exemplos.

Exemplos de Entrada e Saída
Entrada	
3 7
2 1 8 6 4 8 2 0 0 8 7 4 4 7 2 2 3 5 7 0 0
Saída	
2 1 8 6 4 8 2
0 0 8 7 4 4 7
2 2 3 5 7 0 0
Entrada	
8 4
6 4 6 7 1 3 5 3 0 3 2 3 3 3 7 0 0 2 3 2 1 7 0 5 5 8 5 7 5 8 4 7
Saída	
6 4 6 7
1 3 5 3
0 3 2 3
3 3 7 0
0 2 3 2
1 7 0 5
5 8 5 7
5 8 4 7
Entrada	
7 3
5 5 8 8 7 6 7 7 2 6 4 2 0 7 2 8 8 3 6 1 8
Saída	
5 5 8
8 7 6
7 7 2
6 4 2
0 7 2
8 8 3
6 1 8
 */
package Lista12;

import java.util.Scanner;

public class Matriz{
	private int [][]matriz;
	private int tamanhoLinha;
	private int tamanhoColuna;
	
	Matriz(int l, int c){
		this.setTamanhoLinha(l);
		this.setTamanhoColuna(c);
		matriz=new int[this.getTamanhoLinha()][this.getTamanhoColuna()];
	}
	public int getTamanhoLinha(){
		return this.tamanhoLinha;
	}
	public void setTamanhoLinha(int novoValor){
		this.tamanhoLinha = novoValor;
	}
	public int getTamanhoColuna(){
		return this.tamanhoColuna;
	}
	public void setTamanhoColuna(int novoValor){
		this.tamanhoColuna=novoValor;
	}
	public int getMatriz(int linha, int coluna){
		return this.matriz[linha][coluna];
	}
	public void setMatriz(int linha, int coluna, int valor){
		this.matriz[linha][coluna]=valor;
	}
	public void inicializa(int[] valor){
		int index=0;
		for(int i=0; i<this.getTamanhoLinha(); i++){
			for(int j=0; j<this.getTamanhoColuna(); j++){
				this.setMatriz(i, j, valor[index]);
				index++;
			}
		}
	}
	public void imprimeMatriz(){
		for(int i=0; i<this.getTamanhoLinha(); i++){
			for(int j=0; j<this.getTamanhoColuna();j++){
				System.out.print(this.getMatriz(i, j)+ " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int N=ler.nextInt();
		int M=ler.nextInt();
		Matriz ord = new Matriz(N, M);
		int []valores=new int[N*M];
		int cont=0;
		while(cont<(N*M)){
			valores[cont]=ler.nextInt();
			cont++;
		}
		ord.inicializa(valores);
		ord.imprimeMatriz();
		ler.close();
	}
}
