package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;

import java.time.LocalDate;

public @Data class JournalEntry {
    /**
    * DTO with simple data to represent a journalEntry with a logged ID and a stored localDate
     * Unit Tests that are needed to be passed with this DTO:
     * <p>
     * Create a DTO.  Use Lombok annotations instead of creating getter and setter methods.
     * </p>
     */

    private int journalID;
    private String notes;
    private String date;


}
