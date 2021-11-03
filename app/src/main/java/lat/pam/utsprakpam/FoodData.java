package lat.pam.utsprakpam;

import android.content.Context;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Batagor", "Extraordinary Cuisine with Peanut Sauce", 7000, context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Black Salad", "Healthy Salad", 13000, context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Caphuchino", "Ultimato Frapuchino", 18000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Cheesecake", "Homemade CheeseCake", 10000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Cireng", "Aci di Goreng", 5000, context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Donut", "Freshly Served Donut From J.CO", 8000, context.getDrawable(R.drawable.donut)));
        list.add(new Food("Kopi Hitam", "Liong Bulan Punya", 3000, context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Fried Noodle", "Signature Fried Noodle", 8000, context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Friend Rice", "Indonesia Signature Cuisine 'Nasi Goreng' ", 12000, context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Sprakling Tea", "Refreshing Sparkling Tea ", 5000, context.getDrawable(R.drawable.sparkling_tea)));
        return list;
    }
}
