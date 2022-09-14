public class Main {
    public static void main(String[] args) {

        Produto[] produtos = new Produto[4];

        Produto p1 = new Notebook("Acer",1000,100,"GTX 1650","Ryzen 5");
        Produto p2 = new Camiseta("Nike",180,"Preto","M");
        Produto p3 = new Notebook("Lenovo",1500,1000,"GTX 1650","Ryzen 7");
        Produto p4 = new Camiseta("Puma",120,"Azul","G");

        produtos[0] = p1;
        produtos[1] = p2;
        produtos[2] = p3;
        produtos[3] = p4;

        for(int i = 0; i < produtos.length;i++){
            if(produtos[i] != null){
                if(produtos[i] instanceof Notebook){
                    Notebook pc =(Notebook) produtos[i];
                    System.out.println(pc.etiquetaPreco());
                }
                else if(produtos[i] instanceof Camiseta){
                    Camiseta c = (Camiseta) produtos[i];
                    System.out.println(c.etiquetaPreco());
                }
            }
        }

    }
}
