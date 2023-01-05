package lab.rob6;

import lab.rob5.Shop5;

public class Shop6 implements RecruitmentOfEmployees {

    public Shop5 shop5;

    public Shop6(Shop5 shop5) {
        this.shop5 = shop5;
    }

    @Override
    public void recruitmentOfEmployees(String data) {
        if (data.equals("Касир") || data.equals("Директор") || data.equals("Вантажник") || data.equals("Мерчендайзер")) {
            System.out.println("Нажаль у нас усі ці місця зайняті. Проте є ще Охоронець та Прибиральник");
        } else if (data.equals("Прибиральник") || data.equals("Охоронець")) {
            System.out.println("Ви прийняті на роботу !");
        } else {
            System.out.println("Такої посади у нас нема !");
        }
    }
}
