package Week_3.Generics;

public class Box<T> {
    private T content;
    public T getContent(){
        return content;
    }

    public void setContent(T content){
        this.content=content;
    }


}
