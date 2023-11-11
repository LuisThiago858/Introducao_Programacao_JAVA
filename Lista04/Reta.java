package Lista04;
/*
 * Enunciado
Ponto na reta
Nesse exercício você deve mostrar seus dotes matemáticos para seu coleguinha joão que não está conseguindo decifrar dado dois números se eles pertecem a reta 2x + y = 3. Sua missão é ajudar seu coleguinha elaborando um programa que possa verificar se dados dois números x e y ele fazem parte da reta apresentada.

Dicas
Escreva um algoritmo que leia as coordenadas de um ponto P(x,y) do plano cartesiano .
Crie uma classe Ponto.
Sua classe deverá ter dois atributos do tipo int.
Observe os casos de teste.
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
2
4
Saída	
2 e 4 nao fazem parte da reta
Entrada	
1 1
Saída	
1 e 1 fazem parte da reta
Resultado
 */
import java.util.Scanner;

public class Reta{
	private int num1;
	private int num2;
	
	public void setNum1(int novoNum1){
		this.num1=novoNum1;
	}
	public int getNum1(){
		return this.num1;
	}
	public void setNum2(int novoNum2){
		this.num2=novoNum2;
	}
	public int getNum2(){
		return this.num2;
	}
	
	
	public void ehReta(int x, int y){
		x=this.getNum1();
		y=this.getNum2();
		
		if(((2*x)+y)==3){
			System.out.println(x+" e "+y+" fazem parte da reta");
		}else{
			System.out.println(x+" e "+y+" nao fazem parte da reta");
		}
		
	}
	
	public static void main(String[] args){
		Reta cordenadas = new Reta();
		Scanner ler = new Scanner(System.in);
		
		int temp1=ler.nextInt();
		cordenadas.setNum1(temp1);
		int temp2=ler.nextInt();
		cordenadas.setNum2(temp2);
		cordenadas.ehReta(temp1, temp2);
        ler.close();
	}
}
