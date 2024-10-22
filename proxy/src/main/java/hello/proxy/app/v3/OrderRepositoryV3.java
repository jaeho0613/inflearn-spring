package hello.proxy.app.v3;

import hello.proxy.Util;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryV3 {

    public void save(String itemId) {
        // 저장로직
        if (itemId.equals("ex")) {
            throw new IllegalStateException("예외 발생!");
        }

        Util.sleep(1000);
    }

}
