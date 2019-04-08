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
public class requestAdditionalItem_class {

    private int code;// serial not null,
    private int code_requestitem;// integer,
    private int code_additional;// integer,

    public requestAdditionalItem_class() {
        this.code = 0;
        this.code_requestitem = 0;
        this.code_additional = 0;
    }
    
    //Metodos Getters
    public int getCode() {
        return code;
    }

    public int getCode_requestitem() {
        return code_requestitem;
    }

    public int getCode_additional() {
        return code_additional;
    }
    
    //Metodos Setters
    public void setCode(int code) {
        this.code = code;
    }

    public void setCode_requestitem(int code_requestitem) {
        this.code_requestitem = code_requestitem;
    }

    public void setCode_additional(int code_additional) {
        this.code_additional = code_additional;
    }
    
    

}
