package org.mehrabi;

import java.beans.PropertyChangeSupport;

public class EsObserver {

	public static void main(String[] args) {
		
		Subject s = new Subject(new PropertyChangeSupport(Subject.class));
		
		Concerned o = new Concerned();
		Concerned2 o2 = new Concerned2();

		s.addObserver(o);
		s.addObserver(o2);

		s.setProperty("new");

	}

}