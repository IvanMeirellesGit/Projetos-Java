public class Autor {
    private String nome;
    private String email;
    private String cpf;

    public Autor() {
        System.out.println("Autor Criado");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void MostrarDetalhes() {
        String mensagemAutor = "Mostrando detalhes do autor ";
        System.out.println(mensagemAutor);
        System.out.println("--");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("CPF: " + getCpf());
    }
}
