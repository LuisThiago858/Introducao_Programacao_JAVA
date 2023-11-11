/*
 * Enunciado
Treinando com matrizes VIII
Crie uma classe chamada Matriz.
Sua classe deve ter um atributo ordem do tipo int.
Sua classe deve ter o atributo mat do tipo (int[][]).
Crie os métodos gets/sets.
Crie um método chamado somaMatrizes que recebe duas matrizes por parâmetro e salva o resultado da soma dessas duas matrizes em uma outra matriz:
O resultado dessa soma é outra matriz.
Crie um método chamado imprimeMatriz  que deve apenas imprimir todos os os valores da matriz.
Dicas
atenção aos casos de testes.

Exemplos de Entrada e Saída
Entrada	
3
1 4 5
2 0 1
3 4 6
2 3 4
8 9 7
1 1 1
Saída	
Matriz A
1 4 5
2 0 1
3 4 6
Matriz B
2 3 4
8 9 7
1 1 1
Matriz Resultante
3 7 9
10 9 8
4 5 7
 */
package Lista13;

import java.util.Scanner;

public class Matriz8 {
    private int [][]mat;
	private int tamlinha;
	private int tamcoluna;
	
	Matriz8(int l, int c){
		this.setLinha(l);
		this.setColuna(c);
		mat=new int[this.getLinha()][this.getColuna()];
	}
	
	public void setLinha(int taml){
		this.tamlinha=taml;
	}
	public int getLinha(){
		return this.tamlinha;
	}
	public void setColuna(int tamc){
		this.tamcoluna=tamc;
	}
	public int getColuna(){
		return this.tamcoluna;
	}
	
	public void setMatriz(int l, int c, int v){
		this.mat[l][c]=v;
	}
	public int getMatriz(int l, int c){
		return this.mat[l][c];
	}
	
	public void inicializa(Scanner ler){
		for(int i=0; i<this.getLinha(); i++){
			for(int j=0; j<this.getColuna(); j++){
				int valor=ler.nextInt();
				this.setMatriz(i, j, valor);
			}
		}
	}
	
	public Matriz8 somaMatrizes(Matriz mat1, Matriz mat2){
		Matriz8 soma = new Matriz8(this.getLinha(), this.getColuna());
		int valor=0;
		for(int i=0; i<this.getLinha(); i++){
			for(int j=0; j<this.getColuna(); j++){
				valor=mat1.getMatriz(i, j)+mat2.getMatriz(i, j);
				soma.setMatriz(i, j, valor);
			}
		}
		return soma;
	}
	
	public void imprimirA() {
		System.out.println("Matriz A");
        for (int i = 0; i < this.getLinha(); i++) {
            for (int j = 0; j < this.getColuna(); j++) {
                System.out.print(this.getMatriz(i, j) + " ");
            }
            System.out.println();
        }
    }
	public void imprimirB() {
		System.out.println("Matriz B");
        for (int i = 0; i < this.getLinha(); i++) {
            for (int j = 0; j < this.getColuna(); j++) {
                System.out.print(this.getMatriz(i, j) + " ");
            }
            System.out.println();
        }
    }
	public void imprimirR() {
		System.out.println("Matriz Resultante");
        for (int i = 0; i < this.getLinha(); i++) {
            for (int j = 0; j < this.getColuna(); j++) {
                System.out.print(this.getMatriz(i, j) + " ");
            }
            System.out.println();
        }
    }
	
	public static void main(String[] args){
		Scanner ler=new Scanner(System.in);
		
		int ordem=ler.nextInt();
		Matriz8 mat1=new Matriz8(ordem, ordem);
		Matriz8 mat2=new Matriz8(ordem, ordem);
		
		mat1.inicializa(ler);
		mat2.inicializa(ler);
		
		mat1.imprimirA();
		mat2.imprimirB();
		
		Matriz8 resultado = mat1.somaMatrizes(mat1, mat2);
        resultado.imprimirR();
		
	}
}
