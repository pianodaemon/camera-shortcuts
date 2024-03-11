package com.immortalcrab.meh;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Camera {

	private String name;

	private String uri;

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(name).append(uri).toHashCode();
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj instanceof Camera) {
			final Camera other = (Camera) obj;

			return new EqualsBuilder().append(name, other.name).append(uri, other.uri).isEquals();
		}

		return false;
	}
}
