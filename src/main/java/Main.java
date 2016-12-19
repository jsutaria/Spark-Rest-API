/**
 * Created by jainil.sutaria on 12/18/16.
 */
import org.apache.log4j.BasicConfigurator;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        get("/hello", (req, res) -> "Testing 123");
    }
}