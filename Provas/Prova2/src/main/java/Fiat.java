public class Fiat extends Carro implements Desligar, Abastecer, Ligar{

    private boolean popular;
    private int capacidadeMax;

    public Fiat(String nome, int id, String cor, boolean carroDisponivel) {
        super(nome, id, cor, carroDisponivel);
    }


    public void pegarPassageiro(){
        System.out.println("Passageiro a bordo no carro " + this.getNome());
    }

    @Override
    public void desligarMotor() {
        System.out.println(this.getNome() + " desligou o motor");
    }

    @Override
    public void abastecer() {
        System.out.println("Carro abastecido");
    }

    @Override
    public void ligarMotor() {
        System.out.println(this.getNome() + " ligou o motor");
    }
}
