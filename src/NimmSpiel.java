import javax.swing.*;

import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JOptionPane.DEFAULT_OPTION;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;

public class NimmSpiel {

    private int[] reihen = {1,3,5,7};



    public NimmSpiel(){

    }
    //staebe Zaehlen und in eine String zurrückgeben.
    public String staebeZaehlen(){

        StringBuilder sb = new StringBuilder();

        for (int i : reihen) {
            for (int j = 0; j < i; j++) {
                sb.append('|');
                sb.append(' ');
            }
            sb.append('\n');
        }

        //JOptionPane.showMessageDialog(null, sb.toString());
        return sb.toString();
    }
    public void welcheZeileNehmenFragen(){
        // dinamisch zeilen abfragen, falls stange nicht gibt, dann ausblenden.
        ArrayList<String> zeilenStrAusgeben = new ArrayList<String>();

        // jede zeile mit stange kontrollieren
        //arraylist packen falls da min eine stange gibt.
        for(int i = 0; i < reihen.length; i++){
            if(reihen[i] !=0)
                zeilenStrAusgeben.add(i+1+".Zeile");
        }
        ///
        int welcheZeile =
                JOptionPanePrint(staebeZaehlen()+"Welche Zeile willst du ziehen ?",
                        zeilenStrAusgeben.toArray(),
                zeilenStrAusgeben.toString());
        zeilenStrAusgeben.clear();
        ///
        ///
        for(int i = 0; i < reihen[welcheZeile]; i++){
            if(reihen[welcheZeile] !=0)
                zeilenStrAusgeben.add(i+1+" Stück");
        }
        ///
        int wieViele =
                JOptionPanePrint(
                        staebeZaehlen()+"Wie viele ?",
                        zeilenStrAusgeben.toArray(),
                        zeilenStrAusgeben.toString());

        zeilenStrAusgeben.clear();

        reihen[welcheZeile] -= wieViele+1;

    }
    public int JOptionPanePrint(String message,Object[] strArr, String endArr){
        int returnInput =
                 JOptionPane.showOptionDialog(
                         null,
                         message,
                         "Nimm",
                         DEFAULT_OPTION,
                         QUESTION_MESSAGE,
                         null,
                         strArr,
                         endArr );


        return returnInput;
    }

    public void ziehen(int index,int wieViele){
        reihen[index] = reihen[index] - wieViele;
    }
    public void print(){
        for(int i : reihen)
            System.out.println(i);
    }

}
