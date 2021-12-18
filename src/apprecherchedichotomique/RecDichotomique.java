
package apprecherchedichotomique;

public class RecDichotomique {

   
   

  
     static  int[] table = new int[20];
    static void AfficherTable (int [] t){
        int n = t.length - 1;
        for(int i = 1; i <=n ; i++){
        System.out.println(t[i] + " ,");
         System.out.println();
        }
    }
    static void InitTable(){
        //remplisage aleatoire du tableau
        int n = table.length - 1;
        for(int i = 1; i <= n; i++){
            table[i] = (int)(Math.random()*100);
        }
    }
    static void TriInsert (){
        // sous - programme de tri par selection
        int n = table.length - 1;
        for(int i = 2; i<-n; i++){
        int V = table[i];
        int j = i;
        while(table[j-1] > V){
            table[j] = table[j-1];
            j = j-1;
        }
        table[j] = V;
        }
    }
    static int RechDichometrique2(int[] t , int Elt){
        int n = t.length - 1;
        int bas = 1, haut = n, milieu;
        int Rang = -1;
        do{
            milieu = (bas + haut)/2;
            if(Elt == t[milieu])Rang = milieu;
            else if (t[milieu] < Elt) bas = milieu + 1;
            else haut = milieu - 1;
        }
        while((Elt != t[milieu]) & (bas <= haut));
        return Rang;
    }
      public static void main(String[] args) {
        InitTable();
        System.out.println("Tableau initial");
        AfficherTable(table);
        TriInsert();
        System.out.println("Tableau trie");
        AfficherTable(table); 
        int tab[] = {1, 2, 3, 4, 5, 6, 7};
        int val = 3;
        int L = tab.length - 1;
        RechDichometrique2( tab , 6);
    }
    
}
