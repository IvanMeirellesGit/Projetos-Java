public class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor) {
        this();
        System.out.println("Novo livro criado!");
        this.autor = autor;
    } // Construtor da classe Livro recebendo autor como parametro

    public Livro() {
        this.isbn = "000-00-00000-00-0";
    }// Construtor vazio

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void MostrarDetalhes() {
        System.out.println("--");
        String mensagemLivro = "Mostrando detalhes do livro ";
        System.out.println(mensagemLivro);
        System.out.println("--");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("Isbn: " + getIsbn());

        if (this.temAutor()) {
            getAutor().MostrarDetalhes();
        }
        System.out.println("--");
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        this.valor -= getValor() * porcentagem;
        return true;
    }

    public boolean temAutor() {
        return this.getAutor() != null;
    }
}