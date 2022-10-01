package iesteis.javafxjacksonrickmorty.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("results")
	private List<Character> results;

	@JsonProperty("info")
	private Info info;

	public List<Character> getResults(){
		return results;
	}

	public Info getInfo(){
		return info;
	}
}