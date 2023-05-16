import java.util.*;

public class Nicknames {
    public static void main(String[] args) throws Exception {
        //Nicknames
        HashMap<String, String> names = new HashMap<>();

        names.put("matthew","matt");
        names.put("michael", "mix");
        names.put("arthur", "artie");

        System.out.println(names.get("arthur"));
    }
}
