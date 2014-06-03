package it.skedenpio.names.services;

import java.util.List;

import it.skedenpio.names.domain.Name;

public interface INameLookup {
	
	public Name getNameById(int id);
	
	public List<Name> getNames();

}
