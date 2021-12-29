package com.mami.dp.adapter;

public class ImageViewer implements Filter {

  private final Image image;

  public ImageViewer(Image image) {
    this.image = image;
  }

  @Override
  public void apply(Image image) {
    System.out.println("Apply Filter to : " + image.getName());
  }
}
