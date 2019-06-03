package gt.edu.umg.ingenieria.sistemas.so2.fibonacci.controller;

import gt.edu.umg.ingenieria.sistemas.so2.fibonacci.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Josué Barillas (jbarillas)
 */
@RestController
@RequestMapping("/series")
public class FibonacciController {
    
    @Autowired
    private FibonacciService fibService;

    @GetMapping("/fibonacci")
    public long fibonacci(@RequestParam(required = true) int n) throws Exception {
        return this.fibService.fibonacciRecursivePrintNthElement(n);
    }
    
    
}
