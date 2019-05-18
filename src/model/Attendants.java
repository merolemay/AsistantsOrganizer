package model;

public class Attendants {
	
	private int id;
	private Attendants next,left,right;
	private String first_name,last_name,email,gender,country,photo,birthday;
	/**
	 * @param id
	 * @param first_name
	 * @param last_name
	 * @param email
	 * @param gender
	 * @param country
	 * @param photo
	 * @param birthday
	 */
	public Attendants(int id, String first_name, String last_name, String email, String gender, String country,
			String photo, String birthday) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.gender = gender;
		this.country = country;
		this.photo = photo;
		this.birthday = birthday;
		next =null;
		right= null;
		left = null;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}
	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Attendants getNext() {
		return next;
	}
	public void setNext(Attendants next) {
		this.next = next;
	}
	
	/**
	 * @return the left
	 */
	public Attendants getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(Attendants left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public Attendants getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(Attendants right) {
		this.right = right;
	}
	@Override
	public String toString() {
		return null;
	}

}
