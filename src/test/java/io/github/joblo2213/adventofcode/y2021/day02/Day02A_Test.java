package io.github.joblo2213.adventofcode.y2021.day02;

import io.github.joblo2213.adventofcode.y2021.helpers.PuzzleInput;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02A_Test {

    @Test
    public void test1() throws Exception {
        assertEquals(150, new Day02A().run(PuzzleInput.ofMulti("""
                forward 5
                down 5
                forward 8
                up 3
                down 8
                forward 2
                """)));
    }

    @Test
    public void task() throws Exception {
        new Day02A().run();
    }
}
