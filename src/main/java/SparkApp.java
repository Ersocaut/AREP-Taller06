import static spark.Spark.*;

public class SparkApp {
    public static void main(String[] args) {
        port(5000);

        get("/hello", (req, res) -> "Hello Service");
    }
    
}
