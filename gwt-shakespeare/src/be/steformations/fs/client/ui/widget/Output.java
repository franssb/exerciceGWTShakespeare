package be.steformations.fs.client.ui.widget;

import com.google.gwt.core.client.GWT;

import be.steformations.fs.client.event.EventManager;
import be.steformations.fs.client.event.reset.ResetEvent;
import be.steformations.fs.client.event.reset.ResetEventManager;
import be.steformations.fs.client.event.result.ResultEvent;
import be.steformations.fs.client.event.result.ResultEventManager;
import gwt.material.design.client.ui.MaterialLabel;

public class Output extends MaterialLabel implements ResetEventManager, ResultEventManager{

	public Output() {
		GWT.log("Output.Output()");
		
		EventManager.getInstance().addHandler(ResetEvent.type, this);
		EventManager.getInstance().addHandler(ResultEvent.type, this);
	}

	@Override
	public void onReset(ResetEvent event) {
		GWT.log("Output.onReset()");		
		this.setText("");		
	}

	@Override
	public void onResult(ResultEvent event) {
		GWT.log("Output.onResult()");	
		this.setText(event.getMonologue());
	}
}
