package Week_5.InnerClass;

public class Outer {
    static class Nested{
        public void display(){
            System.out.println("Static nested class");
        }
        private void privateNestedDisplay(){
            System.out.println("Static nested class,public method");
        }
    }

    public void outDisplay(){
        Outer.Nested nested = new Nested();
        nested.display();
    }

}
