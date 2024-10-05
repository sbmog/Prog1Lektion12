package opgave03;


public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

        //Man kan undlade, at kalde på tostring metoden her i main, da compileren selv ved, at det er metodens indhold, som der skal printes, hvis man blot skriver objektets navn. OBS. tostring metoden skal fortsat være inde i klassen. Det er blot, det at kalde den, man kan spare væk.
    }
}
