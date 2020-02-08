package example.micronaut;


import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/hello")
public class SampleController {

    @Post(consumes = MediaType.APPLICATION_JSON)
    public String hello(@Body String body) {
        return "hello";
    }

}
