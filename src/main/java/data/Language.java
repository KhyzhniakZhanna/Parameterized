package data;

public enum Language {
    UA ("uk-ua"),
    RU ("ru-ua"),
    ES ("es"),
    DE ("de");


    String lang;

    Language(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
