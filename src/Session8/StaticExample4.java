package Session8;

public class StaticExample4 {

    static class Config1{

        public int  defaultValue = 100;
//       without static (public int) the method returns 100, 100
//       with static int (public static int) the method returns 100, 200

        public int getDefaultValue(){
            return defaultValue;
        }

        public void setDefaultValue(int value){
            defaultValue = value;
        }
    }

    public static void main(String[] args) {
        Config1 config1 = new Config1();
        Config1 config2 = new Config1();
        System.out.println(config1.getDefaultValue());
        config2.setDefaultValue(200);
        System.out.println(config1.getDefaultValue());

    }
}


