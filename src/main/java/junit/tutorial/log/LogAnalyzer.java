package junit.tutorial.log;

import java.io.IOException;
import java.util.Map;

import org.mockito.asm.tree.analysis.AnalyzerException;

public class LogAnalyzer {
    LogLoader logLoader = new LogLoader();
    
    public Object analyze(String file) {
        try {
            Map<String, String> rawData = logLoader.load(file);
            return doAnalyze(rawData);
        } catch (IOException e) {
            throw new AnalyzeException(e);
        }
    }
    
    private Object doAnalyze(Map<String, String> rawData) {
        return new Object();
    }
    
    static class AnalyzeException extends RuntimeException {
        public AnalyzeException(Throwable cause) {
            super(cause);
        }
    }
}
