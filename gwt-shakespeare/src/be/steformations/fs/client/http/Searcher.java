package be.steformations.fs.client.http;

import com.google.gwt.core.client.GWT;

import be.steformations.fs.client.event.EventManager;
import be.steformations.fs.client.event.search.SearchEvent;
import be.steformations.fs.client.event.search.SearchEventManager;
import be.steformations.fs.client.event.search.SearchParams;

public class Searcher implements SearchEventManager{

	
	public Searcher() {
		super();
		EventManager.getInstance().addHandler(SearchEvent.type, this);
	}
	
	@Override
	public void onSearch(SearchEvent event) {
		SearchParams params = event.getParams();
		GWT.log("Searcher.onSearch() =>" + params);		
	}
	
}
