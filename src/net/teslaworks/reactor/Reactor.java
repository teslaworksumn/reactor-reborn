package net.teslaworks.reactor;

import ddf.minim.Minim;

public class Reactor {

	public static void main(String[] args)
        {
	    MinimObject minimObject = new MinimObject();
	    Minim minim = new Minim(minimObject);
            
            /* tests sketchPath function, should return an absolute path to the
            minim library */
            System.out.println(minimObject.sketchPath("lib/minim"));
            
            System.out.println("Here");
	}

}
