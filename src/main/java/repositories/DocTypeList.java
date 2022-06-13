package repositories;

import entyties.documents.*;
import java.util.ArrayList;

public class DocTypeList {

    public static ArrayList<Class> docTypeList;

    static {
        docTypeList = new ArrayList<>(){{
            add(Task.class);
            add(Incoming.class);
            add(Outgoing.class);
        }};
    }
}
