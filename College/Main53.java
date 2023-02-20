import java.util.*;
class Stock{
         public String name;
         public int A[] = new int[8];
         Stock(){
                Scanner sc = new Scanner(System.in);
                System.out.print("\nEnter the name of the Stock: ");
                name = sc.nextLine();
                System.out.print("\nEnter the stock prices: ");
                for(int i=0;i<8;i++){
                     A[i] = sc.nextInt();
                }    
         }
}
class Transaction extends Stock{
         int S=0,Total=0;
         int Maximumprofit(){
               Total=0;
               for(int i=1;i<8;i++){
                         if(A[i]>A[i-1]){
                            Total = Total + A[i] - A[i-1];
                            System.out.print("\nBuy on day "+i+" Sell on day "+(i+1));
                         }
               }
               return Total;
         }
}
class Main53{
         public static void main(String []args){
                Transaction T = new Transaction();
                int total = T.Maximumprofit();
                System.out.print("\nTotal Profit is: "+total);
         }     
}
