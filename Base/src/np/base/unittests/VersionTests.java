package np.base.unittests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import np.base.versioncontrol.Version;

class VersionTests {

	@Test
	void testConstruction() {
		Version v100R = new Version(1,0,0, Version.Type.RELEASE);
		
		System.out.println(v100R);
		
		assertEquals("1.0.0-RELEASE", v100R.toString());
	}
	
	@Test
	void testGetMajor() {
		Version version = new Version(1,2,3, Version.Type.RELEASE);
		
		assertEquals(1, version.getMajor());
	}
	
	@Test
	void testGetMinor() {
		Version version = new Version(1,2,3, Version.Type.RELEASE);
		
		assertEquals(2, version.getMinor());
	}
	
	@Test
	void testGetBugfix() {
		Version version = new Version(1,2,3, Version.Type.RELEASE);
		
		assertEquals(3, version.getBugfix());
	}
	
	@Test
	void testGetType() {
		Version version = new Version(1,2,3, Version.Type.ALPHA);
		
		assertEquals(Version.Type.ALPHA, version.getType());
	}
	
	@Test
	void testEquals() {
		Version versionA = new Version(1,2,3, Version.Type.ALPHA);
		Version versionB = new Version(1,2,3, Version.Type.ALPHA);
		
		assertTrue(versionA.equals(versionB));
	}

}
