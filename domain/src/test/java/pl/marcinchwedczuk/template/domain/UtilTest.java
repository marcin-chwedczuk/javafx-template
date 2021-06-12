package pl.marcinchwedczuk.template.domain;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UtilTest {
    @Test
    void quote_works() {
        assertThat(Util.quote("foo"))
                .isEqualTo("'foo'");
    }
}