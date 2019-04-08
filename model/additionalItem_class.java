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
public class additionalItem_class {

    private int code;// serial not null,
    private int code_additional;// integer,
    private int code_item;// integer,

    public additionalItem_class() {
        this.code = 0;
        this.code_additional = 0;
        this.code_item = 0;
    }

    //Metodos Getters
    public int getCode() {
        return code;
    }

    public int getCode_additional() {
        return code_additional;
    }

    public int getCode_item() {
        return code_item;
    }

    //Metodos Setters
    public void setCode(int code) {
        this.code = code;
    }

    public void setCode_additional(int code_additional) {
        this.code_additional = code_additional;
    }

    public void setCode_item(int code_item) {
        this.code_item = code_item;
    }
    
}
