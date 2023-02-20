import java.util.*;
class Recruitment{
         void Result(double percent){
                if(percent>=60)
                   System.out.println("\n!!!PASSED!!!\nYour percent = "+percent);
                else 
                   System.out.println("\n!!!FAILED!!!TRY AGAIN NEXT YEAR\nYour percent = "+percent);
         }
}
class Testing extends Recruitment{
         Scanner sc = new Scanner(System.in);
         static int increment=0;
         double percent;
         int A[] = new int[8];
         int B[] = new int[]{1,1,1,1,1,1,1,1};
         void takeTest(){
                System.out.print("\nWhat is the vision of the company?\nPress 1:Great Heights\nPress 2:Something else\nGive your input: ");
                A[0] = sc.nextInt();
                System.out.print("\nHow long will you stay in this role?\nPress 1:As long as the company runs\nPress 2:Atleast 10 years\nGive your input: ");
                A[1] = sc.nextInt();
                System.out.print("\nWhat is final method in java?\nPress 1:Once you declare a method as final it cannot be overridden\nPress 2:Once you declare a method as final it can be overridden\nGive your input: ");
                A[2] = sc.nextInt();
                System.out.print("\nWhat is the lastest version of java?\nPress 1:Java 17\nPress 2:Java 15\nGive your input: ");
                A[3] = sc.nextInt();
                System.out.print("\nWhat did you learn about java in last job?\nPress 1: Its a programming language\nPress 2: Its is a difficult language\nGive your input: ");
                A[4] = sc.nextInt();
                System.out.print("\nWhat do you wish to learn?\nPress 1:Other programming language\nPress 2:Stay on the same\nGive your input: ");
                A[5] = sc.nextInt();
                System.out.print("\nWhat makes a team successful?\nPress 1:Listening to each others views\nPress 2:Poaching only our own ideas\nGive your inputs: ");
                A[6] = sc.nextInt();
                System.out.print("\nDo you work in team or as individual?\nPress 1:Team work is the best work\nPress 2:Working alone makes the best change\nGive your inputs: ");
                A[7] = sc.nextInt();
         }      
         double generateResult(){
                for(int i=0;i<8;i++){
                     if(B[i]==A[i]) 
                       increment++;
                } 
                return percent = (double)(increment*100)/8;
         }
}
class Tester52{
         public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Testing T = new Testing();
                T.takeTest();
                double percent = T.generateResult();
                T.Result(percent);
         }
}