package eci.edu.math;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/collatzsequence")
    public Math math(@RequestParam(value = "value") int n) {
        return new Math("collatzsequence", n, collatz(n));
    }

    public String collatz(int num) {
        String sequence = "" + num;
        int current = num; 

        while (current != 1) {
            if (current % 2 == 0) {
                current = current / 2;
            } else {
                current = (current * 3) + 1;
            }
            sequence = sequence + " -> " + current;
        }
        return sequence;
    }
}