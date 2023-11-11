package Lista05;

/*
 * Enunciado
"Classificando o trapézio"

Desenvolva um programa no que calcule a área de um trapézio. O programa deve permitir que se introduzam os dados de um trapézio. Se a área for menor que 5 se deve classificar o trapézio como Pequeno, se estiver entre 5 e 10 se classifica como  Normal e se for maior que 10 se classifica como Grande. Para cada trapézio introduzido se deve indicar a classificação para o trapézio introduzido.

Dicas
Você é livre para escolher o nome da classe.
Observe os casos de teste.
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
10
5
3
Saída	
Grande
Resultado
 */
import java.util.Scanner;

public class Trapezio{
	private int lado1;
	private int lado2;
	private int lado3;
	
	public int getLado1(){
		return this.lado1;
	}
	public void setLado1(int novoLado1){
		this.lado1=novoLado1;
	}
	
	public int getLado2(){
		return this.lado2;
	}
	
	public void setLado2(int novoLado2){
		this.lado2=novoLado2;
	}
	
	public int getLado3(){
		return this.lado3;
	}
	public void setLado3(int novoLado3){
		this.lado3=novoLado3;
	}
	
	public void tipoTrapezio(){
		int num1=this.getLado1();
		int num2=this.getLado2();
		int num3=this.getLado3();
		
		int areaT=(((num1+num2)*num3)/2);
		if(areaT<5){
			System.out.println("Pequeno");
		}else if((areaT>=5)&&(areaT<=10)){
			System.out.println("Normal");
		}else if(areaT>10){
			System.out.println("Grande");
		}
	}
	
	public static void main(String[] args){
		Trapezio figura=new Trapezio();
		Scanner ler=new Scanner(System.in);
		
		int ld1=ler.nextInt();
		int ld2=ler.nextInt();
		int ld3=ler.nextInt();
		
		figura.setLado1(ld1);
		figura.setLado2(ld2);
		figura.setLado3(ld3);
		
		figura.tipoTrapezio();
        ler.close();
	}
}
