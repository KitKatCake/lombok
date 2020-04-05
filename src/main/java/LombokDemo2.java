import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
public class LombokDemo2 {
    @NonNull
    private int id;
    @NonNull
    private String shap;
    private int age;

    public static void main(String[] args) {
        new LombokDemo2(1,"circle");

        LombokDemo2.of(2,"circle2");

        new LombokDemo2();

        new LombokDemo2(1, "circle", 2);
    }
}
