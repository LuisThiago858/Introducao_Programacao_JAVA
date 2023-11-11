package Lista02;
/*
 * nunciado
Crie uma classe chamada Pessoa, essa classe deverá ter:

Um atributo do tipo String.
Um atributo do tipo int.
Os métodos gets/sets.
Um método chamado imprimePessoa que imprime o nome e a idade do nosso objeto pessoa.
 

Dicas
Tenha como base para o calculo o ano de 2021.
O ano informado pelo usuario jamais irá ser maior que 2021.
Fiquem atentos aos exemplos de saída.
Exemplos de Entrada e Saída
Entrada	
Sofia
1997
Saída	
Nome: Sofia
Idade: 24
Resultado
 */
import java.util.Scanner;

public class Pessoa{
	private String palavra1;
	private int num1;
	
	public void setPalv1(String novaPalavra1){
		this.palavra1=novaPalavra1;
	}
	public String getPalv1(){
		return this.palavra1;
	}
	public void setNum1(int novoNum1){
		this.num1=novoNum1;
	}
	public int getNum1(){
		return this.num1;
	}
	
	public void imprimePessoa(){
		String nome=this.getPalv1();
		int ano=this.getNum1();
		int anoAtual=2021;
		int idade=anoAtual-(ano);
		
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		
	}
	
	public static void main(String[] args){
		Pessoa num=new Pessoa();
		Scanner ler=new Scanner(System.in);
		
		String temp1=ler.nextLine();
		int temp2=ler.nextInt();
		
		num.setPalv1(temp1);
		num.setNum1(temp2);
		
		num.imprimePessoa();
        ler.close();
	}
}
