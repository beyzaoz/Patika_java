package Week_3.Generics;

public class Bounded_generic_example <T extends Animal>{
    private T content;
    public T getContent(){
        return content;
    }

    public void setContent(T content){
        this.content=content;
    }
}
