package models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class PlanetModel {

	private String name;
	private String rotation_period;
	private String orbital_period;
	private String diameter;
	private String climate;
	private String gravity;
	private String terrain;
	private String surfaceWater;
	private String population;
	private List<Object> residents = null;
	private List<String> films = null;
	private String created;
	private String edited;
	private String url;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRotationPeriod() {
		return rotation_period;
	}

	public void setRotationPeriod(String rotationPeriod) {
		this.rotation_period = rotationPeriod;
	}

	public String getOrbitalPeriod() {
		return orbital_period;
	}

	public void setOrbitalPeriod(String orbitalPeriod) {
		this.orbital_period = orbitalPeriod;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getGravity() {
		return gravity;
	}

	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public String getSurfaceWater() {
		return surfaceWater;
	}

	public void setSurfaceWater(String surfaceWater) {
		this.surfaceWater = surfaceWater;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public List<Object> getResidents() {
		return residents;
	}

	public void setResidents(List<Object> residents) {
		this.residents = residents;
	}

	public List<String> getFilms() {
		return films;
	}

	public void setFilms(List<String> films) {
		this.films = films;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("name", name).append("rotationPeriod", rotation_period)
				.append("orbitalPeriod", orbital_period).append("diameter", diameter).append("climate", climate)
				.append("gravity", gravity).append("terrain", terrain).append("surfaceWater", surfaceWater)
				.append("population", population).append("residents", residents).append("films", films)
				.append("created", created).append("edited", edited).append("url", url)
				.append("additionalProperties", additionalProperties).toString();
	}
}