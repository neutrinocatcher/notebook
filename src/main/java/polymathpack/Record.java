package polymathpack;

import java.util.ArrayList;
import java.util.List;

public class Record {
    public Record() {
        counter++;
        id = counter;
    }

    private static int counter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private List<String> phones = new ArrayList<>();

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    private String email;
    private String address;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phones=" + phones +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
