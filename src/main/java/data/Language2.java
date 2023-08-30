package data;

public enum Language2 {
    ES ("es"),
    DE ("de");
    String lang;

    Language2(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}

