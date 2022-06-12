package vn.com.tma.trainingplan.mockito.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import vn.com.tma.trainingplan.mockito.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub() {
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(
				new TodoServiceStub());
		
		List<String> filteredTodos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Tan");
		assertEquals(2, filteredTodos.size());
	}
}
