package polymathpack;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private List<Record> records = new ArrayList<>();

    @Command
    public void Create(String firstName, String lastName, String phone) {
        Record record = new Record();
        record.setFirstName(firstName);
        record.setLastName(lastName);
        record.setPhone(phone);
        records.add(record);
    }

    @Command
    public List<Record> List() {
        return records;
    }
}
