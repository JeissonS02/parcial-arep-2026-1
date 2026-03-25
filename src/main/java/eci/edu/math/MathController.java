package eci.edu.math;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/collatzsequence")
    public Math math(@RequestParam int n) {

        return new Math(collatz(n));
    }

    public String collatz(int num){
        String sequence = "" + num;

        while(num!=1){
            int op = 0;

            if(num % 2 == 0){
                op = num / 2;
                num = op;
                
            }
            else{
                op = (num * 3) + 1;
                num = op;
                
            }
            
            sequence = sequence + "->"+ num;
        }
        
    return sequence;
    }
}
