public class MySql implements PersonSaver {
    public void savePerson(Person person) {
        System.out.println("Save person" + person.getName() + " ok...");
    }
}
