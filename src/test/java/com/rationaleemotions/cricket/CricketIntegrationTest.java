package com.rationaleemotions.cricket;

import java.lang.management.ManagementFactory;
import org.testng.annotations.Test;

public class CricketIntegrationTest {

  @Test
  public void cricketTest() {
    System.err.println("Cricket tested on " + Thread.currentThread().getId()
        + " on JVM " + ManagementFactory.getRuntimeMXBean().getName());
  }
}
