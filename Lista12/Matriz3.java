/*
 * Enunciado
Utilize a sua classe Matriz da questão 1 e adicione o método public Matriz somaMatrizEReal(int numero) que retorna uma nova matriz que é o resultado da soma da matriz que chamou o método pelo número recebido como parâmetro.

Dicas
Entrada
A entrada inicialmente contém 3 valores inteiros X, N e M, que são respectivamente um número qualquer, a quantidade de linhas e colunas da matriz. Logo em seguida leia N*M inteiros e atribuia esses valores a uma matriz.

Saída
Gere uma nova matriz que é a soma do número X pela matriz lida e imprima seus valores.

Exemplos de Entrada e Saída
Entrada	
3 4 9
6 0 4 7 8 8 8 2 6 2 5 4 2 8 7 7 4 6 1 8 4 8 3 0 2 6 5 4 7 1 2 7 0 2 0 2
Saída	
9 3 7 10 11 11 11 5 9
5 8 7 5 11 10 10 7 9
4 11 7 11 6 3 5 9 8
7 10 4 5 10 3 5 3 5
Entrada	
9 7 7
6 5 2 5 0 2 7 1 2 5 7 4 4 2 6 4 4 4 2 0 1 5 3 1 8 6 8 0 7 7 7 2 1 3 2 8 7 6 3 6 5 1 2 7 0 1 8 3 2
Saída	
15 14 11 14 9 11 16
10 11 14 16 13 13 11
15 13 13 13 11 9 10
14 12 10 17 15 17 9
16 16 16 11 10 12 11
17 16 15 12 15 14 10
11 16 9 10 17 12 11
Entrada	
8 4 6
4 7 7 6 1 3 1 1 4 6 3 3 0 6 8 0 6 7 3 6 0 4 4 8
Saída	
12 15 15 14 9 11
9 9 12 14 11 11
8 14 16 8 14 15
11 14 8 12 12 16
 */
package Lista12;

import java.util.Scanner;

public class Matriz3 {
    private int[][] matriz, matrizSoma;
    private int numSoma;
    private int tamanhoLinha;
    private int tamanhoColuna;

    Matriz3(int l, int c) {
        this.setTamanhoLinha(l);
        this.setTamanhoColuna(c);
        matriz = new int[this.getTamanhoLinha()][this.getTamanhoColuna()];
        matrizSoma = new int[this.getTamanhoLinha()][this.getTamanhoColuna()];
    }

    public int getNumSoma() {
        return this.numSoma;
    }

    public void setNumSoma(int novoValor) {
        this.numSoma = novoValor;
    }

    public int getTamanhoLinha() {
        return this.tamanhoLinha;
    }

    public void setTamanhoLinha(int novoValor) {
        this.tamanhoLinha = novoValor;
    }

    public int getTamanhoColuna() {
        return this.tamanhoColuna;
    }

    public void setTamanhoColuna(int novoValor) {
        this.tamanhoColuna = novoValor;
    }

    public int getMatriz(int linha, int coluna) {
        return this.matriz[linha][coluna];
    }

    public void setMatriz(int linha, int coluna, int valor) {
        this.matriz[linha][coluna] = valor;
    }

    public int getMatrizSoma(int linha, int coluna) {
        return this.matrizSoma[linha][coluna];
    }

    public void setMatrizSoma(int linha, int coluna, int valor) {
        this.matrizSoma[linha][coluna] = valor;
    }

    public void inicializa() {
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < this.getTamanhoLinha(); i++) {
            for (int j = 0; j < this.getTamanhoColuna(); j++) {
                int valor = ler.nextInt();
                this.setMatriz(i, j, valor);
            }
        }
    }

    public void somaMatrizEReal(int numero) {
        for (int i = 0; i < this.getTamanhoLinha(); i++) {
            for (int j = 0; j < this.getTamanhoColuna(); j++) {
					 int valor=this.getMatriz(i, j) + numero;
                this.setMatrizSoma(i, j, valor);
            }
        } 
    }

    public void imprimeMatrizSoma() {
        for (int i = 0; i < getTamanhoLinha(); i++) {
            for (int j = 0; j < getTamanhoColuna(); j++) {
                System.out.print(this.getMatrizSoma(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1 = ler.nextInt();
        int num2 = ler.nextInt();
        int real = ler.nextInt();

        Matriz3 ord = new Matriz3(num1, num2);
        ord.inicializa();
        ord.somaMatrizEReal(real);
        ord.imprimeMatrizSoma();
    }
}
