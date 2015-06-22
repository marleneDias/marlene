/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.Util;
import Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public  class FuncionarioController {
    public static void inserirFuncionario(Funcionario fun) throws SQLException {
        try {
            Util util = new Util();
            
            try (Connection conexao = util.conecta()) {
                String sql = "INSERT INTO Funcionario(Nome,Endereco,RG,CPF,Carteira_de_Trabalho,Senha,Email,Telefone,ID_Funcionario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
                statement.setString(1, fun.getNome());
                statement.setString(2, fun.getEndereco());
                statement.setString(3, fun.getRg());
                statement.setString(4, fun.getCpf());
                statement.setString(5, fun.getCarteira_de_trabalho());
                statement.setString(6, fun.getSenha());
                statement.setString(7, fun.getEmail());
                statement.setString(8, fun.getTelefone());
                statement.setInt(9, fun.getId());
                
                int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
                if (rowsInserted > 0) {
                System.out.println("Novo Funcionario inserido com sucesso");
                }
                statement.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
     
        
    }
    
}

