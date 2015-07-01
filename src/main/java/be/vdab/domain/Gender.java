package be.vdab.domain;

/**
 * Created by Evelyne on 30/06/15.
 */
public enum Gender {
    MALE("male"),FEMALE("female"),TO_BE_DECLARED("to be declared");

    String label;
    Gender(String label) {
        this.label=label;
    }

    public String getLabel() {
        return label;
    }
}
