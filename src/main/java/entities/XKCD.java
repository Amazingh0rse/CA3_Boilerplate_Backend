package entities;

import java.io.Serializable;

public class XKCD implements Serializable {

    private static final long serialVersionUID = 1L;

    private String alt;
    private String day;
    private String img;
    private String link;
    private String month;
    private String news;
    private int num;
    private String safe_title;
    private String title;
    private String transcript;
    private String year;
    
    public XKCD(String alt, String day, String img, String link, String month, String news, int num, String safe_title, String title, String transcript, String year) {
        this.alt = alt;
        this.day = day;
        this.img = img;
        this.link = link;
        this.month = month;
        this.news = news;
        this.num = num;
        this.safe_title = safe_title;
        this.title = title;
        this.transcript = transcript;
        this.year = year;
    }

    public XKCD() {
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSafe_title() {
        return safe_title;
    }

    public void setSafe_title(String safe_title) {
        this.safe_title = safe_title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

  
}
