package vertical;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.json.Json;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import service.MyFriendService;

/**
 * @author: Binh Nguyen
 * Dec 03, 2021
 */

public class MyVertical extends AbstractVerticle {

    private final MyFriendService service;

    public MyVertical(MyFriendService service) {
        this.service = service;
    }

    @Override
    public void start(Promise startPromise) throws Exception {
        service.createFriendList();
        Router router = Router.router(vertx);
        router.get("/api/friends").handler(this::getFriendList);
        vertx.createHttpServer()
                .requestHandler(router::accept)
                .listen(config().getInteger("http.port",8080), httpServerAsyncResult -> {
                        if (httpServerAsyncResult.succeeded()) {
                            startPromise.complete();
                        } else if (httpServerAsyncResult.failed()) {
                            startPromise.fail(httpServerAsyncResult.cause());
                        }
                    });
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Stop MyVertical");
    }

    private void getFriendList(RoutingContext routingContext) {
        routingContext.response()
                .putHeader("content-type", "application/json")
                .end(Json.encodePrettily(service.getFriendMap()));
    }

}
