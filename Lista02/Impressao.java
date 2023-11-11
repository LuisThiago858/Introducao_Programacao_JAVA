package Lista02;
/*
 * Enunciado
Crie uma classe chamada Impressao, essa classe deverá ter:

Um atributo do tipo String.
Os métodos gets/sets.
Um método chamado imprimeNome que imprime o nome guardado em um objeto.
 

Dicas
Todos os nomes serão compostos.

Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
Tonny Jaa
Saída	
Tonny Jaa
Resultado
 */
import java.util.Scanner;

public class Impressao{
	private String palavra1;
	
	public void setPalv1(String novaPalavra1){
		this.palavra1=novaPalavra1;
	}
	public String getPalv1(){
		return this.palavra1;
	}
	
	public void imprimeNome(){
		String temp1=this.getPalv1();
		System.out.printf(temp1+"\n");
		
	}
	
	public static void main(String[] args){
		Impressao num=new Impressao();
		Scanner ler=new Scanner(System.in);
		
		String temp1=ler.nextLine();
		
		num.setPalv1(temp1);
		
		num.imprimeNome();
        ler.close();
	}
}
