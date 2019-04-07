package io.reflectoring;

import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;

class User {

	@NotNull
	private long id;

	@NotNull
	private String name;

	public User(@NotNull long id, @NotNull String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
