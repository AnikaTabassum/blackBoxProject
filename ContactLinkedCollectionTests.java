package testFinalProject;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import finalProject.finalProject.Contacts;
import finalProject.finalProject.ContactsArrayCollection;
import finalProject.finalProject.ContactsLinkedCollection;
import finalProject.finalProject.UsingContactsFile;

class ContactLinkedCollectionTests {
	
	ContactsLinkedCollection initialize() {
	String fileName = "MOCK_DATA.csv";
    UsingContactsFile contactsFile = new UsingContactsFile(fileName);
    ContactsLinkedCollection contactList = contactsFile.importContactListCSV();
    return contactList;
	}
	ContactsArrayCollection searchReturn = null;
	
	/*
	@Test
	void findByIDTestmin() {
		
		 ContactsLinkedCollection contactList;
		 contactList=initialize();
		boolean actual= contactList.findByID(1); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	*/
	/*
	@Test
	void findByIDTestmax() {

		 ContactsLinkedCollection contactList;
		 contactList=initialize();
		boolean actual= contactList.findByID(10002); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	*/
	/*
	@Test
	void findByIDTestminplus() {

		 ContactsLinkedCollection contactList;
		 contactList=initialize();
		boolean actual= contactList.findByID(2); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	*/
	/*
	@Test
	void findByIDTestmaxminus() {
		ContactsLinkedCollection contactList;
		 contactList=initialize();
		boolean actual= contactList.findByID(10001); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	*/
	/*
	@Test
	void findByIDTestnom() {
		ContactsLinkedCollection contactList;
		 contactList=initialize();
		boolean actual= contactList.findByID(5555); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	*/
	/*
	@Test
	void findByIDTestminminus() {
		ContactsLinkedCollection contactList;
		 contactList=initialize();
		boolean actual= contactList.findByID(0); 
		System.out.println(actual);
		boolean expected=false;
		assertEquals(expected, actual);
	} 
	*/
	/*
	@Test
	void findByIDTestmaxplus() {
		ContactsLinkedCollection contactList;
		 contactList=initialize();
		boolean actual= contactList.findByID(10003); 
		System.out.println(actual);
		boolean expected=false;
		assertEquals(expected, actual);
	}
	*/
	
	//testing remove method with robust
	/*
	@Test
	void removemin() {
		ContactsLinkedCollection contactList;
		 contactList=initialize();
		boolean actual= contactList.removeContact(1); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	*/
	/*
	@Test
	void removemax() {
		ContactsLinkedCollection contactList;
		 contactList=initialize();
		boolean actual= contactList.removeContact(10002); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	*/
	/*
	@Test
	void removeminplus() {
		ContactsLinkedCollection contactList;
		 contactList=initialize();
		boolean actual= contactList.removeContact(2); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	*/
	/*
	@Test
	void removemaxminus() {
		ContactsLinkedCollection contactList;
		 contactList=initialize();
		boolean actual= contactList.removeContact(10001); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	*/
	/*
	@Test
	void removenominal() {
		ContactsLinkedCollection contactList;
		 contactList=initialize();
	
		boolean actual= contactList.removeContact(5555); 
		System.out.println(actual);
		boolean expected=true;
		assertEquals(expected, actual);
	} 
	*/
	/*
	@Test
	void removeminminus() {
		ContactsLinkedCollection contactList;
		 contactList=initialize();
		boolean actual= contactList.removeContact(0); 
		System.out.println(actual);
		boolean expected=false;
		assertEquals(expected, actual);
	} 
	*/
	/*
	@Test
	void removemaxplus() {
		ContactsLinkedCollection contactList;
		 contactList=initialize();
		boolean actual= contactList.removeContact(10003); 
		System.out.println(actual);
		boolean expected=false;
		assertEquals(expected, actual);
	}
	*/
	
	Contacts cn= new Contacts("komola's", "komola", "apple", "angur", "banana", "litchi");
	/*
	//testing change contact method with robust
		@Test
		void changemin() {
			ContactsLinkedCollection contactList;
			 contactList=initialize();
			boolean actual= contactList.changeContact(1,cn); 
			System.out.println(actual);
			boolean expected=true;
			assertEquals(expected, actual);
		} 
		*/
		/*
		@Test
		void changemax() {
			ContactsLinkedCollection contactList;
		 contactList=initialize();
			boolean actual= contactList.changeContact(10002,cn); 
			System.out.println(actual);
			boolean expected=true;
			assertEquals(expected, actual);
		} 
		*/
		/*
		@Test
		void changeminplus() {
			ContactsLinkedCollection contactList;
			 contactList=initialize();
			boolean actual= contactList.changeContact(2,cn); 
			System.out.println(actual);
			boolean expected=true;
			assertEquals(expected, actual);
		} 
		*/
		/*
		@Test
		void changemaxminus() {
			ContactsLinkedCollection contactList;
			 contactList=initialize();
			boolean actual= contactList.changeContact(10001,cn); 
			System.out.println(actual);
			boolean expected=true;
			assertEquals(expected, actual);
		} 
		*/
		/*
		@Test
		void changenominal() {
			ContactsLinkedCollection contactList;
			 contactList=initialize();
			boolean actual= contactList.changeContact(5555,cn); 
			System.out.println(actual);
			boolean expected=true;
			assertEquals(expected, actual);
		}
		*/
		/*
		@Test
		void changeminminus() {
			ContactsLinkedCollection contactList;
			 contactList=initialize();
			boolean actual= contactList.changeContact(0,cn); 
			System.out.println(actual);
			boolean expected=false;
			assertEquals(expected, actual);
		} 
		*/
		/*
		@Test
		void changemaxplus() {
			ContactsLinkedCollection contactList;
			 contactList=initialize();
			boolean actual= contactList.changeContact(10003,cn); 
			System.out.println(actual);
			boolean expected=false;
			assertEquals(expected, actual);
		}
		*/
		
	 /*
	@Test
	void contactsArrayCOllectionTest1() {
		ContactsLinkedCollection contactList;
		 contactList=initialize();
	
		searchReturn = contactList.getAll("anika");
		contactList.findByID(1);
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
	
	*/
	
	/*
	@Test
	void contactsArrayCOllectionTest2() {
		
		ContactsLinkedCollection contactList;
		 contactList=initialize();
		//System.out.println(contactList);
		searchReturn = contactList.getAll("Zava");
		int actual= searchReturn.size();
		//// i found the expected value from the csv
		int expected=34;
		assertEquals(expected, actual);
	}
	*/
	List<Contacts> searchResult= searchResult=new ArrayList<Contacts>();
	
	@Test
	void fullListTest() {
		ContactsLinkedCollection contactList;
		 contactList=initialize();
		searchResult= contactList.fullList();
		//System.out.println(searchResult);
		int actual=searchResult.size();
	      
	       
	      // System.out.println(actual);
		int expected=10002;
		assertEquals(expected, actual);
	}
	

	
}
