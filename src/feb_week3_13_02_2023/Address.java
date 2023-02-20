package feb_week3_13_02_2023;

//constructor :
//no return type allowed. becoz constructor is of class only.
public class Address {
    int pno,fno,pincode;
    String hname,area,city,state,country;

    public Address(int pno, int fno, int pincode, String hname, String area, String city, String state) {
        this.pno = pno;
        this.fno = fno;
        this.pincode = pincode;
        this.hname = hname;
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
