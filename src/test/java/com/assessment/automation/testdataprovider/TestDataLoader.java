package com.assessment.automation.testdataprovider;

import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestDataLoader {

	
	private static List<TestDataObjects> testCases;

    static {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = TestDataLoader.class.getClassLoader()
                    .getResourceAsStream("testdata/testdata.json");
            if (is == null) {
                throw new RuntimeException("Test data JSON not found!");
            }
            var jsonNode = mapper.readTree(is).get("tests");
            testCases = mapper.convertValue(jsonNode, new TypeReference<List<TestDataObjects>>() {});
        } catch (Exception e) {
            throw new RuntimeException("Failed to load test data JSON", e);
        }
    }

    public static TestDataObjects getTestCaseByName(String name) {
        return testCases.stream()
                .filter(t -> t.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Test case not found: " + name));
    }
    
}
