public class HH {
    public static void main(String[] args) {

        Object ss = "a";
        Class clazzs = ss.getClass();
        boolean flag = ((Object)clazzs == (Object)Object[].class);
        System.out.println(flag);
    }

}
