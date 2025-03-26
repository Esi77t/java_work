package access;

import ex05_inheritance.Parent;

public class NotChild {
	void accessTest() {
		Parent p2 = new Parent();
		super.access();
		p2.accessProtected();
	}
}
