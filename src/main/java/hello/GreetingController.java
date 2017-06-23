package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/{name}/hello")
public class GreetingController {

    private static final String helloTemplate = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET)
    public Greeting readGreeting(@PathVariable String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(helloTemplate, name));
    }
}