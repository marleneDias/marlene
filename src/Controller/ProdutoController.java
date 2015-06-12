/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Config.Util;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public  class ProdutoController {
    public static void inserirProduto(Produto p) throws SQLException {
        try {

           Util util = new Util();
            try (Connection conexao = util.conecta()) {
                String sql = "INSERT INTO pessoa (nome,plataforma,qtd_min,valor_compra,valor_venda,tipo) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
                statement.setString(1, p.getNome());
                statement.setString(2, p.getPlataforma());
                statement.setString(3, p.getQtd_min());
                statement.setString(4, p.getValor_compra());
                statement.setString(5, p.getValor_venda());
                statement.setString(6, p.getTipo());

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

