package Models;

public class Notes {
    private String notes;

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Notes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Notes: \n"+ notes
                ;
    }
}
