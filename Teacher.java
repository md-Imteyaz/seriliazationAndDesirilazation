package Serialaztion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Teacher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1349844285532736111L;

	public String Details() {
		String name = "sudama";
		String addr = "kol";
		System.out.println(name);
		System.out.println(addr);
		return "details updated";
	}
}
//class seri {
// public static void main(String[] args) throws Exception { Teacher t = new
// Teacher();
//  FileOutputStream fos = new FileOutputStream("file101.text"); ObjectOutputStream
//  ous = new ObjectOutputStream(fos);
//  ous.writeObject(t); ous.flush(); System.out.println("completed");
// }
//}
	 class Deserilization {

		public static void main(String[] args) throws Exception {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("file101.text"));
			Teacher t = (Teacher)in.readObject();
			System.out.println(t.Details());
			in.close();
		}
//	}
}
