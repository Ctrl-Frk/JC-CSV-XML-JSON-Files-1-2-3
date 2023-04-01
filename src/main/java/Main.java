import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* CSV to JSON */
        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        List<Employee> listFromCsv = Parsers.parseCsv("data.csv", columnMapping);
        String jsonFromCsv = Parsers.listToJson(listFromCsv);
        boolean ifJsonFromCsv = Parsers.writeString(jsonFromCsv, "data.json");
        if (ifJsonFromCsv) {
            System.out.println("data.json файл успешно записан!");
        }

        /* XML to JSON*/
        List<Employee> listFromXml = Parsers.parseXml("data.xml");
        String jsonFromXml = Parsers.listToJson(listFromXml);
        boolean ifJsonFromXml = Parsers.writeString(jsonFromXml, "data2.json");
        if (ifJsonFromXml) {
            System.out.println("data2.json файл успешно записан!");
        }

        /* JSON to List */
        String jsonString = Parsers.readString("data.json");
        List<Employee> listFromJson = Parsers.jsonToList(jsonString);
        listFromJson.stream()
                .forEach(System.out::println);
    }
}
