public class Sedan extends Carro {
    private boolean temBancoCouro;

    public Sedan(String marca, String modelo, boolean temBancoCouro) {
        super(marca, modelo);
        this.temBancoCouro = temBancoCouro;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Banco de Couro: " + (temBancoCouro ? "Sim" : "Não");
    }
}

class SUV extends Carro {
    private boolean temTracao4x4;

    public SUV(String marca, String modelo, boolean temTracao4x4) {
        super(marca, modelo);
        this.temTracao4x4 = temTracao4x4;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Tração 4x4: " + (temTracao4x4 ? "Sim" : "Não");
    }
}

class Esportivo extends Carro {
    private int velocidadeMaxima;

    public Esportivo(String marca, String modelo, int velocidadeMaxima) {
        super(marca, modelo);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Velocidade Máxima: " + velocidadeMaxima + " km/h";
    }
}

