import java.util.ArrayList;

class Project {
    public String name;
    public String description;
    public double initialCost;

    public String elevatorPitch() {
        return name + "(" + initialCost + "): " + description;
    }
 
    // public Project() {
    // }

    // public Project(String name) {
    //     this.name = name;
    // }   

    // public Project(String name, String description) {
    //     this.name = name;
    //     this.description = description;
    // }  

    public String getName() {
        return name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String inputDescription) {
        this.description = inputDescription;
    }

    public double getInitialCost() {
        return initialCost;
    }

    public void setInitialCost(double inputInitialCost) {
        this.initialCost = inputInitialCost;
    }

}

class Portfolio {
    ArrayList<Project> projects = new ArrayList<Project>();

    public ArrayList getProject() {
        ArrayList<String> projectNames = new ArrayList<String>();
        for(Project project : this.projects) {
            projectNames.add(project.name);
        }
        return projectNames;
    }

    public void setProject(Project inputProject) {
        projects.add(inputProject);
    }

    public double getPortfolioCost() {
        double cost = 0;
        for(Project project : this.projects) {
            cost = cost + project.getInitialCost();
        }
        return cost;
    }

}