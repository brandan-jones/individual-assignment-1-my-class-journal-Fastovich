package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dao.IJournalDAO;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * A mock implementation for {@link IJournalService} interface to manage the entries in a journal.
 * Provides basic CRUD operations for journal entry.
 * delegats data management tasks to {@link IJournalDAO}
 */
@Service
public class JournalServiceMock implements IJournalService{
    /** data access object for journal entries*/
   @Autowired
    private IJournalDAO journalDAO;

   /**
    *Constructor for {@code JournalServiceStub} class
    */
   public JournalServiceMock(){

   }

    /**
     * Contructor with {@link IJournalDAO} for injection.
     *
     * @param journalDAO data access objecct to manage journal entries.
     */
   public JournalServiceMock(IJournalDAO journalDAO){
       this.journalDAO = journalDAO;
   }


    /**
     * saves/updates new journal entry using injected {@link IJournalDAO}.
     *
     * @param journalEntry data access object for journal entries
     * @return saved/updated journal entry.
     */
   @Override
    public JournalEntry save(JournalEntry journalEntry){
       return journalDAO.save(journalEntry);
   }

    /**
     * pulls list of all journal entries using {@link IJournalDAO}
     *
     *
     * @return list of journal entries
     */

   @Override
    public List<JournalEntry> fetchAll() {
       return journalDAO.fetchAll();
   }
}
