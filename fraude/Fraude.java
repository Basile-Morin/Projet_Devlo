package fraude;

import java.time.LocalDate;

public class Fraude {
    protected LocalDate dateReleve;
    protected String description;
    protected String contenu;

    public Fraude(){
        dateReleve=LocalDate.now();
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(LocalDate dateReleve) {
        this.dateReleve = dateReleve;
    }
}
