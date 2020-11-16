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
public class signup {
    private String country;
            private String username;
            private String password;
            private String gender;
            private int clicked;
            private int count;
private signup next;

    public signup getNext() {
        return next;
    }

    public void setNext(signup next) {
        this.next = next;
    }
    public signup(int clicked,int count) {
        this.clicked=clicked++;
        this.count=count++;
    }

    public signup() {
        
    }

    public int getClicked() {
        return clicked;
    }
public void setCount(int count) {
        this.count = count++;
    }
    public void setClicked(int clicked) {
        this.clicked = clicked++;
    }

    public int getCount() {
        return count;
    }
public void printCount(){
    System.out.println(this.getCount());
}
    
        
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoeno() {
        return phoeno;
    }

    public void setPhoeno(String phoeno) {
        this.phoeno = phoeno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
            private String phoeno;
            private String fname;
            private String lname;

    public signup(String country, String username, String password, String gender, String phoeno, String fname, String lname) {
        this.country = country;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.phoeno = phoeno;
        this.fname = fname;
        this.lname = lname;
    }
            
}
