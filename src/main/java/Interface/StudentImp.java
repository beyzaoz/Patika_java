package Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class StudentImp extends test implements Student,student2{

    boolean mezunMu= false;

    float ortalama = 65.76f;




    @Override
    public void mezunolma(int studentId) throws Exception {
        if(ortalama>65){
            mezunMu = true;
        } else{
            mezunMu=false;
        }

    }

    @Override
    public float ortalama() {
        List<Integer> numbers = new LinkedList<>();
        numbers.iterator();
        return new Random().nextInt();
    }

}
