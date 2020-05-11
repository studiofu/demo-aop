package demo.demoaop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FirstController {

    @RequestMapping("/")
    @LogExecutionTime
    public List<String> hello() {
        return Arrays.asList("Hello", "DD1DEFGFXXXX!!!!!");
    }

    @GetMapping("/value")
    public int findValue() {
        return 10;
    }


}
