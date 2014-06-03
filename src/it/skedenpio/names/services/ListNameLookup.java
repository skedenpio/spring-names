package it.skedenpio.names.services;

import it.skedenpio.names.domain.Name;

import java.util.List;

public class ListNameLookup implements INameLookup {

	private List<Name> names;
	
	public void setNames(List<Name> names) {
		this.names = names;
	}

	@Override
	public List<Name> getNames() {
		return names;
	}
	
	@Override
	public Name getNameById(int id) {
		Name name = names.get(id);
		return name;
	}

}
