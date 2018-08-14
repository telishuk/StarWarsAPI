package models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class Films  implements Serializable{

    private String title;

    @SerializedName("episode_id")
    private Integer episodeID;

    @SerializedName("opening_crawl")
    private String openingCrawl;

    private String director;
    private String producer;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("starships")
    private List<String> starshipsUrls;

    @SerializedName("vehicles")
    private List<String> vehiclesUrls;

    @SerializedName("characters")
    private List<String> charactersUrls;

    @SerializedName("planets")
    private List<String> planetsUrls;

    private String url;
    private String created;
    private String edited;

    @Override
    public String toString() {
        return "Films{" +
                "title='" + title + '\'' +
                ", episodeID=" + episodeID +
                ", openingCrawl='" + openingCrawl + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", starshipsUrls=" + starshipsUrls +
                ", vehiclesUrls=" + vehiclesUrls +
                ", charactersUrls=" + charactersUrls +
                ", planetsUrls=" + planetsUrls +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getEpisodeID() {
        return episodeID;
    }

    public void setEpisodeID(Integer episodeID) {
        this.episodeID = episodeID;
    }

    public String getOpeningCrawl() {
        return openingCrawl;
    }

    public void setOpeningCrawl(String openingCrawl) {
        this.openingCrawl = openingCrawl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getStarshipsUrls() {
        return starshipsUrls;
    }

    public void setStarshipsUrls(List<String> starshipsUrls) {
        this.starshipsUrls = starshipsUrls;
    }

    public List<String> getVehiclesUrls() {
        return vehiclesUrls;
    }

    public void setVehiclesUrls(List<String> vehiclesUrls) {
        this.vehiclesUrls = vehiclesUrls;
    }

    public List<String> getCharactersUrls() {
        return charactersUrls;
    }

    public void setCharactersUrls(List<String> charactersUrls) {
        this.charactersUrls = charactersUrls;
    }

    public List<String> getPlanetsUrls() {
        return planetsUrls;
    }

    public void setPlanetsUrls(List<String> planetsUrls) {
        this.planetsUrls = planetsUrls;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }
}
