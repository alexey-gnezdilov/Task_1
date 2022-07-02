package ParserXML;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "staff")
@XmlType(propOrder = {"name","count"})
public class Person extends Staff{

    private String name;
    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    @XmlElement(name = "count")
    private String count;

}
