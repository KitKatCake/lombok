import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Wither;

@Builder
@Wither
@Getter
public class Sample {
    private int x;
    private int y;

    public static void main(String[] args) {
//        Sample s = Sample.builder().x(10).y(20).build();

//        System.out.println(s.getX());
//        System.out.println(s.getY());
        Sample s = new Sample().withX(10).withY(20);
    }
}
