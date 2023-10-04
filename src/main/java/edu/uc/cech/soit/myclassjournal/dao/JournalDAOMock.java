package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class JournalDAOMock implements IJournalDAO{
    /** Internal Storage for journal Entries */
    List<JournalEntry> allJournalEntries = new ArrayList<JournalEntry>();


    /**
     * saves/updates new journal entries with one inside internal storage.
     *
     * @param journalEntry update/save
     * @return updated journal entry
     */
    @Override
    public JournalEntry save(JournalEntry journalEntry){
        allJournalEntries.add(journalEntry);
        return journalEntry;
    }

    /**
     * retrieves all journal entries from internal storage as a list.
     *
     * @return the list of all journal entries
     */

    @Override
    public List<JournalEntry> fetchAll() {
        return allJournalEntries;
    }

}
