/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Config.Util;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;


public  class ProdutoController {
    public static void inserirProduto(Produto p) throws SQLException {
        try {

           Util util = new Util();
            try (Connection conexao = util.conecta()) {
                String sql = "INSERT INTO Produto (idProduto,Nome,Plataforma,Qtd_min,Valor_compra,Valor_venda,Tipo) VALUES (?, ?, ?, ?, ?,?,?)";
                PreparedStatement statement = conexao.prepareStatement(sql);// note que agora criamos um Statement de forma diferente
               
                statement.setInt(1, p.getId());
                statement.setString(2, p.getNome());
                statement.setString(3, p.getPlataforma());
                statement.setString(4, p.getQtd_min());
                statement.setString(5, p.getValor_compra());
                statement.setString(6, p.getValor_venda());
                statement.setString(7, p.getTipo());

                int rowsInserted = statement.executeUpdate(); // Executa a inserção e retorna valor != 0 se inseriu (ID de inserção do banco)
                if (rowsInserted > 0) {
                    System.out.println("Novo Produto inserido com sucesso");
                }
                statement.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public int pegaIdPorNome(String nomeProduto) throws SQLException {
        
     int id=-1;
            Util util= new Util();
            Connection conexao = util.conecta();
            String sql= "Select idProduto from Produto where Nome like '"+nomeProduto+"'";
                Statement statement = conexao.createStatement();
          ResultSet result = statement.executeQuery(sql);
           while (result.next()){               
               id=result.getInt("idProduto");
            }
    
        return id;
    }
    
    public Vector listaProdutos() throws SQLException{
            Vector s =new Vector();
            Util util= new Util();
            Connection conexao = util.conecta();
            String sql= "Select Nome from Produto";
                Statement statement = conexao.createStatement();
          ResultSet result = statement.executeQuery(sql);
          while (result.next()){               
               s.add(result.getString("Nome"));
            }
      
           
        return s;
    }
    
}

