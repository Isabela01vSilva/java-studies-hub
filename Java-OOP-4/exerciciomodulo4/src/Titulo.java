import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Titulo {
    private String titulo = "Titulo de exemplo";
    private String autor = "Autor de exemplo";

    public static void main(String[] args) {

        Titulo titulo = new Titulo();
//      Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);

        System.out.println(json);
    }
}
