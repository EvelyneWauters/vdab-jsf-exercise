package be.vdab.domain;

/**
 * Created by Evelyne on 01/07/15.
 */
public class RijksregisterNummer {
    private int year;
    private int month;
    private int day;
    private int seq;
    private int suffix;

    public RijksregisterNummer(int day, int month, int seq, int suffix, int year) {
        this.day = day;
        this.month = month;
        this.seq = seq;
        this.suffix = suffix;
        this.year = year;
    }
}
