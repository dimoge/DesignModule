public class MainFactory {

    public static void main(String[] args) {

        System.out.println(test(1));
        System.out.println(test2(1));

    }

    public static String test(int num) {
        switch (num) {
            case 1:
                return "11111";
            case 2:
                return "2222";
            case 3:
                return "33333";
            case 4:
                return "44444";
            default:
                return "00000000000000";
        }
    }

    public static String test2(int num) {
        String result = "";
        switch (num) {
            case 1:
                result = "11111";
                return result + "asdf";
            case 2:
                result = "2222";
                return result + "asdf";
            case 3:
                result = "33333";
                return result + "asdf";
            case 4:
                result = "44444";
                return result + "asdf";
            default:
                result = "0000000000000000000000";
                return result + "asdf";
        }
//        return result;
    }
}
