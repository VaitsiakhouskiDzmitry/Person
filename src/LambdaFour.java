public class LambdaFour {
    interface UserBuilder{
        User create(String name);
    }


    public static void main(String[] args) {
        UserBuilder userB = User::new;
        User user = userB.create("Tom");
        System.out.println(user.getName());
    }

}
class User{
    private String name;
    String getName(){
        return  name;
    }
    User(String n ){
        this.name=n;
    }

}
