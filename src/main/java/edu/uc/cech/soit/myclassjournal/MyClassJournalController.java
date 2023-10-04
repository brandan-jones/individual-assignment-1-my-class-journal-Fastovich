package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import edu.uc.cech.soit.myclassjournal.service.IJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * Controller class to manage journal entries in Spring Boot
 * This class is made to handle HTTP requests for journal entries
 */
@Controller
public class MyClassJournalController {

    @Autowired
    IJournalService journalService;
    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")
    public String index(Model model) {

        JournalEntry journalEntry = new JournalEntry();
        journalEntry.setJournalID(01);
        journalEntry.setDate("10/3/2023");
        journalEntry.setNotes("I am writing about how I was looking at the assignment one day before it was do, and started doing the assignment on the due date due to my work load.");

        model.addAttribute("JournalEntry",journalEntry);

        return "index";
    }

    @RequestMapping("/saveJournalEntry")
    public String saveJournalEntry(JournalEntry journalEntry) {
        journalService.save(journalEntry);
        return "index.html";
    }

    @GetMapping
    @ResponseBody
    public List<JournalEntry> fetchAllJournalEntries() {
        return journalService.fetchAll();
    }

    @PostMapping(value = "/journalEntry", consumes = "application/json", produces = "application/json")
    public JournalEntry createJournalEntry(@RequestBody JournalEntry journalEntry){
        JournalEntry newJournalEntry = null;
        try {
            newJournalEntry = journalService.save(journalEntry);
        } catch (Exception e){

        }
        return newJournalEntry;
    }


}
