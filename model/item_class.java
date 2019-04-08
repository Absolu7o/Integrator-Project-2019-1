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
public class item_class {

    private int code;// serial not null,
    private String description;// varchar(40),
    private double price;// decimal(6,2),
    private String preparation;// varchar(10),
    private String additional;// char(3),
    private String active;// char(3),
    private int code_category;// integer,

    public item_class() {
        this.code = 0;
        this.description = "";
        this.price = 0;
        this.preparation = "";
        this.additional = "";
        this.active = "";
        this.code_category = 0;
    }
    
    //Metodos Geters
    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getPreparation() {
        return preparation;
    }

    public String getAdditional() {
        return additional;
    }

    public String getActive() {
        return active;
    }

    public int getCode_category() {
        return code_category;
    }
    
    //Metodos Seters
    public void setCode(int code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public void setCode_category(int code_category) {
        this.code_category = code_category;
    }

}
