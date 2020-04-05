import lombok.ToString;

@ToString(exclude = "id",callSuper = true,includeFieldNames = true)
public class LombokDemo {
    private int id;
    private String name;
    private int age;

    public static void main(String[] args) {
        System.out.println(new LombokDemo());
    }
}
