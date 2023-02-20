import java.util.*;
class Production{
         private String title,director,writer;
         Production(String T,String D,String W){
                 title = T;
                 director = D;
                 writer = W;
         }       
         public String toString(){
                 return ("\nTitle: "+title+"\nDirector: "+director+"\nWriter: "+writer);
         }
}
class Play extends Production{
         Scanner sc = new Scanner(System.in);
         String Output;
         int Pseats,Tplay=0;
         static int Sum=0,f=0,performance=0;
         Play(String T,String D,String W){
                super(T,D,W);
         }
         void SetPlay(){
                 performance++;
                 System.out.print("\nEnter the number of seats you want: ");
                 Pseats = sc.nextInt();
                 Tplay = 500 * Pseats;
         }
         public String toString(){
                 return (super.toString() +"\nTotal seats: "+Pseats);
         }
         void GetPlay(){
                 System.out.print("\nAmount to pay: "+Tplay);
                 Sum = Sum + Tplay;
         } 
}
class Musical extends Play{
         Scanner sc = new Scanner(System.in);
         String composer,lyricist;
         Musical(String T,String D,String W){
                super(T,D,W);
                System.out.print("\nEnter the name of composer: ");
                composer = sc.nextLine();
                System.out.print("\nEnter the name of lyricist: ");
                lyricist = sc.nextLine();
         }
         void SetMusical(){
                 performance++;
                 System.out.print("\nEnter the number of seats you want: ");
                 Pseats = sc.nextInt();
                 Tplay = 800 * Pseats;
         }
         public String toString(){
                 return (super.toString()+"\nComposer: "+composer+"\nLyricist: "+lyricist);
         }
}
class Tester54{
         public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Play P[] = new Play[3];
                Musical M[] = new Musical[2]; 
                for(int i=0;i<3;i++){
                     System.out.print("\nEnter Play Details: ");
                     System.out.print("\nTitle: ");
                     String str = sc.nextLine();
                     System.out.print("\nDirector: ");
                     String D = sc.nextLine();
                     System.out.print("\nWriter: ");
                     String W = sc.nextLine(); 
                     P[i] = new Play(str,D,W);
                     P[i].SetPlay();
                }
                for(int i=0;i<2;i++){
                     System.out.print("\nEnter Musical Details: ");
                     System.out.print("\nTitle: ");
                     String str = sc.nextLine();
                     System.out.print("\nDirector: ");
                     String D = sc.nextLine();
                     System.out.print("\nWriter: ");
                     String W = sc.nextLine(); 
                     M[i] = new Musical(str,D,W);
                     M[i].SetMusical();
                }
                for(int i=0;i<3;i++){
                     String output = P[i].toString();
                     System.out.print("\n"+output);
                     P[i].GetPlay();
                }
                for(int i=0;i<2;i++){
                     String output = M[i].toString();
                     System.out.print("\n"+output);
                     M[i].GetPlay();
                }
                System.out.print("\n\nThe total number of performances is: "+M[1].performance+"\nThe total box office collection is: "+M[1].Sum);
         }
}