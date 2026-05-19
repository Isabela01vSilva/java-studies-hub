public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("\nTitulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
     }

    void avaliar(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double media(){
        double conta = avaliacao / numAvaliacoes;
        return conta;
    }
}
