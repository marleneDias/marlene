/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.Util;
import Model.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public  class EstoqueController {
    public static void inserirEstoque(Estoque e) throws SQLException {
            
            Util util = new Util();
            try (Connection conexao = util.conecta()) {
                String sql = "INSERT INTO Estoque(idEstoque,Produto_idProduto,Quantidades) VALUES (?,?,?)";
                PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
                 statement.setInt(1,e.getId()); 
                statement.setInt(2,e.getProduto());
                 statement.setInt(3,e.getQuantidade());
             int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
                if (rowsInserted > 0) {
                    System.out.println("Novo usuário inserido com sucesso");
                }
                statement.close();
            }
        } 
          
       
}

   
