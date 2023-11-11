package Lista02;
/*
 * Enunciado
Crie uma classe chamada Aumento, essa classe deverá ter:

Dois atributos do tipo float.
Os métodos gets/sets.
Um método chamado imprimeSalario que imprime o novo salário de um funcionário.
 

Dicas
Dado um salário atual e o percentual do reajuste calcule o novo salário de um funcionário.
Todos os dados serão pontos flutuantes.
utilize o método System.out.printf() para a impressão do resultado.
Fiquem atentos aos exemplos de saída.
Exemplos de Entrada e Saída
Entrada	
595 
6.7
Saída	
O novo salario eh: 634.86
Entrada	
2358.99
4.75
Saída	
O novo salario eh: 2471.04
Resultado
 */
import java.util.Scanner;

public class Aumento{
	
	private float salarioAtual;
	private float percentual;
	
	public void setSalario(float novoSalario){
		this.salarioAtual=novoSalario;
	}
	public float getSalario(){
		return this.salarioAtual;
	}
	public void setPercentual(float novoPercentual){
		this.percentual=novoPercentual;
	}
	public float getPercentual(){
		return this.percentual;
	}
	
	public void imprimeSalario(){
		float salario=this.getSalario();
		float percentual=this.getPercentual();
		float novoSalario=(salario+(salario*percentual/100));
		System.out.printf("O novo salario eh: %.2f\n", novoSalario);
	}
	
	
	public static void main(String[] args){
		Aumento num=new Aumento();
		Scanner ler=new Scanner(System.in);
		float temp4=ler.nextFloat();
		float temp5=ler.nextFloat();
		num.setSalario(temp4);
		num.setPercentual(temp5);
		num.imprimeSalario();
		
        ler.close();
	}
}
