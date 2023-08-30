package data;

public enum Localozation {
    KV("kyiv"),
    DP("dnipro"),
    OD ("odessa"),
    KH ("kharkiv"),
    LV("lviv");
    String city;

    Localozation(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
