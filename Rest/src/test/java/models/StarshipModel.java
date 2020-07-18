package models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class StarshipModel {

	private String name;
	private String model;
	private String manufacturer;
	private String cost_in_credits;
	private String length;
	private String maxAtmospheringSpeed;
	private String crew;
	private String passengers;
	private String cargoCapacity;
	private String consumables;
	private String hyperdriveRating;
	private String mGLT;
	private String starshipClass;
	private List<String> pilots = null;
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCostInCredits() {
		return cost_in_credits;
	}

	public void setCostInCredits(String costInCredits) {
		this.cost_in_credits = costInCredits;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getMaxAtmospheringSpeed() {
		return maxAtmospheringSpeed;
	}

	public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
	}

	public String getCrew() {
		return crew;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

	public String getPassengers() {
		return passengers;
	}

	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}

	public String getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(String cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public String getConsumables() {
		return consumables;
	}

	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}

	public String getHyperdriveRating() {
		return hyperdriveRating;
	}

	public void setHyperdriveRating(String hyperdriveRating) {
		this.hyperdriveRating = hyperdriveRating;
	}

	public String getMGLT() {
		return mGLT;
	}

	public void setMGLT(String mGLT) {
		this.mGLT = mGLT;
	}

	public String getStarshipClass() {
		return starshipClass;
	}

	public void setStarshipClass(String starshipClass) {
		this.starshipClass = starshipClass;
	}

	public List<String> getPilots() {
		return pilots;
	}

	public void setPilots(List<String> pilots) {
		this.pilots = pilots;
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
		return new ToStringBuilder(this).append("\n"+"name", name).append("\n"+"model", model)
				.append("\n"+"manufacturer", manufacturer).append("\n"+"costInCredits", cost_in_credits).append("\n"+ "length", length)
				.append("\n"+"maxAtmospheringSpeed", maxAtmospheringSpeed).append("\n"+"crew", crew)
				.append("\n"+"passengers", passengers).append("\n"+"cargoCapacity", cargoCapacity)
				.append("\n"+"consumables", consumables).append("\n"+"hyperdriveRating", hyperdriveRating).append("\n"+"mGLT", mGLT)
				.append("\n"+"starshipClass", starshipClass).append("\n"+"pilots", pilots).append("\n"+"films", films)
				.append("\n"+"created", created).append("\n"+"edited", edited).append("\n"+"url", url)
				.append("\n"+"additionalProperties", additionalProperties).toString();
	}
}
