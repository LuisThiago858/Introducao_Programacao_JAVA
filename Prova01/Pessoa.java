package Prova01;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int anoNascimento;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String novoNome){
        this.nome=novoNome;
    }
    public int getAnoNascimento(){
        return this.anoNascimento;
    }
    public void setAnoNascimento(int novoAnoNasc){
        this.anoNascimento=novoAnoNasc;
    }

    public void calculaIdade(){
        String tempNome=this.getNome();
        int tempAnoNasc=this.getAnoNascimento();
        int idade=(2020-(tempAnoNasc));
        System.out.println("Nome: "+tempNome);
        System.out.println("Idade: "+idade);
    }

    public static void main(String[] args){
        Pessoa individuo=new Pessoa();
        Scanner ler = new Scanner(System.in);
        String nomeI=ler.nextLine();
        int idadeI=ler.nextInt();
        individuo.setNome(nomeI);
        individuo.setAnoNascimento(idadeI);
        individuo.calculaIdade();
    }
}
