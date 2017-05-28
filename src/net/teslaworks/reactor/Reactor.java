package net.teslaworks.reactor;

import ddf.minim.Minim;

public class Reactor {

	public static void main(String[] args)
        {
	    MinimObject minimObject = new MinimObject();
	    Minim minim = new Minim(minimObject);
            System.out.println(minimObject.sketchPath("lib/minim"));
            System.out.println("Here");
	}

}
