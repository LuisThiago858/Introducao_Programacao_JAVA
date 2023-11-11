package Lista02;

/*
 * Enunciado
Crie uma classe chamada Aluno, essa classe deverá ter:

Um atributo do tipo String.
Um atributo do tipo int.
Os métodos gets/sets.
Um método chamado imprimeInformacoes que imprime os dados do objeto.
 

Dicas
Leia do teclado um nome e uma idade, e imprima esses valores usando a função System.out.printf();

Deve ser feita a quebra de linha manualmente.

Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
Zeca
46
Saída	
Zeca
46
Resultado
 */
import java.util.Scanner;

public class Aluno{
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
	
	public void imprimeInformacoes(){
		String temp1=this.getPalv1();
		int temp2=this.getNum1();
		
		System.out.printf(temp1+"\n"+temp2);
		
	}
	
	public static void main(String[] args){
		Aluno num=new Aluno();
		Scanner ler=new Scanner(System.in);
		
		String temp1=ler.nextLine();
		int temp2=ler.nextInt();
		
		num.setPalv1(temp1);
		num.setNum1(temp2);
		
		num.imprimeInformacoes();
        ler.close();
	}
}
