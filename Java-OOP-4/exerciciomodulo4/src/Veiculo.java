import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricado;
    private double preco;

    public Veiculo(String marca, String modelo, int anoFabricado, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricado = anoFabricado;
        this.preco = preco;
    }

    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("Honda", "Civic", 2020, 11000.00);
        Veiculo carro2 = new Veiculo("Toyota", "Corolla", 2022, 98000.00);

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro1);
        veiculos.add(carro2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonVeiculo = gson.toJson(veiculos);

        System.out.println("Objeto veiculo em Json");
        System.out.println(jsonVeiculo);

        try (FileWriter escreve = new FileWriter("arquivoCarro.txt")) {
            escreve.write(jsonVeiculo);
            System.out.println("Dados gravados com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
