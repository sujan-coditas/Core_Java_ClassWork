package feb_week3_13_02_2023;

public interface ShapeInterface {
    abstract void area();
    // we can have method defination in interface but we have to use default & static
    // for this method we can only have default we cant write public private or protected
    // why to use default and why not other modifiers ??
    default void display(){
        System.out.println(" display");
    }
    static void show(){
        System.out.println("show ");
    }

}
