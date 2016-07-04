package srs.domain;

public class Person {
	private String name;
	private String ssn;
	private String accountNo;
	private String pwd;
	private Type type;
	
	public Person(){
		
	}
	public Person(String accountNo, String pwd, Type type) {
		this.setAccountNo(accountNo);
		this.setPwd(pwd);
		this.setType(type);
	}
	
	public Person(String name, String ssn, String accountNo, String pwd, Type type) {
		this.setName(name);
		this.setSsn(ssn);
		this.setAccountNo(accountNo);
		this.setPwd(pwd);
		this.setType(type);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public Type getType() {
		return type;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
}
