/**
 * 
 * Project name: 
 * Initial date: 7/05/2020
 * Modification date: 
 * @author Carlos Alberto Ro'Pe
 * @superv Jonathan Minors
 */
package prueba;

import mail.sender.MailSender;

public class Prueba {

    /**
     * @param args the cmd arguments. To use it open cmd ant write <java -jar
     * YourJARFile.jar arg0 arg1 ... argn>
     */
    public static void main(String args[]) {
        new MailSender("ing.carope9@gmail.com","Correo de prueba 6","Elimíname", "logo.png", "C:/logo.png");
    }

}
