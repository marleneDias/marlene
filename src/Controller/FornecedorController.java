/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.Util;
import Model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public  class FornecedorController {
    public static void inserirFornecedor(Fornecedor f) throws SQLException {
        try {

           Util util = new Util();
            try (Connection conexao = util.conecta()) {
                String sql = "INSERT INTO pessoa (cnpj, nome,telefone,endereco) VALUES (?, ?, ?, ?)";
                PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
                statement.setString(1, f.getCnpj());
                statement.setString(2, f.getNome());
                statement.setString(3, f.getTelefone());
                statement.setString(4, f.getEndereco());
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

