package freeVue;

import java.util.Date;

public final class Screening {

    Film film;
    Date date;

    public Screening(int id, Date date, int venue, int film) {
        this.date = date;
    }

    public String htmlTr(){
        String tr = "<tr><td>" + this.date + "</td><td>Exeter Pheonix</td><td>Alien</td><td>1</td>";
        return tr;
    }

    public Film getFilm(){
        return this.film;    
    }

    public Date getDate(){
        return this.date;
    }


}
