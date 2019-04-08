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
public class comboItem_class {

    private int code;// serial not null,
    private int countitem;// integer,
    private int code_item;// integer,
    private int code_comboitem;// integer,

    public comboItem_class() {
        this.code = 0;
        this.countitem = 0;
        this.code_item = 0;
        this.code_comboitem = 0;
    }

    //Metodos Getters
    public int getCode() {
        return code;
    }

    public int getCountitem() {
        return countitem;
    }

    public int getCode_item() {
        return code_item;
    }

    public int getCode_comboitem() {
        return code_comboitem;
    }

    //Metodos Setters
    public void setCode(int code) {
        this.code = code;
    }

    public void setCountitem(int countitem) {
        this.countitem = countitem;
    }

    public void setCode_item(int code_item) {
        this.code_item = code_item;
    }

    public void setCode_comboitem(int code_comboitem) {
        this.code_comboitem = code_comboitem;
    }
    
}
