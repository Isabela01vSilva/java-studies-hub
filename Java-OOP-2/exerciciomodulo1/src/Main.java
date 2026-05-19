public class Main {
    public static void main(String[] args) {
        //1
        Pessoa pessoa1 = new Pessoa();
        pessoa1.exibirMensagem();

        //2
        Calculadora numero1 = new Calculadora();
        numero1.calculadora(10);

        //3
        Musica musica1 = new Musica();
        musica1.titulo = "Mistérios";
        musica1.artista = "KayBlack";
        musica1.anoLancamento = 2024;
        musica1.exibirFichaTecnica();
        musica1.avaliar(8.0);
        musica1.avaliar(5.0);
        musica1.avaliar(2.0);
        System.out.println("Total de avaliações: " + musica1.avaliacao);
        System.out.println("Quantidade de avaliações: " + musica1.numAvaliacoes);
        System.out.println("A média de avaliações é: " + musica1.media());

        //4
        Carro carro1 = new Carro();
        carro1.modelo = "Civic";
        carro1.ano = 2020;
        carro1.cor = "Preto";

        carro1.exibirCarro();
        carro1.idadeCarro(2024);
        System.out.println("Idade do carro: " + carro1.ano);

        //5
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Carlos";
        aluno1.idade = 18;
        aluno1.exibirAluno();
    }
}