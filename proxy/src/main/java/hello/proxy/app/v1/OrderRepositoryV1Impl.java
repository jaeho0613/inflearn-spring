package hello.proxy.app.v1;

import hello.proxy.Util;

public class OrderRepositoryV1Impl implements OrderRepositoryV1 {
    
    @Override
    public void save(String itemId) {
        // 저장로직
        if(itemId.equals("ex")) {
            throw new IllegalStateException("예외 발생!");
        }

        Util.sleep(1000);
    }
}
