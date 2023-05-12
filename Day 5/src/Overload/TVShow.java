package Overload;
public class TVShow {
    private String showName;
    private int numEpisodes;
    private String genre;

    public TVShow(String showName, int numEpisodes, String genre) {
        this.showName = showName;
        this.numEpisodes = numEpisodes;
        this.genre = genre;
    }

    public TVShow(String showName) {
        this(showName, 0, "Unknown"); // Invokes the three-argument constructor with default values
    }

    public TVShow(String showName, int numEpisodes) {
        this(showName, numEpisodes, "Unknown"); // Invokes the three-argument constructor with default genre
    }

    public String getShowName() {
        return showName;
    }

    public int getNumEpisodes() {
        return numEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return "The name of the show is " + showName + " with " + numEpisodes + " number of episodes. The genre is " + genre + ".";
    }
}
