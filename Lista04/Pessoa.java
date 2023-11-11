package Lista04;
/*
 * Enunciado
Maior de idade
A boate primas celestiais contratou você para realizar um programa que verifica se um cliente é maior de idade. Dado uma data de nascimento e seu nome o programa deve retornar informar se o cliente pode entrar ou não na boate.

Dicas
Implemente a classe Pessoa.
Sua classe deve ter dois atributos nome (String) e anoNascimento (int).
Tenha como base para o calculo o ano de 2021.
O ano informado pelo usuario jamais irá ser maior que 2021.
Observe os casos de teste.
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
Sofia
1997
Saída	
Sofia entrada liberada, divirta-se a vontade na melhor boate da regiao norte
Entrada	
Pedrinho
2014
Saída	
Pedrinho entrada negada, volte daqui a alguns anos
Resultado

 */
import java.util.Scanner;

public class Pessoa{
	
	private String nome;
	private int ano;
	
	public void setNome(String novoNome){
		this.nome=novoNome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setAno(int novoAno){
		this.ano=novoAno;
	}
	public int getAno(){
		return this.ano;
	}
	
	public void resultadoMaiorIdade(){
		String nome=this.getNome();
		int ano=this.getAno();
		int resultado=((2021)-(ano));
		if(resultado>0){
			if(resultado>=18){
				System.out.println(nome+" entrada liberada, divirta-se a vontade na melhor boate da regiao norte");
			}else{
				System.out.println(nome+" entrada negada, volte daqui a alguns anos");
			}
		}
		
	}
	public static void main(String[] args){
		Pessoa pes = new Pessoa();
		Scanner ler=new Scanner(System.in);
		
		String temp1=ler.nextLine();
		int temp2=ler.nextInt();
		
		pes.setNome(temp1);
		pes.setAno(temp2);
		
		pes.resultadoMaiorIdade();
		ler.close();
	}
}
