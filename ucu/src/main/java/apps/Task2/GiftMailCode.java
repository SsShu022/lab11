package apps.Task2;

public class GiftMailCode implements MailCode {

    @Override
    public String createMailCode(Client client) {
        String title = (client.getGender() == Gender.MALE) ? "Sir" : "Madam";
        return client.getName() + ", we have a gift for you, " + title + ".";
    }
    
}
