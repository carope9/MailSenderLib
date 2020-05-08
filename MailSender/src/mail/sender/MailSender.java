package mail.sender;

/**
 *
 * @author Emilio R. Fong
 */
public class MailSender {

    /**
     * Mail with attachment
     * @param addressee Email account that will receive the message
     * @param subject Message Subject
     * @param message Message content
     * @param fileName Name of the attached file
     * @param filePath Absolute path of the attached file
     */
    public MailSender(String addressee, String subject, String message,
            String fileName, String filePath) {
        try {
            MailConfiguration.getConfiguration();

            Mail mail = new Mail();
            mail.setPassword(MailConfiguration.getValue("mail.smtp.password"));
            mail.setMailUser(MailConfiguration.getValue("mail.smtp.user"));
            mail.setSubject(subject);
            mail.setMessage(message);
            mail.setAddressee(addressee.trim());
            mail.setFileName(fileName);
            mail.setFilePath(filePath);
            
            System.out.println("From: " + mail.getMailUser());
            System.out.println("To: " + mail.getAddressee());
            System.out.println("Subject: " + mail.getSubject());
            System.out.println("Content: " + mail.getMessage());
            System.out.println("Attachment name: " + mail.getFileName());
            System.out.println("Path file: " + mail.getFilePath());

            MailSenderController control = new MailSenderController();
            control.sendMail(mail);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Mail without attachment
     * @param addressee Email account that will receive the message
     * @param subject Message Subject
     * @param message Message content
     */
    public MailSender(String addressee, String subject, String message) {
        try {
            MailConfiguration.getConfiguration();

            Mail mail = new Mail();
            mail.setPassword(MailConfiguration.getValue("mail.smtp.password"));
            mail.setMailUser(MailConfiguration.getValue("mail.smtp.user"));
            mail.setSubject(subject);
            mail.setMessage(message);
            mail.setAddressee(addressee.trim());
            mail.setFileName("");
            mail.setFilePath("");
            
            System.out.println("From: " + mail.getMailUser());
            System.out.println("To: " + mail.getAddressee());
            System.out.println("Subject: " + mail.getSubject());
            System.out.println("Content: " + mail.getMessage());

            MailSenderController control = new MailSenderController();
            control.sendMail(mail);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
