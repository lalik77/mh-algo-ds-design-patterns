package com.mami.dp.adapter;

public class ImageView {
  private final Image image;

  public ImageView(Image image) {
    this.image = image;
  }

  public void proceedFilter(Filter filter) {
    filter.apply(image);
  }
}
