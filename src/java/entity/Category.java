package entity;
// Generated Oct 20, 2016 9:55:15 PM by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * Category generated by hbm2java
 */
public class Category  implements java.io.Serializable {


     private String code;
     private String name;

    public Category() {
    }

	
    public Category(String code) {
        this.code = code;
    }
    public Category(String code, String name) {
       this.code = code;
       this.name = name;
    }
   
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


