package com.mami;

import com.mami.dp.adapter.CaramelAdapter;
import com.mami.dp.adapter.Image;
import com.mami.dp.adapter.ImageViewer;
import com.mami.dp.adapter.ava.Caramel;

/**
 * Hello world!
 *
 */
public class AppAdapter
{
    public static void main( String[] args )
    {
        Image image1 = new Image("Photo 1");
        ImageViewer imageViewer = new ImageViewer(image1);

        imageViewer.apply(image1);

        Caramel caramel = new Caramel();

        CaramelAdapter caramelAdapter = new CaramelAdapter(caramel);

        caramelAdapter.apply(image1);


    }
}
