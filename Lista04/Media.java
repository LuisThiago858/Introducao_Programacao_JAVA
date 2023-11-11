package Lista04;
/*
 * Enunciado
Média do aluno
Você tem vários colegas que desejam saber se passaram ou reprovaram a partir da média das suas notas, porém eles não querem ficar fazendo todos esses cálculos, você como um bom amigo resolve criar um programa que calcula a média de um aluno e verifica se ele foi aprovado ou reprovado.  A entrada consiste em 3 notas do tipo float. Ao final informe a média do aluno e sua situação final aprovado ou reprovado.

Dicas
Você é livre para escolher o nome da classe.
A média dever ser maior que 5 para o aluno ser aprovado.
Caso o aluno seja aprovado exiba a mensagem "Media: X, ta aprovado meu peixe".
Observe os casos de teste.
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
5
5
5
Saída	
Media: 5.00, infelizmente ta reprovado
Resultado
 */
import java.util.Scanner;

public class Media{
	private float nota1;
	private float nota2;
	private float nota3;
	
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
	
	public void media(){
		float tempNota1=this.getNota1();
		float tempNota2=this.getNota2();
		float tempNota3=this.getNota3();
		float media=((tempNota1+tempNota2+tempNota3)/3.0f);
		
		if((media>=0)&&(media<=5)){
			System.out.printf("Media: %.2f, infelizmente ta reprovado", media);
		}else if((media>5)&&(media<=10)){
			System.out.printf("Media: %.2f, ta aprovado meu peixe", media);
		}
	}
	
	public static void main(String[] args){
		Media ano = new Media();
		Scanner ler = new Scanner(System.in);
		
		float temp1=ler.nextFloat();
		float temp2=ler.nextFloat();
		float temp3=ler.nextFloat();
		ano.setNota1(temp1);
		ano.setNota2(temp2);
		ano.setNota3(temp3);
		ano.media();
        ler.close();
	}
}
