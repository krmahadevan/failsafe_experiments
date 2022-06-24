package com.rationaleemotions.football;

import java.lang.management.ManagementFactory;
import org.testng.annotations.Test;

public class FootballIntegrationTest {

  @Test
  public void footballTest() {
    System.err.println("Football tested on " + Thread.currentThread().getId()
        + " on JVM " + ManagementFactory.getRuntimeMXBean().getName());
  }
}
