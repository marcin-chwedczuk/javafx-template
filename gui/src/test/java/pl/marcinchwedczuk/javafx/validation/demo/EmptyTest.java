package pl.marcinchwedczuk.javafx.validation.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmptyTest {
    @Test
    public void empty() {
        assertThat(1)
                .isEqualTo(1);
    }
}
