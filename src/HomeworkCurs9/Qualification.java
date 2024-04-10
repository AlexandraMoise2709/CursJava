package HomeworkCurs9;

public class Qualification extends Teacher {

	public Qualification(String Course, int ExperienceYears, String Schedule ) {
		super(Course, ExperienceYears,Schedule);
	}
	
	
	
	public void Verify(String Course, int ExperienceYears, String Schedule ) {
		
		if(super.ExperienceYears>3 && super.Course.equals("Java") && super.Schedule.equals("Afternoon")) {
			
			System.out.println("You qualify to teach at this school!");
		}else {
			
			System.out.println("You do not qualify!");
			
		}
		
	}
	
	
	
	
}
