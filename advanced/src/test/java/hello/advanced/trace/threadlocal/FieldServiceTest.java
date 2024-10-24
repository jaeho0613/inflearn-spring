package hello.advanced.trace.threadlocal;

import hello.advanced.trace.Util;
import hello.advanced.trace.threadlocal.code.FieldService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class FieldServiceTest {
    
    private FieldService fieldService = new FieldService();
    
    @Test
    void field() {
        log.info("main start");
        Runnable userA = () -> fieldService.logic("userA");
        Runnable userB = () -> fieldService.logic("userB");
        
        Thread threadA = new Thread(userA);
        threadA.setName("thread-A");
        Thread threadB = new Thread(userB);
        threadB.setName("thread-B");
        
        threadA.start();
        // Util.sleep(2000); // 동시성 문제 발생 X
        Util.sleep(100); // 동시성 문제 발생 O
        threadB.start();

        Util.sleep(3000); // 메인 쓰레드 종료 대기
        log.info("main exit");
    }
}
