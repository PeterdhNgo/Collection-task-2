import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Employee walter = new Employee();
        walter.setName("Walter White");

        Job jobOne = new Job();
        jobOne.setJobTitle("Chemistry Teacher");
        jobOne.setSalary(25000);

        Job jobTwo = new Job();
        jobTwo.setJobTitle("Pharmaceutical Consultant");
        jobTwo.setSalary(1500000);

        ArrayList<Job> jobs = new ArrayList();
        jobs.add(jobOne);
        jobs.add(jobTwo);
        walter.setJob(jobs);

        for (Job job : jobs)
        {
            System.out.println(job.getJobTitle());
            System.out.println(job.getSalary());
        }

        walter.setDepartment("Science");
    }
}