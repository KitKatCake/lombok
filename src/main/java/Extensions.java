public class Extensions {
    public static <T> T or(T obj,T ifNull){
        return obj!=null?obj:ifNull;
    }
    public static String toTitleCase(String in){
        if (in.isEmpty())
            return in;
        return ""+Character.toTitleCase(in.charAt(0))+in.substring(1).toLowerCase();
    }
}
