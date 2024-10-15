package hello.login.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    // 외부 주입
    BizService bizService = new BizService();
    
    // 외부 주입
    LogService logService = new LogService();
    
    @RequestMapping(value = "/test")
    public void test() {
        
        // 벨리데이션 로직
        validation();
        
        // 로그 저장
        Long id = logService.newLog();

        try {
            // 비즈니스 로직 실행
            bizService.bizLogic();
            
            // 성공 로그로 업데이트
            logService.successLog(id);
        } catch (Exception e) {
            // 실패 로그로 업데이트
            logService.failLog(id);
        }
    }
    
    private void validation() {}
    
    class BizService {
        void bizLogic() {};
    }
    
    class LogService {
        private Long newLog() {return 1L;}
        private void successLog(Long id) {}
        private void failLog(Long id) {}
    }
}
