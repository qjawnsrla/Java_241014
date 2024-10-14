package 스트림활용하기;

import java.util.ArrayList;
import java.util.List;

public class StreamApply {
    public static void main(String[] args) {
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("안유진", 21, 1000));
        customerList.add(new TravelCustomer("유나", 21, 2000));
        customerList.add(new TravelCustomer("카즈하", 21, 3000));
        customerList.add(new TravelCustomer("헤린", 18, 800));

        System.out.println("\n===== 고객 명단 출력 =====");
        customerList.stream().map(TravelCustomer::getName).forEach(e->System.out.print(e + " "));

        System.out.println("\n===== 여행 종료 =====");
        int total = customerList.stream().mapToInt(e -> e.getPrice()).sum();
        System.out.println("총 여행 비용 : " + total);

        System.out.println("===== 20세 이상 명단 출력 =====");
        customerList.stream()
                .filter(e -> e.getPrice() > 20)
                .map(TravelCustomer::getName)
                .sorted()
                .forEach(e->System.out.print(e + " "));

    }
}

class TravelCustomer {
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}