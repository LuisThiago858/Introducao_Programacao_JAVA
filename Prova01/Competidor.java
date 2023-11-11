/* */

package Prova01;

import java.util.Scanner;

public class Competidor {
    private String nome;
    private int pontos;
    Competidor(String Cnome, int Cpontos){
        this.setNome(Cnome);
        this.setPontos(Cpontos);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String novoNome){
        this.nome=novoNome;
    }

    public int getPontos(){
        return this.pontos;
    }
    public void setPontos(int novoPonto){
        this.pontos=novoPonto;
    }

    public void ComparaCompetidorCom(Competidor comp1, Competidor comp2){
        if(comp1.getPontos()>comp2.getPontos()){
            System.out.println(comp1.getNome());
        }else{
            System.out.println(comp2.getNome());
        }
    }

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        String nome1=ler.nextLine();
        int pontos1=ler.nextInt();
        ler.nextLine();
        String nome2=ler.nextLine();
        int pontos2=ler.nextInt();
        Competidor competidor01=new Competidor(nome1, pontos1);
        Competidor competidor02=new Competidor(nome2, pontos2);
        competidor01.ComparaCompetidorCom(competidor01, competidor02);
    }
}
