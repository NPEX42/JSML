package np.base.versioncontrol;

public class Version {
	private final int major, minor, bugfix;
	private final Type type;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Version) {
			Version other = (Version) obj;
			
			return (
				other.major == this.major &&
				other.minor == this.minor &&
				other.bugfix == this.bugfix &&
				other.type == this.type
			);
		}
		
		return false;
	}
	
	
	
	public Version(int major, int minor, int bugfix, Type type) {
		super();
		this.major = major;
		this.minor = minor;
		this.bugfix = bugfix;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return major + "." + minor + "." + bugfix + "-" + type.name();
	}
	
	

	public int getMajor() {
		return major;
	}

	public int getMinor() {
		return minor;
	}

	public int getBugfix() {
		return bugfix;
	}

	public Type getType() {
		return type;
	}



	public static enum Type {
		ALPHA, BETA, RELEASE, HOTFIX
	}
}
