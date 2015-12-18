package com.vaibhav.developer.ad.findings.resaerch;

/**
 * Created by Administrator on 13-05-2015.
 */
import android.graphics.Bitmap;

/**
 *
 * @author vaibhav
 *
 */

public class Item {
    Bitmap image;
    String title;

    public Item(Bitmap image, String title) {
        super();
        this.image = image;
        this.title = title;
    }
    public Bitmap getImage() {
        return image;
    }
    public void setImage(Bitmap image) {
        this.image = image;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


}
