import io.vertx.core.Vertx;

/**
 * @author: Binh Nguyen
 * Dec 03, 2021
 */

public class TestVertX {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new MyVertical());
    }
}
