package ticketvariables;

public class ldt_movie {

    static String lang, date, time;

    public ldt_movie() {
    }

    public ldt_movie(String l, String d, String t) {
        lang = l;
        date = d;
        time = t;
    }

    public String get_lang() {
        return lang;
    }

    public String get_date() {
        return date;
    }

    public String get_time() {
        return time;
    }
}
