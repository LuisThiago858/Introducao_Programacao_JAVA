package Lista05;
/*Enunciado
"OMS"

A Organização Mundial de Saúde (OMS) define adolescência como sendo o período da vida que começa aos 10 anos e termina aos 24 anos completos. Logo, está dividida em três fases, que podem ser vistas abaixo:

Infância - dos 0 até 9 anos e 12 meses;
Pré-adolescência – dos 10 aos 14 anos;
Adolescência – dos 15 aos 19 anos;
Juventude – dos 20 aos 24 anos.
Faça um programa respeite a convenção da OMS. Use ponto flutuante (float/double) para ler a idade, dessa forma, considere os anos e meses de vida sepados pelo ponto decimal.

Dicas
A idade sempre será menor que 25;
Não imprima com acentos;
Use letras minúsculas.
Você é livre para escolher o nome da classe.
Observe os casos de teste.
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
24.0
Saída	
juventude
Resultado
 */
import java.util.Scanner;

public class OMS{
	private float idade;
	
	public float getIdade(){
		return this.idade;
	}
	public void setIdade(float novaIdade){
		this.idade=novaIdade;
	}
	
	public void classificaIdade(){
		float tempI=this.getIdade();
		if((tempI>=0.0f)&&(tempI<=9.9f)){
			System.out.println("infancia");
		}else if((tempI>=10.0f)&&(tempI<14.9f)){
			System.out.println("pre-adolescencia");
		}else if((tempI>=15.0f)&&(tempI<19.9f)){
			System.out.println("adolescencia");
		}else if((tempI>=20.0f)&&(tempI<=24.9f)){
			System.out.println("juventude");
		}
	}
	
	public static void main(String[] args){
		OMS idade=new OMS();
		Scanner ler=new Scanner(System.in);
		
		float tempI=ler.nextFloat();
		idade.setIdade(tempI);
		idade.classificaIdade();
        ler.close();
	}
}
