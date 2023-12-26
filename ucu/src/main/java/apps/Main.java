package apps;

import com.mailjet.client.errors.MailjetException;

public class Main {
    public static void main(String[] args) throws MailjetException {

        MailSender mailSender = new MailSender();
        MailBox mailBox = new MailBox(mailSender);

        Client client = new Client("John", "shuliak.pn@ucu.edu.ua", 19, Gender.MALE);
        MailInfo birthdayMail = new MailInfo(client, new BdaymailCode());

        Client client2 = new Client("Mary", "shuliak.pn@ucu.edu.ua", 25, Gender.FEMALE);
        MailInfo giftMail = new MailInfo(client2, new GiftMailCode());

        mailBox.addMailInfo(birthdayMail);
        mailBox.addMailInfo(giftMail);

        mailBox.sendAll();


    }
}
