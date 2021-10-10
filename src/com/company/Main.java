package com.company;


public class Main {
    public static void triSelection(int[] tab ){
        for (int i= 0; i < tab.length  ; i++  ){ // retourne les indexes
            int min = i;
            for (int j = i + 1; j <= tab.length -1; j++){
                if (tab[j] < tab[i]) {
                    min = j;

                    int tri = tab[i];
                    tab[i] = tab[min];
                    tab[j] = tri;


                }

            }
        }
        printTab(tab);
    }
    public static void printTab(int [] tableau){
        for (int i = 0; i<= tableau.length - 1; i++){
            System.out.println(tableau[i]);
        }
    }



    public static void main(String[] args) {
        int []tableau = {4 , 6 , 9 , 2 , 5 , 3 };
        triSelection(tableau);


    }
}