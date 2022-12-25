package mail;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailinfo) {
        infos.add(mailinfo);
    }

    public void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        MailSender sender = new MailSender();
        for (MailInfo info: infos) {
            sender.sendMail(info);
        }
    }
}

