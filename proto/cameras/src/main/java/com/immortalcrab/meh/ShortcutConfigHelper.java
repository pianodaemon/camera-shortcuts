package com.immortalcrab.meh;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class ShortcutConfigHelper {

	static ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

	public static ShortcutConfig fetch(File file) throws IOException {
		ShortcutConfig sc = mapper.readValue(file, ShortcutConfig.class);
		return sc;
	}

	public static ShortcutConfig fetchFromEvar(String evar) throws Exception {
		if (!System.getenv().containsKey(evar))
			throw new Exception("Env variable does not exits");
		final String filePath = Optional.ofNullable(System.getenv().get(evar)).get();
		return fetch(new File(filePath));
	}
}
