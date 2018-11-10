package fr.cmm.tags;
import org.apache.commons.lang3.StringUtils;

public class Functions {

    public static String renvoyer(String texte){
        String resultat = StringUtils.replace(texte, "\n", "<br>");
        return resultat;
    }

}
//OK je pense (sauf "renvoyer"?=