import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        //1
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(12345);
        conta.setSaldo(1100);
        conta.titular = "Pedro";

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());

        //2
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Carla");
        pessoa.setIdade(2);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        pessoa.verificarIdade();

        //3
        Produto produto = new Produto();
        produto.setNome("Shampoo");
        produto.setPreco(30.99);

        produto.aplicarDesconto(5);
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());

        //4
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Aline");
        aluno1.setNota1(5.5);
        aluno1.setNota2(7.6);
        aluno1.setNota3(7.4);
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.calcularMedia());

        //5
        Livro livro1 = new Livro();
        livro1.setTitulo("O monge e o executivo");
        livro1.setAutor("James");

        Livro livro2 = new Livro();
        livro2.setTitulo("Minha historia de vida");
        livro2.setAutor("Britney Speark");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}