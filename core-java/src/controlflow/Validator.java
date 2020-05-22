package controlflow;

public class Validator {
	static boolean isEligible(Student s) {
		if (s.getTenth() >= 60) {
			if (s.getTwelth() >= 60) {
				if (s.getCgpa() >= 8.0) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
