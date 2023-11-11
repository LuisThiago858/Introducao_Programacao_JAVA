/*
 * Enunciado
As Tartarugas

Implemente em Java a classe Tartaruga com os atributos:  tamanho atual (mm) e taxa de crescimento (mm/ano).

A partir dos dados de 2 tartarugas dados como entrada (tamanho e taxa de crescimento de cada uma), implemente um método que calcule e imprima quanto tempo (em anos) levará para que ambas cheguem ao mesmo tamanho (assuma que as entradas sempre serão válidas para esse problema). 

PS: Não é permitido usar qq tipo de comando de iteração (para, enquanto ou repita).

Dicas
Entrada
A entrada é composta por quatro números de ponto flutuante, ta1, tc1, indicando as características da primeira tartaruga e ta2, tc2, indicando as características da segunda tartaruga.

Saída
Imprima uma linha contendo quanto tempo em anos levará para que ambas cheguem ao mesmo tamanho com duas casas decimais de precisão.

Exemplos de Entrada e Saída
Entrada	
2.0
0.5
1.0
1.0
Saída	
2.00
Entrada	
100.0
5.0
75.0
10.0
Saída	
5.00
Entrada	
133.0
8.0
53.0
16.0
Saída	
10.00
 */

package Prova01;

import java.util.Scanner;

public class Tartaruga {
   private float tmAtual;
   private float txCresc;

   public float getTMatual(){
    return this.tmAtual;
   }

   public void setTMatual(float novoTMatual){
    this.tmAtual=novoTMatual;
   }

   public float getTXcresc(){
    return this.txCresc;
   }

   public void setTXcresc(float novaTXcresc){
    this.txCresc=novaTXcresc;
   }

   public void quantTempAnosCresc(Tartaruga tart01, Tartaruga tart02){
        float temp1TM=tart01.getTMatual();
        float temp1TX=tart01.getTXcresc();
        float temp2TM=tart02.getTMatual();
        float temp2TX=tart02.getTXcresc();
        float resultadoTX=(temp1TX-temp2TX);
        float resultadoTM=(temp2TM-temp1TM);
        float tamanhoComparacao=(resultadoTM/resultadoTX);

        System.out.printf("%.2f", tamanhoComparacao);
   }

   public static void main(String[] args){
        Tartaruga tart1=new Tartaruga();
        Tartaruga tart2=new Tartaruga();

        Scanner ler=new Scanner(System.in);

        float ta1=ler.nextFloat();
        tart1.setTMatual(ta1);
        float tc1=ler.nextFloat();
        tart1.setTXcresc(tc1);
        float ta2=ler.nextFloat();
        tart2.setTMatual(ta2);
        float tc2=ler.nextFloat();
        tart2.setTXcresc(tc2);

        tart1.quantTempAnosCresc(tart1, tart2);
   }
}
