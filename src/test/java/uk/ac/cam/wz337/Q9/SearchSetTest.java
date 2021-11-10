package uk.ac.cam.wz337.Q9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.google.common.truth.Truth.assertThat;

@RunWith(JUnit4.class)
public class SearchSetTest {
    @Test
    public void contains_isCorrect() {
        SearchSet set = new SearchSet();
        assertThat(set.contains(1)).isFalse();

        set.insert(1);

        assertThat(set.contains(1)).isTrue();
    }

    @Test
    public void insert_isCorrect() {
        SearchSet set = new SearchSet();

        set.insert(1);
        set.insert(2);
        set.insert(5);

        assertThat(set.contains(1)).isTrue();
        assertThat(set.contains(2)).isTrue();
        assertThat(set.contains(5)).isTrue();
        assertThat(set.getNumberElements()).isEqualTo(3);

        SearchSet set2 = new SearchSet();
        set2.insert(5);
        set2.insert(2);
        set2.insert(1);
        assertThat(set2.contains(1)).isTrue();
        assertThat(set2.contains(2)).isTrue();
        assertThat(set2.contains(5)).isTrue();
        assertThat(set2.getNumberElements()).isEqualTo(3);
    }
}