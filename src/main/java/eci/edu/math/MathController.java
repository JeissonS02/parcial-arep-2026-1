package eci.edu.math;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

private final AtomicLong counter = new AtomicLong();

@GetMapping("/greeting")
public Math mathservice(@RequestParam(value = "name", defaultValue = "World") String name) {
return new Math(counter.incrementAndGet(), String.format(template, name));
}
}


