package Week_5.Lambdas;

public class CheckIfSwim implements CheckTrait{

    @Override
    public boolean test(Animal anim) {
        return anim.canSwim();

    }
}
