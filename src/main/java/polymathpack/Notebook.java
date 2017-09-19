package polymathpack;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Notebook {

    private List<Record> records = new ArrayList<>();

    @Command
    public void create(String firstName, String lastName, String email, String address, String ... phones) {
        Record record = new Record();
        record.setFirstName(firstName);
        record.setLastName(lastName);
        record.setPhones(Arrays.asList(phones));
        record.setEmail(email);
        record.setAddress(address);
        records.add(record);
    }

    @Command
    public List<Record> list() {
        return records;
    }

    @Command
    public void remove(int id) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getId() == id) {
                records.remove(i);
                break;
            }
        }
    }
}
