/*
 * Enunciado
Treinando com matrizes IV
Crie uma classe chamada Matriz.
Sua classe deve ter dois atributo linhas e colunas do tipo int.
Sua classe deve ter o atributo mat do tipo (int[][]).
Crie os métodos gets/sets.
Crie um método chamado somaPrimos que imprime a soma de todos os valores primos presente na matriz.
Crie um método chamado imprimeMatriz  que deve apenas imprimir todos os os valores da matriz.
Dicas
atençao aos casos de teste

Exemplos de Entrada e Saída
Entrada	
2 1
11 
0 
Saída	
Matriz
11 
0 
Soma Primos: 11
 */
package Lista13;

import java.util.Scanner;

public class Matriz4 {
    private int[][] matriz;
		 private int tamLinha;
		 private int tamColuna;
	
		 Matriz4(int l, int c) {
			  this.setTamLinhas(l);
			  this.setTamColunas(c);
			  matriz = new int[this.getTamLinhas()][this.getTamColunas()];
		 }
	
		 public int getTamLinhas() {
			  return this.tamLinha;
		 }
	
		 public void setTamLinhas(int noval) {
			  this.tamLinha = noval;
		 }
	
		 public int getTamColunas() {
			  return this.tamColuna;
		 }
	
		 public void setTamColunas(int novac) {
			  this.tamColuna = novac;
		 }
	
		 public int getMatriz(int l, int c) {
			  return this.matriz[l][c];
		 }
	
		 public void setMatriz(int l, int c, int novov) {
			  this.matriz[l][c] = novov;
		 }
	
		 public void inicializa(Scanner ler) {
			  for (int i = 0; i < this.getTamLinhas(); i++) {
					for (int j = 0; j < this.getTamColunas(); j++) {
						 int valor = ler.nextInt();
						 this.setMatriz(i, j, valor);
					}
			  }
		 }
	
		 public boolean ehPrimo(int num) {
			  boolean resp = true;
			  if (num <= 1) {
					resp = false;
			  }
			  if (num == 2) {
					resp = true;
			  }
			  if (num % 2 == 0) {
					resp = false;
			  }
			  int i = 3;
			  while (i * i <= num && resp) {
					if (num % i == 0) {
						 resp = false;
					}
					i += 2;
			  }
			  return resp;
		 }
	
		 public void somaPrimos() {
			  int sumPrimos = 0;
			  for (int i = 0; i < this.getTamLinhas(); i++) {
					for (int j = 0; j < this.getTamColunas(); j++) {
						 if (ehPrimo(this.getMatriz(i, j))) {
							  sumPrimos += this.getMatriz(i, j);
						 }
					}
			  }
			  System.out.println("Soma Primos: " + sumPrimos);
		 }
	
		 public void imprimeMatriz() {
			  System.out.println("Matriz");
			  for (int i = 0; i < this.getTamLinhas(); i++) {
					for (int j = 0; j < this.getTamColunas(); j++) {
						 System.out.print(this.getMatriz(i, j) + " ");
					}
					System.out.println();
			  }
		 }
	
		 public static void main(String[] args) {
			  Scanner ler = new Scanner(System.in);
			  int linhas = ler.nextInt();
			  int colunas = ler.nextInt();
			 
			  Matriz4 mat = new Matriz4(linhas, colunas);
			 
			  mat.inicializa(ler);
			  mat.imprimeMatriz();
			  mat.somaPrimos();
		 }
}
