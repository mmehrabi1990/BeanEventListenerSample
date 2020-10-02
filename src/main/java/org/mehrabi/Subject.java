package org.mehrabi;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Subject {

	String property="initial";
	// contain a support object instead of extending the support class
	PropertyChangeSupport pcs;

	public Subject(PropertyChangeSupport pcs){
		this.pcs = pcs;
	}
	
	public void addObserver(PropertyChangeListener l) {
		pcs.addPropertyChangeListener("theProperty", l);
	}
	
	public void setProperty(String val) {
		String old = property;
		property = val;
		pcs.firePropertyChange("theProperty", old, val);
	}
	
	public String toString() { return "The subject object"; };
}