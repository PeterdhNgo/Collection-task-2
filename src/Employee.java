import java.util.ArrayList;

public class Employee
{
    private String name;
    private String department;
    private ArrayList<Job> job;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setJob(ArrayList<Job> job)
    {
        this.job = job;
    }

    public ArrayList<Job> getJob()
    {
        return job;
    }

  /* DO NOT EDIT ANYTHING BELOW THIS LINE!
     IF YOU EDIT ANYTHING BELOW THIS LINE, YOU
     WILL NOT WIN ANY MEDALS ON THIS PAGE! */
    /* ------------------------------------------------------ */
    /* DO NOT EDIT DO NOT EDIT DO NOT EDIT DO NOT EDIT */

    private static java.util.ArrayList<Employee> all;public static java.util.ArrayList<Employee> getAll(){if(all == null)all=new java.util.ArrayList();return all;}public Employee(){if(all==null)all=new java.util.ArrayList();all.add(this);}

}