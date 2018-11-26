package freeVue;

import java.util.Date;

public final class Screening {

    int id;
    Date date;
    String venue;
    String film;

    public Screening(int id, Date date, String venue, String film) {
        this.id = id;
        this.date = date;
        this.venue = venue;
        this.film = film;
    }

    public String htmlTr(){
        String tr = "<tr><td>"+this.id+"</td><td>"+this.date+"</td><td>"+this.venue+"</td><td>"+this.film+"</td></tr>";
        return tr;
    }

    public String getFilm(){
        return this.film;    
    }

    public Date getDate(){
        return this.date;
    }


}
