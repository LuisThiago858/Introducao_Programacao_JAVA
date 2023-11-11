package Prova01;

public class MultaVelocidade {
    private int velocidadeMV;
    private int velocidadeM;

    public int getVelocidadeMV(){
        return this.velocidadeMV;
    }
    public void setVelocidadeMV(int novaVeloMV){
        this.velocidadeMV=novaVeloMV;
    }

    public int getVelocidadeM(){
        return this.velocidadeM;
    }
    public void setVelocidadeM(int novoVeloM){
        this.velocidadeM=novoVeloM;
    }

    public void calcularMulta(){
        int tempVeloMV=this.getVelocidadeM();
        int tempVeloM=this.getVelocidadeM();

        int velocidadeUltrapassada=((tempVeloM)-(tempVeloMV));
        int multa=0;

        if((velocidadeUltrapassada>0)&&(velocidadeUltrapassada<=10)){
            multa=+50;
            System.out.println(multa);
        }else if((velocidadeUltrapassada>10)&&(velocidadeUltrapassad<=10>)){
            multa=+100;
            System.out.println(multa);
        }else if(velocidadeUltrapassada>30){
            multa=+200;
            System.out.println(multa);
        }else{
            multa=0;
            System.out.println(multa);
        }
    }

    public static void main(String[] args){
        MultaVelocidade motora=new MultaVelocidade();
        Scanner ler = new Scanner(System.in);

        int VMAX=ler.nextInt();
        int VMOTORA=ler.nextInt();
        motora.setVelocidadeMV(VMOTORA);
        motora.setVelocidadeM(VMOTORA);
    }
    
}
