package com.xmunch.atomspace;

import java.util.HashMap;

import com.xmunch.atomspace.aux.AtomSpaceParams;
import com.xmunch.atomspace.aux.GlobalValues;
import com.xmunch.atomspace.examples.RandomGraphExample;
import com.xmunch.atomspace.model.AtomSpace;

public class Main {
	
	static AtomSpace atomSpace;

    public static void main(String[] args) {
    	
    	HashMap<String, String> atomSpaceParams = new HashMap<String, String>();
    	HashMap<String, String> atomParams = new HashMap<String, String>();
    	
    	atomSpaceParams.put(AtomSpaceParams.VISUALIZATION.get(),GlobalValues.TRUE.get());
    	
    	atomSpace = AtomSpace.getInstance(atomSpaceParams);
    	RandomGraphExample.run(atomParams,atomSpace);
        
    }

}
