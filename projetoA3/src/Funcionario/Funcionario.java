/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;

/**
 *
 * @author gabri
 */
public class Funcionario {
    
    private int IDFuncionario;
    private String NomeFuncionario;
    private int TelefoneFuncionario;
    private String Cargo;
    
    public int getIDFuncionario(){
       return IDFuncionario; 
    }
    
    public String getNomeFuncionario(){
        return NomeFuncionario;
    }
    
    public int getTelefoneFuncionario(){
        return TelefoneFuncionario;   
    }
    
    public String getCargo(){
        return Cargo;
    }
    
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    public void setIDFuncionario(int IDFuncionario) {
        this.IDFuncionario = IDFuncionario;
    }

    public void setNomeFuncionario(String NomeFuncionario) {
        this.NomeFuncionario = NomeFuncionario;
    }

    public void setTelefoneFuncionario(int TelefoneFuncionario) {
        this.TelefoneFuncionario = TelefoneFuncionario;
    }
}
