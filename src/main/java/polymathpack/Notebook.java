package polymathpack;

import asg.cliche.Command;
import asg.cliche.Param;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Notebook {

    private List<Record> records = new ArrayList<>();

    @Command
    public void createPerson(String firstName, String lastName, String email, String address, String ... phones) {
        Person record = new Person();
        record.setFirstName(firstName);
        record.setLastName(lastName);
        record.setPhones(Arrays.asList(phones));
        record.setEmail(email);
        record.setAddress(address);
        records.add(record);
    }

    @Command
    public void createNote(
            @Param(name="text", description="Note record text property")
            String text) {
        Note note = new Note();
        note.setText(text);
        records.add(note);
    }

    @Command
    public void createReminder(String text, String time) {
        Reminder reminder = new Reminder();
        reminder.setText(text);
        reminder.setTime(time);
        records.add(reminder);
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
