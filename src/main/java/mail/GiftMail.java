package mail;

public class GiftMail implements MailCode{
    private static String TEMPLATE = "Gift for %NAME";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replace("%NAME", client.getName());
    }
}
