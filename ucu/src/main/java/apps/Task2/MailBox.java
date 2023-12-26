package apps.task2;

import java.util.ArrayList;
import java.util.List;

import com.mailjet.client.errors.MailjetException;

public class MailBox {
    private final List<MailInfo> infos = new ArrayList<>();
    private final MailSender mailSender;

    public MailBox(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() throws MailjetException {
        for (MailInfo info : infos) {
            mailSender.sendMail(info);
        }
        infos.clear();
    }
}
