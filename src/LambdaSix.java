import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LambdaSix {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ivan");
        strings.add(null);
        strings.add("Stepan");
        strings.add("bloblbolblo");
        List<user1> users = new ArrayList<>();
        List<String> usernames = new ArrayList<>();
        for(String name:strings){
            if( name !=null&&!name.contains(" ")&&Character.isUpperCase(name.charAt(0))){
                usernames.add(name);
            }
        }
        Collections.sort(usernames);
        for(String name:usernames){
            user1 user = new user1(name);
            users.add(user);
        }
    }
}
class user1{
    private String name;
    public user1(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }        }
