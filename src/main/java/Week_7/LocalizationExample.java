package Week_7;

import org.w3c.dom.ls.LSOutput;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationExample {
    public static void main(String[] args) {
        Locale trlocale = new Locale("tr", "TR");
        Locale english = Locale.ENGLISH;


        ResourceBundle resourceBundle = ResourceBundle.getBundle("Messages",trlocale);

        System.out.println(resourceBundle.getString("hello"));

    }

}
