package model;

public class AsistantRoot extends Assistant {
	
	private Assistant left,right;
	
	public AsistantRoot(int id, String first_name, String last_name, String email, String gender, String country,
			String photo, String birthday, Assistant next) {
		super(id, first_name, last_name, email, gender, country, photo, birthday, next);
	}

	public Assistant getRight() {
		return right;
	}

	public void setRight(Assistant right) {
		this.right = right;
	}

	public Assistant getLeft() {
		return left;
	}

	public void setLeft(Assistant left) {
		this.left = left;
	}

	

}
