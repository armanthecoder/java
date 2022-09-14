public class break_continue {
    public static void main(String[]args){

        // break using for loops
        //for(int i=0;i<50;i++){
        //    System.out.println(i);
        //    System.out.println("Java is graet!");
        //    if(i==2){
        //        System.out.println("Ending the loop");
        //        break;
        //    }
        //}


        // break using while loop
        //int i=0;
        //while(i<=2){
          //  System.out.println(i);
          //  System.out.println("Java is great!");
           // if(i==2){
          //      System.out.println("Ending the loop");
         //       break;
         //   }
        //    i++;
        //}
        //System.out.println("loop ends here");


        //break using do_while_loops
        //int i=0;
        //do{
        //    System.out.println(i);
        //    System.out.println("Java is great");
        //    if(i==2){
        //        System.out.println("Ending of loop");
        //        break;
        //    }
        //    i++;
        //}while(i<=2);
        //    System.out.println("Loop ends here");


        //continue using for loops
        //     for(int i=0;i<50;i++){
        //        if(i==2){
        //            System.out.println("Ending the loop");
        //            continue;
        //        }
        //         System.out.println(i);
        //         System.out.println("Java is graet!");
        //    }


            // continue using while loop
        //    int i=0;
        //    while(i<=2){
        //      System.out.println(i);
        //      System.out.println("Java is great!");
        //     if(i==2){
        //          System.out.println("Ending the loop");
        //           continue;
        //       }

        //        i++;
        //    }
        //    System.out.println("loop ends here");


            //break using do_while_loops
            int i=0;
            do{
                i++;
                if(i==2){
                    System.out.println("Ending of loop");
                    continue;
                }
                System.out.println(i);
                System.out.println("Java is great");

            }while(i<=5);
                System.out.println("Loop ends here");
    }
}
