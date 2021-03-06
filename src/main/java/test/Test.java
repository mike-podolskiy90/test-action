/*
 * Copyright 2020 Global Biodiversity Information Facility (GBIF)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Test google format and github actions
 */
public class Test {
  public static void main(String[] args) {
    Set<Object> objects = new HashSet<Object>();
    List<Object> objects2 = new ArrayList<Object>();
    System.out.println("Hello world");
    System.out.println("again");
    System.out.println("and again");
    System.out.println("just stuff");
    System.out.println(
        "That's a very very very very very very very very very very long line, almost 120 characters");
  }
}
