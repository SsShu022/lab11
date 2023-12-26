package apps.task2;

import com.mailjet.client.errors.MailjetException;

public class Main {
    public static void main(String[] args) throws MailjetException {

        MailSender mailSender = new MailSender();
        MailBox mailBox = new MailBox(mailSender);

        Client client = new Client("John", "shuliak.pn@ucu.edu.ua", 19, Gender.MALE);
        MailInfo birthdayMail = new MailInfo(client, new BdaymailCode());

        Client clientA = new Client("Mary", "shuliak.pn@ucu.edu.ua", 25, Gender.FEMALE);
        MailInfo giftMail = new MailInfo(clientA, new GiftMailCode());

        mailBox.addMailInfo(birthdayMail);
        mailBox.addMailInfo(giftMail);

        mailBox.sendAll();


    }
}
