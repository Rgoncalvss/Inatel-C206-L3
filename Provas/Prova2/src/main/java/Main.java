public class Main {
    public static void main(String[] args) {

        Concecionaria concecionaria = new Concecionaria();
        int aux = 0;
        concecionaria.carros[0] = new Fiat("Uno",aux,"Cinza",false);
        concecionaria.carros[1] = new Honda("Civic",aux,"Preto",true);
        concecionaria.carros[2] = new Tesla("Model X", aux, "Branco",true);


        concecionaria.mostraInfo();
        System.out.println(" ");
        for(int i = 0; i < concecionaria.carros.length; i++){
                if(concecionaria.carros[i] instanceof Fiat fiat){
                    fiat.mostraInfo();
                    fiat.ligarMotor();
                    fiat.abastecer();
                    fiat.pegarPassageiro();
                    fiat.venderCarro();
                }
                else if(concecionaria.carros[i] instanceof Honda honda){
                    System.out.println(" ");
                    honda.mostraInfo();
                    honda.ligarMotor();
                    honda.venderCarro();
                }
                else if(concecionaria.carros[i] instanceof Tesla tesla){
                    System.out.println(" ");
                    tesla.mostraInfo();
                    tesla.ligarMotor();
                    tesla.acelerar();
                    tesla.desligarMotor();
                }
        }
    }
}
