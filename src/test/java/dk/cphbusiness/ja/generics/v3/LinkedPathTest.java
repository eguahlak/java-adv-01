package dk.cphbusiness.ja.generics.v3;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedPathTest {
  
  @Test
  public void testCreateSingle() {
    Path<Integer> path = new LinkedPath(4711);
    assertThat(path.getFirst(), is(4711));
    }
  
  @Test
  public void testCreateMore() {
    Path<Integer> path = new LinkedPath<>(7, 9, 13);
    assertThat(path.getFirst(), is(7));
    assertThat(path.getRest().getFirst(), is(9));
    assertThat(path.getRest().getRest().getFirst(), is(13));
    }
  
  @Test
  public void testIterableProperty() {
    Path<Integer> path = new LinkedPath<>(7, 9, 13);
    assertThat(path, hasItems(7, 9, 13));
    }
  
  }
