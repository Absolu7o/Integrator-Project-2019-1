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
public class guestCheck_class {
    private int code;// serial not null;
    private String barcode;// varchar(10);
    private String active;// char(3);
    
    private guestCheck_class(){
        this.code = 0;
        this.barcode = "";
        this.active = "";
    }

    //Metodos Geters
    public int getCode() {
        return code;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getActive() {
        return active;
    }

    //Metodos Seters
    public void setCode(int code) {
        this.code = code;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
