import lombok.experimental.ExtensionMethod;

@ExtensionMethod({java.util.Arrays.class, Extensions.class})
public class ExtensionMethodExample {
    public String test(){
        int [] intArray = {5,3,8,2};
        intArray.sort();
        String iAmNull = null;
        return iAmNull.or("hELlO, WORlD!".toTitleCase());
    }

    public static void main(String[] args) {
        ExtensionMethodExample extensionMethodExample = new ExtensionMethodExample();

        String s = extensionMethodExample.test();

        System.out.println(s);
    }
}


