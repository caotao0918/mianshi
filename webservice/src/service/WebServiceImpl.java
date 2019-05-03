package service;

import javax.jws.WebService;

/**
 * Title: WebServiceImpl类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
@WebService
public class WebServiceImpl  implements service.WebService {
    @Override
    public String sayHello(String name) {
        return name + "你好。。。";
    }
}
