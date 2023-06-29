package utilities;

import java.util.Locale;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class FakerUtility {
	
	
	
	public static String clientName()
	{
		Faker fake=new Faker();
		String clientname=fake.name().username();
				
				return clientname;
	
	}
	
	public static String company()
	{
		Faker fake=new Faker();
		String companyNameString=fake.name().username();
		
		return companyNameString;
	}
	public static String location()
	{
		Faker fake=new Faker();
		String location=fake.address().latitude();
		
		
		return location;
	}
	public static String address()
	{
		Faker fake=new Faker();
		String address=fake.address().streetAddress();
		
		
		return address;
	}
	public static String city()
	{
		Faker fake=new Faker();
		String city=fake.address().city();
		
		
		return city;
	}
	public static String postalcode()
	{
		Faker fake=new Faker();
		String postalcode=fake.address().countryCode();
		
		
		return postalcode;
	}
	public static String telephone()
	{
		Faker fake=new Faker();
		String postalcode=fake.address().countryCode();
		
		
		return postalcode;
	}
	public static String email()
	{
		FakeValuesService fakevalueservice=new FakeValuesService(new Locale("en-GB"),new RandomService());
		Faker fake=new Faker();
		String email=fakevalueservice.bothify("????##@gmail.com");
		
		
		return email;
	}
	public static String vat()
	{
		Faker fake=new Faker();
		String vatnum=fake.idNumber().ssnValid();
		
		
		return vatnum;
	}
	public static String snn()
	{
		Faker fake=new Faker();
		String snnnumber=fake.idNumber().ssnValid();
		
		
		return snnnumber;
	}
	
}
