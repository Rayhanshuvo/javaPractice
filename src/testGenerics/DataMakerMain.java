package testGenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataMakerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Man> manList = new ArrayList<Man>();

		DataMaker dataMaker = new DataMaker();
		dataMaker.takenAnyNumber("Rayhan", "Shuvo", "Emon Vai", "Thanks");
		Man mann = new Man();
		Man mannn = new Man();
		mann.setAgePerson("6666666666");
		mann.setAgePerson("999999999999999999999999");
		mann.setNoOfFaltuBestfriends(99);
		mann.setNamePerson("Rahul ray chaudhury");

		mannn.setNamePerson("Nothing to do with second");

		dataMaker.takenAnyNumberOfmen(mann);
		manList.add(mann);
		manList.add(mannn);

		Iterator itr = manList.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		manList.forEach((a) -> System.out.println(a));

	}

}
