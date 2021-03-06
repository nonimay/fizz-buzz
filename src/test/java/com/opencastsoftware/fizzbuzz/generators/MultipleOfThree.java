package com.opencastsoftware.fizzbuzz.generators;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class MultipleOfThree extends Generator<Integer> {

    public MultipleOfThree() {
        super(Integer.class);
    }
        @Override
        public Integer generate(SourceOfRandomness sourceOfRandomness, GenerationStatus generationStatus) {
        return sourceOfRandomness.nextInt(0, Integer.MAX_VALUE / 3) * 3;
    }
}
