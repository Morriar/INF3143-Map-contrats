/*
 * Copyright 2015 Alexandre Terrasa <alexandre@moz-code.org>.
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
package map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new Map<>();
        System.out.println("Created new empty map: " + map.isEmpty());

        for (int i = 0; i <= 10; i++) {
            map.put("key" + i, i);
        }
        System.out.println("Added " + map.size() + " values");

        for (int i = 0; i <= 10; i++) {
            String key = "key" + i;
            System.out.println(map.get(key));
            map.remove(key);
        }
        System.out.println("Map is now empty: " + map.isEmpty());

    }

}
