package com.example.demo.controller;

import com.google.common.collect.ImmutableList;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.text.StringSubstitutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/security-demo")
public class SecurityDependencyDemoController {

    @GetMapping("/text4shell/exploitable")
    public Map<String, Object> text4ShellExploitable(@RequestParam String template) {
        // Deliberately vulnerable for GHAS demo: interpolator resolves lookups from user input.
        String resolved = StringSubstitutor.createInterpolator().replace(template);

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("mode", "exploitable");
        response.put("dependency", "org.apache.commons:commons-text:1.9");
        response.put("input", template);
        response.put("resolved", resolved);
        return response;
    }

    @GetMapping("/commons-collections/non-exploitable")
    public Map<String, Object> commonsCollectionsNonExploitable() {
        Map<String, String> source = new HashMap<>();
        source.put("demo", "safe-usage-only");
        Map<String, String> unmodifiable = MapUtils.unmodifiableMap(source);

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("mode", "non-exploitable");
        response.put("dependency", "commons-collections:commons-collections:3.1");
        response.put("entries", unmodifiable);
        return response;
    }

    @GetMapping("/guava/non-exploitable")
    public Map<String, Object> guavaNonExploitable() {
        ImmutableList<String> demo = ImmutableList.of("a", "b", "c");

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("mode", "non-exploitable");
        response.put("dependency", "com.google.guava:guava:24.1.1-jre");
        response.put("entries", demo);
        return response;
    }
}
