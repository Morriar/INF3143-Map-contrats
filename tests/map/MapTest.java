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

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author morriar
 */
public class MapTest {

    public MapTest() {
    }

    @Test
    public void new_map_is_empty() {
        Map<String, Integer> map = new Map<>();
        assertTrue(map.isEmpty());
    }

    @Test
    public void new_map_has_0_size() {
        Map<String, Integer> map = new Map<>();
        assertEquals(0, map.size());
    }

    @Test
    public void put_increase_size() {
        Map<String, Integer> map = new Map<>();
        map.put("a", 1);
        assertEquals(1, map.size());
    }

    @Test
    public void remove_decrease_size() {
        Map<String, Integer> map = new Map<>();
        map.put("a", 1);
        map.remove("a");
        assertEquals(0, map.size());
    }

    @Test
    public void has_key_return_true_is_key_exist() {
        Map<String, Integer> map = new Map<>();
        map.put("a", 1);
        assertTrue(map.hasKey("a"));
    }

    @Test
    public void has_key_return_true_is_key_not_found() {
        Map<String, Integer> map = new Map<>();
        assertFalse(map.hasKey("b"));
    }

    @Test
    public void get_return_previous_put_value() {
        Map<String, Integer> map = new Map<>();
        int exp = 100;
        map.put("a", exp);
        int res = map.get("a");
        assertSame(exp, res);
    }
}
