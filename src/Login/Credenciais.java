/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import Conexao.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author EMERSONCORDEIRODELIM
 */
public class Credenciais {

    public Credenciais(String login, String senha1) {
    }

    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    private String usuario;
    private String senha;
   private String codigo;
   
    /**
     *
     * @param usuario
     * @return 
     * @throws java.sql.SQLException
     */
    public boolean existe(Credenciais usuario) throws SQLException{
        
       
        String sql = "SELECT senha FROM Login WHERE usuario = ? and senha = ?";

        DAO dao = new DAO();
        try (Connection c = dao.obtemConexao()){

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getSenha());

            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        
        }

    }
}
