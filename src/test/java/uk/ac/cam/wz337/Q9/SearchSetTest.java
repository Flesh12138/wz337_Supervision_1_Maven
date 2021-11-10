package uk.ac.cam.wz337.Q9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.google.common.truth.Truth.assertThat;

@RunWith(JUnit4.class)
public class SearchSetTest {
    @Test
    public void insert_isCorrect() {
        SearchSet s = new SearchSet();
        s.insert(1);
        s.insert(2);
        s.insert(3);


    }
}