package example.micronaut;


import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import java.util.Map;

@Controller("/hello")
public class SampleController {

    @Post
    public String hello(@Body HelloRequest body) {
        return "hello";
    }

    @Post("/1")
    public Map hello1(@Body HelloRequest body) {
        return Map.of("a", "b");
    }
}
