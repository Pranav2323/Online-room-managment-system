public class Invoice {

public int CalBill(int days, String type) {
	int bill=0;
	if (type.compareTo("single")==0)
	{
		bill=2500*days;
	}
	else if(type.compareTo("twin bed")==0)
	{
		bill=3500*days;
	}
	else if(type.compareTo("suite")==0)
	{
		bill=10000*days;
	}
	
	return bill;
	}
}
