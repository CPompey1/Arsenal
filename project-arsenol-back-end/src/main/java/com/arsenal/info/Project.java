import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity 
public class Project {
    
    private String projName;
    private String descripion;
    private String githubLink;
    private Project(){}

    public Project(String projName, String descripion, String githubLink){
        this.projName = projName;
        this.descripion = descripion;
        this.githubLink = githubLink;
    }

    @Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Project project = (Project) o;
		return Objects.equals(projName, project.projName) &&
			Objects.equals(githubLink, project.githubLink) &&
			Objects.equals(descripion, project.descripion);
	}

    public String getProjName() {
        return projName;
    }

    public String getDescripion() {
        return descripion;
    }

    public String getGithubLink() {
        return githubLink;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Project{" +
			", Name='" + projName + '\'' +
			", link='" + githubLink + '\'' +
			", description='" + descripion + '\'' +
			'}';
    }
}