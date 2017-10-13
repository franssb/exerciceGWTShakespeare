package be.steformations.fs.client.ui.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiConstructor;

import be.steformations.fs.client.event.EventManager;
import be.steformations.fs.client.event.reset.ResetEvent;
import be.steformations.fs.client.event.reset.ResetEventManager;
import gwt.material.design.client.ui.MaterialListBox;

public class PlayInput extends MaterialListBox implements ResetEventManager{
	
	@UiConstructor
	public PlayInput(String placeholder) {
		GWT.log("PlayInput.PlayInput()");
		
		this.setPlaceholder(placeholder);
		
		this.addItem("hamlet", "Hamlet");
		this.addItem("lear", "Lear");
		this.addItem("macbeth", "Macbeth");
		this.addItem("much_ado", "Much ado about nothing");
		this.addItem("othello", "Othello");
		this.addItem("romeo_and_juliet", "Romeo and Juliet");
		this.addItem("tempest", "The Tempest");
		
		this.setSelectedIndex(0);
		
		EventManager.getInstance().addHandler(ResetEvent.type, this);
	}

	@Override
	public void onReset(ResetEvent event) {
		GWT.log("PlayInput.onReset()");		
		this.setSelectedIndex(0);
	}
	
}
