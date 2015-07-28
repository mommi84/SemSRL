package org.aksw.simba.semsrl.controller;

import java.io.IOException;

import org.aksw.simba.semsrl.model.DataSource;
import org.aksw.simba.semsrl.model.ResourceGraph;

/**
 * @author Tommaso Soru <tsoru@informatik.uni-leipzig.de>
 *
 */
public interface Crawler {

	public ResourceGraph crawl(DataSource ds, String id) throws IOException;
	
}
