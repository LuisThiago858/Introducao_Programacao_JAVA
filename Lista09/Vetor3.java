/*
 * Enunciado
Finalmente ordenando o objeto vetor!!
 

Utilizando como base a implementação realizada na questão 2, faça o seguinte

1 - Crie o método public void ordena() - esse método deve utilizar o método arrumaMenor(int indexInicio, int indexFinal) que foi implementado na questão anterior. O metodo arrumaMenor deve ser executado varias vezes, alterando somente o valor do indexInicio - iniciando de 0 até o valor 8 - e o indexFinal deve ficar "travado" em 9 (pois o nosso vetor tem tamanho 10).

2 - Leia os 10 numeros fornecidos como entrada.

3 - Execute o método ordena() para ordenar os valores encontrados no vetor.

4 - Imprima o vetor ordenado!

 

 

 

Dicas
1) Não quebrem o encapsulamento!! rs

2) Cuidado com a manipulação dos indices - você pode causar um arrayOutOfBounds !! rs

Exemplos de Entrada e Saída
Entrada	
9 8 7 6 5 4 3 2 1 0
Saída	
0 1 2 3 4 5 6 7 8 9

 */
package Lista09;

import java.util.Scanner;

public class Vetor3 {
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

    public void ordena() {
        for (int i = 0; i < this.getTamanho() - 1; i++) {
            this.arrumaMenor(i, this.getTamanho() - 1);
        }
    }

    public void inicializa() {
        Scanner ler = new Scanner(System.in);
        int valor;
        for (int cont = 0; cont < this.getTamanho(); cont++) {
    
            valor = ler.nextInt();
            this.setElemento(cont, valor);
        }
    }

    public static void main(String[] args) {
        Vetor3 num = new Vetor3();
        num.inicializa();
        
        num.ordena();
        num.imprimeVetor();
    }
}

