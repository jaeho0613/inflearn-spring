package hello.advanced.trace.stractegy;

import hello.advanced.trace.stractegy.stractegy.ContextV2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ContextV2Test {

    /**
     * 전략 패턴 적용
     */
    @Test
    void strategyV1() {
        ContextV2 context = new ContextV2();
        context.execute(() -> log.info("비즈니스 로직 1"));
        context.execute(() -> log.info("비즈니스 로직 2"));
    } 
}
