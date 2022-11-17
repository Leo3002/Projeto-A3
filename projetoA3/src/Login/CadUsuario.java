/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Conexao.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Alunos
 */
public class CadUsuario {
    private String usuario;
    private String senha;

 
    public String ValidarSenha (String usu, String pass){
        
        usuario = usu;
        senha = pass;
 
        String sql = "SELECT senha FROM Login WHERE usuario = ?";

        DAO dao = new DAO();
        try (Connection c = dao.obtemConexao()){

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, usuario);

            ResultSet rs = ps.executeQuery();
            //5: itera sobre o resultado
            String aux = "";
            while (rs.next()){
                senha = rs.getString("senha");       
            }
            System.out.println(senha);
        }   
        catch (Exception e){
            e.printStackTrace();
        }
        
        return(senha);
    }
}
