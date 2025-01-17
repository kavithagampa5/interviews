package com.elsevier.education;

import java.util.Set;

/**
 * 
 * TODO: Make this class immutable.
 * 
 * 1. Declared the variables as final, so that they can be initialized only once.
 * 2. Modified the constructor as argument bases, so that while creating the object members can be initialized.
 * 3. No Setter methods, so that it's members can not be changed
 * 
 */
public class Exercise1 {

	public final static class Person {

		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;

		public Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = phoneNumbers;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		// public void setPhoneNumbers(Set<String> newPhoneNumbers) {
		// phoneNumbers = newPhoneNumbers;
		// }

		public String getFirstName() {
			return firstName;
		}
		// public void setFirstName(String newName) {
		// firstName = newName;
		// }

		public String getLastName() {
			return lastName;
		}
		// public void setLastName(String newName) {
		// lastName = newName;
		// }
	}
}
