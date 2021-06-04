package ticketvariables;

public class name_movie {

    public name_movie() {

    }
    static String name;

    public name_movie(String var) {
        name = var;
        System.out.println(name);
    }

    public String get_movie() {
        return name;
    }

}
