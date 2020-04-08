import java.util.ArrayList;

class ProjectTest {
    public static void main(String[] args) {
        Project task = new Project();
        task.setName("Feed Lilly");
        task.setDescription("She's a weirdo and needs her treato");
        task.setInitialCost(420.69);
        
        // String taskName = task.getName();
        // String taskDescription = task.getDescription();
        // double taskInitialCost = task.getInitialCost();

        Project task2 = new Project();
        task2.setName("Feed Chewie");
        task2.setDescription("She's not ugly and needs her treato");
        task2.setInitialCost(99.99);
    
        // System.out.println("Task name: " + taskName + " ($" + taskInitialCost + "), Description: " + taskDescription);

        Portfolio portfolioThing = new Portfolio();
        portfolioThing.setProject(task);
        portfolioThing.setProject(task2);
        ArrayList portfolioProjects = portfolioThing.getProject();
        double portfolioCost = portfolioThing.getPortfolioCost();
        System.out.println("Projects: " + portfolioProjects + ", Portfolio Cost: " + portfolioCost);
    }
}