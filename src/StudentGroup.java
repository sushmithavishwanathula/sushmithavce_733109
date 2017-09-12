import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		return students; 
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
			throw IllegalArgumentException;
		 for(int i=0;i<length;i++)
             this.students[i]=students[i];
	}

	@Override
	public Student getStudent(int index) {
		if((index<0)||(index>length))
			throw IllegalArgumentException;
		// Add your implementation here
		 return students[index];
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null)
			throw IllegalArgumentException;
		if((index<0)||(index>length))
			throw IllegalArgumentException;
		 students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
			throw IllegalArgumentException;
		 length++;
         for(int i=length-1;i>=1;i--)
               students[i]=students[i-1];
           students[0]=student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
			throw IllegalArgumentException;
		 length++;
         students[length-1]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null)
			throw IllegalArgumentException;
		if((index<0)||(index>length))
			throw IllegalArgumentException;
		 length++;
         for(int i=length-1;i>=index;i--)
                  students[i]=students[i-1];
                    students[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(student==null)
			throw IllegalArgumentException;
		if((index<0)||(index>length))
			throw IllegalArgumentException;
        for(int i=index;i<length;i++)
           students[i]=students[i+1];
                length--;
	}

	@Override
	public void remove(Student student) {
		if(student==null)
			throw IllegalArgumentException;
		for(int i=0;i<length;i++)
			if(students[i]==student)
			{
				for(int j=i;j<length;j++)
					 students[i]=students[i+1];
				length--;
			}
		
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(student==null)
			throw IllegalArgumentException;
		if((index<0)||(index>length))
			throw IllegalArgumentException;
		int diff=length-index;
		length=length-diff;
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		for(int i=0;i<length;i++)
			if(students[i]==student)
			{
				int diff=length-i;
				length=length-diff;
			}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(student==null)
			throw IllegalArgumentException;
		if((index<0)||(index>length))
			throw IllegalArgumentException;
		for(int i=index;i<length;i++)
			 students[i]=students[i+1];
		               length--;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		for(int i=0;i<length;i++)
			if(students[i]==student)
			{
				for(int j=i;j<length;j++)
					 students[i]=students[i-1];
				length--;
			}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		double max=0.0;
		int j=0;
		students student1[];
		for(int i=0;i<length;i++)
			  if((students[i].avgMark)>max)
				  max=students[i].avgMark;
		for(int k=0;k<length;k++)
			if((students[k].avgMark)==max)
			{
				student1[j]=students[k];
				j++;
			}
		return student1;
		
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student==null)
			throw IllegalArgumentException;
		      for(int i=0;i<length;i++)
		    	  if(students[i]==student)
		    		  return students[i+1];
		return null;
	}
}
