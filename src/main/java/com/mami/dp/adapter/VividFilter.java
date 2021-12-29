package com.mami.dp.adapter;

public class VividFilter implements Filter {

  private final Image image;

  public VividFilter(Image image) {
    this.image = image;
  }

  @Override
  public void apply(Image image) {
    System.out.println("Apply Vivid Filter to : " + image.getName());
  }
}
