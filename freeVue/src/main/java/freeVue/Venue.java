package freeVue;

public final class Venue {

    private int venueId;
    private Screening screenings[];

    private Venue() {
    }

    public Venue[] getVenues()
    {
        Venue venues[];
        venues = new Venue[2];
        venues[0] = new Venue();
        return venues;
    }

    public Screening[] listScreenings()
    {
        return screenings;
    }
}
