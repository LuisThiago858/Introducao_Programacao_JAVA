package Lista05;
/*
 * Enunciado
"Multa ou não Multa"

Nesse exercício você deve ler a velocidade máxima permitida em uma avenida e a velocidade com que o motorista
estava dirigindo nela e calcule a multa que uma pessoa vai receber, sabendo que são pagos:


a) 50 reais se o motorista estiver ultrapassar em até 10km/h a velocidade permitida (ex.: velocidade máxima: 50km/h; motorista a 60km/h ou a 56km/h);
b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida.
c) 200 reais, se estiver acima de 31km/h da velocidade permitida.

Dicas
Crie o método construtor, acesso/modificação e um método chamado verifica que recebe por parâmetro a velocidade permitida na avenida e faz a checagem da velocidade do motorista.
Você é livre para escolher o nome da classe.
Observe os casos de teste.
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
suze
41 41
Saída	
Motorista: suze
Sem multa
Entrada	
silva
50 80
Saída	
Motorista: silva
Multa: R$ 100
Resultado
 */
import java.util.Scanner;

public class Multa{
	private String nome;
	private int veloP;
	private int veloU;
	
	Multa(String nNome, int nvelocidadePer, int nvelocidadeUlt){
		this.setNome(nNome);
		this.setVeloP(nvelocidadePer);
		this.setVeloU(nvelocidadeUlt);
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String novoNome){
		this.nome=novoNome;
	}
	public int getVeloP(){
		return this.veloP;
	}
	public void setVeloP(int novoVelP){
		this.veloP=novoVelP;
	}
	
	public int getVeloU(){
		return this.veloU;
	}
	public void setVeloU(int novoVelU){
		this.veloU=novoVelU;
	}
	
	public void verifica(){
		String nome=this.getNome();
		int veluP=this.getVeloP();
		int veluU=this.getVeloU();
		int velocidadeUltrapassada=(veluU)-(veluP);
		int quantoPagar=0;
		if((velocidadeUltrapassada>0)&&(velocidadeUltrapassada<=10)){
			quantoPagar=+50;
			System.out.println("Motorista: "+nome);
			System.out.println("Multa: R$ "+quantoPagar);
		}
		else if((velocidadeUltrapassada>=11) && (velocidadeUltrapassada<=30)){
			quantoPagar=+100;
			System.out.println("Motorista: "+nome);
			System.out.println("Multa: R$ "+quantoPagar);
		}
		else if(velocidadeUltrapassada>=31){
			quantoPagar=+200;
			System.out.println("Motorista: "+nome);
			System.out.println("Multa: R$ "+quantoPagar);
		}
		else{
			System.out.println("Motorista: "+nome);
			System.out.println("Sem multa");
		}
	}
	
	public static void main(String[] args){
		
		Scanner ler=new Scanner(System.in);
		String temp1=ler.nextLine();
		int temp2=ler.nextInt();
		int temp3=ler.nextInt();
		
		Multa ver=new Multa(temp1, temp2, temp3);
		
		ver.verifica();
        ler.close();
	}
}
