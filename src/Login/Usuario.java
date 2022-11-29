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
public class Usuario {
    public Usuario(String login, String senha) {
       this.usuario = login;
       this.senha = senha;
    }

    public Usuario(int codigo) {
       this.codigo = codigo;
       
    }
    public Usuario(int codigo, String login, String senha) {
       this.codigo = codigo;
       this.usuario = login;
       this.senha = senha;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    private String usuario;
    private String senha;
   private int codigo;
   
    public boolean existe(Usuario usuario1) throws SQLException{
        
       
        String sql = "SELECT senha FROM Login WHERE usuario = ? and senha = ?";

        DAO dao = new DAO();
        try (Connection c = dao.obtemConexao()){

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1,getUsuario());
            ps.setString(2, getSenha());

            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        
        }

    }
   
   public void InserirCreden() throws SQLException{
        String SQL = "INSERT INTO login(usuario, senha) VALUES(?,?)";
    
        DAO dao = new DAO();
        
        try(Connection c = dao.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(SQL);
            ps.setString(1, getUsuario());
            ps.setString(2, getSenha());
          
            
            ps.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    
    
    }
   public void AlterarCreden() throws SQLException{
        String SQL = "UPDATE login SET usuario= ?, senha = ? WHERE codigo = ?";
    
        DAO dao = new DAO();
        
        try(Connection c = dao.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(SQL);
            ps.setString(1, getUsuario());
            ps.setString(2, getSenha());
            ps.setInt(3, getCodigo());
            
            ps.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    
        
    }
    public void ExcluirCreden() throws SQLException{
        String SQL = "DELETE FROM login WHERE codigo = ?";
    
        DAO dao = new DAO();
        
        try(Connection c = dao.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(SQL);
            
            ps.setInt(1, getCodigo());
            
            ps.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    
        
    }
}
