package Model;

import java.sql.Date;
import java.util.Observable;

public class Product extends Observable {
	private String account_name;
	private Date account_date;
	
	public Product()
	{
		
	}
	
	
	
	public String getAccountName()
	{
		return account_name;
	}
	
	public Date getAccountDate()
	{
		return account_date;
	}
	
	public void setData(String account_name, Date account_date)
	{
		this.account_name = account_name;
		this.account_date = account_date;
		measurementChanged();
	}
	
	public void measurementChanged()
	{
		setChanged();
		notifyObservers(null);
	}
}
