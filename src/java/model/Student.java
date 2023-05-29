package model;

import java.io.Serializable;

/**
 *
 * @author aalmasri
 */
public class Student implements Serializable{
    private String fName;
    private String lName;
    private Laptop laptop;
    // 0 const
    public Student(){}

    public Student(String fName, String lName, Laptop laptop) {
        this.fName = fName;
        this.lName = lName;
        this.laptop = laptop;
    }

    

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    
    
    

    
}
