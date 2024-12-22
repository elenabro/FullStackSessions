package Session8;

public class StaticMethod {

    static class MathUtil{
        public static int calcSquare(int num){
            return num*num;
        }
    }


//     we don't need to initialize MathUtil class.
//     We don't need multiple instances of  the same calculation

    public static void main(String[] args) {
        System.out.println(MathUtil.calcSquare(125));
    }
}
