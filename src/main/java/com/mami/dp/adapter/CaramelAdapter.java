package com.mami.dp.adapter;

import com.mami.dp.adapter.ava.Caramel;

public class CaramelAdapter implements Filter{

  Caramel caramel;

  public CaramelAdapter(Caramel caramel) {
    this.caramel = caramel;
  }

  @Override
  public void apply(Image image) {
    System.out.println(caramel.init());
    caramel.applyFilter();
    System.out.print(image.getName());
  }
}
