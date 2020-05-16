public class Invoice {

public int CalBill(int days, String type) {
	int bill=0;
	if(day>=0)
	{
		if (type.compareTo("single")==0)
		{
			bill=3000*days;
		}
		else if(type.compareTo("twin bed")==0)
		{
			bill=4000*days;
		}
		else if(type.compareTo("suite")==0)
		{
			bill=12000*days;
		}
		return bill;
	}
	else
	{
		return -1;
	}
	
}
