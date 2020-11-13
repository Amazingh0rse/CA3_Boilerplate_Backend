/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.XKCD;

/**
 *
 * @author Amazingh0rse
 */

public class XKCDDTO  {

    private String alt;
    private String day;
    private String img;
//    private String link;
    private String month;
//    private String news;
    private int num;
//    private String safe_title;
    private String title;
    private String transcript;
    private String year;
    private XKCD xkcd;
    
    public XKCDDTO(){
    }

    public XKCDDTO(XKCD xkcd){
        this.alt = xkcd.getAlt();
        this.day = xkcd.getDay();
        this.img = xkcd.getImg();
        this.month = xkcd.getMonth();
        this.num = xkcd.getNum();
        this.title = xkcd.getTitle();
        this.transcript = xkcd.getTranscript();
        this.year = xkcd.getYear();
        
    }
    public String getAlt() {
        return alt;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public XKCD getXkcd() {
        return xkcd;
    }

    public void setXkcd(XKCD xkcd) {
        this.xkcd = xkcd;
    }
    
    

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
