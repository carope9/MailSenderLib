/**
 * 
 * @author Carlos Alberto Ro'Pe
 */
package mail.sender;

public class SendExample {
    
    public static void main(String args[]) {
        /**
         * Esta forma de enviar correo es con archivo adjunto
         */
//        new MailSender(
//                /*Correo al que se enviará: */ "ing.carope9@gmail.com",
//                /*Asunto del correo:*/ "Correo de prueba",
//                /*Mensaje del correo:*/ "Este es un correo de prueba que puede ser eliminado",
//                /*Nombre del archivo adjunto: */ "foto.jpg",
//                /*Ruta del archivo adjunto*/ "C:\foto.jpg");

        /**
         * Esta forma de enviar correo es sin archivo adjunto, por lo que los
         * datos del nombre y ruta del archivo se quedan en blanco ""
         */
        new MailSender(
                /*Correo al que se enviará: */ "ing.carope9@gmail.com",
                /*Asunto del correo:*/ "Correo de prueba",
                /*Mensaje del correo:*/ "Este es un correo de prueba que puede ser eliminado");
    }
}
