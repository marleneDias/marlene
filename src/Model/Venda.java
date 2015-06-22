/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Venda {
    int ID_Item,ID_Servico, ID_Funcionario,ProdutosVendidos_idProdutosVendidos;
    String data_venda,quantidade,Cliente_CPF;

    public Venda(int ID_Item, int ID_Servico, int ID_Funcionario, int ProdutosVendidos_idProdutosVendidos, String data_venda,String quantidade,String Cliente_CPF) {
        this.ID_Item = ID_Item;
        this.ID_Servico = ID_Servico;
        this.ID_Funcionario = ID_Funcionario;
        this.ProdutosVendidos_idProdutosVendidos = ProdutosVendidos_idProdutosVendidos;
        this.data_venda = data_venda;
        this.quantidade = quantidade;
        this.Cliente_CPF = Cliente_CPF;
                }

    public String getCliente_CPF() {
        return Cliente_CPF;
    }

    public void setCliente_CPF(String Cliente_CPF) {
        this.Cliente_CPF = Cliente_CPF;
    }
    
    public int getProdutosVendidos_idProdutosVendidos() {
        return ProdutosVendidos_idProdutosVendidos;
    }

    public void setProdutosVendidos_idProdutosVendidos(int ProdutosVendidos_idProdutosVendidos) {
        this.ProdutosVendidos_idProdutosVendidos = ProdutosVendidos_idProdutosVendidos;
    }

    public int getID_Item() {
        return ID_Item;
    }

    public void setID_Item(int ID_Item) {
        this.ID_Item = ID_Item;
    }

    public int getID_Servico() {
        return ID_Servico;
    }

    public void setID_Servico(int ID_Servico) {
        this.ID_Servico = ID_Servico;
    }

    public int getID_Funcionario() {
        return ID_Funcionario;
    }

    public void setID_Funcionario(int ID_Funcionario) {
        this.ID_Funcionario = ID_Funcionario;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

  
     
    }

 
    
    

   
 

