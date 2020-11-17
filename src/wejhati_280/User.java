/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wejhati_280;

/**
 *
 * @author manar
 */
public class User {
    private String FName;
    private String LName;
    private String age;
    private String phoneNo;
   private String gender;

   public User(){
       
   }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
         
    public User(String FName, String LName, String age, String phoneNo, String country, String dob,String g) {
        this.FName = FName;
        this.LName = LName;
        this.age = age;
        this.phoneNo = phoneNo;
        this.country = country;
        this.dob = dob;
        this.gender=g;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    private String country;
    private String dob;
    
    
 
}
