package com.mami;

import com.mami.dp.adapter.CaramelAdapter;
import com.mami.dp.adapter.Image;
import com.mami.dp.adapter.ImageView;
import com.mami.dp.adapter.VividFilter;
import com.mami.dp.adapter.ava.Caramel;

/**
 * Hello world!
 *
 */
public class AppAdapter
{
    public static void main( String[] args )
    {
        Image image = new Image("Photo 1");
        ImageView imageView  = new ImageView(image);
        imageView.proceedFilter(new VividFilter(image));

        Caramel caramel = new Caramel();

        CaramelAdapter caramelAdapter = new CaramelAdapter(caramel);

        imageView.proceedFilter(caramelAdapter);
    }
}
