public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "The Matrix";
        meuFilme.anoDeLancamento = 1999;
        meuFilme.duracaoEmMinutos = 135;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(7);

        System.out.println("Total de avaliações do filme: " +meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " +meuFilme.pegaMedia());

        //Classe Pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        //Classe Calculadora
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);

        //Classe Musica
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Nome da Música";
        minhaMusica.artista = "Nome do Artista";
        minhaMusica.anoLancamento = 2023;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(4.5);
        minhaMusica.avalia(3.8);
        minhaMusica.avalia(5.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);

        //Classe Carro
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Gol";
        meuCarro.ano = 2023;
        meuCarro.cor = "Preto";

        meuCarro.exibeFichaTecnica();

        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");

        //Classe Aluno
        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Akemi";
        meuAluno.idade = 18;

        meuAluno.exibeInformacoes();
    }

}