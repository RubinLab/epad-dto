package edu.stanford.epad.dtos;

import java.io.Serializable;
import java.util.List;

public class RemotePACEntity  implements Serializable {
	public final String entityType;
	public final String entityValue;
	public final int level;
	public final String entityID;
	
	public RemotePACEntity(String entityType, String entityValue, int level, String entityID) {
		super();
		this.entityType = entityType;
		this.entityValue = entityValue;
		this.level = level;
		this.entityID = entityID;
	}
	
}
