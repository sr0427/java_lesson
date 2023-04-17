package sample;

public class ItemCaIcuIate {
    public static void main(String[] args) {
        String name = "コーヒー";
        int price = 100;
        int amount = 5;
        boolean isSale = true;

        int total_price = price * amount;

        System.out.println(name);
        System.out.println(total_price);
        System.out.println(isSale);

         //Complie Error
        //total_price = name * amounr;

        //comsuption tax
        final float TAX_RATE = 0.1f;

        System.out.println(TAX_RATE);
        //TAX_RATE = 0.8f;

        price = 200;
        float pointRate = 0.05f;
        float point = (float) price * pointRate;
        System.out.println(("ポイント:")+ point + "pt");
        amount = 5;
         //increment
        amount++;
        System.out.println(amount);
        //decrement
        amount--;
        System.out.println(amount);


        amount = 10;
        //11 + 10
        System.out.println(amount++ + amount++);

        amount = 10;
        //11 + 12
        System.out.println(++amount + ++amount);

         //(1) 2項演算
        amount = 3;
        amount = amount + 1;
        System.out.println(amount);
        //(2) 複合演算
        amount = 3;
        amount +=1;
        System.out.println(amount);


        price = 110;
        amount = 3;
        //price から10ひく
        price -= 10;
        //price に amount をかける
        price *= amount;
        System.out.println(price);


        boolean is_match = false;
        price = 100;

        is_match = (price == 100);
        System.out.println(is_match);
// 左項が右項より小さいか
        is_match = (price < 100);
        System.out.println(is_match);
// 左項と右項が等しくないか
        is_match = (price != 100);
        System.out.println(is_match);
// 左項が右項より大きいか
        is_match = (price > 100);
        System.out.println(is_match);
//左項が右項以上か
        is_match = (price >= 100);
        System.out.println(is_match);


        int price3 = 100;
        String price4 = "100";
        is_match = (price3 == Integer.parseInt(price4));
        System.out.println(is_match);

    }




}