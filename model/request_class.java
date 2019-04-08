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
public class request_class {

    private int code;// serial not null,
    private String status;// varchar(20),
    private Date datetimeins;// timestamp,
    private Date datetimeend;// timestamp,
    private double paymoney;// decimal(6,2),
    private double paycard;// decimal(6,2),
    private String cardtype;// varchar(2),
    private int code_guestcheck;// integer,
    private int code_tablelist;// integer,

    public request_class() {
        this.code = 0;
        this.status = "";
        this.datetimeins = new Date();
        this.datetimeend = new Date();
        this.paymoney = 0;
        this.paycard = 0;
        this.cardtype = "";
        this.code_guestcheck = 0;
        this.code_tablelist = 0;
    }

    //Metodos Geters
    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public Date getDatetimeins() {
        return datetimeins;
    }

    public Date getDatetimeend() {
        return datetimeend;
    }

    public double getPaymoney() {
        return paymoney;
    }

    public double getPaycard() {
        return paycard;
    }

    public String getCardtype() {
        return cardtype;
    }

    public int getCode_guestcheck() {
        return code_guestcheck;
    }

    public int getCode_tablelist() {
        return code_tablelist;
    }

    //Metodos Seters
    public void setCode(int code) {
        this.code = code;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDatetimeins(Date datetimeins) {
        this.datetimeins = datetimeins;
    }

    public void setDatetimeend(Date datetimeend) {
        this.datetimeend = datetimeend;
    }

    public void setPaymoney(double paymoney) {
        this.paymoney = paymoney;
    }

    public void setPaycard(double paycard) {
        this.paycard = paycard;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public void setCode_guestcheck(int code_guestcheck) {
        this.code_guestcheck = code_guestcheck;
    }

    public void setCode_tablelist(int code_tablelist) {
        this.code_tablelist = code_tablelist;
    }

}
