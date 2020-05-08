package mail.sender;

/**
 *
 * @author Emilio R. Fong
 */
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailSenderController {

    public boolean sendMail(Mail mail) {
        String key[] = MailConfiguration.getKeys();
        try {
            Properties preperty = new Properties();
            preperty.put("mail.smtp.host", MailConfiguration.getValue("mail.smtp.host"));
            preperty.setProperty("mail.smtp.starttls.enable", MailConfiguration.getValue("mail.smtp.starttls.enable"));
            preperty.setProperty("mail.smtp.port", MailConfiguration.getValue("mail.smtp.port"));
            preperty.setProperty("mail.smtp.user", mail.getMailUser());
            preperty.setProperty("mail.smtp.auth", MailConfiguration.getValue("mail.smtp.auth"));
            preperty.put("mail.smtp.ssl.trust", MailConfiguration.getValue("mail.smtp.ssl.trust"));
            Session session = Session.getDefaultInstance(preperty, null);
            BodyPart text = new MimeBodyPart();
            text.setText(mail.getMessage());
            BodyPart attachedFile = new MimeBodyPart();

            if (!mail.getFilePath().equals("")) {
                attachedFile.setDataHandler(new DataHandler(new FileDataSource(mail.getFilePath())));
                attachedFile.setFileName(mail.getFileName());
            }
            MimeMultipart mm = new MimeMultipart();
            mm.addBodyPart(text);

            if (!mail.getFilePath().equals("")) {
                mm.addBodyPart(attachedFile);
            }
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(mail.getMailUser()));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(mail.getAddressee()));
            message.setSubject(mail.getSubject());
            message.setContent(mm);

            Transport t = session.getTransport("smtp");
            t.connect(mail.getMailUser(), mail.getPassword());
            t.sendMessage(message, message.getAllRecipients());
            t.close();

            return true;
        } catch (MessagingException e) {
            System.err.println("MAIL SENDER ERROR - Need to check the mail.conf"
                    + " file. Make sure the server configuration data is"
                    + " correct.");
            new MailConfigurationView(true).setVisible(true);
            e.printStackTrace();
            return false;
        }

    }
}
