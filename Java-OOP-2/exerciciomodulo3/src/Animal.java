public class Animal {
    private String nome;
    private String tamanho;
    private String cor;
    private String tipo;

    public void cadastrarAnimal (String name, String tamanho, String cor, String tipo){
        this.nome = name;
        this.tamanho = tamanho;
        this.cor = cor;
        this.tipo = tipo;
    }

    public void exibirAnimal() {
        System.out.println("**********");
        System.out.println("Nome: " + nome);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
        System.out.println("Raça: " + tipo);
    }

    public void emitirSom(){
        System.out.println("Som do animal");
    }
}
