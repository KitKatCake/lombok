import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class EnumIdExample {
    @RequiredArgsConstructor
    public enum Status{
        WAITING(0),
        READY(1),
        SKIPPED(-1),
        COMPLETED(5);

        @Getter
        private final int code;
    }
}
