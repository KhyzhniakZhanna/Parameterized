package data;

public enum Language {
    UA ("uk-ua"),
    RU ("ru-ua");


    String lang;

    Language(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
