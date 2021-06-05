package com.example.test_proiect;

public class Obiect {
    private String obj;
    private int imagine;
    private String descriere;

    public Obiect(String obj, int imagine, String descriere) {
        this.obj = obj;
        this.imagine = imagine;
        this.descriere = descriere;
    }

    public int getImagine(){
        return imagine;
    }

    public String getDescriere(){
        return descriere;
    }

    public String getObj() {

        return obj;
    }

    public void setImagine(){
        this.imagine = imagine;
    }
    public void setDescriere(){
        this.descriere = descriere;
    }

    public void setObj(String obj) {

        this.obj = obj;
    }
}
