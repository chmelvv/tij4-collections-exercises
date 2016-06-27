// containers/Ex1.java
// TIJ4 Chapter Containers, Exercise 1, page 809
/* Create a List (try both ArrayList and LinkedList) and fill it using
* Countries. Sort the list and print it, then apply Collections.shuffle()
* to the list repeatedly, printing it each time so that you can see how
* the shuffle() method randomizes the list differently each time.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1 {
	public static void main(String[] args) {

		List<Countries> countriesList = new ArrayList<>();
		for (Countries c: Countries.values()) {
			countriesList.add(c);
		}

		System.out.println(countriesList);

		Collections.shuffle(countriesList);
		System.out.println(countriesList);

		Collections.sort(countriesList); //sorted list as defined in enum Countries
		System.out.println(countriesList);

		Collections.shuffle(countriesList);
		System.out.println(countriesList);

	}

}
