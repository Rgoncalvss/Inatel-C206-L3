public class Honda extends Carro implements Desligar, Abastecer{

    private boolean flex;
    private boolean tracao;

    public Honda(String nome, int id, String cor, boolean carroDisponivel) {
        super(nome, id, cor, carroDisponivel);
    }

    public void ligarMotor(){
        System.out.println(this.getNome() + " ligando o motor");
    }

    @Override
    public void desligarMotor() {
        System.out.println(this.getNome() + " desligou o motor");
    }


    @Override
    public void abastecer() {
        System.out.println("Carro abastecido");
    }
}
