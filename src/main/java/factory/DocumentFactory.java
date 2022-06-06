package factory;

import document.*;
import exceptions.DocumentExistException;
import java.util.*;

public class DocumentFactory
{
    static HashMap<Integer,Document> docList = new HashMap<>();
    static int docType;
    static Integer regNumInMap;

    public static void createDocuments(int amount)
    {
        for (int i = 0; i < amount; i++)
        {
            docType = (int)((Math.random() * 3) + 1);
            regNumInMap = (int)((Math.random() * 100) + 5);

            try
            {
                if (!docList.containsKey(regNumInMap))
                {
                    switch (docType)
                    {
                        case 1 -> docList.put(regNumInMap,new Task(regNumInMap));
                        case 2 -> docList.put(regNumInMap,new Incoming(regNumInMap));
                        case 3 -> docList.put(regNumInMap,new Outgoing(regNumInMap));
                    }
                }
                else
                {
                    throw new DocumentExistException(regNumInMap);
                }
            }
            catch (Exception e)
            {

            }
        }

        docList.values().stream().sorted().forEach(System.out::println);
    }
}