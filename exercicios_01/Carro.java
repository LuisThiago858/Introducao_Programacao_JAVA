package exercicios_01;
public class Carro {
    private String placa;
    private boolean motor;
    private Integer velocidade;


    public void setPlaca(String novaPlaca){
        this.placa=novaPlaca;
    }
    public String getPlaca(){
        return this.placa;
    }

    public void setMotor(boolean novoMotor){
        this.motor=novoMotor;
    }
    public boolean getMotor(){
        return this.motor;
    }

    public void setVelocidade(int novaVelocidade){
        this.velocidade=novaVelocidade;
    }
    public int getVelocidade(){
        return this.velocidade;
    }

    public void ligarCarro(){
        this.setMotor(true);
        System.out.println("Motor ligado!!");
    }

    public void acelerar(){
        int temp;
        temp=this.getVelocidade();
        this.setVelocidade(temp+30);
        System.out.println("Carro acelerou!!");
    }

    public void freiar(){
        int temp;
        temp=this.getVelocidade();
        this.setVelocidade(temp-10);
        System.out.println("Carro freiou!!");
    }
    public void replacamento(){
        String temp;
        temp="JKL-7856";
        this.setPlaca(temp);
    }
}
