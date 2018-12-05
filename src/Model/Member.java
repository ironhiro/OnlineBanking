package Model;
import java.util.*;

public abstract class Member extends Observable{

	private String id = "";

    private String password = "";

    private String name = "";

    private String phoneNo = "";

    private String address = "";

    private Boolean gender = false;

    private Date birth = null;
    public Member() {
    	
    	
    }
//
//<<<<<<< HEAD
    private String id;

    private String password;

    private String name;

    private String phoneNo;
 
    private String address;

    private Boolean gender;

    private Date birth;
//=======
//    
//>>>>>>> branch 'master' of https://github.com/ironhiro/OnlineBanking.git

    private ArrayList<Account> accountList;

    public String getID() {
        // TODO implement here
        return id;
    }

    public String getPassword() {
        // TODO implement here
        return password;
    }

    public String getName() {
        // TODO implement here
        return name;
    }

    public String getPhoneNo() {
        // TODO implement here
        return phoneNo;
    }

    public String getAddress() {
        // TODO implement here
        return address;
    }

    public Boolean getGender() {
        // TODO implement here
        return gender;
    }

    public Date getBirth() {
        // TODO implement here
        return birth;
    }
    
    public void setValues(String id,String password, String name, String phoneNo, String address, boolean gender, Date birth)
    {
    	this.id = id;
    	this.password = password;
    	this.name = name;
    	this.phoneNo = phoneNo;
    	this.address = address;
    	this.gender = gender;
    	this.birth = birth;
    	measurementsChanged();
    }
    
    public ArrayList<Account> getAccountList(){
    	return accountList;
    }
    
    public void addAccountList(Account a)
    {
    	accountList.add(a);
    	measurementsChanged();
    }
    
    
    public void measurementsChanged()
    {
    	setChanged();
    	notifyObservers(null);
    }

    public void showAccountList() {
        // TODO implement here
        
    }

}