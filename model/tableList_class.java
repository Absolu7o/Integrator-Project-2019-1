/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Programador
 */
public class tableList_class {
    private int code;// serial not null;
    private String description;// varchar(10);
    private String active;// char(3);
    
    private tableList_class(){
        this.code = 0;
        this.description = "";
        this.active = "";
    }

    //Metodos geters
    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getActive() {
        return active;
    }
    
    //Metodos Seters
    public void setCode(int code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
