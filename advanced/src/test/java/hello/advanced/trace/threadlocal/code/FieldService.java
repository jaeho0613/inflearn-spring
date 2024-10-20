package hello.advanced.trace.threadlocal.code;

import hello.advanced.trace.Util;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FieldService {
    
    private String nameStore;
    
    public String logic(String name) {
        log.info("저장 name={} -> nameStore={}", name, nameStore);
        nameStore = name;
        Util.sleep(1000);
        log.info("조회 nameStore={}", nameStore);
        return nameStore;
    }
}