public class Carro extends Veiculo{
    private String chassi;

    public String getChassi(){
        return chassi;
    }

    public void setChassi(String chassi){
        this.chassi = chassi;
    }

    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro Ligado");   
    }
    public void confereCombustivel(){
        System.out.println("Conferindo Combustível");
    }

    public void confereCambio(){
        System.out.println("Conferindo cambio em P");
    }

}
