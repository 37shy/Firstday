package srs.domain;

public enum Type {
	student("s"), professor("t");
	
	private final String type;
	
	private Type(String s) {
		this.type = s;
	}
	
	public String getType() {
		return type;
	}
	
	public String toString() {
		switch (this) {
		case student: return "s";
		case professor: return "t";
		default: return "unspecified";
		}
	}
	
	public static Type exchangeType(String s) {
		Type type = null;
		for(Type t: Type.values()) {
			System.out.println(t.getType());
			if(t.getType().equals(s)) {
				type = t;
			}
		}
		return type;
	}
}
