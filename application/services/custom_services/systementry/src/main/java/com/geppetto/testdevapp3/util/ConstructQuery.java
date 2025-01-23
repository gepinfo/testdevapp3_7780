package com.geppetto.testdevapp3.util;

import org.springframework.stereotype.Component;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class ConstructQuery {

    /**
    * Constructs a MongoDB query string from the given parameters.
    *
    * @param params A map of query parameters.
    * @return A MongoDB query string.
    */
    public String constructQueries(Map<String, String> params) {
    if (params.isEmpty()) {
     return "{}";
    }
    return params.entrySet().stream()
    .map(entry -> String.format("\"%s\": \"%s\"", entry.getKey(), entry.getValue()))
    .collect(Collectors.joining(", ", "{ ", " }"));
    }
}


