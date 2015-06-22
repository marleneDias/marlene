/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Config.Util;
import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public  class ClienteController {
    public static void inserirCliente(Cliente c) throws SQLException {
        try {

           Util util = new Util();
            try (Connection conexao = util.conecta()) {
                String sql = "INSERT INTO Cliente (Endereco, Nome_Cliente,CPF,Email ,RG,Telefone) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
                statement.setString(1, c.getEndereco());
                statement.setString(2, c.getNome());
                statement.setString(3, c.getCpf());
                statement.setString(4, c.getEmail());
                statement.setString(5, c.getRg());
                statement.setString(6, c.getTelefone());

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
