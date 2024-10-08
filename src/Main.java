import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Main {
    static int zugvonSpielern = 0;


    public static void main(String[] args) {
        //Matrix mit verschiedenen leangen
        int[][] matrix = new int[4][];
        matrix[0] = new int[]{1};               // 1
        matrix[1] = new int[]{1,1,1};           // 3
        matrix[2] = new int[]{1,1,1,1,1};       // 5
        matrix[3] = new int[]{1,1,1,1,1,1,1};   // 7




        //zeichne(matrix);
    }
    public static void zeichne(int matrix [][]){

        //zeichnet soviele stöcke wie es geht
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 1)
                    System.out.print("|");

            }
            System.out.println();
        }


    }
    public static void welcheZeileNehmen(int matrix [][]){
        // dinamisch zeilen abrafegen,falsl es nicht gibt, dann ausblenden.
        String [] zeilen = {"1.Zeile","2.Zeile","3.Zeile","4,Zeile"};
        int zeile = JOptionPane.showOptionDialog(null,"Welche Zeile willst du ziehen ?","Nimm",
                DEFAULT_OPTION, QUESTION_MESSAGE, null,
                zeilen, zeilen[0]);
    }

    public static void zug(int matrix [][]){


        //Regeln
        //nur 3 höstens ziehen
        // scan dien zug
        //spieler 1-2
        //ziehen aber reihe und wie viele
        for (int i = 0; i < matrix.length; i++) {


            int count = matrix[i].length;
            for (int j = 0; j < matrix[i].length; j++) {


                if(matrix[i][j] == 0)
                    count--;
            }

        }








    }

}