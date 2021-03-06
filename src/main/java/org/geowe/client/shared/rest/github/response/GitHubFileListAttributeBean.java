/*
 * #%L
 * GeoWE Project
 * %%
 * Copyright (C) 2015 - 2016 GeoWE.org
 * %%
 * This file is part of GeoWE.org.
 * 
 * GeoWE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * GeoWE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with GeoWE.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
package org.geowe.client.shared.rest.github.response;

import org.jboss.errai.common.client.api.annotations.MapsTo;
import org.jboss.errai.common.client.api.annotations.Portable;

/**
 * 
 * @author jose@geowe.org
 *
 */
@Portable
public class GitHubFileListAttributeBean {
	
	
	private String attributeName;
	private String attributeUrl;
	private String attributeType;
	

	
	public GitHubFileListAttributeBean(@MapsTo("name") String fileName, @MapsTo("download_url")String url, @MapsTo("type")String type) {
		
		this.attributeName = fileName;
		this.attributeUrl = url;
		this.attributeType = type;
	}

	

	public String getAttributeType() {
		return attributeType;
	}



	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}



	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	
	

	public String getAttributeUrl() {
		return attributeUrl;
	}



	public void setAttributeUrl(String attributeUrl) {
		this.attributeUrl = attributeUrl;
	}



	@Override
	public String toString() {
		return "Repository [" + attributeName + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attributeName == null) ? 0 : attributeName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GitHubFileListAttributeBean other = (GitHubFileListAttributeBean) obj;
		if (attributeName == null) {
			if (other.attributeName != null)
				return false;
		} else if (!attributeName.equals(other.attributeName))
			return false;
		return true;
	}	 
}
