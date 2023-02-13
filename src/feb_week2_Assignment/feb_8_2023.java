package feb_week2_Assignment;
// calculate area of rectangle using getter ,setter

class AreaOfRectangle{
    private int width;
    private  int height;
    private  int Area;

    public int Area(){
        return  Area=height*width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    private  int getArea(){
        return Area;
    }

    private  int setArea(){
        return Area;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "AreaOfRectangle{" +
                "width=" + width +
                ", height=" + height +
                ", Area=" + Area +
                '}';
    }
}


public class feb_8_2023 {
    public static void main(String[] args) {
        AreaOfRectangle areaOfRectangle= new AreaOfRectangle();
        areaOfRectangle.setHeight(50);
        areaOfRectangle.setWidth(100);
       // System.out.println("Area of rectangle is: "+ areaOfRectangle.Area());
        System.out.println("Area of rectangle is: "+ areaOfRectangle.getHeight()*areaOfRectangle.getWidth());



    }
}
