/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Programador
 */
public class requestItem_class {

    private int code;// serial not null,
    private String status;// varchar(20),
    private int countitem;// integer,
    private String note;// varchar(150),
    private String check_requeststart;// char(1),
    private Date datetimeins;// timestamp,
    private Date datetimeupd;// timestamp,
    private int code_request;// integer,
    private int code_item;// integer,

    public requestItem_class() {
        this.code = 0;
        this.status = "";
        this.countitem = 0;
        this.note = "";
        this.check_requeststart = "";
        this.datetimeins = new Date();
        this.datetimeupd = new Date();
        this.code_request = 0;
        this.code_item = 0;
    }
    
    //Metodos Geters
    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public int getCountitem() {
        return countitem;
    }

    public String getNote() {
        return note;
    }

    public String getCheck_requeststart() {
        return check_requeststart;
    }

    public Date getDatetimeins() {
        return datetimeins;
    }

    public Date getDatetimeupd() {
        return datetimeupd;
    }

    public int getCode_request() {
        return code_request;
    }

    public int getCode_item() {
        return code_item;
    }
    
    //Metodos Seters
    public void setCode(int code) {
        this.code = code;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCountitem(int countitem) {
        this.countitem = countitem;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setCheck_requeststart(String check_requeststart) {
        this.check_requeststart = check_requeststart;
    }

    public void setDatetimeins(Date datetimeins) {
        this.datetimeins = datetimeins;
    }

    public void setDatetimeupd(Date datetimeupd) {
        this.datetimeupd = datetimeupd;
    }

    public void setCode_request(int code_request) {
        this.code_request = code_request;
    }

    public void setCode_item(int code_item) {
        this.code_item = code_item;
    }
    
}
