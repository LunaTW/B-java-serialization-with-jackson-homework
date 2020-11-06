package com.thoughtworks.capability.gtb.vo;

public enum EventType {
  U("UPLOAD"),D("DOWNLOAD");

  private String code;

  EventType(String code) {
    this.code = code;
  }
}
