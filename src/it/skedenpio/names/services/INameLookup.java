package it.skedenpio.names.services;

import java.util.List;

import it.skedenpio.names.domain.Name;

public interface INameLookup {
	
	public List<Name> getNames();
	
	public Name getNameById(int id);

}
