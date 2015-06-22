/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Fornecedor {
    int Produto_idProduto, idFornecedor,telefone;
    String cnpj, nome, endereco;

    public Fornecedor(int Produto_idProduto, int idFornecedor, int telefone, String cnpj, String nome, String endereco) {
        this.Produto_idProduto = Produto_idProduto;
        this.idFornecedor = idFornecedor;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        
    }

    public int getProduto_idProduto() {
        return Produto_idProduto;
    }

    public void setProduto_idProduto(int Produto_idProduto) {
        this.Produto_idProduto = Produto_idProduto;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
