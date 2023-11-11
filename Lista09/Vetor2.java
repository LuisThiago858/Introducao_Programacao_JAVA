/*
 * Enunciado
Colocando o menor elemento o seu lugar!
Utilizando o mesmo fonte da primeira questão como ponto de partida (impressão do menor elemento do vetor - vetor de inteiro de 10 elementos).

1) Crie o método public void troca(int indexA, int indexB) que troca os elementos de 2 posições de vetor - indicados nos indices passados como parametros.

2) Implemente o método public void arrumaMenor(int indexInicio, int indexFinal). O objetivo desse método é arrumar o menor elemento encontrado no vetor dentro de uma faixa de endereços. Ele deve encontrar o menor elemento dentro da faixa de endereços passada como parametro e trocar ele de posição com o elemento que estiver na posição "indexInicio") - para colocar o menor elemento na posição correta, use o metodo implementado no passo 1.

Observação importante: Os valores indicados nos indices (inicio e fim) estão contidos na faixa a ser utilizada - isto é..   se o indexInicio for 2 e o indexFina for 8, vc deve trabalhar nos endereços 2,3,4,5,6,7 e 8.

3) Leia os 10 numeros passados como entrada, insira eles no objeto vetor (o vetor vai ter 10 elementos).

4) Imprima o vetor depois executar o método implementado no passo 2!

-  Serão fornecidos 12 numeroos como entrada - os 10 primeiros são os numero que devem ser utilizados para preencher o vetor - os 2 ultimos são os valores a serem utilizados para chamar o metodo "arrumaMenor".

 

Dicas
1) Não quebre o encapsulamento! rs

2) Atenção os indices para não passar do tamanho do array!!

Exemplos de Entrada e Saída
Entrada	
9 8 7 6 5 4 3 2 1 0 2 6
Saída	
9 8 3 6 5 4 7 2 1 0
 */
package Lista09;

import java.util.Scanner;

public class Vetor2 {
    private int[] vet;
    private int tamanho;

    Vetor() {
        this.setTamanho(10);
        vet = new int[this.getTamanho()];
    }

    public int getTamanho() {
        return this.tamanho;
    }

    private void setTamanho(int novoValor) {
        this.tamanho = novoValor;
    }

    public int getElemento(int index) {
        return this.vet[index];
    }

    public void setElemento(int index, int novoValor) {
        this.vet[index] = novoValor;
    }

    public void imprimeVetor() {
        for (int i = 0; i < this.getTamanho() - 1; i++) {
            System.out.print(this.getElemento(i) + " ");
        }
        System.out.println(this.getElemento(this.getTamanho() - 1));
    }

    public void troca(int indexA, int indexB) {
        int temp = this.getElemento(indexA);
        this.setElemento(indexA, this.getElemento(indexB));
        this.setElemento(indexB, temp);
    }

    public void arrumaMenor(int indexInicio, int indexFinal) {
        int indMenor = indexInicio;
        for (int cont = indexInicio + 1; cont <= indexFinal; cont++) {
            if (this.getElemento(cont) < this.getElemento(indMenor)) {
                indMenor = cont;
            }
        }
        this.troca(indexInicio, indMenor);
    }

    public void inicializa() {
        Scanner ler = new Scanner(System.in);
        int valor;
        for (int cont = 0; cont < this.getTamanho(); cont++) {
            valor = ler.nextInt();
            this.setElemento(cont, valor);
        }
		 int inicio = ler.nextInt();
       int fim = ler.nextInt();
		 this.arrumaMenor(inicio, fim);
    }

    public static void main(String[] args) {
        Vetor2 num = new Vetor2();
        num.inicializa(); 
        num.imprimeVetor();
    }
}
