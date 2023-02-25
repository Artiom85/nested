public class MotherBoard {

    static class USB {
        public String name = "AVIO ";
        public int value = 12;

        void method(){
            System.out.print(name);
            System.out.print(value);

        }
    }
    public static void myMethod(){
        USB usb = new USB();
        usb.method();

    }

}
