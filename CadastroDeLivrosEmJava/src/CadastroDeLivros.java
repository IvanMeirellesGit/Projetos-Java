class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@gmail.com");
        autor.setCpf("123.456.789.10");

        Livro livro = new Livro(autor);
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");

        livro.MostrarDetalhes();

        Autor outroautor = new Autor();
        outroautor.setNome("Ivan Meirelles");
        outroautor.setEmail("ivanmeirellesgmail.com");
        outroautor.setCpf("789.456.123.30");

        Livro outrolivro = new Livro(outroautor);
        outrolivro.setNome("Lógica de Programação");
        outrolivro.setDescricao("Crie seus primeiros programas");
        outrolivro.setValor(89.90);
        //outrolivro.setIsbn("978-85-66255-33-0");
        outrolivro.setAutor(outroautor);

        outrolivro.MostrarDetalhes();

        if (!livro.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto não pode ser maior do que 30%");
        } else {
            System.out.println("Valor com desconto: " + livro.getValor());
        }

        livro.aplicaDescontoDe(0.1);
        outrolivro.aplicaDescontoDe(0.1);
    }
}