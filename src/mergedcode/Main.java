package mergedcode;


//parent class Water-
class Water{
    public void state(){
        System.out.println("Water is in Liquid State");
    }
}

//subclass Ice represents solid state of water-
class Ice extends Water{
    @Override
    public void state() {
        System.out.println("Water is in solid state(Ice)");
    }
}

//another subclass vapour represent gaseous state of Water-
class Vapour extends Water{
    @Override
    public void state() {
        System.out.println("Water is in gaseous state(Vapour)");
    }
}

public class Main {
    public static void main(String[] args) {
        //creating objects
        Water liquidwater = new Water();
        Water solidwater = new Ice();
        Water gaseouswater = new Vapour();

        liquidwater.state();    //Water is in Liquid State
        solidwater.state();     //Water is in solid state(Ice)
        gaseouswater.state();   //Water is in gaseous state(Vapour)


        //MAIN CLASS WILL BE SAME FOR BOTH ""mergedcode"" and ""sepratedcode""

    }
}
