import javax.swing.*;

import static javax.swing.JOptionPane.DEFAULT_OPTION;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;

public class NimmSpiel {

    private int[] reihen = {1,3,5,7};



    public NimmSpiel(){

    }

    public void zeichne(){

        StringBuilder sb = new StringBuilder();

        for (int i : reihen) {
            for (int j = 0; j < i; j++) {
                sb.append('|');
                sb.append(' ');
            }
            sb.append('\n');
        }

        JOptionPane.showMessageDialog(null, sb.toString());

    }
    public int welcheZeileNehmenFragen(){
        // dinamisch zeilen abrafegen,falsl es nicht gibt, dann ausblenden.


        // string mit append
        StringBuilder sb = new StringBuilder();
        String [] zeilen = {"1.Zeile","2.Zeile","3.Zeile","4,Zeile"};
        int zeile = JOptionPane.showOptionDialog(null,"Welche Zeile willst du ziehen ?","Nimm",
                DEFAULT_OPTION, QUESTION_MESSAGE, null,
                zeilen, zeilen[0]);

        return zeile;
    }
    public void wieVieleZiehenFragen(){


    }
    public void ziehen(int index,int wieViele){
        reihen[index] = reihen[index] - wieViele;
    }
    public void print(){
        for(int i : reihen)
            System.out.println(i);
    }

}
