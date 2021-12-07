package io.github.joblo2213.adventofcode.y2021.day07;

import io.github.joblo2213.adventofcode.y2021.helpers.PuzzleInput;
import io.github.joblo2213.adventofcode.y2021.helpers.Task;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Day07A extends Task {
    @Override
    public long run(PuzzleInput input) throws Exception {
        int[] heights = input.withDelimiter(",").ints().toArray();
        int max = Arrays.stream(heights).max().orElseThrow();
        return IntStream.rangeClosed(1, max)
                .parallel()
                .mapToLong(i -> Arrays.stream(heights).map(h -> h - i).map(Math::abs).sum())
                .min()
                .orElseThrow();
    }
}
