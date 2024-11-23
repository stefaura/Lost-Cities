package model;

public abstract class Finding {
    private String description; // A textual description of the finding.
    private String image;       // A file path or URL for the image.

    public Finding(String description, String image) {
        this.description = description;
        this.image = image;
    }

    /**
     * Retrieves the description of the finding.
     * @return description of the finding.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Retrieves the image path or URL of the finding.
     * @return image path or URL.
     */
    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "Finding{" +
                "description='" + description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
