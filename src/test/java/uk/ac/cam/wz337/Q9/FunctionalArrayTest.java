package uk.ac.cam.wz337.Q9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.google.common.truth.Truth.assertThat;

@RunWith(JUnit4.class)
public class FunctionalArrayTest {
    @Test
    public void test_initializeCorrectly() {
        FunctionalArray fa = new FunctionalArray(10);
        assertThat(fa.get(0)).isEqualTo(0);
        assertThat(fa.get(1)).isEqualTo(0);
        assertThat(fa.get(9)).isEqualTo(0);
        assertThrows(IllegalArgumentException.class, () -> fa.get(10));
        assertThrows(IllegalArgumentException.class, () -> fa.get(-1));
    }

    @Test
    public void set_getsCorrectly() {
        FunctionalArray fa = new FunctionalArray(10);
        fa.set(0, 1);
        fa.set(1, 2);
        fa.set(9, 3);
        assertThat(fa.get(0)).isEqualTo(1);
        assertThat(fa.get(1)).isEqualTo(2);
        assertThat(fa.get(9)).isEqualTo(3);
    }
}