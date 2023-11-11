package Lista01;
/*
 * Enunciado
Crie uma classe chamada TempCelsius, essa classe deverá ter:

Um atributo do tipo float.
Os métodos gets/sets.
Um método chamado ConverteTemp que dada uma temperatura em graus Celsius, converta esse valor para Fahrenheit e imprima o resultado.
Dicas
A formula para conversão dos graus:



 

Todos os dados serão pontos flutuantes.

Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
44
Saída	
Temperatura em C: 44.0
Temperatura em F: 111.2
Entrada	
-5
Saída	
Temperatura em C: -5.0
Temperatura em F: 23.0
Resultado
 */
import java.util.Scanner;

public class TempCelsius{
	private float num1;
	
	public void setNum1(float novoNum1){
		this.num1=novoNum1;
	}
	public float getNum1(){
		return this.num1;
	}
	
	
	public void imprimeTemp(){
		float celsius=this.getNum1();
		float fahrenheit = (celsius*1.8f)+32.0f;
		System.out.printf("Temperatura em C: %.1f\n", celsius);
		System.out.printf("Temperatura em F: %.1f\n", fahrenheit);
	}
	
	public static void main(String[] args){
		TempCelsius num=new TempCelsius();
		Scanner ler=new Scanner(System.in);
		
		float temp1=ler.nextFloat();
		num.setNum1(temp1);
		num.imprimeTemp();
        ler.close();
	}
}
