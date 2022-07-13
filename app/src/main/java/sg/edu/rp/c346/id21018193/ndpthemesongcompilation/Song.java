package sg.edu.rp.c346.id21018193.ndpthemesongcompilation;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Song implements Serializable {
    private int id;
    private String title;
    private String singers;
    private int years;
    private int stars;

    public Song(int id, String title, String singers, int years, int stars){
        this.id = id;
        this.title = title;
        this.singers = singers;
        this.years = years;
        this.stars = stars;
    }


    public int getId() {return id;}
    public String getTitle() {return title;}
    public String getSingers() {return singers;}
    public int getYears() {return years;}
    public int getStars() { return stars; }

    @NonNull
    @Override
    public String toString() {
        return id + "\n" + title  + "\n" + singers + "\n" +  years + "\n" + stars;
    }

    public String setTitle(String toString) {
        return title;
    }

    public String setSingers(String toString) {
        return singers;
    }

    public int setYear(String toString) {
        return years;
    }
}
