package com.isa.usersystem.model;

//Estrutura do padrão builder quando o builder é parâmetro do padrão Factory
public class UsuarioBuilder {

    //Declaração dos atributos Builder
    private String nome;
    private String cpf;
    private String telefone;
    private String email; //opcional
    //no Postman, coloque tipo como o 5º atributo para a lógica de cadastro funcionar

    //REPETE OS GETs de UsuarioComum e UsuarioAdministrador

    //Metodos get tradicionais (DEVE TER para não dar erro na Controller e Service)
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    //Metodos set Builder
    public UsuarioBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public UsuarioBuilder setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public UsuarioBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public UsuarioBuilder setEmail(String email) {
        this.email = email;
        return this;
    }
}

