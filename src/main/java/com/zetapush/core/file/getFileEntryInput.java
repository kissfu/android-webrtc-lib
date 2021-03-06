package com.zetapush.core.file;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 *
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.file.getFileEntryInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.file.getFileEntryInput$Impl.class, name = "com.zetapush.core.file.getFileEntryInput") })
public interface getFileEntryInput {

	/** Getter for field path
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getPath();

	/** Setter for field path */
	void setPath(String path);

	/** Getter for field owner
	 * 
	 */
	String getOwner();

	/** Setter for field owner */
	void setOwner(String owner);
}
