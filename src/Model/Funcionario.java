/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Funcionario {
    int id;
    String nome,endreco,rg,cpf,carteira_de_trabalho,senha,email,telefone;

    public Funcionario(int id, String nome, String endreco, String rg, String cpf, String carteira_de_trabalho, String senha, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endreco = endreco;
        this.rg = rg;
        this.cpf = cpf;
        this.carteira_de_trabalho = carteira_de_trabalho;
        this.senha = senha;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndreco() {
        return endreco;
    }

    public void setEndreco(String endreco) {
        this.endreco = endreco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCarteira_de_trabalho() {
        return carteira_de_trabalho;
    }

    public void setCarteira_de_trabalho(String carteira_de_trabalho) {
        this.carteira_de_trabalho = carteira_de_trabalho;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}
