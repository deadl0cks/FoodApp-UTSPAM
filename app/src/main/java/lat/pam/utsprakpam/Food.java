package lat.pam.utsprakpam;

import android.graphics.drawable.Drawable;

public class Food {
    String judul;
    String desc;
    int price;
    Drawable image;

    Food(String judul, String desc, int price, Drawable image) {
        this.judul = judul;
        this.desc = desc;
        this.price= price;
        this.image= image;
    }
}
