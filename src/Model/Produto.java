/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Produto {
    int id;
    String nome,plataforma,qtd_min,valor_compra,valor_venda,tipo;

    public Produto(int id, String nome, String plataforma, String qtd_min, String valor_compra, String valor_venda, String tipo) {
        this.id = id;
        this.nome = nome;
        this.plataforma = plataforma;
        this.qtd_min = qtd_min;
        this.valor_compra = valor_compra;
        this.valor_venda = valor_venda;
        this.tipo = tipo;
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

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getQtd_min() {
        return qtd_min;
    }

    public void setQtd_min(String qtd_min) {
        this.qtd_min = qtd_min;
    }

    public String getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(String valor_compra) {
        this.valor_compra = valor_compra;
    }

    public String getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(String valor_venda) {
        this.valor_venda = valor_venda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
