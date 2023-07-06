import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> itemMap = new HashMap<>();
        itemMap.put("ポーション", 100);
        itemMap.put("毒消し", 100);
        itemMap.put("フェニックスの尾", 1300);
        itemMap.put("めぐすり", 50);
        itemMap.put("金の針", 100);

        for (Map.Entry<String, Integer> sushientry : itemMap.entrySet()) {
            System.out.println(sushientry.getKey() + "は" + sushientry.getValue() + "ギルです!");
        }

        System.out.println("ご注文は？");
        String name = new Scanner(System.in).next();

        Integer order;
        order = itemMap.get(name);

        try {
            if (order != null) {
                System.out.println(order + "ギルだよ");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(order + "売ってないよ！");
        }
    }
}
