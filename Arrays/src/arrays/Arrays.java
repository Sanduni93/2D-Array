
package arrays;


public class Arrays {

  
    public static void main(String[] args) {
        int[][] a = new int[10][10];
        
        int i,j,m=0;
        
        for(i=a.length;i>=1;i--){
            
            for(j=a.length;j>=1;j--){
            int k =i*j;
            a[m][10-j]=k;
            
               System.out.print( a[m][10-j]);
              System.out.print("  ");  
                 
                
            }
        System.out.println("");
        m++;
        }
      
        
        
        
    }
    
}
