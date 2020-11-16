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
public class sign_linkedlist {
      private signup head;
private int count=0;

    public signup getHead() {
        return head;
    }

    public void setHead(signup head) {
        this.head = head;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public sign_linkedlist() {
       count++;
    }
    public boolean isEmpty() {
      //to check if the linked list is empty
        return head == null;
    } 
        public void removeStudent(String user) { 
//removing only one student

       if (head.getUsername().equalsIgnoreCase(user)) {
            head = head.getNext();
        } else {
            signup helpPtr = head;

            while (helpPtr != null) {
                if (helpPtr.getUsername().equalsIgnoreCase(user)) {
            
                    helpPtr.setNext(helpPtr.getNext().getNext());
                    break;
                }
                helpPtr = helpPtr.getNext();
            }
        }
    }
        public String PrintInfo() {
    //printing students
     
        signup helpPtr = head;
        System.out.println("");
String append="";
        while (helpPtr != null) {

          append+= count++ +" username"+","+helpPtr.getUsername()+","+"password"+","+helpPtr.getPassword()+","+"country"+","+helpPtr.getCountry()+","+"fname"+","+helpPtr.getFname()+","+"lname"+","+helpPtr.getLname()+","+"Phoneno"+","+helpPtr.getPhoeno()+"\n";
   
            helpPtr = helpPtr.getNext(); // to go to the next node

        }
   
        return append;
    }
    public void addUser(signup newSign) {
//this method is to add a new student to the linked list
            if (head == null) {
                head = newSign;
            } else {

                signup helpPtr = head;
                while (helpPtr.getNext() != null) {
                    helpPtr = helpPtr.getNext();
                }
                helpPtr.setNext(newSign);
            
        }
    }
 
}
