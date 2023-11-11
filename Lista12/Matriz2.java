/*
 * Enunciado
Utilize a sua classe Matriz da questão 1 e adicione o método imprimeTransposta() que imprime a transposta da matriz sem modificá-la.

Dicas
Entrada
A entrada inicialmente contém 2 valores inteiros N e M, que são respectivamente a quantidade de linhas e colunas. Logo em seguida leia N*M inteiros e atribuia esses valores a uma matriz.

Saída
Imprima a transposta da matriz como nos exemplos.

Obs: Não modifique a matriz lida!!!

Exemplos de Entrada e Saída
Entrada	
9 2
7 1 3 4 2 4 1 5 1 6 7 2 2 3 8 8 3 2
Saída	
7 3 2 1 1 7 2 8 3
1 4 4 5 6 2 3 8 2
Entrada	
4 8
7 2 8 8 0 7 6 4 4 6 7 1 2 3 6 2 8 4 5 0 5 3 2 4 8 0 0 6 2 7 5 6
Saída	
7 4 8 8
2 6 4 0
8 7 5 0
8 1 0 6
0 2 5 2
7 3 3 7
6 6 2 5
4 2 4 6
Entrada	
2 4
6 3 4 0 2 3 3 4
Saída	
6 2
3 3
4 3
0 4
 */
package Lista12;

import java.util.Scanner;

public class Matriz2 {
    private int [][]matriz, transposta;
	private int tamanhoLinha;
	private int tamanhoColuna;
	
	Matriz2(int l, int c){
		this.setTamanhoLinha(l);
		this.setTamanhoColuna(c);
		matriz=new int[this.getTamanhoLinha()][this.getTamanhoColuna()];
		transposta=new int[this.getTamanhoColuna()][this.getTamanhoLinha()];
	}
	public int getTamanhoLinha(){
		return this.tamanhoLinha;
	}
	public void setTamanhoLinha(int novoValor){
		this.tamanhoLinha=novoValor;
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
	public int getTransposta(int linha, int coluna){
		return this.transposta[linha][coluna];
	}
	public void setTransposta(int linha, int coluna, int valor){
		this.transposta[linha][coluna]=valor;
	}
	public void inicializa(Scanner ler){
		for(int i=0; i<this.getTamanhoLinha(); i++){
			for(int j=0; j<this.getTamanhoColuna(); j++){
				int valor = ler.nextInt();
				this.setMatriz(i, j, valor);
			}
		}
	}
	public void popularTransposta(){
		for(int i=0; i<this.getTamanhoLinha(); i++){
			for(int j=0; j<this.getTamanhoColuna(); j++){
				this.setTransposta(j, i, this.getMatriz(i, j));
			}
		}
	}
	public void imprimeTransposta(){
		for(int i=0; i<this.getTamanhoColuna(); i++){
			for(int j=0; j<this.getTamanhoLinha(); j++){
				System.out.print(this.getTransposta(i, j)+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		int num1 = ler.nextInt();
		int num2 = ler.nextInt();
		
		Matriz2 ord = new Matriz2(num1, num2);
		ord.inicializa(ler);
		ord.popularTransposta();
		ord.imprimeTransposta();
		ler.close();
	}
}
