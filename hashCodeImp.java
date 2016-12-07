package Hash;

import java.util.HashSet;
import java.util.UUID;

public class hashCodeImp {
	Records records;

	public static void main(String[] args) {

		HashSet<Records> h = new HashSet<Records>();
		Records r = new Records(UUID.randomUUID().toString(), "Nanobi", "WEL");
		Records r1 = new Records(UUID.randomUUID().toString(), "Nanobi", "WEL");
		h.add(r1);
		if (r1.equals(r)) {
			System.out.println("Got by normal object check");
		} else
			System.out.println("NOT GOT ");
		if (h.contains(r)) {
			System.out.println("Got by hash code");
		} else
			System.out.println("NOT GOT ");

	}

}
