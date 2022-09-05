public class User {
    private String name,surname;
    private ITransport transport;

    public User(String name, String surname, ITransport transport) {
        this.name = name;
        this.surname = surname;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ITransport getTransport() {
        return transport;
    }

    public void setTransport(ITransport transport) {
        this.transport = transport;
    }
}
