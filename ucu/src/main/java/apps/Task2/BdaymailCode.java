package apps.task2;

import lombok.Getter;

@Getter
public class BdaymailCode implements MailCode {

    @Override
    public String createMailCode(Client client) {
        return "Happy Birthday " + client.getName() + "!";
    }

}
