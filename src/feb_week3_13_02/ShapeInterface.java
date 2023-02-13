package feb_week3_13_02;

public interface ShapeInterface {
    abstract void area();
    // we can have method defination in interface but we have to use default & static
    default void display(){

    }
    static void show(){

    }

}
