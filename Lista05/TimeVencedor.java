package Lista05;
/*
 * Enunciado
"Melhor time"

Sua missão é dado dois times A e B e a quantidade respectiva de gols que cada um fez em uma partida, elaborar um programa que verifique se houve um time vencedor ou não.

Dicas
O programa deve apresentar a mensagem "Os times 'nomeTimeA' e 'nomeTimeB' empataram.
Crie um método chamado verificaVencedor que recebe por parâmetro um objeto da classe TimeVencedor.
Crie uma classe com o nome TimeVencedor.
Observe os casos de teste.
Não se prenda somente aos exemplos mostrados.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
Flamengo
20
Vasco
0
Saída	
Flamengo foi o vencedor da partida.
Resultado
 */
import java.util.Scanner;

public class TimeVencedor{
	private String time;
	private int gols;
	
	public String getTime(){
		return this.time;
	}
	public void setTime(String novoTime){
		this.time=novoTime;
	}
	public int getGols(){
		return this.gols;
	}
	public void setGols(int novoGol){
		this.gols=novoGol;
	}
	
	public void verificaVencedor(TimeVencedor time1, TimeVencedor time2){
		if(time1.getGols()>time2.getGols()){
			System.out.println(time1.getTime()+" foi o vencedor da partida.");
		}else if(time2.getGols()>time1.getGols()){
			System.out.println(time2.getTime()+" foi o vencedor da partida.");
		}else{
			System.out.println("Os times "+time1.getTime()+" e "+time2.getTime()+" empataram.");
		}
	}
	
	public static void main(String[] args){
		TimeVencedor timeA=new TimeVencedor();
		TimeVencedor timeB=new TimeVencedor();
		Scanner ler=new Scanner(System.in);
		
		String nomeTimeA=ler.nextLine();
		timeA.setTime(nomeTimeA);
		int quantiGolA=ler.nextInt();
		timeA.setGols(quantiGolA);
		ler.nextLine();
		String nomeTimeB=ler.nextLine();
		timeB.setTime(nomeTimeB);
		int quantiGolB=ler.nextInt();
		timeB.setGols(quantiGolB);
		
		timeA.verificaVencedor(timeA, timeB);
        ler.close();
	}   	
}
