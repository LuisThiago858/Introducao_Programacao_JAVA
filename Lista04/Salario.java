package Lista04;
/*
 * Enunciado
Conceder empréstimo
Você foi contratado pelo banco Mafu para realizar um programa que verifica se um cliente está apto para receber um empréstimo, para um cliente está apto o valor da prestação do empréstimo deve ser menor ou igual a 20% di salário total do cliente.

Dicas
Crie uma classe Salario.
Sua classe deverá ter apenas dois atibutos do tipo float.
Faça todos os métodos de acesso/modificação.
Crie um método chamado emprestimo que verifica se o valor da prestação é maior que 20% do salário total do trabalhador.
Leia o salário de um trabalhador e o valor da prestação de um empréstimo. Se a prestação for maior que 20% do salário imprima: "Emprestimo nao concedido...", caso contrário, "Emprestimo concedido!!!".
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
1045
200
Saída	
Emprestimo concedido!!!
Entrada	
2090
500
Saída	
Emprestimo nao concedido...
Resultado
 */
import java.util.Scanner;

public class Salario{
	private float valor;
	private float prestacao;
	
	public void setNota1(float novaNota1){
		this.valor=novaNota1;
	}
	public float getNota1(){
		return this.valor;
	}
	
	public void setNota2(float novaNota2){
		this.prestacao=novaNota2;
	}
	public float getNota2(){
		return this.prestacao;
	}
	
	public void emprestimo(){
		float salario=this.getNota1();
		float prestacao=this.getNota2();
		
		float verifica=((prestacao*100)/salario);
		
		if(verifica<=20.0f){
			System.out.println("Emprestimo concedido!!!");
		}else{
			System.out.println("Emprestimo nao concedido...");
		}
	}
	
	public static void main(String[] args){
		Salario empres = new Salario();
		Scanner ler = new Scanner(System.in);
		
		float temp1=ler.nextFloat();
		float temp2=ler.nextFloat();
		
		empres.setNota1(temp1);
		empres.setNota2(temp2);
		
		empres.emprestimo();
        ler.close();
	}
}
