public class Tesla extends Carro implements Desligar,Ligar{

    private boolean eletrico;
    private int potencia;

    public Tesla(String nome, int id, String cor, boolean carroDisponivel) {
        super(nome, id, cor, carroDisponivel);
    }

    public void acelerar(){
        System.out.println("Acelerando o carro " + this.getNome());
    }

    @Override
    public void desligarMotor() {
        System.out.println(this.getNome() + " desligou o motor");
    }
    @Override
    public void ligarMotor() {
        System.out.println(this.getNome() + " ligou o motor");
    }
}
