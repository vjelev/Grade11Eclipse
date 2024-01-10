package Auto;

import java.util.Comparator;

public class sortTires implements Comparator<Tire> {

	@Override
	public int compare(Tire o1, Tire o2) {
		// TODO Auto-generated method stub
		if (o1.getHeight() < o2.getHeight())
			return -1;
		else if (o1.getHeight() < o2.getHeight())
			return 1;
		else
			return o1.getModel().compareTo(o2.getModel());
	}

}
