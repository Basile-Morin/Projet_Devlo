import fraude.Fraude;
import java.time.LocalDateTime;
import java.util.List;

class FormulaireFraude {
    private int id;
    private LocalDateTime dateCreation ;
    private LocalDateTime dateDerniereModification;
    private Epreuve epreuve;
    private List<Etudiant> etudiants;
    private List<Fraude> fraudes;

    void ajouterEtudiant(Etudiant etudiant){
        etudiants.add(etudiant);
    }
    void ajouterFraude(Fraude fraude){
        fraudes.add(fraude);
        dateDerniereModification = LocalDateTime.now();
    }



    public List<Fraude> getFraudes() {
        return fraudes;
    }

    public void setFraudes(List<Fraude> fraudes) {
        this.fraudes = fraudes;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Epreuve getEpreuve() {
        return epreuve;
    }

    public void setEpreuve(Epreuve epreuve) {
        this.epreuve = epreuve;
    }

    public LocalDateTime getDateDerniereModification() {
        return dateDerniereModification;
    }

    public void setDateDerniereModification(LocalDateTime dateDerniereModification) {
        this.dateDerniereModification = dateDerniereModification;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}