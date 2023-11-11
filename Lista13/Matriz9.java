/*
 * Enunciado
Treinando com matrizes IV
Crie uma classe chamada Matriz.
Sua classe deve ter um atributo ordem do tipo int.
Sua classe deve ter o atributo mat do tipo (int[][]).
Crie os métodos gets/sets.
Crie um método chamado matrizTransposta que recebe uma matriz por parâmetro e devolve a matriz trasposta dela:
O resultado desse método é outra matriz.
Crie um método chamado imprimeMatriz  que deve apenas imprimir todos os os valores da matriz.
Dicas
atenção aos casos de teste

Exemplos de Entrada e Saída
Entrada	
2
3 11 
12 11 
Saída	
Matriz A
3 11 
12 11 
Matriz Transposta
3 12 
11 11 
 */
package Lista13;

import java.util.Scanner;

public class Matriz9 {
    private int [][]mat;
	private int tamlinha;
	private int tamcoluna;
	
	Matriz9(int l, int c){
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
	
	public Matriz9 matrizTransposta(Matriz mat1){
		Matriz9 transposta = new Matriz9(this.getLinha(), this.getColuna());
		int valor=0;
		for(int i=0; i<this.getLinha(); i++){
			for(int j=0; j<this.getColuna(); j++){
				valor=mat1.getMatriz(j, i);
				transposta.setMatriz(i, j, valor);
			}
		}
		return transposta;
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
	public void imprimirTransposta() {
		System.out.println("Matriz Transposta");
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
		Matriz9 mat1=new Matriz9(ordem, ordem);
		
		mat1.inicializa(ler);
		
		mat1.imprimirA();
		
		Matriz9 resultado = mat1.matrizTransposta(mat1);
        resultado.imprimirTransposta();
		
	}
}
