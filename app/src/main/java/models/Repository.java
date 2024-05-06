package models;

public class Repository {
    private String repositoryName;
    private String repositoryLanguaje;
    private String repositoryOwner;
    private String image;

    public Repository(String repositoryName, String repositoryLanguaje, String repositoryOwner, String image) {
        this.repositoryName = repositoryName;
        this.repositoryLanguaje = repositoryLanguaje;
        this.repositoryOwner = repositoryOwner;
        this.image = image;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getRepositoryLanguaje() {
        return repositoryLanguaje;
    }

    public void setRepositoryLanguaje(String repositoryLanguaje) {
        this.repositoryLanguaje = repositoryLanguaje;
    }

    public String getRepositoryOwner() {
        return repositoryOwner;
    }

    public void setRepositoryOwner(String repositoryOwner) {
        this.repositoryOwner = repositoryOwner;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
