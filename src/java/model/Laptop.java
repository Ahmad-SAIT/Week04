package model;

import java.io.Serializable;

/**
 *
 * @author aalmasri
 */
public class Laptop implements Serializable{
    private String model;
    private Laptop(){}

    public Laptop(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
}
