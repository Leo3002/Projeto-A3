/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alunos
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class ConexaoBanco {
    
    private String usuario = "root";
    private String senha = "usjt@2019";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "projetoA3";
    
    public Connection obtemConexao (){
        try{
            Connection c = DriverManager.getConnection(
                "jdbc:mysql://" + host + ":" + porta + ";" + bd,
                usuario,
                senha
            );
            return c;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

