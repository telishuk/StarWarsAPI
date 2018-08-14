
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.*;
import org.testng.annotations.*;
import utils.HttpUtils;
import static org.testng.Assert.*;
import java.io.IOException;

public class TestAPI{

    private Gson gson;
    private People people;
    private Planet planet;
    private Films films;


    @BeforeTest
    public void setUp() {
        gson = new GsonBuilder().create();
        people = gson.fromJson(HttpUtils.sendRequest("https://swapi.co/api/people/1/"), People.class);
        planet = gson.fromJson(HttpUtils.sendRequest("https://swapi.co/api/planets/1/"), Planet.class);
    }


    @Test
    public void testLuke() throws IOException {
        People people = gson.fromJson(HttpUtils.sendRequest("https://swapi.co/api/people/1/"), People.class);
        assertEquals(people.getName(), "Luke Skywalker");
    }

    @Test
    public void testHomeworld() throws IOException {
        Planet planet = gson.fromJson(HttpUtils.sendRequest(people.getHomeWorldUrl()), Planet.class);
        assertEquals(planet.getName(), "Tatooine");
        assertEquals(planet.getPopulation(), "200000");
    }

    @Test
    public void testFilms() throws IOException {
       Films films = gson.fromJson(HttpUtils.sendRequest(planet.getFilmsUrls().get(0)), Films.class);
       assertEquals(films.getTitle(), "Attack of the Clones");
    }

    @Test
    public void testCharacters() throws IOException {
        Films filmsChar = gson.fromJson(HttpUtils.sendRequest(people.getUrl()), Films.class);
        Films filmsPlanet = gson.fromJson(HttpUtils.sendRequest(planet.getUrl()), Films.class);
        assertEquals(filmsChar.getUrl(), people.getUrl());
        assertEquals(filmsPlanet.getUrl(), planet.getUrl());
    }


}
