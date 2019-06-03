package gt.edu.umg.ingenieria.sistemas.so2.bubblesort.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Josué Barillas (jbarillas)
 */
@RestController
@RequestMapping("/sort")
public class BubbleSortController {

    @GetMapping("/bubble")
    public int[] bubble(@RequestParam(required = true) int[] numbers) {
        if (numbers == null) {
            return null;
        }
        
        for (int i = 0; i < numbers.length; i++) {            
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }
        
        return numbers;
    }
    
}
