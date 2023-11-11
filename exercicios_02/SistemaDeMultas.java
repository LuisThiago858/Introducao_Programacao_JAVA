package exercicios_02;

public class SistemaDeMultas {
    private float velMaxima;
    private float velAferida;

    public float getVelMax(){
        return this.velMaxima;
    }
    public void setVelMaxima(float novaVelMax){
        this.velMaxima=novaVelMax;
    }
    public float getVelAfer(){
        return this.velAferida;
    }
    public void setVelAferida(float novaVelAfer){
        this.velAferida=novaVelAfer;
    }


    private float deltaVel(){
        float dadoVelMax=this.getVelMax();
        float dadoVelAfer=this.getVelAfer();

        float dado3Delta=dadoVelAfer-dadoVelMax;

        return dado3Delta;
    }

    public void sistemaDeMultas(){

        if(deltaVel()<=0){
            System.out.println("Voce nao deve nada");
        }
        else{
            if(deltaVel()<=20.0f){
                System.out.println("Vacilou pensando na 10/10 ... Paga 100 contos");
            }
            else{
                if((deltaVel()>=20.0f) && (deltaVel()<=60.0f)){
                    System.out.println("Calma garotao... ja foi, nao volte mais... paga 500 contos");
                }
                else{
                    if(deltaVel()>=60.0f){
                        System.out.println("A vida nao ej forz motosport ... paga 1000.00 e entrega a CNH");
                    }
                }
            }
        }
    }
}
