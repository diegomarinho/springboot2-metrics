package br.com.uol.monitoring.springboot2metrics;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;

/**
 * @author dialmeida
 *
 */
@RestController
public class SomeController {

    private Counter globalRegistryCounter = Metrics.counter("globalmetrics");

    @Timed
    @GetMapping("/")
    public Map<String, String> index() {

        globalRegistryCounter.increment();

        return new HashMap<String, String>() {

            private static final long serialVersionUID = 1L;

            {
                put("hello", "world");
            }
        };
    }
}
