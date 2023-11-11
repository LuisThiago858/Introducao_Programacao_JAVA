package Lista02;
/*
 * Enunciado
Crie uma classe chamada Aluno, essa classe deverá ter:

Um atributo do tipo String.
Um atributo do tipo int.
Um atributo do tipo char.
Três atributo do tipo float.
Os métodos gets/sets.
Um método chamado imprimeMedia que imprime a médias das notas.
Um método chamado imprimeAluno que imprime todas as informações do aluno inclusive sua média.
Dicas
Seu programa deverá ler as seguintes informações de um aluno:

nome
idade
sexo
nota1
nota2
nota3
Os nomes sempre serão compostos.

Fiquem atentos aos exemplos de saída.

Exemplos de Entrada e Saída
Entrada	
Max Steel
18
m
9.3
9.9
10
Saída	
Nome: Max Steel
Idade: 18
Sexo: m
Media: 9.73
Entrada	
Zeca Urubu
26
m
4.3
3.7
1.2
Saída	
Nome: Zeca Urubu
Idade: 26
Sexo: m
Media: 3.07
Resultado
 */
import java.util.Scanner;

public class Aluno01{
	private String nome;
	private int idade;
	private char sexo;
	private float nota1;
	private float nota2;
	private float nota3;
	
	public void setNome(String novoNome){
		this.nome=novoNome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setIdade(int novaIdade){
		this.idade=novaIdade;
	}
	public int getIdade(){
		return this.idade;
	}
	public void setSexo(char novoSexo){
		this.sexo=novoSexo;
	}
	public char getSexo(){
		return this.sexo;
	}
	public void setNota1(float novaNota1){
		this.nota1=novaNota1;
	}
	public float getNota1(){
		return this.nota1;
	}
	public void setNota2(float novaNota2){
		this.nota2=novaNota2;
	}
	public float getNota2(){
		return this.nota2;
	}
	public void setNota3(float novaNota3){
		this.nota3=novaNota3;
	}
	public float getNota3(){
		return this.nota3;
	}
	
	
	
	public void imprimeAluno(){
		String temp1=this.getNome();
		int temp2=this.getIdade();
		char temp3=this.getSexo();
		
		System.out.println("Nome: "+temp1);
		System.out.println("Idade: "+temp2);
		System.out.println("Sexo: "+temp3);
	}
	public void imprimeMedia(){
		float temp1=this.getNota1();
		float temp2=this.getNota2();
		float temp3=this.getNota3();
		float media=((temp1+temp2+temp3)/3.0f);
		System.out.printf("Media: %.2f\n", media);
	}
	
	public static void main(String[] args){
		Aluno01 num=new Aluno01();
		Scanner ler=new Scanner(System.in);
		
		String temp1=ler.nextLine();
		int temp2=ler.nextInt();
		char temp3=ler.next().charAt(0);
		
		float temp4=ler.nextFloat();
		float temp5=ler.nextFloat();
		float temp6=ler.nextFloat();
		
		num.setNome(temp1);
		num.setIdade(temp2);
		num.setSexo(temp3);
		num.setNota1(temp4);
		num.setNota2(temp5);
		num.setNota3(temp6);
		
		
		num.imprimeAluno();
		num.imprimeMedia();
        ler.close();
	}
}
