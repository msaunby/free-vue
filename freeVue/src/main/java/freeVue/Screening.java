package freeVue;

import java.util.Date;

public final class Screening {

    Film film;
    Date date;

    private Screening() {
    }

    public Screening[] getScreenings(int venueID) {
        Screening screenings[];
        screenings = new Screening[2];
        screenings[0] = new Screening();
        return screenings;
    }

    public Film getFilm(){
        return this.film;    
    }

    public Date getDate(){
        return this.date;
    }


}
