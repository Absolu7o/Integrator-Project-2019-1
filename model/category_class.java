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
public class category_class {
    private int code;// serial not null;
    private String description;// varchar(40)

    private category_class(){
        this.code = 0;
        this.description = "";
    }
    //Metodos Geters

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
    
    //metodos Seters

    public void setCode(int code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
