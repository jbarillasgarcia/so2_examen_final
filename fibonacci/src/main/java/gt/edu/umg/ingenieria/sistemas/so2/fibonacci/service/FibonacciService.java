package gt.edu.umg.ingenieria.sistemas.so2.fibonacci.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Josué Barillas (jbarillas)
 */
@Service
public class FibonacciService {
    
    public long fibonacciRecursivePrintNthElement(int n) throws Exception {
        return fibonacciRecursivePrintNthElement(1, 1, 3, n);
    }
    
    private long fibonacciRecursivePrintNthElement(long left, long right, int current, int n) throws Exception {
        if (n <= 0) {
            throw new Exception(String.format("Cannot calculate fibonacci series for element %d.", n));
        } else if (n <= 2) {
            return 1;
        }
        
        if (current++ == n) {
            return (left + right);
        } else {
            return fibonacciRecursivePrintNthElement(right, left + right, current, n);
        }
    }

}
