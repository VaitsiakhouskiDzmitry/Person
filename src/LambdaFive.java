public class LambdaFive {
    interface Operation{
        int execute(int x, int y);
    }
    private static Operation action(int number){
        switch(number){
            case 1 : return(x,y)->x+y;
            case 2 : return (x,y)->x-y;
            case 3 :return(x,y)->x*y;
            defaulr: return(x,y)->0;
        }
    }

    public static void main(String[] args) {
        Operation func = action(1);
        int a = func.execute(6,5);
        int b = action(2).execute(8,2);
    }

}
