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
   
            private String username;
            private String password;
         
private signup next;

    public signup getNext() {
        return next;
    }

    public void setNext(signup next) {
        this.next = next;
    }
 
    public signup() {
        
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
        this.username = username;
        this.password = password;
        this.phoeno = phoeno;
        this.fname = fname;
        this.lname = lname;
    }
    public boolean isDateMatched(String date){
      return date.matches("\\d{2}/\\d{2}/\\d{4}");
      
    }
     public boolean isPhoneMatched(String phone){
         return phone.matches("\\d{2}-\\d{3}-\\d{4}");
     }       
     public boolean isStrong (String pass){
         return (pass.length()>=7 && pass.matches("^[a-zA-Z0-9]*$"));
     }
}
