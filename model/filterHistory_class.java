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
public class filterHistory_class {

    private int code;// serial not null,
    private int code_category;// integer,

    public filterHistory_class() {
        this.code = 0;
        this.code_category = 0;
    }
    
    //Metodos Getters
    public int getCode() {
        return code;
    }

    public int getCode_category() {
        return code_category;
    }

    //Metodos Setters
    public void setCode(int code) {
        this.code = code;
    }

    public void setCode_category(int code_category) {
        this.code_category = code_category;
    }

}
