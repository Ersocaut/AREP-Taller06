import static spark.Spark.*;

public class SparkApp {
    public static void main(String[] args) {
        port(getPort());

        secure(getKeyStore(), "123456", null, null);

        get("/hello", (req, res) -> "Hello Service");
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }

    private static String getKeyStore(){
        if (System.getenv("KEYSTORE") != null){
            return System.getenv("KEYSTORE");
        }
        return "keystores/ecikeystore.p12";
    }

}
