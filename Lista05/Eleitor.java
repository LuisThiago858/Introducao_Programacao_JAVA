package Lista05;
/*
 * Enunciado
"Eleições"

Nesse exercício você deve criar um programa que a partir da idade informada de um eleitor, elabore um método calcule e imprima a sua classe eleitoral, sabendo que:

menores de 16 não votam - não votante, 
que o voto é obrigatório para adultos entre 18 e 65 anos  - eleitor obrigatório 
que o voto é opcional para eleitores entre 16 e 18, ou maiores de 65 anos  - eleitor facultativo.
Dicas
Sua classe deve se chamar Eleitor, cujo atributo é a idade.
Não use acentos para imprimir!!.
Observe os casos de teste.
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
15
Saída	
nao votante
Entrada	
19
Saída	
eleitor obrigatorio
Entrada	
17
Saída	
eleitor facultativo
Resultado

 */
import java.util.Scanner;

public class Eleitor{
	private int idade;
	
	public int getIdade(){
		return this.idade;
	}
	public void setIdade(int novaIdade){
		this.idade=novaIdade;
	}
	
	public void votaSimouNao(){
		int idade=this.getIdade();
		
		if(idade<16){
			System.out.println("nao votante");
		}else if((idade>=16)&&(idade<=18)||(idade>65)){
			System.out.println("eleitor facultativo");
		}else if((idade>18)&&(idade<=65)){
			System.out.println("eleitor obrigatorio");
		}
	}
	
	public static void main(String[] args){
		Eleitor pessoa=new Eleitor();
		Scanner ler=new Scanner(System.in);
		
		int idade=ler.nextInt();
		
		pessoa.setIdade(idade);
		
		
		pessoa.votaSimouNao();
        ler.close();
	}
}
