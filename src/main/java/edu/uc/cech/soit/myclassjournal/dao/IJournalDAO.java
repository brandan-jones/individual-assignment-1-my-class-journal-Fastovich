package edu.uc.cech.soit.myclassjournal.dao;
import java.util.List;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;


public interface IJournalDAO {
    /**
     *
     */
    JournalEntry save (JournalEntry journalEntry);


    /**
     * Retrieves a list of all journal entries.
     *
     * @return A list of journal entries.
     */
    List<JournalEntry> fetchAll();
}
