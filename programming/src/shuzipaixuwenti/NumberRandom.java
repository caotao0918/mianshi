package shuzipaixuwenti;

/**
 * Title: NumberRandom类<br>
 * Description:
 * Company: 安阳师范学院
 *
 * @author 曹涛
 * @version 1.0
 */
public class NumberRandom {
    private static String[] mustExistNumber = new String[]{"1", "2", "2", "3", "4", "5"};

    private static boolean isValidNumber(String str) { // 检查是否包含12345这五个数，不包含返回false
        for (String number : mustExistNumber) {
            if (!str.contains(number))
                return false;
        }
        // 检查是否有两个2，只有一个返回false
        if (str.lastIndexOf("2") == str.indexOf("2")) {
            return false;
        }
        // 检查4在不在第三位，是返回false
        if (str.charAt(2) == '4') {
            return false;
        }
        // 检查是否存在35在一起，有返回false
        return !str.contains("35") && !str.contains("53");
    }

    public static void main(String[] args) {


        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 122345; i <= 543221; i++) {
            if (isValidNumber(String.valueOf(i))) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
        long end = System.currentTimeMillis();
        long l = end - start;
        System.out.println(l);//60-93
    }}