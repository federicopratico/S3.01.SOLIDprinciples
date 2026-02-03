public class ServicePerson {
    private PersonSaver personSaver;

    public ServicePerson(PersonSaver personSaver) {
        this.personSaver = personSaver;
    }

    public void savePerson(Person person) {
        personSaver.savePerson(person);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Juan");

        ServicePerson service = new ServicePerson(new MySql());
        service.savePerson(person);
        
    }

}