package Prova01;

import java.util.Scanner;

public class Eleitor{
    private int idade;
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int novaIdade){
        this.idade=novaIdade;
    }

    public void classificacaoEleitor(){
        int tidade=this.getIdade();
        if(tidade<16){
            System.out.println("nao votante");
        }else if((tidade>=18)&&(tidade<=65)){
            System.out.println("eleitor obrigatorio");
        }else if((tidade>=16)&&(tidade<18)){
            System.out.println("eleitor facultativo");
        }else{
            System.out.println("eleitor facultativo");
        }
    }

    public static void main(String[] args){
        Eleitor votante=new Eleitor();
        Scanner ler=new Scanner(System.in);

        int I=ler.nextInt();
        votante.setIdade(I);
        votante.classificacaoEleitor();
    }
}