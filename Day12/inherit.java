class Student extends Person{
	private int[] testScores;
    private String firstName;
	private String lastName;
	private int id;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores){
		super(firstName,lastName,id);
        this.testScores = scores;
	}
    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate(){
        int num = testScores.length;
        int sum=0;
        for (int i=0; i<num; i++){
            sum += testScores[i];
        }
        double avg = sum/num;
        char c;

        if(avg>=90)
            c = 'O';
        else if(avg>=80 && avg<90)
            c = 'E';
        else if(avg>=70 && avg<80)
            c = 'A';
        else if(avg>=55 && avg<70)
            c = 'P';
        else if(avg>=40 && avg<55)
            c = 'D';
        else
            c = 'T';

        return c;
    }
}
