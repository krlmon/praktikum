/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author GENESIS
 */
public abstract class UserEntityAbstract90476 {
    protected int Id;
    protected String Nama, Password, NoTelp;
    
    public UserEntityAbstract90476(){
    }
    public UserEntityAbstract90476(String nama, String password, String noTelp){
        this.Nama = nama;
        this.Password = password;
        this.NoTelp = noTelp;
    }
    
    public int getId90476(){
        return this.Id;
    }
    public void setId90476(int id){
        this.Id = id;
    }
    
    public String getNama90476(){
        return this.Nama;
    }
    public void setNama90476(String nama){
        this.Nama = nama;
    }
    
    public String getPassword90476(){
        return this.Password;
    }
    public void setPassword90476(String password){
        this.Password = password;
    }
    
    public String getNotTelp90476(){
        return this.NoTelp;
    }
    public void setNoTelp90476(String noTelp){
        this.NoTelp = noTelp;
    }
}
