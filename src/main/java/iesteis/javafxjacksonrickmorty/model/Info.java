package iesteis.javafxjacksonrickmorty.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Info{

	@JsonProperty("next")
	private Object next;

	@JsonProperty("pages")
	private int pages;

	@JsonProperty("prev")
	private Object prev;

	@JsonProperty("count")
	private int count;

	public Object getNext(){
		return next;
	}

	public int getPages(){
		return pages;
	}

	public Object getPrev(){
		return prev;
	}

	public int getCount(){
		return count;
	}
}