package be.steformations.fs.client.event.search;

import com.google.gwt.event.shared.EventHandler;

public interface SearchEventManager extends EventHandler{

	void onSearch(SearchEvent event);
}
