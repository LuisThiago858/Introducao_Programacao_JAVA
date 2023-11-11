package Lista01;
/*
 * Enunciado
Crie uma classe chamada TempFahrenheit, essa classe deverá ter:

Um atributo do tipo float.
Os métodos gets/sets.
Um método chamado ConverteTemp que dada uma temperatura em graus  Fahrenheit, converta esse valor para Celsius e imprima o resultado.
Dicas
Formula para transfomar Fahrenheit em Celsius



 

Todos os dados serão pontos flutuantes.

Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
15.7
Saída	
Temperatura em F: 15.7
Temperatura em C: -9.1
Entrada	
24.2
Saída	
Temperatura em F: 24.2
Temperatura em C: -4.3
Resultado
 */
import java.util.Scanner;

public class TempFahrenheit{
	private float num1;
	
	public void setNum1(float novoNum1){
		this.num1=novoNum1;
	}
	public float getNum1(){
		return this.num1;
	}
	
	
	public void ConverteTemp(){
		float fahrenheit=this.getNum1();
		float celsius = (fahrenheit-32.0f)/1.8f;
		System.out.printf("Temperatura em F: %.1f\n", fahrenheit);
		System.out.printf("Temperatura em C: %.1f\n", celsius);
	}
	
	public static void main(String[] args){
		TempFahrenheit num=new TempFahrenheit();
		Scanner ler=new Scanner(System.in);
		
		float temp1=ler.nextFloat();
		num.setNum1(temp1);
		num.ConverteTemp();

        ler.close();
	}
}
