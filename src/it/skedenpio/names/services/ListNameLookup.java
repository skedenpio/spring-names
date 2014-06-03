package it.skedenpio.names.services;

import it.skedenpio.names.domain.Name;

import java.util.List;

public class ListNameLookup implements INameLookup {

	private List<Name> nameList;
	
	public void setNameList(List<Name> nameList) {
		this.nameList = nameList;
	}
	
	@Override
	public Name getNameById(int id) {
		Name name = nameList.get(id);
		return name;
	}

	@Override
	public List<Name> getNames() {
		return nameList;
	}

}
