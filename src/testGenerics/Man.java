package testGenerics;

public class Man {

	String namePerson;
	String agePerson;
	int noOfFaltuBestfriends;

	public String getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public String getAgePerson() {
		return agePerson;
	}

	public void setAgePerson(String agePerson) {
		this.agePerson = agePerson;
	}

	public int getNoOfFaltuBestfriends() {
		return noOfFaltuBestfriends;
	}

	public void setNoOfFaltuBestfriends(int noOfFaltuBestfriends) {
		this.noOfFaltuBestfriends = noOfFaltuBestfriends;
	}

	@Override
	public String toString() {
		return "Man [namePerson=" + namePerson + ", agePerson=" + agePerson + ", noOfFaltuBestfriends="
				+ noOfFaltuBestfriends + "]";
	}

}
