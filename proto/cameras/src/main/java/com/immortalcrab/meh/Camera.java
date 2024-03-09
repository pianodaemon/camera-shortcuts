package com.immortalcrab.meh;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor
public class Camera {

	protected final @NonNull String name;

	protected final @NonNull String uri;
}
