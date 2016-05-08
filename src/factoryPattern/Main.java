package factoryPattern;

/**
 * Created by arpit on 31/1/16.
 */
public class Main {

    public static void main(String[] args){

        GodFactory godFactory = GodFactory.getInstance();
        God god1 = godFactory.createGod("Goku");
        God god2 = godFactory.createGod("Vegeta");
        God god3 = godFactory.createGod("Bills");

        System.out.println("God's Name : " + god1.getName()
            + ", Power Level : " + god1.getPowerLevel()
            + ", Special Move : " + god1.getspecialMove());

        System.out.println("God's Name : " + god2.getName()
                + ", Power Level : " + god2.getPowerLevel()
                + ", Special Move : " + god2.getspecialMove());

        System.out.println("God's Name : " + god3.getName()
                + ", Power Level : " + god3.getPowerLevel()
                + ", Special Move : " + god3.getspecialMove());

    }

}
