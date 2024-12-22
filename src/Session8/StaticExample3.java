package Session8;

public class StaticExample3 {

    static class Config{
//        static int  defaultValue = 100;
//        or
        static int defaultValue;
        static{
        defaultValue = 100;
        }
        public static int getDefaultValue(){
            return defaultValue;

        }
    }

    public static void main(String[] args) {
        Config c = new Config();
        System.out.println(Config.getDefaultValue());


//      if remove static from defaultValue, it will give an error. we can't call
//            System.out.println(Config.getDefaultValue()); in main method, but it will work with
//            System.out.println(c.getDefaultValue());
//
//
//        public int getDefaultValue(){
//            return defaultValue;
//
//        public static void main(String[] args) {
//        Config c = new Config();
//        System.out.println(c.getDefaultValue());
    }
}
