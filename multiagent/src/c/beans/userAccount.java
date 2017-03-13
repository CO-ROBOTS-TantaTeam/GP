package c.beans;

public class userAccount {
	
	private int id;
	private String username;
	private String email;
	private String mNumber;
	private String password;
	private String jobDescription;
	
	public userAccount(){
		
	}
	
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getmNumber(){
		return this.mNumber;
	}
	public void setmNumber(String mNumber){
		this.mNumber = mNumber;
	}
	
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public void setJobDescription(String jobDescription){
		this.jobDescription = jobDescription; 
	}
	public String getjobDescription(){
		return jobDescription;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
