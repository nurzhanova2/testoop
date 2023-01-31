
@Component
public class EmailService {


    public String  sendEmail(String [] to,String from, String subject, String msg) throws MessagingException {

        String status ="099";
        final  String password ="********";

        final String fromsender = from;
        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "smtp");
        props.setProperty("mail.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.debug", "true");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(fromsender,password);
                    }
                });

        //session.setDebug(true);
        Transport transport;
        try {
            transport = session.getTransport();
            InternetAddress addressFrom = new InternetAddress(fromsender);

            MimeMessage message = new MimeMessage(session);
            message.setSender(addressFrom);
            message.setSubject(subject);
            message.setContent(msg, "text/plain");
            //message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            for(int i =0;i<to.length;i++){
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to[i]));


            }

            transport.connect();
            Transport.send(message);
            status ="000";
            transport.close();
        } catch (NoSuchProviderException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        }

        return status;
    }