
package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SwagDataProvider {

    public static List<String> readCartProducts()
            throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        try (InputStream input =
                     SwagDataProvider.class
                             .getClassLoader()
                             .getResourceAsStream("testData.json")) {

            if (input == null) {
                throw new IOException(
                        "testData.json was not found in test resources"
                );
            }

            JsonNode root = mapper.readTree(input);

            return mapper.convertValue(
                    root.get("cartProducts"),
                    new TypeReference<List<String>>() {}
            );
        }
    }

    @DataProvider(name = "cartProducts")
    public Object[][] cartProductsProvider() throws IOException {
        return new Object[][] {
                { readCartProducts() }
        };
    }
}

