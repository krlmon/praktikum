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
public class MahasiswaEntity90476 extends UserEntityAbstract90476{
    private String Npm;
    private int Status;
    
    public MahasiswaEntity90476(){
    }
    
    public String getNpm90476(){
        return this.Npm;
    }
    public void setNpm90476(String npm){
        this.Npm = npm;
    }
    
    public int getStatus90476(){
        return this.Status;
    }
    public void setStatus(int status){
        this.Status = status;
    }
}
