import Strategy.AgressiveBehavior;
import Strategy.DefensiveBehavior;
import Strategy.Robot;

public class App {
    public static void main(String[] args) throws Exception {
        Robot megatron = new Robot();
        megatron.setName("MR. Megatron");
        megatron.setBehavior(new AgressiveBehavior());
        System.out.println(megatron.getName());
        megatron.move();
        Robot optimus = new Robot();
        optimus.setName("MR. Optimus");
        optimus.setBehavior(new DefensiveBehavior());
        System.out.println(optimus.getName());
        optimus.move();
    }
}
