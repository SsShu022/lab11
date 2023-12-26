package apps.task2;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
    private final MailjetClient client;

    public MailSender() {
        ClientOptions options = ClientOptions.builder()
            .apiKey(System.getenv("MJ_APIKEY_PUBLIC"))
            .apiSecretKey(System.getenv("MJ_APIKEY_PRIVATE"))
            .build();

        this.client = new MailjetClient(options);
    }

    public void sendMail(MailInfo mailInfo) throws MailjetException {
        String content = mailInfo.getMailCode().createMailCode(mailInfo.getClient());
        MailjetRequest request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "shuliak.pn@ucu.edu.ua")
                                        .put("Name", "Me"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", mailInfo.getClient().getEmail())
                                                .put("Name", mailInfo.getClient().getName())))
                                .put(Emailv31.Message.SUBJECT, "Subject Here")
                                .put(Emailv31.Message.TEXTPART, content)
                                .put(Emailv31.Message.HTMLPART, "<h3>" + content + "</h3>")));
        MailjetResponse response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
