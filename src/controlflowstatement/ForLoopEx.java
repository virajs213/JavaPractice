package controlflowstatement;

public class ForLoopEx {
    public static void main(String[] args) {
        //Simple For Loop
      /*  for (int i =0;i<3;i++) {
            System.out.println(i);
        }*/
        //Nested Loop
//        for (int i = 0; i < 5; i++) {
//
//            for (int j = 0; j < 5; j++) {
//                System.out.println(i + " " + j);
//            }
//        }
        //Nested Example
//        for (int i = 3;i>0;i--){
//            for (int j=3;j>0;j--) {
//                System.out.println(i+" "+j);
//            }
        //Infinte Loop
//        for (;;) {
//            System.out.println("Hello");
//        }
        //Enhanced For Loop
        int a[] = {2,4,6,8,10};
        for(int no:a) {
            System.out.println(no);
        }
    }
}
