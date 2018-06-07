public class lambdaExamples {

        interface Operationable{
            int calculate(int x,int y);
        }
        private static  void m1(){
            Operationable operationableAnon = (x, y) -> x+y;
            int resultAnon = operationableAnon.calculate(10,20);
            System.out.println(resultAnon);

        Operationable operation1 = (x,y)->x*y;
        Operationable operation2 = (x,y)->x-y;
            System.out.println(operation1.calculate(10,20));
            System.out.println(operation2.calculate(10,20));
}



    public static void main(String[] args) {

            m1();
        }

    }

