import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaDeCarros = new ArrayList<>();

        listaDeCarros.add(new Sedan("Toyota", "Corolla", true));
        listaDeCarros.add(new SUV("Jeep", "Renegade", true));
        listaDeCarros.add(new Esportivo("Ferrari", "F8", 340));

        for (Carro carro : listaDeCarros) {
            System.out.println(carro.getDescricao());
        }
    }
}
