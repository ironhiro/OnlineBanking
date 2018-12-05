package Model;
import java.util.*;

public abstract class Member extends Observable{

    public Member(String id, String password, String name, String phoneNo, String address, Boolean gender, Date birth) {
    	
    }

    private String id;

    private String password;

    private String name;

    private String phoneNo;
 
    private String address;

    private Boolean gender;

    private Date birth;

    private ArrayList<Account> accountList;

    public String getID() {
        // TODO implement here
        return "";
    }

    public String getPassword() {
        // TODO implement here
        return "";
    }

    public String getName() {
        // TODO implement here
        return "";
    }

    public String getPhoneNo() {
        // TODO implement here
        return "";
    }

    public String getAddress() {
        // TODO implement here
        return "";
    }

    public Boolean getGender() {
        // TODO implement here
        return null;
    }

    public Date getBirth() {
        // TODO implement here
        return null;
    }

    public void showAccountList() {
        // TODO implement here
        
    }

}