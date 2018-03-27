package testGenerics;

public class DataMaker {

	public void takenAnyNumber(String... strings) {

		for (String arr : strings) {
			System.out.println(arr);

		}

	}

	public void takenAnyNumberOfmen(Man... mans) {

		for (Man men : mans) {
			System.out.println(men.getAgePerson() + "\n" + men.getNoOfFaltuBestfriends() + "\n" + men.getNamePerson());

		}

	}

}
