
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Paycheck p1 = new Paycheck("Keith Check 1", 350);
//		Paycheck p2 = new Paycheck("Keith Check 1", 1350);
//		Paycheck p3 = new Paycheck("Adam Check 1", 350);
//		Paycheck p4 = new Paycheck("Adam Check 1", 1350);
//		Paycheck p5 = new Paycheck("Keith Check 1", 50);

//		System.out.println("Comparing p1 to p2 " + p1.compareTo(p2) + "\n");
//		System.out.println("Comparing p1 to p5 " + p1.compareTo(p5) + "\n");
//		System.out.println("Comparing p1 to p3 " + p1.compareTo(p3) + "\n");
//		System.out.println("Comparing p3 to p4 " + p3.compareTo(p4) + "\n");
//		System.out.println("Comparing p3 to p2 " + p3.compareTo(p2) + "\n");

		PaycheckSortedArrayBag test = new PaycheckSortedArrayBag(10);
		test.add("Bark 1", 60);
		test.add("Quack", 55);
		test.add("Dumb", 60);
//		test.add("Please", 55);
//		test.add("Work", 100);
//		test.add("finally", 605);
//		test.add("Fire Force", 360);
//		Paycheck index = new Paycheck("Please", 55);
//		Paycheck delete = new Paycheck("Quack", 55);
//		Paycheck oldThing = new Paycheck("Please", 55);
//		Paycheck newThing = new Paycheck("FartFart", 99);
		
//		System.out.println(test.size());
		
//		System.out.println("Testing toString " + test.toString());
//		System.out.println("Found the object at index " + test.indexOf(index) + "\n");
//		test.remove(delete);
//		System.out.println(test.toString());
//		System.out.println(test.grab(2));
//		System.out.println(test.total());
//		test.countOccurance("Quack");
//		test.replace(oldThing, newThing);
//		System.out.println(test.toString());
		
		PaycheckSortedArrayBag test1 = new PaycheckSortedArrayBag(10);
		test.add("Bark 1", 60);
		test.add("Quack", 55);
		test.add("Dumb", 60);
//		test.add("Please", 55);
//		test.add("Work", 100);
//		test.add("finally", 605);
//		test.add("Fire Force", 360);
		
		System.out.println(test.sameContents(test1));
		
	}

}
