/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class ProdutosVendidos {
    int id;
    String Quantidade;

    public ProdutosVendidos(int id, String Quantidade) {
        this.id = id;
        this.Quantidade = Quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }
    
}
