package Week_5.Lambdas;

public class CheckIfHoper implements CheckTrait {
    @Override
    public boolean test(Animal anim) {
        return anim.canHope();
    }
}
