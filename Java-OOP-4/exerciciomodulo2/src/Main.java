import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {
    public static void main(String[] args) {
        //1
        String jsonPessoa = "{nome: Rodrigo, idade:20, cidade: Brasília}";
        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println(pessoa);

        //2
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println("Objeto Livro: " + livro);
    }
}