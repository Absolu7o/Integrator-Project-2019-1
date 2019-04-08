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
public class enableInsert_class {
    private int code;// serial not null
    private String tablelist;// char(3)
    private String guestcheck;// char(3)
    
    private enableInsert_class(){
        this.code = 0;
        this.guestcheck = "";
        this.tablelist = "";
    }

    //Metodos Geters
    public int getCode() {
        return code;
    }

    public String getTablelist() {
        return tablelist;
    }

    public String getGuestcheck() {
        return guestcheck;
    }
    
    //Metodos Seters
    public void setCode(int code) {
        this.code = code;
    }

    public void setTablelist(String tablelist) {
        this.tablelist = tablelist;
    }

    public void setGuestcheck(String guestcheck) {
        this.guestcheck = guestcheck;
    }
}
