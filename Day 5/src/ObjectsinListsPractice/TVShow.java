package ObjectsinListsPractice;

public class TVShow {
    private String showName;
    private int numEpisodes;
    private String genre;

    public TVShow(String showName, int numEpisodes, String genre) {
        this.showName = showName;
        this.numEpisodes = numEpisodes;
        this.genre = genre;
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
