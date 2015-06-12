/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Venda {
    int id;
    String data_venda,itens,servico;

    public Venda(int id, String data_venda, String itens, String servico) {
        this.id = id;
        this.data_venda = data_venda;
        this.itens = itens;
        this.servico = servico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
            
}
