package service;

import javax.jws.WebMethod;

/**
 * Title: WebService接口<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
@javax.jws.WebService
public interface WebService {
    @WebMethod
    String sayHello(String name);
}
