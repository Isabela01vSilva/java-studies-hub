import java.io.FileWriter;
import java.io.IOException;

public class GravandoArquivo {
    public static void main(String[] args) {
        String arquivo = "Conteudo do arquivo";

        try (FileWriter escreve = new FileWriter("arquivo.txt")) {
          escreve.write(arquivo);
            System.out.println("Dados gravados com sucesso");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}