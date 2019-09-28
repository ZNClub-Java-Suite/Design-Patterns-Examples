import duck.*;
import flying.FlyRocketPowered;

public class Application {

    public static void main(String[] args) {
        simulator();
    }

    public static void simulator() {

        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();

        ModelDuck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
//        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new flying.FlyRocketPowered());
        model.performFly();
    }

    public static void simulatorTwo(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
