package ro.emanuel.dsgenerator.model;

public class Metadata {
    private Integer metaId;
    private String country;
    private String ministerRomana;
    private String ministerEngleza;
    private String numeInstitutie;
    private String numeDocument;
    private String numeDocumentEngleza;

    public Metadata() {
    }

    public Metadata(Integer metaId, String country, String ministerRomana, String ministerEngleza, String numeInstitutie, String numeDocument, String numeDocumentEngleza) {
        this.metaId = metaId;
        this.country = country;
        this.ministerRomana = ministerRomana;
        this.ministerEngleza = ministerEngleza;
        this.numeInstitutie = numeInstitutie;
        this.numeDocument = numeDocument;
        this.numeDocumentEngleza = numeDocumentEngleza;
    }

    public Metadata(String country, String ministerRomana, String ministerEngleza, String numeInstitutie, String numeDocument, String numeDocumentEngleza) {
        this.country = country;
        this.ministerRomana = ministerRomana;
        this.ministerEngleza = ministerEngleza;
        this.numeInstitutie = numeInstitutie;
        this.numeDocument = numeDocument;
        this.numeDocumentEngleza = numeDocumentEngleza;
    }

    public Integer getMetaId() {
        return metaId;
    }

    public void setMetaId(Integer metaId) {
        this.metaId = metaId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMinisterRomana() {
        return ministerRomana;
    }

    public void setMinisterRomana(String ministerRomana) {
        this.ministerRomana = ministerRomana;
    }

    public String getMinisterEngleza() {
        return ministerEngleza;
    }

    public void setMinisterEngleza(String ministerEngleza) {
        this.ministerEngleza = ministerEngleza;
    }

    public String getNumeInstitutie() {
        return numeInstitutie;
    }

    public void setNumeInstitutie(String numeInstitutie) {
        this.numeInstitutie = numeInstitutie;
    }

    public String getNumeDocument() {
        return numeDocument;
    }

    public void setNumeDocument(String numeDocument) {
        this.numeDocument = numeDocument;
    }

    public String getNumeDocumentEngleza() {
        return numeDocumentEngleza;
    }

    public void setNumeDocumentEngleza(String numeDocumentEngleza) {
        this.numeDocumentEngleza = numeDocumentEngleza;
    }
}
