package Lista13;

import java.util.Scanner;

public class Matriz10 {
    private int [][]mat;
	private int tamlinha;
	private int tamcoluna;
	
	Matriz10(int l, int c){
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
	
	public Matriz10 MultiplicaMatriz(Matriz mat1, Matriz mat2){
		Matriz10 multi = new Matriz10(this.getLinha(), this.getColuna());
		int valor=0;
		for(int i=0; i<this.getLinha(); i++){
			for(int j=0; j<this.getColuna(); j++){
				if(i==j){
					valor=mat1.getMatriz(i, j)*mat2.getMatriz(i, j);
				}else{
					valor=mat1.getMatriz(i, j);
				}
				multi.setMatriz(i, j, valor);
			}
		}
		return multi;
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
	public void imprimeMatriz() {
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
		Matriz10 mat1=new Matriz10(ordem, ordem);
		Matriz10 mat2=new Matriz10(ordem, ordem);
		
		mat1.inicializa(ler);
		mat2.inicializa(ler);
		
		mat1.imprimirA();
		mat2.imprimirB();
		
		Matriz10 resultado = mat1.MultiplicaMatriz(mat1, mat2);
      resultado.imprimeMatriz();
		
	}
}