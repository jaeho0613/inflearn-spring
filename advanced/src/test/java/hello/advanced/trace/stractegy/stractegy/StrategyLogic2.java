package hello.advanced.trace.stractegy.stractegy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyLogic2 implements Strategy {
    @Override
    public void call() {
        log.info("비즈니스2 로직");
    }
}
