package feb_week2_Assignment;

// this keyword: points to current object
// used when the name is same to remove ambiguity
// if u don't want to use it then just change the variable name
class Student{
    //private variables
    private  int id;
    private  String name,city;
    private  float percentage;

    // public methods:getters and setters


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // tostring


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public float getPercentage() {
        return percentage;
    }
}
public class StudentEncapsulation {
    public static void main(String[] args) {
        Student student=new Student();
        student.setId(1);
        student.setName("Sujan");
        student.setCity("Nanded");
        student.setPercentage(87.45f);
        System.out.println(student);

    }
}
