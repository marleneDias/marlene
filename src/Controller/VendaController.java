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
            try (Connection conexao = util.conecta()) {
                String sql = "INSERT INTO pessoa (data_venda,itens,servico) VALUES (?,?,?)";
                PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
                statement.setString(1, v.getData_venda());
                statement.setString(2, v.getItens());
                statement.setString(3, v.getServico());
                
                int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
                if (rowsInserted > 0) {
                    System.out.println("Novo usuário inserido com sucesso");
                }
                statement.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

