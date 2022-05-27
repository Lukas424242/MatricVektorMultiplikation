public class MatrixVektorMultiplikationTUM {

    
    public static int vecvecmul(int[] a, int[] b){
        int produkt =0;
    for(int i =0; i< a.length;i++){
       produkt = produkt + a[i] + b[i]; 
    }
    return produkt;
    
    }
     //
    public static int[] VektormitMatrix(int[][] a, int[] b){
        int anzErgebnisse=a[0].length;
      int[] produkt = new int[anzErgebnisse];
      int zwischenprodukt=0;
      // zwei For schleifen eine für die matrix tiefe, die andere um die reihen zu
      //multiplizieren
      for(int j =0;j<anzErgebnisse;j++){
          // j nehmen für die matrix in der zweiten schleife
       zwischenprodukt=0;   
       for(int i=0; i<b.length;i++){
         zwischenprodukt = zwischenprodukt + a [i][j]  * b[i];  
           
       }
        produkt[j] = zwischenprodukt;    

       
      }
        return produkt;
    }
    public static int[] matvecmul(int[][] a, int[] b){
       int anzErgebnisse=b.length; 
       int[] produkt = new int[anzErgebnisse];
       int zwischenprodukt=0;

       for(int j=0; j<a.length;j++){
        zwischenprodukt=0;   
 
          for(int i=0;i<anzErgebnisse;i++){
            zwischenprodukt = zwischenprodukt + a[j][i] *b[i]; 
 
          } 
          produkt[j] = zwischenprodukt;    

       }
        
        
       return produkt; 
    }
    
    public static int[][] transpose(int[][] a){
      int[][] b = new int[a[0].length][a.length];
      for(int i=0; i<a.length;i++){
          
          for(int j=0;j<a[i].length;j++){
              b[i][j] = a[j][i];
              
          }
          
      }
      return b;
        
        
    }
    
    public static int[][] matmatmult(int[][] a, int[][] b){
        int[][] neuesprodukt = new int[a.length][a[0].length];
        
        for(int i=0; i<a.length; i++){
            
         for(int j=0;j<a[i].length;j++ ){
             neuesprodukt[i][j] = a[i][j] * b[j][i];
             
             
         }   
        }
        
        
        return neuesprodukt;
    }
    public static int[][] print2D(int [][] feld){
        int[][]neuesArray = null;
        System.out.print("{");

        for(int i=0;i<feld.length;i++){
            
            for(int j=0; j < feld[i].length; j++){
                System.out.print(feld[i][j]);
                
                if (i == feld.length -1 && j==feld[i].length -1 ) {
                System.out.print("");
            } else {
                System.out.print(", ");

            }

            }
        
    }
        System.out.print("}");
 
    return neuesArray;
}
}
