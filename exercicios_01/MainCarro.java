package exercicios_01;
public class MainCarro {
    public static void main(String[] args){
        System.out.println("Programa carro inicializado!!");
        Carro carro01;
        carro01=new Carro();

        carro01.setPlaca("THX-7895");
        carro01.setMotor(false);
        carro01.setVelocidade(0);

        System.out.println("A placa do meu carro eh: "+carro01.getPlaca());
        System.out.println("O estado do motor eh: "+carro01.getMotor());
        System.out.println("A velocidade atual do carro eh: "+carro01.getVelocidade());
        carro01.ligarCarro();
        System.out.println("O estado do motor eh: "+carro01.getMotor());
        carro01.acelerar();
        System.out.println("A velocidade atual do carro eh: "+carro01.getVelocidade());
        carro01.freiar();
        System.out.println("A velocidade atual do carro eh: "+carro01.getVelocidade());
        carro01.replacamento();
        System.out.println("A replacamento do meu novo carro eh: "+carro01.getPlaca());
    }
}
