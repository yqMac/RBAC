package com.rbac.entity;



/**
 * SysAccount generated by MyEclipse Persistence Tools
 */

public class SysAccount  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String username;
     private String password;
     private String realname;


    // Constructors

    /** default constructor */
    public SysAccount() {
    }

    
    /** full constructor */
    public SysAccount(String username, String password, String realname) {
        this.username = username;
        this.password = password;
        this.realname = realname;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return this.realname;
    }
    
    public void setRealname(String realname) {
        this.realname = realname;
    }
   








}