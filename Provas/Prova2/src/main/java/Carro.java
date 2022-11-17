public abstract class Carro {

    private String nome;
    private int id;
    private String cor;
    private boolean carroDisponivel;
    public static int cont = 0;

    public Carro(String nome, int id, String cor, boolean carroDisponivel) {
        this.nome = nome;
        this.id = cont + 1;
        this.cor = cor;
        this.carroDisponivel = carroDisponivel;
        cont++;
    }

    public void mostraInfo(){
        System.out.println("Total de carros da concecionaria: " + this.cont);
        System.out.println("O modelo: " + this.nome + " da cor: " + this.cor + " de identificacao: " + this.id);
    }

    public void venderCarro(){
        if(this.carroDisponivel == true){
            System.out.println("Carro vendido");
            cont--;
        }
        else
            System.out.println("Carro indisponivel");
    }

    //Getters e Setters

    public static int getCont(){
        return cont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isCarroDisponivel() {
        return carroDisponivel;
    }

    public void setCarroDisponivel(boolean carroDisponivel) {
        this.carroDisponivel = carroDisponivel;
    }
}
