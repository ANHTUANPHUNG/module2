public class fan1 {
    public static void main(String[] args) {
        fan2 fan11 = new fan2();
        fan11.setSpeed(fan2.FAST);
        fan11.setRadius(10);
        fan11.setColor("yellow");
        fan11.setOn(true);
        fan2 fan22 =new fan2();
        fan22.setSpeed(fan2.MEDIUM);
        fan22.setRadius(5);
        fan22.setColor("blue");
        fan22.setOn(false);
        System.out.println("fan1");
        System.out.println(fan11);
        System.out.println("fan1");
        System.out.println(fan22);
    }
}
