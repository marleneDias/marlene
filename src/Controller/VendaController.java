/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.Util;
import Model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public  class VendaController {
    public static void inserirVenda(Venda v) throws SQLException {
        try {
           Util util = new Util();
            try 
                (Connection conexao = util.conecta()) {
                String sql = "INSERT INTO Venda (ID_Itens,ID_Servico,data_venda,quantidade,Funcionario_ID_Funcionario,ProdutosVendidos_idProdutosVendidos,Cliente_CPF) VALUES (?,?,?,?,?,?,?)";
                try
                    (PreparedStatement statement = conexao.prepareStatement(sql)) {
                    statement.setInt(1,v.getID_Item());
                    statement.setInt(2,v.getID_Servico());
                    statement.setString(3,v.getData_venda());
                    statement.setString(4,v.getQuantidade());
                    statement.setInt(5,v.getID_Funcionario());
                    statement.setInt(6,v.getProdutosVendidos_idProdutosVendidos()); 
                    statement.setString(7,v.getCliente_CPF());
                    
                    int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
                    if (rowsInserted > 0) {
                        System.out.println(" Nova Venda inserida com sucesso ");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

