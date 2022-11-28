/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;

import Conexao.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
