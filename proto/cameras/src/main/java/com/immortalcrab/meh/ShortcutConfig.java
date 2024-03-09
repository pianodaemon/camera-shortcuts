package com.immortalcrab.meh;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShortcutConfig {

	private String title;

	@SuppressWarnings("unused")
	private List<Camera> cameras;
}