import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@Builder
public class User {
    private String id;
    private String name;
    private Integer age;



    public static void main(String[] args) {
       // User user = new User();

//        user.setId("1");
//        user.setName("name");
//        user.setAge(1);

       // user.setId("1").setName("chain").setAge(1);

        User user = User.builder().id("1").name("builder").age(1).build();

        System.out.println(user.getId());




    }


}
