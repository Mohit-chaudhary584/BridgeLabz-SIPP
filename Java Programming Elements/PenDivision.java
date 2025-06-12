class PenDivision{
	public static void main(String[] args){
		int numberOfPens = 14;
		int numberOfStudents = 3;
		int penPerStudents = numberOfPens / numberOfStudents;
		int remainingPens = numberOfPens % numberOfStudents;
		System.out.println("The Pen Per Student is " + penPerStudents + " and the remaining pen not distributed is " + remainingPens);
	}
}