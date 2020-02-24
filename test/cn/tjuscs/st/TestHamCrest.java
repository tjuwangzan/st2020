package cn.tjuscs.st;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;

public class TestHamCrest {

	@Test
	public void test() {
		List<Integer> list = Arrays.asList(5,2,4);
		assertThat(list,hasSize(3));
		
		assertThat(list,contains(5,2,4));
		assertThat(list,containsInAnyOrder(2,4,5));
		assertThat(list,everyItem(greaterThan(1)));
		
	}
}
