package com.bloom.bloom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class controller {
  @GetMapping
  public String homePage() {
    return "index";
  }

  @GetMapping("/collection")
  public String collectionPage() {
    return "collection";
  }
  @GetMapping("/about")
  public String aboutUs() {
    return "about";
  }
  @GetMapping("/products/gold-elixir")
  public String productGoldElixir() {
    return "product-gold-elixir";
  }
  @GetMapping("/products/decadent")
  public String productDecadent() {
    return "product-decadent";
  }
  @GetMapping("/products/hydra-gel")
  public String productHydraGel() {
    return "product-hydra-gel";
  }
  @GetMapping("/products/double-dip")
  public String productDoubleDip() {
    return "product-double-dip";
  }

}
