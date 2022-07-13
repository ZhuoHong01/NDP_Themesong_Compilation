package sg.edu.rp.c346.id21018193.ndpthemesongcompilation;

import androidx.annotation.NonNull;

public class Song {
    private int id;
    private String title;
    private String singers;
    private int years;
    private int stars;

    public Song(String title, String singers, int years, int stars){
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
}
