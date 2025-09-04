public class LambdaPracticeImplementation {

//    @Override
//    public void dMe() {
//        //LambdaPractice.super.dMe();
//        System.out.println("functional interface implementation");
//
//    }

//    @Override
//    public void runFast() {
//        System.out.println("functional interface implementation");
//
//    }




    public static void main(String[] args) {
//        LambdaPracticeImplementation lp = new LambdaPracticeImplementation();
        boolean isStaticInvoked = LambdaPractice.staticMethod();
        System.out.println(isStaticInvoked);
        LambdaPractice lp = (System.out::println);

        lp.runFast(10);

    }
}
