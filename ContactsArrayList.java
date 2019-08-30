package testFinalProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import finalProject.finalProject.ContactList;
import finalProject.finalProject.Contacts;
import finalProject.finalProject.ContactsArrayCollection;
import finalProject.finalProject.ContactsLinkedCollection;
import finalProject.finalProject.UsingContactsFile;

class ContactsArrayList {
	String businessName;
	String firstName;
	String lastName;
	String streetAddress;
	String email;
	String phoneNumber;
	String format = "%-10.10s %-15.15s %-15.15s %-15.15s %-30.30s %-30.30s %-20.20s%n";
	ContactsArrayCollection cac= new ContactsArrayCollection();
	String fileName = "MOCK_DATA.csv";
	UsingContactsFile contactsFile = new UsingContactsFile(fileName);
	ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
	ContactsArrayCollection searchReturn = contactList.getAll("anika");
	@Test
	void getIndexTest1() {
		int i=1;
		String actual="";
		actual+=searchReturn.getIndex(i).getBusinessName()+" "+
	               searchReturn.getIndex(i).getFirstName()+" "+
	               searchReturn.getIndex(i).getLastName()+" "+
	               searchReturn.getIndex(i).getStreetAddress()+" "+
	               searchReturn.getIndex(i).getEmail()+" "+
	               searchReturn.getIndex(i).getPhoneNumber()+"\n";
		
		//System.out.println(actual);
		String expected="anikaHr" + " "+ "anika"+" "+"hridita"+" "+"99999"+" "+"12345"+" "+"77777"+"\n";
		assertEquals(expected, actual);
		
	}
	@Test
	void sortElementTest1() {
		//int arr[]= {5,2,1,10,9,10,7,2,3,45};
		
		searchReturn.sortElements(1,1);
		String actual = "";
       for(int i = 0; i < searchReturn.size(); i++) {
    	   actual+=searchReturn.getIndex(i).getBusinessName()+" "+
                   searchReturn.getIndex(i).getFirstName()+" "+
                   searchReturn.getIndex(i).getLastName()+" "+
                   searchReturn.getIndex(i).getStreetAddress()+" "+
                   searchReturn.getIndex(i).getEmail()+" "+
                   searchReturn.getIndex(i).getPhoneNumber()+"\n";
         }
       //System.out.println(actual);
		String expected="anika" + " "+ "anika"+" "+"tabassum"+" "+"123456"+" "+"3333"+" "+"2222"+"\n"+
				"anikaHr" + " "+ "anika"+" "+"hridita"+" "+"99999"+" "+"12345"+" "+"77777"+"\n";
		//System.out.println(expected);
		
		assertEquals(expected, actual);
	}
	//ContactsArrayCollection searchReturn2 = contactList.getAll("anika");
	@Test
	void sortElementTest2() {
		
		searchReturn.sortElements(1,2);
		String actual = "";
       for(int i = 0; i < searchReturn.size(); i++) {
    	   actual+=searchReturn.getIndex(i).getBusinessName()+" "+
                   searchReturn.getIndex(i).getFirstName()+" "+
                   searchReturn.getIndex(i).getLastName()+" "+
                   searchReturn.getIndex(i).getStreetAddress()+" "+
                   searchReturn.getIndex(i).getEmail()+" "+
                   searchReturn.getIndex(i).getPhoneNumber()+"\n";
         }
       //System.out.println(actual);
		String expected="anikaHr" + " "+ "anika"+" "+"hridita"+" "+"99999"+" "+"12345"+" "+"77777"+"\n"+
				"anika" + " "+ "anika"+" "+"tabassum"+" "+"123456"+" "+"3333"+" "+"2222"+"\n";
		//System.out.println(expected);

		assertEquals(expected, actual);
	}
	
	@Test
	void sortElementTest3() {
		
		searchReturn.sortElements(2,1);
		String actual = "";
       for(int i = 0; i < searchReturn.size(); i++) {
    	   actual+=searchReturn.getIndex(i).getBusinessName()+" "+
                   searchReturn.getIndex(i).getFirstName()+" "+
                   searchReturn.getIndex(i).getLastName()+" "+
                   searchReturn.getIndex(i).getStreetAddress()+" "+
                   searchReturn.getIndex(i).getEmail()+" "+
                   searchReturn.getIndex(i).getPhoneNumber()+"\n";
         }
       //System.out.println(actual);
		String expected="anikaHr" + " "+ "anika"+" "+"hridita"+" "+"99999"+" "+"12345"+" "+"77777"+"\n"+
				"anika" + " "+ "anika"+" "+"tabassum"+" "+"123456"+" "+"3333"+" "+"2222"+"\n";
		//System.out.println(expected);
		
		assertEquals(expected, actual);
	}
	@Test
	void sortElementTest4() {
		//int arr[]= {5,2,1,10,9,10,7,2,3,45};
		
		searchReturn.sortElements(1,1);
		
		String actual = "";
	   for(int i = 0; i < searchReturn.size(); i++) {
		   actual+=searchReturn.getIndex(i).getBusinessName()+" "+
	               searchReturn.getIndex(i).getFirstName()+" "+
	               searchReturn.getIndex(i).getLastName()+" "+
	               searchReturn.getIndex(i).getStreetAddress()+" "+
	               searchReturn.getIndex(i).getEmail()+" "+
	               searchReturn.getIndex(i).getPhoneNumber()+"\n";
	     }
	   //System.out.println(actual);
		String expected="anika" + " "+ "anika"+" "+"tabassum"+" "+"123456"+" "+"3333"+" "+"2222"+"\n"+
				"anikaHr" + " "+ "anika"+" "+"hridita"+" "+"99999"+" "+"12345"+" "+"77777"+"\n";
		//System.out.println(expected);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void removeElementTest() {
		int expected=searchReturn.size()-1;
		//System.out.println("sized "+expected);
		int actual=searchReturn.removeElementByIndex(0);
		assertEquals(expected, actual, "match");
	}
	
	@Test
	void filterElementsTest1() {
		searchReturn.filterElements(1, "anika");
		String actual="";
		for(int i = 0; i < searchReturn.size(); i++) {
			   actual+=searchReturn.getIndex(i).getBusinessName()+" "+
		               searchReturn.getIndex(i).getFirstName()+" "+
		               searchReturn.getIndex(i).getLastName()+" "+
		               searchReturn.getIndex(i).getStreetAddress()+" "+
		               searchReturn.getIndex(i).getEmail()+" "+
		               searchReturn.getIndex(i).getPhoneNumber()+"\n";
		     }
		//System.out.println(actual);
		String expected="anika" + " "+ "anika"+" "+"tabassum"+" "+"123456"+" "+"3333"+" "+"2222"+"\n"+
				"anikaHr" + " "+ "anika"+" "+"hridita"+" "+"99999"+" "+"12345"+" "+"77777"+"\n";
		//System.out.println(expected);
		
		//System.out.println(searchReturn.getIndex(0).getUniqueID());
		assertEquals(expected, actual);
	}
	
	@Test
	void filterElementsTest2() {
		searchReturn.filterElements(1, "anikaHr");
		String actual="";
		for(int i = 0; i < searchReturn.size(); i++) {
			   actual+=searchReturn.getIndex(i).getBusinessName()+" "+
		               searchReturn.getIndex(i).getFirstName()+" "+
		               searchReturn.getIndex(i).getLastName()+" "+
		               searchReturn.getIndex(i).getStreetAddress()+" "+
		               searchReturn.getIndex(i).getEmail()+" "+
		               searchReturn.getIndex(i).getPhoneNumber()+"\n";
		     }
		//System.out.println(actual);
		String expected="anikaHr" + " "+ "anika"+" "+"hridita"+" "+"99999"+" "+"12345"+" "+"77777"+"\n";
		//System.out.println(expected);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void filterElementsTest3() {
		searchReturn.filterElements(2, "tabassum");
		String actual="";
		for(int i = 0; i < searchReturn.size(); i++) {
			   actual+=searchReturn.getIndex(i).getBusinessName()+" "+
		               searchReturn.getIndex(i).getFirstName()+" "+
		               searchReturn.getIndex(i).getLastName()+" "+
		               searchReturn.getIndex(i).getStreetAddress()+" "+
		               searchReturn.getIndex(i).getEmail()+" "+
		               searchReturn.getIndex(i).getPhoneNumber()+"\n";
		     }
		//System.out.println(actual);
		String expected="anika" + " "+ "anika"+" "+"tabassum"+" "+"123456"+" "+"3333"+" "+"2222"+"\n";
		//System.out.println(expected);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void filterElementsTest4() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		searchReturn.filterElements(2, "hridita");
		//final java.lang.reflect.Field field = searchReturn.getClass().getDeclaredField("elements");
        //field.setAccessible(true);
		String actual="";
		for(int i = 0; i < searchReturn.size(); i++) {
			   actual+=searchReturn.getIndex(i).getBusinessName()+" "+
		               searchReturn.getIndex(i).getFirstName()+" "+
		               searchReturn.getIndex(i).getLastName()+" "+
		               searchReturn.getIndex(i).getStreetAddress()+" "+
		               searchReturn.getIndex(i).getEmail()+" "+
		               searchReturn.getIndex(i).getPhoneNumber()+"\n";
		     }
		//System.out.println(actual);
		String expected="anikaHr" + " "+ "anika"+" "+"hridita"+" "+"99999"+" "+"12345"+" "+"77777"+"\n";
		//assertEquals(expected, field.get(searchReturn));
		//System.out.println(field.get(searchReturn).toString());
		
		assertEquals(expected, actual);
	}
	


}
