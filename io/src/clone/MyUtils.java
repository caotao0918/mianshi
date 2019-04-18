package clone;

import java.io.*;

/**
 * Title: MyUtils类<br>
 * Description: 利用对象的序列化和反序列化实现对象的克隆
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
//利用对象的序列化和反序列化实现对象的克隆
public class MyUtils {

    private MyUtils()  {
        throw new AssertionError();//断言错误
    }
    @SuppressWarnings("unchecked")//用于抑制编译器产生警告信息
    public static <T extends Serializable> T clone(T obj) throws Exception {

        //序列化
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bout);
        oos.writeObject(obj);//obj:要序列化的对象

        //反序列化
        ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bin);
        return (T) ois.readObject();
    }

}
