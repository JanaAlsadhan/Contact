package LinkedListPhonebook;
//Contact Class
public class Contact implements Comparable<Contact> {
    //Fields:
	private String name;
	private String phone;
	private String email;
	private String address;
	private String birthday;
	private String notes;
	private LinkedList_ADT<Event> events ;


	//Constructors:
        //default constructor
        public Contact() {

		name = null;
		phone = null;
		email = null;
		address = null;
		birthday = null;
		notes = null;
		LinkedList_ADT<Event> events = new LinkedList_ADT<Event>(); //creat an empty linkedlist of events
	}
        
	//parameterized constructor:
        public Contact(String n,String ph ,String e,String adr,String bd ,String note){
		name = n;
		phone = ph;
		email= e ;
		address = adr;
		birthday = bd;
		notes = note;
		LinkedList_ADT<Event> events = new LinkedList_ADT<Event>(); //creat an empty linkedlist of events	// events is a list of events of one contact s
	}


	//setters & getters
       	public void setName(String name) {
		this.name = name;
	}
        
        public String getName() {
		return name;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
        
	public String getPhone() {
		return phone;
	}

        
	public void setEmail(String email) {
		this.email = email;
	}
        
	public String getEmail() {
		return email;
	}


	public void setAddress(String address) {
		this.address = address;
	}
        
	public String getAddress() {
		return address;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
        
	public String getBirthday() {
		return birthday;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}
        
	public String getNotes() {
		return notes;
	}

        
	public void setEvents(LinkedList_ADT<Event> events) {
		this.events = events;
	} //set events associated with the contact
        
	public LinkedList_ADT<Event> getEvents() {
		return events;
	} //return the events associated with the contact


        @Override
	public String toString() {
		return "Contact{ " + "Name: " + name + ", Phone Number: " + phone + ", Email Address: " + email + ", Address: " + address + ", Birthday: " + birthday + ", Notes: " + notes + "}";
	} //represesnt a contact object

	@Override
	public int compareTo(Contact x) {
		return this.name.compareTo(x.name);
	} //returns an integer value indicate the compare relsult







}
