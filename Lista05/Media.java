package Lista05;
/*
 * Enunciado
"Situação do aluno"

Sua missão é criar um programa que calcule a media de um aluno através de suas três notas, e apartir dessa média verifica sua situação onde:

Média	Situação
maior ou igual 7	Aprovado
menor que 3	Reprovado
?	Prova final
 

Dicas
Você é livre para escolher o nome da classe.
Observe os casos de teste.
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
5
6
7
Saída	
Prova final
Resultado

 */
import java.util.Scanner;

public class Media{
	private int nota1;
	private int nota2;
	private int nota3;
	
	public int getNota1(){
		return this.nota1;
	}
	public void setNota1(int novaNota1){
		this.nota1=novaNota1;
	}
	
	public int getNota2(){
		return this.nota2;
	}
	
	public void setNota2(int novaNota2){
		this.nota2=novaNota2;
	}
	
	public int getNota3(){
		return this.nota3;
	}
	public void setNota3(int novaNota3){
		this.nota3=novaNota3;
	}
	
	public void notaMedia(){
		int num1=this.getNota1();
		int num2=this.getNota2();
		int num3=this.getNota3();
		int media=((num1+num2+num3)/3);
		if(media>=7){
			System.out.println("Aprovado");
		}else if((media>=3)&&(media<=6)){
			System.out.println("Prova final");
		}else{
			System.out.println("Reprovado");
		}
	}
	
	public static void main(String[] args){
		Media aluno=new Media();
		Scanner ler=new Scanner(System.in);
		int num1=ler.nextInt();
		int num2=ler.nextInt();
		int num3=ler.nextInt();
		
		aluno.setNota1(num1);
		aluno.setNota2(num2);
		aluno.setNota3(num3);
		
		aluno.notaMedia();
        ler.close();
	}
}
