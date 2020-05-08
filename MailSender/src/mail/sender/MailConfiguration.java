/**
 *
 * @author Carlos Alberto Ro'Pe
 */
package mail.sender;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MailConfiguration {

    static HashMap<String, String> confMap = new HashMap<>();

    public static void getConfiguration() {
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        String aux = "";
        try {
            file = new File("mail.conf");
            if (!file.exists()) {
                new MailConfigurationView(false).setVisible(true);
            } else {
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                String line = "";

                while ((line = br.readLine()) != null) {
                    aux += line + "\n";
                }
                String aux2[] = aux.split("\n");

                if (aux2.length > 1) {
                    for (int j = 0; j < aux2.length; j++) {
                        String aux3[] = aux2[j].split("¬");
                        confMap.put(aux3[0], aux3[1]);
                    }
                } else {
                    new MailConfigurationView(false).setVisible(true);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
            }
        }
    }

    public static void setConfiguration(String key[], String value[]) {
        File file = null;
        FileWriter fw = null;
        BufferedWriter bw = null;

        if (key != null && value != null) {
            for (int i = 0; i < key.length; i++) {
                confMap.put(key[i], value[i]);
            }
        }

        Iterator<Map.Entry<String, String>> it = confMap.entrySet()
                .iterator();

        try {
            file = new File("mail.conf");
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            while (it.hasNext()) {
                Map.Entry<String, String> par = it.next();
                bw.write(par.getKey() + "¬" + par.getValue());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key) {
        return confMap.get(key);
    }

    public static String[] getKeys() {
        String aux = "";
        for (String key : confMap.keySet()) {
            aux += key + ",";
        }
        return aux.split(",");
    }

}
