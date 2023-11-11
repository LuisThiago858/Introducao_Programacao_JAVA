package Lista02;
/*
 * Enunciado
Crie uma classe chamada Frase, essa classe deverá ter:

Dois atributos do tipo String.
Os métodos gets/sets.
Um método chamado imprimeFrase que imprime a concatenação de duas Strings.
 

 

Dicas
Seu programa deverá ler do teclado duas palavras e imprima a frase que as duas palavras formam.

Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
Hello
World
Saída	
Hello World
Resultado
 */
import java.util.Scanner;

public class Frase{
	private String palavra1;
	private String palavra2;
	
	public void setPalv1(String novaPalavra1){
		this.palavra1=novaPalavra1;
	}
	public String getPalv1(){
		return this.palavra1;
	}
	public void setPalv2(String novaPalavra2){
		this.palavra2=novaPalavra2;
	}
	public String getPalv2(){
		return this.palavra2;
	}
	
	public void imprimeFrase(){
		String temp1=this.getPalv1();
		String temp2=this.getPalv2();
		
		System.out.println(temp1+" "+temp2);
	}
	
	public static void main(String[] args){
		Frase num=new Frase();
		Scanner ler=new Scanner(System.in);
		
		String temp1=ler.nextLine();
		String temp2=ler.nextLine();
		
		num.setPalv1(temp1);
		num.setPalv2(temp2);
		
		num.imprimeFrase();
        ler.close();
	}
}
