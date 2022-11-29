/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunciProjeto;

import Conexao.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class FunciProjeto {
    //Projeto
    private String NomeProjeto;
    private int IDProjeto;
    private String descricao;
    private int statusProjeto;
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getStatusProjeto() {
        return statusProjeto;
    }

    public void setStatusProjeto(int statusProjeto) {
        this.statusProjeto = statusProjeto;
    }
    
    
    public String getNomeProjeto() {
        return NomeProjeto;
    }

    public void setNomeProjeto(String NomeProjeto) {
        this.NomeProjeto = NomeProjeto;
    }

    public int getIDProjeto() {
        return IDProjeto;
    }

    public void setIDProjeto(int IDProjeto) {
        this.IDProjeto = IDProjeto;
    }
    
    //Funcionario
    public int getIDFuncionario() {
        return IDFuncionario;
    }

    public void setIDFuncionario(int IDFuncionario) {
        this.IDFuncionario = IDFuncionario;
    }

    public String getNomeFuncionario() {
        return NomeFuncionario;
    }

    public void setNomeFuncionario(String NomeFuncionario) {
        this.NomeFuncionario = NomeFuncionario;
    }

    public String getTelefoneFuncionario() {
        return TelefoneFuncionario;
    }

    public void setTelefoneFuncionario(String TelefoneFuncionario) {
        this.TelefoneFuncionario = TelefoneFuncionario;
    }

    public String getStatusFuncionario() {
        return StatusFuncionario;
    }

    public void setStatusFuncionario(String StatusFuncionario) {
        this.StatusFuncionario = StatusFuncionario;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    private int IDFuncionario;
    private String NomeFuncionario;
    private String TelefoneFuncionario;
    private String StatusFuncionario;
    private String Departamento;
    private String funcao;
    
    public void InserirFunci() throws SQLException{
        String SQL = "INSERT INTO funcionario(nome_funci, telefone, statusFunci, id_projeto, departamento, funcao) VALUES(?,?,?,?,?,?)";
    
        DAO dao = new DAO();
        
        try(Connection c = dao.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(SQL);
            ps.setString(1, getNomeFuncionario());
            ps.setString(2, getTelefoneFuncionario());
            ps.setString(3, getStatusFuncionario());
            ps.setInt(4, getIDProjeto());
            ps.setString(5, getDepartamento());
            ps.setString(6, getFuncao());
            
            ps.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    
    
    }
    public void AlterarFunci() throws SQLException{
        String SQL = "UPDATE funcionario SET nome_funci= ?, telefone = ?, statusFunci= ?, id_projeto= ?, departamento= ?, funcao=? WHERE id_funci = ?";
    
        DAO dao = new DAO();
        
        try(Connection c = dao.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(SQL);
            ps.setString(1, getNomeFuncionario());
            ps.setString(2, getTelefoneFuncionario());
            ps.setString(3, getStatusFuncionario());
            ps.setInt(4, getIDProjeto());
            ps.setString(5, getDepartamento());
            ps.setString(6, getFuncao());
            ps.setInt(7, getIDFuncionario());
            
            ps.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    
        
    }
    public void ExcluirFunci() throws SQLException{
        String SQL = "DELETE FROM funcionario WHERE id_funci = ?";
    
        DAO dao = new DAO();
        
        try(Connection c = dao.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(SQL);
            
            ps.setInt(1, getIDFuncionario());
            
            ps.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    
        
    }
    public void ListarFunci() throws SQLException{
        String SQL = "SELECT * FROM funcionario";
    
        DAO dao = new DAO();
        
        try(Connection c = dao.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(SQL);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int codigo = rs.getInt("Codigo");
                String nome = rs.getString("nome_funci");
                String telefone = rs.getString("telefone");
                String statusFunci = rs.getString("statusFunci");
                String id_projeto = rs.getString("id_projeto");
                String departamento = rs.getString("nome_funci");
                String funcao = rs.getString("funcao");
                
                String aux = String.format("Código%d, Nome%s, Telefone%s, Status do Projeto%s, ID do Projeto%s, Departamento%s, funcao%s", codigo, nome,telefone, statusFunci, id_projeto, departamento, funcao );
                JOptionPane.showMessageDialog(null, aux);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    
        
    }
    public void InserirProjeto() throws SQLException{
        String SQL = "INSERT INTO projeto(nomeprojeto, descricao, statusProjeto) VALUES(?,?,1)";
    
        DAO dao = new DAO();
        
        try(Connection c = dao.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(SQL);
            ps.setString(1, getNomeProjeto());
            ps.setString(2, getDescricao());
            
            
            
            ps.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    
    
    }
    public void AlterarProjeto() throws SQLException{
        String SQL = "UPDATE projeto SET nomeprojeto= ?, descricao = ?, statusProjeto= ? WHERE id_projeto = ?";
    
        DAO dao = new DAO();
        
        try(Connection c = dao.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(SQL);
            ps.setString(1, getNomeProjeto());
            ps.setString(2, getDescricao());
            ps.setInt(3, getStatusProjeto());
            ps.setInt(4, getIDProjeto());
            
            ps.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    
        
    }
    public void ExcluirProjeto() throws SQLException{
        String SQL = "DELETE FROM projeto WHERE id_projeto = ?";
    
        DAO dao = new DAO();
        
        try(Connection c = dao.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(SQL);
            
            ps.setInt(1, getIDProjeto());
            
            ps.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    
}
}
