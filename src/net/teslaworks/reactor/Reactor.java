package net.teslaworks.reactor;

import ddf.minim.Minim;
import java.io.InputStream;

public class Reactor {

	public static void main(String[] args)
        {
	    MinimObject minimObject = new MinimObject();
	    Minim minim = new Minim(minimObject);
            
            /* 
            tests sketchPath function, should return an absolute path to the
            minim library 
            */
            System.out.println(minimObject.sketchPath("lib/minim"));
            
            /*
            tests createInput function. if file exists
            */
            InputStream instr = minimObject.createInput("lib/minim.jar");
            
            System.out.println("Here");
	}

}
