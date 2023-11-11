package Lista03;
/*
 * Enunciado
Liberar acesso
Um grande colega de trabalho está tentando buscar uma forma de imprimir uma mensagem somente  quando uma chave passada pelo usuário for igual a um valor pré-definido, você como um bom amigo decide ajuda-ló. Sua missão nesse exercício é que dado uma chave do tipo String deve comparar se ela é idêntica ao chave do nosso programa, caso não seja seu programa deve terminar, se obter sucesso com a chave deve ser informado ao usuário que seu acesso foi liberado por meio da  seguinte frase:

"$$$ Acesso Liberado, chave: {admin} $$$"

Dicas
O nome da classe deve ser LiberarAcesso.
Observe os casos de teste.
Ao fim do programa deve ser impressa a seguinte frase: "Fim do programa".
A chave secreta é "admin".
Não se prenda somente aos exemplos mostrados.
Pesquise pelo método equals do java.
Qualquer dúvida entre em contato com os monitores.
Exemplos de Entrada e Saída
Entrada	
admim
Saída	
Fim do programa
Entrada	
admin
Saída	
$$$ Acesso Liberado, chave: {admin} $$$
Fim do programa
Resultado
 */
import java.util.Scanner;

public class LiberarAcesso{
	private String chave;
	
	public void setChave(String novaChave){
		this.chave=novaChave;
	}
	public String getChave(){
		return this.chave;
	}
	public void acessoChave(){
		String acesso=this.getChave();
		String chave="admin";
		if(acesso.equals(chave)){
			System.out.println("$$$ Acesso Liberado, chave: {"+chave+"} $$$");
		}
		if(acesso!=chave){
			System.out.println("Fim do programa");
		}
	}
	
	public static void main(String[] args){
		LiberarAcesso usuario=new LiberarAcesso();
		Scanner ler = new Scanner(System.in);
		
		String temp;
		temp=ler.nextLine();
		usuario.setChave(temp);
		usuario.acessoChave();

        ler.close();
	}
}
