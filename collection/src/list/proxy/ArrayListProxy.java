package list.proxy;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Title: ArrayListProxy类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class ArrayListProxy {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        List<String> proxyInstance = (List<String>) Proxy.newProxyInstance(list.getClass().getClassLoader(), list.getClass().getInterfaces(), (proxy, method, args1) -> method.invoke(list, args1));
        proxyInstance.add("你好啊");
        System.out.println(list);
    }
}
